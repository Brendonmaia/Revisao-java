package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio42 {
    static void main() {
        double saldo = 80.0;
        double valorProduto = 100.0;
        boolean clienteVip = true;

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada");
        } else if (clienteVip) {
            System.out.println("Compra aprovada pelo crédito VIP");
        } else {
            System.out.println("Compra recusada");
        }
    }
}
