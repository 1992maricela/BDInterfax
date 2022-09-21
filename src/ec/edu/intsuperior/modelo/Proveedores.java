
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jeffe
 */
public class Proveedores extends Persona{
   private String ruc;
   private String correo;
    public Proveedores(String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
    }

    public Proveedores(String ruc, String correo, String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
        this.ruc = ruc;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
   
}
