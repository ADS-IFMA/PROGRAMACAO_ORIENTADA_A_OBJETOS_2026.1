public class Calculadora {

    String operacao;
    double valor;

    double somar(double a, double b){
        double resultado = a + b;
        operacao = "Adição";
        valor = resultado;
        return resultado;
    }

    double subtrair(double a, double b){
        double resultado = a - b;
        operacao = "Subtração";
        valor = resultado;
        return resultado;
    }

    double multiplicar(double a, double b){
        double resultado = a * b;
        operacao = "Multiplicação";
        valor = resultado;
        return resultado;
    }

    double dividir(double a, double b){
        if(b == 0){
            System.out.println("Divisão por Zero");
            return 0;
        }
        double resultado = a / b;
        operacao = "Divisão";
        valor = resultado;
        return resultado;
    }

}
