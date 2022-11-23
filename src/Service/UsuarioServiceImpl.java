/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.IUsuarioModel;
import Model.UsuarioModelImpl;
import entity.Usuario;
import java.util.List;

/**
 *
 * @author labdessw09
 */
public class UsuarioServiceImpl implements  IUsuarioService{
     IUsuarioModel model = new UsuarioModelImpl();
     
     
//      @Override
//    public void InsertarRegistro(Usuario Registro) {
//                model.insertarregistro(Registro);
//    }
//
//    @Override
//    public List<Usuario> ObtenerRegistro() {
//      return  model.ObtenerRegistro();
//    }
//
//    @Override
//    public void ActualizarRegistro(Usuario  Registro,int id) {
//        model.ActualizarRegistro(id, Registro);
//    }
//
//    @Override
//    public void EliminarRegistro(Usuario Registro) {
//            model.EliminarRegistro(Registro);
//    }
//
//    @Override
//    public Usuario BuscarRegistro(int id) {
//       return model.BuscarRegistro(id);
//    }

    @Override
    public void InsertarRegistro(Usuario Registro) {
        model.insertarregistro(Registro);
    }

    @Override
    public List<Usuario> ObtenerRegistro() {
        return model.ObtenerRegistro();
    }

    @Override
    public void ActualizarRegistro(Usuario idRegistro) {
        model.ActualizarRegistro( idRegistro);
    }

    @Override
    public void EliminarRegistro(int id) {
        model.EliminarRegistro(id);
    }

    @Override
    public Usuario BuscarRegistro(int id) {
       return model.BuscarRegistro(id);
    }

   

}
