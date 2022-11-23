
package Model;

import entity.Rol;
import java.util.List;

public interface IRolModel {
    public void insertarregistro(Rol rol);
    public  List<Rol> ObtenerRegistro();
   public void ActualizarRegistro(Rol rolnuevo);
   public void EliminarRegistro(Rol rol);
   public Rol BuscarRegistro(int id);
    
    
}
