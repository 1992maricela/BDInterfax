
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jeffe
 */
public class Empleados extends Persona{
    
    private String cargo;
    private String seguro;
    
    public Empleados(String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
    }

    public Empleados(String cargo, String seguro, String cedula, String nombre2, String apellido1, String apellido2, String direccion, String telefono) {
        super(cedula, nombre2, apellido1, apellido2, direccion, telefono);
        this.cargo = cargo;
        this.seguro = seguro;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
