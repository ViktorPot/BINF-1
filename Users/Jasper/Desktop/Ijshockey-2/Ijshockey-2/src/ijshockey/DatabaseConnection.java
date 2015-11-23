/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijshockey;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ekmaes
 */
public class DatabaseConnection {
    private Connection databaseConnection;

    //private String databaseLocatie;
    /**
     * Creates a new instance of Database
     */
    public DatabaseConnection() {
    }

    public void start() {
        loadDriver();
        connect();
    }

    private void loadDriver() {
        //TRY LOADING SUN DRIVER
        try {
            //LOAD SUN DRIVER
            Class.forName("com.mysql.jdbc.Driver");
        }//END try
        //DRIVER NOT FOUND, REPORT ERROR
        catch (ClassNotFoundException err) {
            System.out.println("Could not load driver ");
            System.exit(1);
        }//END catch
    }

    private void connect() {
        try {
            //CONNECT TO DATABASE
            String protocol = "jdbc";
            String subProtocol = "mysql";
            String subName = "//mysqlha2.ugent.be/BINFG11?user=BINFG11&password=4v3yfrzt";

            //DB, JAN en RARA vervangen
            String URL = protocol + ":" + subProtocol + ":" + subName;

            databaseConnection = java.sql.DriverManager.getConnection(URL);
            //return dbConnection;
        }//END try
        catch (SQLException error) {
            System.err.println("Error connecting to database: "
                    + error.toString());
        }//END catch

    }//END connectDatabase()

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public void closeConnection() {
        try {
            //CLOSE CONNECTED
            databaseConnection.close();
        }//END try
        catch (SQLException error) {
            System.err.println("Cannot disconnect database");
        }//END catch

    }//END closeConnection()
    
}
