package SistemaTelefonico;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------- SISTEMA DE GESTIÓN DE TELEFONÍA ---------- ");

        // Definimos la misma cantidad de minutos a consumir para ambas líneas
        double minutosConsumo = 30;

        // 1) PRUEBA LÍNEA PREPAGO (Inicia en 0 min consumidos y $20,000 de saldo recargado)
        LineaPrepago prepago = new LineaPrepago("3101234467", "Diana Pérez", 0, 10, 20000);
        
        System.out.println("\n--- RESULTADOS PREPAGO ---");
        System.out.println("Propietario: " + prepago.getPropietario());
        System.out.println("Número: " + prepago.getNumero());
        // Simula una llamada con la misma cantidad de minutos (30 min)
        prepago.simularLlamada(minutosConsumo); 
        System.out.println("Minutos consumidos totales: " + prepago.getMinutosConsumidos());
        System.out.println("Costo por consumo (" + prepago.getMinutosConsumidos() + " min): $" + prepago.calcularCostoConsumo());


        // 2) PRUEBA LÍNEA POSPAGO (Sombra/compara con exactamente 30 min consumidos)
        LineaPospago postpago = new LineaPospago("3209876543", "Carlos Castillo", 0, 0, 40000, 35000);
        // Le asignamos la misma cantidad de minutos consumidos
        postpago.setMinutosConsumidos(minutosConsumo);
        
        System.out.println("\n--- RESULTADOS POSTPAGO ---");
        System.out.println("Propietario: " + postpago.getPropietario());
        System.out.println("Número: " + postpago.getNumero());
        System.out.println("Minutos consumidos totales: " + postpago.getMinutosConsumidos());
        System.out.println("Costo por consumo (" + postpago.getMinutosConsumidos() + " min): $" + postpago.calcularCostoConsumo());
        System.out.println("Cargo fijo mensual: $" + postpago.getCargoFijoMensual());
        System.out.println("Factura Total a Pagar: $" + postpago.calcularFacturaFinal());
    }
}
