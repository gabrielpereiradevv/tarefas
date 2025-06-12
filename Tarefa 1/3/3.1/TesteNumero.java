class Numero {
    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("O valor do atributo é: " + this.valor);
    }
}

public class TesteNumero {
    public static void main(String[] args) {
        Numero meuNumero = new Numero();
    
        meuNumero.setValor(123);

        meuNumero.imprimirValor();

        int enderecoSimulado = System.identityHashCode(meuNumero);
        System.out.println("Endereço de memória (simulado) do objeto: " + enderecoSimulado);
    }
}