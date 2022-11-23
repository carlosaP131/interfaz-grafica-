package Model;

import DB.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    @Override
    public void insertarregistro(Usuario rol) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Guardar('"+rol.getUser()+"');";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Usuario> ObtenerRegistro() {
        try {
            List<Usuario> listarol = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Mostrar;";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Usuario rol = new Usuario();
                rol.setId(rs.getInt("idRol"));
                rol.setUser(rs.getString("rol"));
                listarol.add(rol);
            }
            stm.close();
            connection.close();
            return listarol;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void ActualizarRegistro(Usuario rolnuevo) {

        try {

            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Actualizar('"+rolnuevo.getId()+"','"+rolnuevo.getUser()+"');";
            ResultSet rs;
            stm = connection.createStatement();
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void EliminarRegistro(int rol) {

        try {

            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Eliminar('"+rol+"');";
            stm = connection.createStatement();
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Usuario BuscarRegistro(int id) {
        try {
            Usuario rol = new Usuario();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Buscar('"+id+"')";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            rol.setId(rs.getInt(1));
            rol.setUser(rs.getString(2));
            stm.close();
            connection.close();
            return rol;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        IUsuarioModel model = new UsuarioModelImpl();
//        Rol rol = new Rol();
//        rol.setRol("arbol");
//        model.insertarregistro(rol);
//        List<Rol> lista = model.ObtenerRegistro();
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getRol());
//        }
//        Rol rol2 = new Rol();
//        rol2.setRol("arbol2");
//        model.ActualizarRegistro(rol, rol2);
//         model.EliminarRegistro(rol);
    }

}
