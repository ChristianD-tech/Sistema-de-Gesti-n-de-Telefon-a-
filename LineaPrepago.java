//SUB CLASE
package SistemaTelefonico;


public class LineaPrepago extends LineaTelefonica {
    //CREAMOS LOS ATRUBUTOS DE LA CLASE 
    private double saldoRecargado;
    //CREAMOS EL CONSTRUPTOR
    public LineaPrepago(String numero, String propietario, double minutosConsumidos, double saldo, double saldoRecargado) {
    super(numero, propietario, minutosConsumidos, saldo);
    setSaldoRecargado(saldoRecargado);
    }
    public double getSaldoRecargado() { 
        return saldoRecargado; 
    }
    //VERIFECAMOS QUE EL RECARGO DEL SALDO NO SEA NEGATIVO
    public void setSaldoRecargado(double saldoRecargado) {
        if (saldoRecargado >= 0) {
            this.saldoRecargado = saldoRecargado;
        } else {
            System.out.println("ERROR: EL SALDO RECARGADO NO PUEDE SER NEGATIVO.");
        }
    }

// METODO PARA SIMULAR UNA LLAMADA TELEFONICA Y DESCONTAR EL COSTO DEL SALDO DISPONIBLE
    public void simularLlamada(double minutos) {
        // CALCULAMOS EL COSTO DE LA LLAMADA
        double costo = minutos * TARIFA_MINUTO;
        
        // VERIFICAMOS SI HAY SUFICIENTE RECARGO PARA EFECTUAR LA LLAMADA
        if (saldoRecargado >= costo) {
            saldoRecargado -= costo; // Descuenta el costo del saldo
            // ACTUALIZAMOS LOS MINUTOS CONSUMIDOS MAS LOS NUEVOS
            setMinutosConsumidos(getMinutosConsumidos() + minutos);
            System.out.println("Llamada prepago exitosa. Saldo restante: $" + saldoRecargado);
        } else {
            System.out.println("ERROR: SALDO INSUFICIENTE PARA REALIZAR LA LLAMADA.");
        }
    }

}
