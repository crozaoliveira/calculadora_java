package operacao;

public class OperacoesBasicas {
    

    double resultado = 0;

    public double somar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    public double subtrair(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    public double dividir(double a, double b) {
        resultado = a / b;
        return resultado;
    }

    public double multiplicar(double a, double b) {
        resultado = a * b;
        return resultado;
    }
    
    public double maisMenos(double a){
        resultado = a * -1;
        return resultado;
    }    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
