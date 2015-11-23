/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ijshockey;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author favdndor
 */
public class DriverManager {

    public Connection getConnection() throws SQLException {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("userName", this.userName);
        connectionProps.put("password", this.password);

        if (this.dbms.equals("mysql")) {
            conn = DriverManager.getConnection(
                    "jdbc:" + this.dbms + "://"
                    + this.serverName
                    + ":" + this.portNumber + "/",
                    connectionProps);
        } else if (this.dbms.equals("derby")) {
            conn = DriverManager.getConnection(
                    "jdbc:" + this.dbms + ":"
                    + this.dbName
                    + ";create=true",
                    connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }

// Beheer via het web                              http://phpmyadm.ugent.be
// Gebruikersnaam (=databanknaam)       BINFG11
// Paswoord                                            4v3yfrzt
// Server                                                mysqlha2.ugent.be 
}
