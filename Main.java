//CLASE PRINCIPAL
package SistemaTelefonico;

public class Main {
 public static void main(String[] args) {
        System.out.println(" ---------- SISTEMA DE GESTIÓN DE TELEFONÍA ---------- ");

        // 1) PRUEBA LÍNEA PREPAGO.
        LineaPrepago prepago = new LineaPrepago("3101234467", "Diana Pérez", 0, 0, 10000);
        
        System.out.println("\n--- RESULTADOS PREPAGO ---");
        System.out.println("Propietario: " + prepago.getPropietario());
        System.out.println("Número: " + prepago.getNumero());
        prepago.simularLlamada(20); 

        // 2) PRUEBA LÍNEA POSPAGO.
        LineaPospago postpago = new LineaPospago("3209876543", "Carlos Gómez", 30, 0, 50000, 25000);
        
        System.out.println("\n--- RESULTADOS POSTPAGO ---");
        System.out.println("Propietario: " + postpago.getPropietario());
        System.out.println("Número: " + postpago.getNumero());
        System.out.println("Minutos consumidos: " + postpago.getMinutosConsumidos());
        System.out.println("Costo por consumo de minutos: $" + postpago.calcularCostoConsumo());
        System.out.println("Cargo fijo mensual: $" + postpago.getCargoFijoMensual());
        System.out.println("Factura Total a Pagar: $" + postpago.calcularFacturaFinal());
    }
}
