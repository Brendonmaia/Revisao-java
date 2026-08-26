package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio33 {
    static void main() {
        double saldo = 150.0;
        double valorProduto = 100.0; // Valor do que você quer comprar

        // Usando o operador ternário (?) para definir a mensagem
        // Lê-se: "Se saldo >= valorProduto, então 'Compra aprovada', senão (:) 'Saldo insuficiente'"
        String resultado = saldo >= valorProduto ? "Compra aprovada" : "Saldo insuficiente";

        System.out.println(resultado);
    }
}