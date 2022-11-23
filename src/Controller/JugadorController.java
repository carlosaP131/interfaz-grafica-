package Controller;

import Controller.base.RegistroControllerBase;
import Service.IJugadorService;
import Service.JugadorServiceImpl;
import entity.Jugador;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JugadorController extends RegistroControllerBase<Jugador> {

    private IJugadorService service;

       public void ini(){
           service = new JugadorServiceImpl();
           super.setServise(service);
       }
//instancia a servicio 
//    IJugadorService service = new JugadorServiceImpl();
//    
    public void InsertarRegistro(Jugador jugador) {
        ini();
//        service = new JugadorServiceImpl();
////        service.InsertarRegistro(rol);
//        super.setServise(service);
        super.setRegistro(jugador);
        super.crearActualizarRegistro();
    }
//    public void MostrarRegistro (DefaultTableModel modelo){
//     
//        List<Jugador> listarol = service.ObtenerRegistro();
//        modelo.setRowCount(0);
//        for (Jugador rol : listarol) {
//            Object[] fila = new Object[2];
//            fila[0] =String.valueOf(rol.getIdJugador());
//            fila[1] = rol.getJugador();
//            modelo.addRow(fila);
//          
//        }
//        
//    }
//    
//   public void ActualizarRegistro(int idrol,Jugador rolnuevo){
//      service.ActualizarRegistro(idrol,rolnuevo);
//   
//   }
//   public void EliminarRegistro(Jugador rol){
//       service.EliminarRegistro(rol);
//   }
//     public Jugador BuscarRegistro(int id){
//         return service.BuscarRegistro(id);
//     }
//     
}
