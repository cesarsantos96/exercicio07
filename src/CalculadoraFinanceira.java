public class CalculadoraFinanceira extends Calculadora{

    public double calcularJurosSimples(double principal, double taxaDeJuros, int tempo){
        return principal * taxaDeJuros * tempo;
    }

    public double calcularMontante(double principal, double taxaDeJuros, int tempo){
        return principal + calcularJurosSimples(principal, taxaDeJuros,tempo);
    }
}
