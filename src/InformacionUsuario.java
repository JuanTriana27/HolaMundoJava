import java.util.Scanner;

public class InformacionUsuario {

    public static void main (String [] args){

        String nombreUsuario, apellidoUsuario;
        int edadUsuario;

        //clase:
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar Nombre: ");
        nombreUsuario = entrada.nextLine();

        System.out.print("Ingresar Apellido: ");
        apellidoUsuario = entrada.nextLine();

        System.out.print("Ingresar Edad: ");
        edadUsuario = entrada.nextInt();

        System.out.println("Hola " + nombreUsuario + " " + apellidoUsuario + ", tu edad es: " + edadUsuario);
    }
}