public class Main {
    public static void main(String[] args) {

    CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
    double resultadoCientifico = calcCientifica.potencia(2, 3);
        System.out.println("Potência: " + resultadoCientifico);

        CalculadoraFinanceira calcFinanceira = new CalculadoraFinanceira();
        double juros = calcFinanceira.calcularJurosSimples(1340, 1.05,2);
        System.out.println("Juros Simples: "+ juros);

    }
}