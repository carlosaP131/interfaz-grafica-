
package Model;

import entity.Jugador;

import java.util.List;

public interface IJugadorModel {
    public void insertarregistro(Jugador rol);
    public  List<Jugador> ObtenerRegistro();
   public void ActualizarRegistro(Jugador rolnuevo);
   public void EliminarRegistro(int rol);
   public Jugador BuscarRegistro(int id);
    
    
}
