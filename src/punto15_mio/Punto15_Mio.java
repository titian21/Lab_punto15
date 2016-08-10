package punto15_mio;

import java.util.Scanner;

public class Punto15_Mio {
    
    public static void main(String[] args) {
        
        Client cliente = new Client();
        
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        double valor = 0;
        
        do{
             System.out.println("Seleccione alguna de las siguientes opciones: ");
             System.out.println("1. Ingresar datos.");
             System.out.println("2. Actualizar datos.");
             System.out.println("3. Consignar.");
             System.out.println("4. Retirar.");
             System.out.println("5. Consultar saldo.");
             System.out.println("6. Consultar todos los datos.");
             System.out.println("7. salir");
             System.out.println("");
        
             opcion=leer.nextInt();
             
             System.out.println("");
             
             switch(opcion){
                 
                 case 1:cliente.Loading_Data();
                        break;
                        
                 case 2:cliente.Actualizar_Datos();
                        break;
                        
                 case 3:System.out.print("Ingrese el valor a consignar: ");
                        valor = leer.nextDouble();
                        System.out.println("");
                        cliente.Consignacion(valor);
                        break;
                        
                 case 4:System.out.print("Ingrese el valor a retirar: ");
                        valor = leer.nextDouble();
                        System.out.println("");
                        cliente.Retirar(valor);
                        break;
                        
                 case 5:cliente.Consultar_Saldo();
                        break;
                        
                 case 6:cliente.Data_Show();
                        break;
                        
                 case 7:break;       
                 
                 default:System.out.println("La opcion ingresada no es correcta!");
                 
             }
             
        } while(opcion != 7);
        
    }
    
    //public void Run(){
    
}
   
