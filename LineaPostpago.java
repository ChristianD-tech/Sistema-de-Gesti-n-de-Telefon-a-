//SUB CLASE 
package SistemaTelefonico;


public class LineaPospago extends LineaTelefonica{
//CREAMOS LOS ATRUBUTOS DE LA CLASE 
    private double limiteCredito;
    private double cargoFijoMensual;
    //CREAMOS EL CONSTRUCTOR
    public LineaPospago(String numero, String propietario, double minutosConsumidos, double saldo, double limiteCredito, double cargoFijoMensual) {
        super(numero, propietario, minutosConsumidos, saldo);
        this.limiteCredito = limiteCredito;
        this.cargoFijoMensual = cargoFijoMensual;
    }
    public double getLimiteCredito() { 
        return limiteCredito; 
    }
    public void setLimiteCredito(double limiteCredito) { 
        this.limiteCredito = limiteCredito; 
    }
    public double getCargoFijoMensual() {
        return cargoFijoMensual; 
    }
    public void setCargoFijoMensual(double cargoFijoMensual) {
        this.cargoFijoMensual = cargoFijoMensual; 
    }

    // Método para calcular la factura final sumando el cargo fijo mensual más el costo del consumo de minutos
    public double calcularFacturaFinal() {
        return this.cargoFijoMensual + calcularCostoConsumo();
    }
}
