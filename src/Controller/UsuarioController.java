/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.base.RegistroControllerBase;
import Service.IUsuarioService;
import Service.UsuarioServiceImpl;
import entity.Usuario;

/**
 *
 * @author labdessw09
 */
public class UsuarioController  extends RegistroControllerBase<Usuario> {
     private IUsuarioService service;

//instancia a servicio 
//    IRolService service = new RolServiceImpl();
//    
    public void InsertarRegistro(Usuario usuario) {
        service = new UsuarioServiceImpl();
//        service.InsertarRegistro(rol);
        super.setServise(service);
        super.setRegistro(usuario);
        super.crearActualizarRegistro();
    }
}
