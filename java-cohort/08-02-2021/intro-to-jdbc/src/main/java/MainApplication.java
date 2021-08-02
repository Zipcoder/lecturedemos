
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringJoiner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 9:49 AM
 */
public class MainApplication {

    public static void main(String[] args) {
        registerJDBCDriver();
        Connection mysqlDbConnection = getConnection("mysql");
        executeStatement(mysqlDbConnection, "DROP DATABASE IF EXISTS databaseName;");
        executeStatement(mysqlDbConnection, "CREATE DATABASE IF NOT EXISTS databaseName;");
        executeStatement(mysqlDbConnection, "USE databaseName;");
        executeStatement(mysqlDbConnection, new StringBuilder()
                .append("CREATE TABLE IF NOT EXISTS databaseName.pokemonTable(")
                .append("id int auto_increment primary key,")
                .append("name text not null,")
                .append("primary_type int not null,")
                .append("secondary_type int null);")
                .toString());
        executeStatement(mysqlDbConnection, new StringBuilder()
                .append("INSERT INTO databaseName.pokemonTable(")
                .append("id, name, primary_type, secondary_type) ")
                .append("VALUES (12, 'Ivysaur', 3, 7);")
                .toString());

        executeStatement(mysqlDbConnection, new StringBuilder()
                .append("INSERT INTO databaseName.pokemonTable(")
                .append("id, name, primary_type, secondary_type) ")
                .append("VALUES (13, 'Ivysaurr', 3, 7);")
                .toString());

        String getPokemonTable = "SELECT * FROM databaseName.pokemonTable;";
        ResultSet resultSet = executeQuery(mysqlDbConnection, getPokemonTable);
        printResults(resultSet);

        String showPokemonTable = "SHOW DATABASES;";
        resultSet = executeQuery(mysqlDbConnection, showPokemonTable);
        printResults(resultSet);
    }

    static ResultSet executeQuery(Connection connection, String sqlQuery) {
        try {
            Statement statement = getScrollableStatement(connection);
            return statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    static void printResults(ResultSet resultSet) {
        try {
            for (int rowNumber = 0; resultSet.next(); rowNumber++) {
                String firstColumnData = resultSet.getString(1);
                String secondColumnData = resultSet.getString(2);
                String thirdColumnData = resultSet.getString(3);
                System.out.println(new StringJoiner("\n")
                        .add("Row number = " + rowNumber)
                        .add("First Column = " + firstColumnData)
                        .add("Second Column = " + secondColumnData)
                        .add("Third column = " + thirdColumnData));
            }
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    static void executeStatement(Connection connection, String sqlStatement) {
        try {
            Statement statement = getScrollableStatement(connection);
            statement.execute(sqlStatement);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    static Statement getScrollableStatement(Connection connection) {
        int resultSetType = ResultSet.TYPE_SCROLL_INSENSITIVE;
        int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
        try { // scrollable statements can be iterated more than once without closing
            return connection.createStatement(resultSetType, resultSetConcurrency);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    static Connection getConnection(String dbVendor) {
        String username = "root";
        String password = "";
        String url = new StringBuilder()
                .append("jdbc:")
                .append(dbVendor)
                .append("://127.0.0.1/")
                .append("?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
                .toString();
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    static void registerJDBCDriver() {
        // Attempt to register JDBC Driver
        try {
            DriverManager.registerDriver(Driver.class.newInstance());
        } catch (InstantiationException | IllegalAccessException | SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

}
