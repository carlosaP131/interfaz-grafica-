package Model;

import DB.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import entity.Rol;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RolModelImpl implements IRolModel {

    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    @Override
    public void insertarregistro(Rol rol) {
        try {
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Guardar('"+rol.getRol()+"');";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Rol> ObtenerRegistro() {
        try {
            List<Rol> listarol = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Mostrar;";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Rol rol = new Rol();
                rol.setIdRol(rs.getInt("idRol"));
                rol.setRol(rs.getString("rol"));
                listarol.add(rol);
            }
            stm.close();
            connection.close();
            return listarol;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void ActualizarRegistro( Rol rolnuevo) {

        try {

            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Actualizar('"+rolnuevo.getIdRol()+"','"+rolnuevo.getRol()+"');";
            ResultSet rs;
            stm = connection.createStatement();
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void EliminarRegistro(Rol rol) {

        try {

            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Eliminar('"+rol.getIdRol()+"');";
            stm = connection.createStatement();
            stm.execute(query);
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            stm.close();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Rol BuscarRegistro(int id) {
        try {
            Rol rol = new Rol();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "call Buscar('"+id+"')";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            rol.setIdRol(rs.getInt(1));
            rol.setRol(rs.getString(2));
            stm.close();
            connection.close();
            return rol;
        } catch (SQLException e) {
            System.err.println("Error:");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RolModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        IRolModel model = new RolModelImpl();
        Rol rol = new Rol();
        rol.setRol("arbol");
        model.insertarregistro(rol);
        List<Rol> lista = model.ObtenerRegistro();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getRol());
        }
        Rol rol2 = new Rol();
        rol2.setRol("arbol2");
        model.ActualizarRegistro( rol2);
         model.EliminarRegistro(rol);
    }

}
