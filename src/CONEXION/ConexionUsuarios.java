package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionUsuarios {
    private final String url = "jdbc:mysql://localhost/tarea4";
    private final String username = "root";
    private final String password = "";
    
    private Connection conn;
    private Statement stmnt;
    private ResultSet rs;
    private PreparedStatement ps;
    
    public void conectar() {
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmnt = conn.createStatement();
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void desconectar() {
        try {

            if (conn != null) {
                conn.close();
            }

            System.out.println("Desconectado");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void tryCon(String sql){
        
        try{
            stmnt.executeUpdate(sql);
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        
    }
    
    public static Connection getConexion() {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/tarea4","root","");
            
            return conn;          
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public void insertarUsuario(Usuarios usuarios) {
        conectar();

        String sql = "INSERT INTO usuarios(Nombre, Apellido, Telefono, Correo, Usuario, Contraseña, ConContraseña) "
                + "VALUES('" + usuarios.getNombre() + "', "
                + "'" + usuarios.getApellido() + "', "
                + "'" + usuarios.getTelefono() + "', "
                + "'" + usuarios.getCorreo() + "', "
                + "'" + usuarios.getUsuario() + "', "
                + "'" + usuarios.getContraseña() + "', "
                + usuarios.getConContraseña() + ")";

        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Usuario Agregado");
        
        desconectar();

    }
       
    public void borrarUsuario(Usuarios usuarios){
        conectar();
        
        String sql = "DELETE FROM usuarios WHERE Id = "
                + usuarios.getId();
        
        tryCon(sql);
        JOptionPane.showMessageDialog(null, "Usuario Eliminado");
        
        desconectar();
    }
    
    public void actualizarUsuario(Usuarios usuarios){
    conectar();
        String sql ="UPDATE usuarios SET Nombre= '"+ usuarios.getNombre()+"', Apellido = '"+ usuarios.getApellido() +"', Telefono = '"+ usuarios.getTelefono() +"', Correo = '" + usuarios.getCorreo() +"', Usuario = '" + usuarios.getUsuario() +"', Contraseña = '" + usuarios.getContraseña() +"', ConContraseña = '" + usuarios.getConContraseña() +"' where Id = '"+ usuarios.getId()+"'";        
        try {
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario Modificado");
        } catch (SQLException ex) {
        }

        desconectar();

    }
    
    public void buscarUsuario(Usuarios usuarios){
        conectar();

        String sql = "SELECT Id,Nombre,Apellido,Telefono,Correo,Usuario,Contraseña,ConContraseña FROM usuarios WHERE usuario = "
                + usuarios.getUsuario();
                
        try {
            ResultSet executeQuery = stmnt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        desconectar();
    }
    
}
