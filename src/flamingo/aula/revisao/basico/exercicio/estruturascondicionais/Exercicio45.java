package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio45 {
    static void main() {
        double valorCompra = 350.0;
        double percentualDesconto = 0.0;

        if (valorCompra <= 100) {
            percentualDesconto = 0.0;
        } else if (valorCompra <= 300) {
            percentualDesconto = 0.05;
        } else if (valorCompra <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Porcentagem de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
