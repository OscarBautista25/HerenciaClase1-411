public class CuentaCorriente extends CuentaBancaria{
    float sobregiro=0;
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;
        if (resultado<0) {
            sobregiro = sobregiro - resultado;
        } else {
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;
        if (sobregiro>0) {
            if (residuo > 0) {
                sobregiro = sobregiro - residuo;
                saldo=0;
            } else {
                sobregiro = 0;
                saldo = 0 - residuo;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    public void calcularExtractoMensual(){
        super.calcularExtractoMensual();
    }

    public void imprimir(){
        System.out.println("El numero de transacciones es = "+(numeroConsignaciones+numeroRetiros));
        System.out.println("El sobregiro es = " +sobregiro);
        super.imprimir();
    }


    
    
}
