package operacao;

public class OperacoesAvancadas {

    double resultado = 0;

    public double potencia(double base) {
        resultado = Math.pow(base, 2);
        return resultado;
    }

    public double raiz(double base) {
        resultado = Math.sqrt(base);
        return resultado;
    }

    public double porcentagemMais(double a, double b) {
        double resultado1 = (a * b) / 100;
        resultado = resultado1 + a;
        return resultado;
    }

    public double porcentagemMenos(double a, double b) {
        double resultado1 = (a * b) / 100;
        resultado = a - resultado1;
        return resultado;
    }

    public double porcentagemMultiplo(double a, double b) {
        double resultado1 = (a * b) / 100;
        resultado = resultado1;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
