/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author Daniel
 */
public class Cliente extends Persona {
  private String nit;
  Conexion cn;
  
  public  Cliente (){}

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
   public void agregar (){
     try {
         PreparedStatement parametro;
         String query = "INSERT INTO clientes (nit,nombres,apellidos,direccion,telefono,fecha_nacimiento) VALUES(?,?,?,?,?,?);";
            cn = new Conexion();
            cn.abrir_conexion();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1,this.getNit());
            parametro.setString(2,this.getNombres());
            parametro.setString(3,this.getApellidos());
            
            
            
     } catch (Exception ex){
     System.out.println("Error...."+ ex.getMessage());
     }   
       
   }

}
