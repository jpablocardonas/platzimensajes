//DAO: Data Access Object
//Esto es para Aquí van los métodos que van a permitir la conexión con la base de datos mediante los siguientes métodos.
//REFLEXIONAR: ¿Por qué los métodos deben ser estáticos?

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mensajesDAO {
    //Atributos

    //Métodos
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO `mensajes` (`mensaje`, `autor_mensaje`) VALUES (?,?);";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajeDB(){
        Conexion db_connect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM `mensajes`";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            System.out.println("Mensaje creado");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
            }

        } catch (SQLException e){
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }
    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM mensajes WHERE `mensajes`.`id_mensaje` = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("Mensaje borrado.");
            } catch (SQLException ex) {
                System.out.println(ex);
                System.out.println("No se pudo borrar el mensaje.");
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void actualizarMensajeDB(String id_mensaje, String nuevo_mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE `mensajes` SET `mensaje` = ? WHERE `mensajes`.`id_mensaje` = ?;";
                ps = conexion.prepareStatement(query);
                ps.setString(1, nuevo_mensaje);
                ps.setString(2, id_mensaje);
                ps.executeUpdate();
                System.out.println("Mensaje actualizado.");
            } catch (SQLException ex) {
                System.out.println(ex);
                System.out.println("No se pudo actualizar el mensaje");
            }
        } catch (SQLException e){
            System.out.println(e);
        }

    }

}
