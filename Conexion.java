package Conector;

/**
 *
 * @author jonat
 */
public class Conexion {

    public static java.sql.Connection conectar() {
        try {
            java.sql.Connection conexion = java.sql.DriverManager.getConnection("jdbc:mysql//localhost/bd_sistema_ventas", " root", "");
            return conexion;
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error en la conexion: " + e);
        }
        return null;
    }
}
