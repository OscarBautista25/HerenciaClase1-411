public class CuentaBancaria {
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;
    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }
    /*La logica de retirar se plantea basado en la condición que cantidad no puede ser mayor que saldo  */
    public void retirar(float cantidad){

        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    /*Interes mensual es diferente a comision mensual:  */
    public void calcularInteres(){
        float tasaMensual = tasaAnual/12;
        float interesMensual = saldo*tasaMensual;
        saldo = saldo - interesMensual;
    }
    public void calcularExtractoMensual(){
        saldo = saldo - comisionMensual;
        calcularInteres();

    }

    public void imprimir(){
        System.out.println("Saldo = " +saldo);
        System.out.println("Comision Mensual = " + comisionMensual);
        System.out.println("Numero de consignaciones = " +numeroConsignaciones);
        System.out.println("Numero de retiros = " +numeroRetiros);
        System.out.println("Tasa Anual = " +tasaAnual);
    }
   



    
}