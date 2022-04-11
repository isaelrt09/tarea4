package CONEXION;

public class Usuarios {
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Correo;
    private String Usuario;
    private String Contraseña;
    private String ConContraseña;

    public Usuarios(String Nombre, String Apellido, String Telefono, String Correo, String Usuario, String Contraseña, String ConContraseña) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.ConContraseña = ConContraseña;
    }

    public Usuarios(int Id, String Nombre, String Apellido, String Telefono, String Correo, String Usuario, String Contraseña, String ConContraseña) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.ConContraseña = ConContraseña;
    }

    public Usuarios(int Id, String Nombre, String Apellido, String Telefono, String Correo, String Usuario) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Usuario = Usuario;
    }

    public Usuarios(int Id) {
        this.Id = Id;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConContraseña() {
        return ConContraseña;
    }

    public void setConContraseña(String ConContraseña) {
        this.ConContraseña = ConContraseña;
    }
    
    
}
