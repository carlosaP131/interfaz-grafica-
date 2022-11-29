
package utilerias;

public enum TipoUsuarioEnum {
    ADMINISTRADOR("Super Admin"),
    INVITADO("Invitado"),
    NORMAL("Admin");
    private final String tipo;

     TipoUsuarioEnum(String tipo) {
        this.tipo = tipo;
    }
    
    public String getValue(){
        return tipo;
    }
}
