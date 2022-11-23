/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.base;

import entity.Rol;
import java.util.List;

/**
 *
 * @author labdessw09
 */
public interface IRegistroServiceBase<T> {

    public void InsertarRegistro(T Registro);

    public List<T> ObtenerRegistro();

    public void ActualizarRegistro(T idRegistro);

    public void EliminarRegistro(int id);

    public T BuscarRegistro(int id);
}
