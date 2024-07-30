/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JDani
 */

public class Empleado extends Persona{
    private String codigo_puesto;
    private String puesto;
    
    public Empleado(){}
    

    public Empleado(String codigo_puesto, String puesto) {
        this.codigo_puesto = codigo_puesto;
        this.puesto = puesto;
    }

    public Empleado(String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String codigo_puesto, String puesto) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo_puesto = codigo_puesto;
        this.puesto = puesto;
    }

    public String getCodigo_puesto() {
        return codigo_puesto;
    }

    public void setCodigo_puesto(String codigo_puesto) {
        this.codigo_puesto = codigo_puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("__________________________");
    System.out.println("Nombres: " + this.getNombres() );
    System.out.println("Apellidos: " + this.getApellidos() );
    System.out.println("Direccion: " + this.getDireccion() );
    System.out.println("Telefono: " + this.getTelefono() );
    System.out.println("Fecha nacimiento: " + this.getFecha_nacimiento () );
    System.out.println("Direccion: " + this.getDireccion() );
    System.out.println("Codigo puesto: " + this.getCodigo_puesto() );
    System.out.println("puesto: " + this.getPuesto() );
    System.out.println("__________________________");

    }
}
