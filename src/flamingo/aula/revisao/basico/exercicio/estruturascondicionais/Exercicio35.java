package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio35 {

    static void main() {
        double valorCompra = 150.0;

        // Lê-se: "Se valorCompra >= 100, então 'Tem desconto', senão 'Não tem desconto'"
        String mensagem = (valorCompra >= 100) ? "Tem desconto" : "Não tem desconto";

        System.out.println(mensagem);
    }
}
