package Service;

import Model.IRolModel;
import Model.RolModelImpl;
import entity.Rol;
import java.util.List;


public class RolServiceImpl implements IRolService {

    //realizar una instancia ala capa model 
    IRolModel model = new RolModelImpl();

//    @Override
//    public void InsertarRegistro(Rol rol) {
//        model.insertarregistro(rol);
//
//    }
//
//    @Override
//    public List<Rol> ObtenerRegistro() {
//        return model.ObtenerRegistro();
//
//    }
//
//   // @Override
//    public void ActualizarRegistro(Rol idrol, Rol rolnuevo) {
//        model.ActualizarRegistro(idrol, rolnuevo);
//    }
//
//    @Override
//    public void EliminarRegistro(Rol rol) {
//        model.EliminarRegistro(rol);
//
//    }
//
//    @Override
//    public Rol BuscarRegistro(int id) {
//        return model.BuscarRegistro(id);
//    }

    @Override
    public void InsertarRegistro(Rol Registro) {
                model.insertarregistro(Registro);
    }

    @Override
    public List<Rol> ObtenerRegistro() {
      return  model.ObtenerRegistro();
    }

    @Override
    public void ActualizarRegistro(Rol  Registro) {
        model.ActualizarRegistro( Registro);
    }

    @Override
    public void EliminarRegistro(int Registro) {
            model.BuscarRegistro(Registro);
    }

    @Override
    public Rol BuscarRegistro(int id) {
       return model.BuscarRegistro(id);
    }

}
