package Controller;

import Controller.base.RegistroControllerBase;
import Service.IRolService;
import Service.RolServiceImpl;
import entity.Rol;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RolController extends RegistroControllerBase<Rol> {

    private IRolService service;
       public void ini(){
           service = new RolServiceImpl();
           super.setServise(service);
       }
       
//instancia a servicio 
//    IRolService service = new RolServiceImpl();
//    
    public void CrearActualizarRegistro(Rol rol) {
        //ini();
        super.setRegistro(rol);
        super.crearActualizarRegistro();
//        service = new RolServiceImpl();
////        service.InsertarRegistro(rol);
//        super.setServise(service);
//        super.setRegistro(rol);
//        super.crearActualizarRegistro();
    }
//    public void MostrarRegistro (DefaultTableModel modelo){
//     
//        List<Rol> listarol = service.ObtenerRegistro();
//        modelo.setRowCount(0);
//        for (Rol rol : listarol) {
//            Object[] fila = new Object[2];
//            fila[0] =String.valueOf(rol.getIdRol());
//            fila[1] = rol.getRol();
//            modelo.addRow(fila);
//          
//        }
//        
//    }
//    
//   public void ActualizarRegistro(int idrol,Rol rolnuevo){
//      service.ActualizarRegistro(idrol,rolnuevo);
//   
//   }
//   public void EliminarRegistro(Rol rol){
//       service.EliminarRegistro(rol);
//   }
//     public Rol BuscarRegistro(int id){
//         return service.BuscarRegistro(id);
//     }
//     
}
