public class CuentaAhorros extends CuentaBancaria{
    protected boolean activa;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000 ) {
            activa = false;
        } else {
            activa = true;
        }
    }
    public void consignar(float cantidad){
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void retirar(float cantidad){
        if (activa) {
            super.retirar(cantidad);
        }
     
    }

    public void calcularExtractoMensual(){
        if (numeroRetiros>1) {
            comisionMensual = comisionMensual + (numeroRetiros-1)*1000;
            super.calcularExtractoMensual();
        }
        if (saldo<10000) {
            activa=false;
        }
    }

    public void imprimir(){
        System.out.println("El numero de transacciones es = "+(numeroConsignaciones+numeroRetiros));
        super.imprimir();
    }
    
}
