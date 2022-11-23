/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import entity.base.IRegistroEntityBase;

/**
 *
 * @author labdessw09
 */
public class Usuario implements IRegistroEntityBase{
    private int idUsuario;
    private String User;
    private String Pwd;           

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    @Override
    public int getId() {
        return getId();
    }

    @Override
    public void setId(int id) {
        setId(id);
    }
}
