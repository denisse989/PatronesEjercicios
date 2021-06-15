package Examen.Ejercicio2Chain;

//. (Chain of Responsability) Se tiene un chat de comunicación entre un chat educativo
//donde solo se admiten Estudiantes (numero matricula, nombre), Docentes (ci, nombre) y
//administrativos( nombre, cargo) , los estudiantes pueden decidir si su mensaje es
//enviado a todos, solo a docentes o solo administrativos. los docentes solo envian
//mensajes a docentes y estudiantes, los administrativos envian mensajes a todos

public class Cliente {
    public static void main(String[] args) {


        ChatDeComunicacion chatDeComunicacion = new ChatDeComunicacion();


        chatDeComunicacion.mensaje("A todos");
        chatDeComunicacion.mensaje("Solo docentes");
        chatDeComunicacion.mensaje("Solo Administrativos");
        chatDeComunicacion.mensaje("Solo a docentes y estudiantes");
        chatDeComunicacion.mensaje("A todas las personas");

    }
}
