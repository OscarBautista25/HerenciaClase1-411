import java.util.Scanner;

public class PruebaCuentaAhorros {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Cuenta de Ahorros");
        System.out.println("Ingrese saldo inicial = $");
        float saldoInicialAhorros = in.nextFloat();
        System.out.println("Ingrese una tasa de interes anual");
        float tasa = in.nextFloat();
        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(saldoInicialAhorros, tasa);
        System.out.println("Ingrese la cantidad a consignar = $");
        float cantidadConsignar = in.nextFloat();
        cuentaAhorros1.consignar(cantidadConsignar);
        System.out.println("Ingrese la cantidad a retirar = $");
        float cantidadRetirar = in.nextFloat();
        cuentaAhorros1.retirar(cantidadRetirar);
        System.out.println("Ingrese la cantidad a consignar = $");
        float cantidadConsignar2 = in.nextFloat();
        cuentaAhorros1.consignar(cantidadConsignar2);
        System.out.println("Ingrese la cantidad a retirar = $");
        float cantidadRetirar2 = in.nextFloat();
        cuentaAhorros1.retirar(cantidadRetirar2);
        cuentaAhorros1.calcularExtractoMensual();
        cuentaAhorros1.imprimir();
        in.close();
        
    }
}
