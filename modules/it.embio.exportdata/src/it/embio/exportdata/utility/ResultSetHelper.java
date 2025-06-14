package it.embio.exportdata.utility;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetHelper {
    public String[] getColumnNames(ResultSet rs) throws SQLException;

    public String[] getColumnValues(ResultSet rs) throws SQLException, IOException;

    public String[] getColumnValues(ResultSet rs, boolean trim) throws SQLException, IOException;

    public String[] getColumnValues(ResultSet rs, boolean trim, String dateFormatString, String timeFormatString)
            throws SQLException, IOException;
}