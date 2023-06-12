//Esta clase hace parte del backend del proyecto
//La función de esta clase es tener toda la estructura básica del proyecto para poder realizar todas las operaciones.
//Aquí coloco los atributos de las entidades de la base de datos
//Inserto getters y setters
//Creos dos constructores:
//Uno vacío y otro para envíar los datos a la DB cuando se esté creando un mensaje (con los parámetros correspondientes)
public class Mensajes {
    //Atributos
    int id_mensaje;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;
    //Métodos
    //Método constructor
    public Mensajes() {
    }
    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    //Métodos getter y setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}
