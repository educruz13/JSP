/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel
 */
public class Empleado extends Persona {
private String codigo;
private int id_puesto;

    public Empleado(String codigo, int id_puesto) {
        this.codigo = codigo;
        this.id_puesto = id_puesto;
    }

    public Empleado(String codigo, int id_puesto,String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.id_puesto = id_puesto;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    
    
    
}
