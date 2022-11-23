package entity;

import entity.base.IRegistroEntityBase;

public class Jugador extends Persona implements IRegistroEntityBase {

    private int IdJugador;
    private int Puntos;

    public int getIdJugador() {
        return IdJugador;
    }

    public void setIdJugador(int IdJugador) {
        this.IdJugador = IdJugador;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    @Override
    public int getId() {
        return getIdJugador();
    }

    @Override
    public void setId(int id) {
        setIdJugador(id);
    }

}
