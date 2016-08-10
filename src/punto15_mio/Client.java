package punto15_mio;


public class Client extends Personal_Date {
    
    private double saldo=0;
    
    public void Actualizar_Datos(){
        this.Loading_Data();
    }
    
    public void Consignacion(double cons){
        if(cons>0)
            saldo = saldo+cons;
        else{
            System.out.println("No se pueden consignar valores negativos!");
            System.out.println("");
        }    
    }
    
    public void Retirar(double ret){
        if(ret>saldo){
            System.out.println("Tiene dinero insuficiente para realizar el retiro!");
            System.out.println("");
        }    
        else
            saldo = saldo-ret;
    }   
    
    public void Consultar_Saldo(){
        System.out.println("Saldo actual de la cuenta: " + saldo);
        System.out.println("");
    }
    
}
