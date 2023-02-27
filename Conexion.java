package conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Edgar JPC (Yacu)
 */
public class Conexion {
   
    //conexion local
    public static Connection conectar(){
        
        try{
        
          Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas","root","02062019");
          return cn;   
        }catch (SQLException e){
            System.out.println("Error em la conexion local" + e);
        }return null;
    }
}
