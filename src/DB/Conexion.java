
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private String driver;
    private String user;
    private String pdw;
    private String url;
    private String ip;
    private String puerto;
    private String basedatos;
    private Connection connection;

    public Conexion() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.user = "root";
        this.pdw = "root";
        this.url = "jdbc:mysql://";
        this.ip = "172.17.0.2";
        this.puerto = "3306";
        this.basedatos = "juego";
    }

    public Connection getConnection() throws ClassNotFoundException {
        try {

            Class.forName(this.driver);
            connection = DriverManager.getConnection(this.url + this.ip + ":" + puerto + "/"
                    + this.basedatos, this.user, this.pdw);

            System.out.println("Conexion exitosa");
            return connection;
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
       
        return null;
    }

}
