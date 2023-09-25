public class CalculadoraCientifica extends Calculadora {
    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Não existe raiz quadrada com números negativos");
        }
        return Math.sqrt(numero);
    }


}
