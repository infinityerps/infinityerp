package it.embio.exportdata.utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.openbravo.base.session.OBPropertiesProvider;
import org.openbravo.dal.service.OBDal;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.database.ExternalConnectionPool;
import org.openbravo.exception.NoConnectionAvailableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MEXDConnectionProvider implements ConnectionProvider {
  private static final Logger log = LoggerFactory.getLogger(MEXDConnectionProvider.class);
  private Connection connection;
  private Properties properties;
  // This parameter can be used to define whether the OBDal needs to be flushed when the connection
  // is retrieved or not
  private boolean flush = true;
  private String pool;

  public void destroy() throws Exception {
    // never close
  }

  public MEXDConnectionProvider() {
    pool = "DEFAULT";
  }

  private MEXDConnectionProvider(String poolName) {
    pool = poolName;
    flush = false;
  }

  public static MEXDConnectionProvider getReadOnlyConnectionProvider() {
    return new MEXDConnectionProvider();
  }

  public MEXDConnectionProvider(boolean flush) {
     pool = "DEFAULT";
    this.flush = flush;
  }

  public Connection getConnection() throws NoConnectionAvailableException {
    try {
      if (connection == null || connection.isClosed()) {
        connection = OBDal.getInstance().getConnection(false);
      }
    } catch (SQLException sqlex) {
      log.error("Error checking connection of {} pool", pool, sqlex);
    } catch (HibernateException hex) {
      // Handle the case of a connection retrieved from Hibernate pool which has been already
      // closed. In this case the connection is marked as not usable and when we try to check its
      // status a HibernateException is thrown.
      connection = OBDal.getInstance().getConnection(false);
    }

    if (flush) {
      OBDal.getInstance().flush();
    }
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  public String getRDBMS() {
    return getProperties().getProperty("bbdd.rdbms");
  }

  private boolean closeConnection(Connection conn) {
    if (conn == null)
      return false;
    try {
      conn.setAutoCommit(true);
      conn.close();
    } catch (Exception ex) {
      return false;
    }
    return true;
  }
//this connection only use for report purpose not for transcation purpose because autocomit false not applied.
  public Connection getTransactionConnection() throws NoConnectionAvailableException, SQLException {
	  try {
	      if (connection == null || connection.isClosed()) {
	        connection = OBDal.getInstance().getConnection(false);
	      }
	    } catch (SQLException sqlex) {
	      log.error("Error checking connection of {} pool", pool, sqlex);
	    } catch (HibernateException hex) {
	      // Handle the case of a connection retrieved from Hibernate pool which has been already
	      // closed. In this case the connection is marked as not usable and when we try to check its
	      // status a HibernateException is thrown.
	      connection = OBDal.getInstance().getConnection(false);
	    }

	    if (flush) {
	      OBDal.getInstance().flush();
	    }
	  
	    return connection;
  }

  public void releaseCommitConnection(Connection conn) throws SQLException {
    if (conn == null)
      return;
    conn.commit();
    closeConnection(conn);
  }

  public void releaseRollbackConnection(Connection conn) throws SQLException {
    if (conn == null)
      return;
    conn.rollback();
    closeConnection(conn);
  }

  public PreparedStatement getPreparedStatement(String SQLPreparedStatement) throws Exception {
    return getPreparedStatement(getConnection(), SQLPreparedStatement);
  }

  public PreparedStatement getPreparedStatement(String poolName, String SQLPreparedStatement)
      throws Exception {
    return getPreparedStatement(getConnection(), SQLPreparedStatement);
  }

  public PreparedStatement getPreparedStatement(Connection conn, String SQLPreparedStatement)
      throws SQLException {
    PreparedStatement ps = conn.prepareStatement(SQLPreparedStatement,
        ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    return ps;
  }

  public CallableStatement getCallableStatement(String SQLCallableStatement) throws Exception {
    return getCallableStatement("", SQLCallableStatement);
  }

  public CallableStatement getCallableStatement(String poolName, String SQLCallableStatement)
      throws Exception {
    Connection conn = getConnection();
    return getCallableStatement(conn, SQLCallableStatement);
  }

  public CallableStatement getCallableStatement(Connection conn, String SQLCallableStatement)
      throws SQLException {
    if (conn == null || SQLCallableStatement == null || SQLCallableStatement.equals(""))
      return null;
    CallableStatement cs = null;
    try {
      cs = conn.prepareCall(SQLCallableStatement);
    } catch (SQLException e) {
      throw e;
    }
    return (cs);
  }

  public Statement getStatement() throws Exception {
    return getStatement("");
  }

  public Statement getStatement(String poolName) throws Exception {
    Connection conn = getConnection();
    return getStatement(conn);
  }

  public Statement getStatement(Connection conn) throws SQLException {
    if (conn == null)
      return null;
    try {
      return (conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY));
    } catch (SQLException e) {
      throw e;
    }
  }

  public void releasePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
    if (preparedStatement == null) {
      return;
    }
    preparedStatement.close();
  }

  public void releaseCallableStatement(CallableStatement callableStatement) throws SQLException {
    if (callableStatement == null) {
      return;
    }
    callableStatement.close();
  }

  public void releaseStatement(Statement statement) throws SQLException {
    if (statement == null) {
      return;
    }
    statement.close();
  }

  public void releaseTransactionalStatement(Statement statement) throws SQLException {
    if (statement == null) {
      return;
    }
    statement.close();
  }

  public void releaseTransactionalPreparedStatement(PreparedStatement preparedStatement)
      throws SQLException {
    if (preparedStatement == null) {
      return;
    }
    preparedStatement.close();
  }

  public String getStatus() {
    return "Not implemented";
  }

  public Properties getProperties() {
    if (properties == null) {
      properties = OBPropertiesProvider.getInstance().getOpenbravoProperties();
    }
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }
}
