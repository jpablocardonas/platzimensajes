import java.sql.Connection;
import java.util.Scanner;

public class Inicio{
    //Atributos

    //Métodos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("-----------------");
            System.out.println("MENÚ PRINCIPAL:");
            System.out.println("1. Crear mensaje.");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Borrar mensajes");
            System.out.println("5. Salir del menú");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: mensajesService.crearMensaje();
                    break;
                case 2: mensajesService.listarMensajes();
                    break;
                case 3: mensajesService.editarMensjaes();
                    break;
                case 4 : mensajesService.borrarMensajes();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);




    }
}