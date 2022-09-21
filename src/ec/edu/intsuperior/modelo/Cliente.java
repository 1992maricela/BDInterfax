
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jeffe
 */
public class Cliente extends Persona {
 private String  correo;

    public Cliente(String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
    }

    public Cliente(String correo, String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
}
