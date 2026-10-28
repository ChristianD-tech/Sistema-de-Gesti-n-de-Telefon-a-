//CLASE PADRE

package SistemaTelefonico;

public class LineaTelefonica {
//ATRIBUTOS PRIVADOS
private String numero;
private String propietario;
private double minutosConsumidos;
private double saldo;

//DETERMINAMOS LA CONSTANTE DE TARIFA (FIANL:SIRVE PARA ASIGNAR CONSTANTE)

public static final double TARIFA_MINUTO = 150.0;

//CONSTRUCTOR Y METODO SET(SET NO PERMITE NEGATIVOS)
public LineaTelefonica(String numero,String pripietario, double minutosConsumidos, double saldo){
    this.numero = numero;
    this.propietario = propietario;
    //utilizamos set para vañidar que no ingresen numeros negativos
    setMinutosConsumidos(minutosConsumidos);
    setSaldo(saldo);
    
}
public String getNumero(){
    return numero;
}
public void setNumero(String numero) { 
    this.numero = numero; 
}
public String getPropietario() { 
    return propietario; 
}
public void setPropietario(String propietario) { 
    this.propietario = propietario; 
}
public double getMinutosConsumidos() { 
    return minutosConsumidos; 
}
//VERIFICAMOS QUE LOS MINUTOS DE LLAMADA NO SEAN NEGATIVOS
public void setMinutosConsumidos(double minutosConsumidos){
    if (minutosConsumidos >= 0){
        this.minutosConsumidos = minutosConsumidos;
    }else{
        System.out.println("ERROR: LOS MINUTOS NO PUEDEN SER NEGATIVOS.");
        
    }
}
public double getSaldo(){
    return saldo;
}
//VERIFICAMOS QUE EL SALDO NO SEA NEGATIVO
public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("ERROS: EL SALDO NO PUEDE SER NEGATIVO.");
        }
    }

//CREAMOS EL METODO PARA CALCULAR EL COSTO
public double calcularCostoConsumo() {
        return this.minutosConsumidos * TARIFA_MINUTO;
    }
}
