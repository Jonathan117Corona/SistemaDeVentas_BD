package Gestion;
/**
 *
 * @author jonat
 */
public class Ctrl_Producto {
    
    //Metodo para guardar el nuevo prodcuto
    
    public boolean guardar(Clases.Producto objeto) {
        
        boolean respuesta = false;
        java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = (java.sql.PreparedStatement) cn.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorcentajeIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (java.sql.SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }
        return respuesta;
    }
    
    //metodo para consultar si el producto ya esta registrado

    public boolean existeProducto(String producto) {

        boolean respuesta = false;
        String sql = "select nombre from tb_producto where descripcion = '" + producto + "';";
        java.sql.Statement st;

        try {

            java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
            st = (java.sql.Statement) cn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (java.sql.SQLException e) {
            System.out.println("Error al consultar producto " + e);
        }
        return respuesta;
    }

    //metodo para actualizar un producto
    public boolean actualizar(Clases.Producto objeto, int idProducto) {
        boolean respuesta = false;
        java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
        try {

            java.sql.PreparedStatement consulta = (java.sql.PreparedStatement) cn.prepareStatement("update tb_producto set nombre=?, cantidad = ?, precio = ?, descripcion= ?, porcentajeIva = ?, idCategoria = ?, estado = ? where idProducto ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }
        return respuesta;

    }
    // metodo para eliminar la consulta 

    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = (java.sql.PreparedStatement) cn.prepareStatement(
                    "delete from tb_producto where idProducto ='" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar el stock
    public boolean actualizarStock(Clases.Producto object, int idProducto) {
        boolean respuesta = false;
        java.sql.Connection cn = (java.sql.Connection) Conector.Conexion.conectar();
        try {
            java.sql.PreparedStatement consulta = (java.sql.PreparedStatement) cn.prepareStatement("update tb_producto set cantidad=? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Error al actualizar stock del producto: " + e);
        }
        return respuesta;
    }

}
