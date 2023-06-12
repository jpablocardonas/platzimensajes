//Esta clase funciona como una capa intermedia entre la DAO (BD) y el frontEND (menú).

import java.util.Scanner;

public class mensajesService {
    //Atributos

    //Métodos
    public static void crearMensaje(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu mensaje: ");
        String mensaje = entrada.nextLine();

        System.out.println("Escribe tu nombre: ");
        String nombre = entrada.nextLine();

        Mensajes registro = new Mensajes();

        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);

        mensajesDAO.crearMensajeDB(registro);

    }
    public static void listarMensajes(){
        mensajesDAO.leerMensajeDB();
    }
    public static void borrarMensajes(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el id del mensaje que desea borrar: ");
        int id_mensaje = entrada.nextInt();
        mensajesDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensjaes(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el ID del mensaje que desea editar: ");
        String id_mensaje_editar = entrada.nextLine();
        System.out.println("Escriba su nuevo mensaje: ");
        String  mensaje_editado = entrada.nextLine();

        mensajesDAO.actualizarMensajeDB(id_mensaje_editar, mensaje_editado);
    }
}
