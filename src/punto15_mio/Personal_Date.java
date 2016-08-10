package punto15_mio;

import java.util.Scanner;

public class Personal_Date {
    
    Scanner leer=new Scanner(System.in);
    private String nombre, apellido, cedula, edad, fecha, direccion, telefono;
    
    public void Loading_Data(){
        System.out.print("Ingrese el nombre: ");
        nombre=leer.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido=leer.nextLine();
        System.out.print("Ingrese la cedula: ");
        cedula=leer.nextLine();
        System.out.print("Ingrese la edad: ");
        edad=leer.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        fecha=leer.nextLine();
        System.out.print("Ingrese la dirección: ");
        direccion=leer.nextLine();
        System.out.print("Ingrese el telefono: ");
        telefono=leer.nextLine();
        System.out.println("");
    }
    
    public void Data_Show(){
        System.out.println("Los datos del usuario son los siguientes:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de nacimiento: " + fecha);
        System.out.println("Dirección de residencia: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("");
    }
    
}
