package it.embio.exportdata.utility;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CSVWriter implements Closeable, Flushable {

    public static final int INITIAL_STRING_SIZE = 128;

    private Writer rawWriter;

    private PrintWriter pw;

    private OutputStream zos;
    
    private char separator;

    private char quotechar;

    private char escapechar;

    private String lineEnd;

    /**
     * The character used for escaping quotes.
     */
    public static final char DEFAULT_ESCAPE_CHARACTER = '"';

    /**
     * The default separator to use if none is supplied to the constructor.
     */
    public static final char DEFAULT_SEPARATOR = ',';

    /**
     * The default quote character to use if none is supplied to the
     * constructor.
     */
    public static final char DEFAULT_QUOTE_CHARACTER = '"';

    /**
     * The quote constant to use when you wish to suppress all quoting.
     */
    public static final char NO_QUOTE_CHARACTER = '\u0000';

    /**
     * The escape constant to use when you wish to suppress all escaping.
     */
    public static final char NO_ESCAPE_CHARACTER = '\u0000';

    /**
     * Default line terminator uses platform encoding.
     */
    public static final String DEFAULT_LINE_END = "\n";

    private ResultSetHelper resultService = new ResultSetHelperService();

    /**
     * Constructs CSVWriter using a comma for the separator.
     *
     * @param writer the writer to an underlying CSV source.
     */
    public CSVWriter(Writer writer) {
        this(writer, DEFAULT_SEPARATOR);
    }
    
    public CSVWriter(OutputStream zos) {
        this(zos, DEFAULT_SEPARATOR);
    }

    /**
     * Constructs CSVWriter with supplied separator.
     *
     * @param writer    the writer to an underlying CSV source.
     * @param separator the delimiter to use for separating entries.
     */
    public CSVWriter(Writer writer, char separator) {
        this(writer, separator, DEFAULT_QUOTE_CHARACTER);
    }
    public CSVWriter(OutputStream zos, char separator) {
        this(zos, separator, DEFAULT_QUOTE_CHARACTER);
    }

    /**
     * Constructs CSVWriter with supplied separator and quote char.
     *
     * @param writer    the writer to an underlying CSV source.
     * @param separator the delimiter to use for separating entries
     * @param quotechar the character to use for quoted elements
     */
    public CSVWriter(Writer writer, char separator, char quotechar) {
        this(writer, separator, quotechar, DEFAULT_ESCAPE_CHARACTER);
    }
    public CSVWriter(OutputStream zos, char separator, char quotechar) {
        this(zos, separator, quotechar, DEFAULT_ESCAPE_CHARACTER);
    }

    /**
     * Constructs CSVWriter with supplied separator and quote char.
     *
     * @param writer     the writer to an underlying CSV source.
     * @param separator  the delimiter to use for separating entries
     * @param quotechar  the character to use for quoted elements
     * @param escapechar the character to use for escaping quotechars or escapechars
     */
    public CSVWriter(Writer writer, char separator, char quotechar, char escapechar) {
        this(writer, separator, quotechar, escapechar, DEFAULT_LINE_END);
    }
    public CSVWriter(OutputStream zos, char separator, char quotechar, char escapechar) {
        this(zos, separator, quotechar, escapechar, DEFAULT_LINE_END);
    }


    /**
     * Constructs CSVWriter with supplied separator and quote char.
     *
     * @param writer    the writer to an underlying CSV source.
     * @param separator the delimiter to use for separating entries
     * @param quotechar the character to use for quoted elements
     * @param lineEnd   the line feed terminator to use
     */
    public CSVWriter(Writer writer, char separator, char quotechar, String lineEnd) {
        this(writer, separator, quotechar, DEFAULT_ESCAPE_CHARACTER, lineEnd);
    }
    public CSVWriter(OutputStream zos, char separator, char quotechar, String lineEnd) {
        this(zos, separator, quotechar, DEFAULT_ESCAPE_CHARACTER, lineEnd);
    }


    /**
     * Constructs CSVWriter with supplied separator, quote char, escape char and line ending.
     *
     * @param writer     the writer to an underlying CSV source.
     * @param separator  the delimiter to use for separating entries
     * @param quotechar  the character to use for quoted elements
     * @param escapechar the character to use for escaping quotechars or escapechars
     * @param lineEnd    the line feed terminator to use
     */
    public CSVWriter(Writer writer, char separator, char quotechar, char escapechar, String lineEnd) {
        this.rawWriter = writer;
        this.pw = new PrintWriter(writer);
        this.separator = separator;
        this.quotechar = quotechar;
        this.escapechar = escapechar;
        this.lineEnd = lineEnd;
    }
    public CSVWriter(OutputStream zos, char separator, char quotechar, char escapechar, String lineEnd) {
        this.separator = separator;
        this.quotechar = quotechar;
        this.escapechar = escapechar;
        this.lineEnd = lineEnd;
        this.zos=zos;
    }

    /**
     * Writes the entire list to a CSV file. The list is assumed to be a
     * String[]
     *
     * @param allLines         a List of String[], with each String[] representing a line of
     *                         the file.
     * @param applyQuotesToAll true if all values are to be quoted.  false if quotes only
     *                         to be applied to values which contain the separator, escape,
     *                         quote or new line characters.
     */
    public void writeAll(List<String[]> allLines, boolean applyQuotesToAll) {
        for (String[] line : allLines) {
            writeNext(line, applyQuotesToAll);
        }
    }

    /**
     * Writes the entire list to a CSV file. The list is assumed to be a
     * String[]
     *
     * @param allLines a List of String[], with each String[] representing a line of
     *                 the file.
     */
    public void writeAll(List<String[]> allLines) {
        for (String[] line : allLines) {
            writeNext(line);
        }
    }

    protected void writeColumnNames(ResultSet rs)
            throws SQLException {

        writeNext(resultService.getColumnNames(rs));
    }
    protected void writeColumnNameszip(ResultSet rs)
            throws IOException, Exception {

        writeNextzip(resultService.getColumnNames(rs),true);
    }

    /**
     * Writes the entire ResultSet to a CSV file.
     * <p/>
     * The caller is responsible for closing the ResultSet.
     *
     * @param rs                 the recordset to write
     * @param includeColumnNames true if you want column names in the output, false otherwise
     * @throws java.io.IOException   thrown by getColumnValue
     * @throws java.sql.SQLException thrown by getColumnValue
     */
    public void writeAll(java.sql.ResultSet rs, boolean includeColumnNames) throws SQLException, IOException {
        writeAll(rs, includeColumnNames, false);
    }
    public void writeAllzip(java.sql.ResultSet rs, boolean includeColumnNames) throws Exception {
    	writeAllzip(rs, includeColumnNames, false);
    	
    }

    /**
     * Writes the entire ResultSet to a CSV file.
     * <p/>
     * The caller is responsible for closing the ResultSet.
     *
     * @throws java.io.IOException   thrown by getColumnValue
     * @throws java.sql.SQLException thrown by getColumnValue
     */
    public void writeAll(java.sql.ResultSet rs, boolean includeColumnNames, boolean trim) throws SQLException, IOException {


        if (includeColumnNames) {
            writeColumnNames(rs);
        }

        while (rs.next()) {
            writeNext(resultService.getColumnValues(rs, trim));
        }
    }
    public void writeAllzip(java.sql.ResultSet rs, boolean includeColumnNames, boolean trim) throws Exception {


        if (includeColumnNames) {
            writeColumnNameszip(rs);
        }

        while (rs.next()) {
            writeNextzip(resultService.getColumnValues(rs, trim),true);
        }
    }

    /**
     * Writes the next line to the file.
     *
     * @param nextLine         a string array with each comma-separated element as a separate
     *                         entry.
     * @param applyQuotesToAll true if all values are to be quoted.  false applies quotes only
     *                         to values which contain the separator, escape, quote or new line characters.
     */
    public void writeNext(String[] nextLine, boolean applyQuotesToAll) {

        if (nextLine == null)
            return;

        StringBuilder sb = new StringBuilder(INITIAL_STRING_SIZE);
        for (int i = 0; i < nextLine.length; i++) {

            if (i != 0) {
                sb.append(separator);
            }

            String nextElement = nextLine[i];

            if (nextElement == null)
                continue;

            Boolean stringContainsSpecialCharacters = stringContainsSpecialCharacters(nextElement);

            if ((applyQuotesToAll || stringContainsSpecialCharacters) && quotechar != NO_QUOTE_CHARACTER)
                sb.append(quotechar);

            if (stringContainsSpecialCharacters) {
                sb.append(processLine(nextElement));
            } else {
                sb.append(nextElement);
            }

            if ((applyQuotesToAll || stringContainsSpecialCharacters) && quotechar != NO_QUOTE_CHARACTER)
                sb.append(quotechar);
        }

        sb.append(lineEnd);
        pw.write(sb.toString());
        pw.flush();
    }

    public void writeNextzip(String[] nextLine, boolean applyQuotesToAll) throws IOException, Exception {

        if (nextLine == null)
            return;

        StringBuilder sb = new StringBuilder(INITIAL_STRING_SIZE);
        for (int i = 0; i < nextLine.length; i++) {

            if (i != 0) {
                sb.append(separator);
            }

            String nextElement = nextLine[i];

            if (nextElement == null)
                continue;

            Boolean stringContainsSpecialCharacters = stringContainsSpecialCharacters(nextElement);

            if ((applyQuotesToAll || stringContainsSpecialCharacters) && quotechar != NO_QUOTE_CHARACTER)
                sb.append(quotechar);

            if (stringContainsSpecialCharacters) {
                sb.append(processLine(nextElement));
            } else {
                sb.append(nextElement);
            }

            if ((applyQuotesToAll || stringContainsSpecialCharacters) && quotechar != NO_QUOTE_CHARACTER)
                sb.append(quotechar);
        }

        sb.append(lineEnd);
        zos.write(sb.toString().getBytes("UTF-8"));
        zos.flush();
    }

    /**
     * Writes the next line to the file.
     *
     * @param nextLine a string array with each comma-separated element as a separate
     *                 entry.
     */
    public void writeNext(String[] nextLine) {
        writeNext(nextLine, true);
    }
      private boolean stringContainsSpecialCharacters(String line) {
        return line.indexOf(quotechar) != -1 || line.indexOf(escapechar) != -1 || line.indexOf(separator) != -1 || line.indexOf("\n") != -1 || line.indexOf("\r") != -1;
    }

    protected StringBuilder processLine(String nextElement) {
        StringBuilder sb = new StringBuilder(INITIAL_STRING_SIZE);
        for (int j = 0; j < nextElement.length(); j++) {
            char nextChar = nextElement.charAt(j);
            if (escapechar != NO_ESCAPE_CHARACTER && nextChar == quotechar) {
                sb.append(escapechar).append(nextChar);
            } else if (escapechar != NO_ESCAPE_CHARACTER && nextChar == escapechar) {
                sb.append(escapechar).append(nextChar);
            } else {
                sb.append(nextChar);
            }
        }

        return sb;
    }

    /**
     * Flush underlying stream to writer.
     *
     * @throws IOException if bad things happen
     */
    public void flush() throws IOException {

        pw.flush();

    }

    /**
     * Close the underlying stream writer flushing any buffered content.
     *
     * @throws IOException if bad things happen
     */
    public void close() throws IOException {
        flush();
        pw.close();
        rawWriter.close();
    }

    /**
     * Checks to see if the there has been an error in the printstream.
     */
    public boolean checkError() {
        return pw.checkError();
    }

    public void setResultService(ResultSetHelper resultService) {
        this.resultService = resultService;
    }

    public void flushQuietly() {
        try {
            flush();
        } catch (IOException e) {
            // catch exception and ignore.
        }
    }
}