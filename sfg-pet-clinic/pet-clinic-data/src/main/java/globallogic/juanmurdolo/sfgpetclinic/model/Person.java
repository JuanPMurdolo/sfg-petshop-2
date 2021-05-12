package globallogic.juanmurdolo.sfgpetclinic.model;


import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
