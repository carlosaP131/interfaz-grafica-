
package Model;


import entity.Usuario;
import java.util.List;

public interface IUsuarioModel {
    public void insertarregistro(Usuario usuario);
    public  List<Usuario> ObtenerRegistro();
   public void ActualizarRegistro(Usuario usuario);
   public void EliminarRegistro(int usuario);
   public Usuario BuscarRegistro(int id);
    
    
}
