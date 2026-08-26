package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio39 {

    static void main() {
        double valorCompra = 120.0;

        double valorFrete = (valorCompra >= 150) ? 0.0 : 20.0;

        System.out.println("Valor do frete: R$ " + valorFrete);
    }
}
