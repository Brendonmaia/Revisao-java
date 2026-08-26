package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio13 {
    static void main() {
        int saldo = 110;
        int valorProduto = 50;
String resultado;

        if (saldo >= valorProduto) {
          resultado = ("Compra aprovada.");

        }else {
            resultado = ("Saldo insuficiente");
        }
        System.out.println(resultado);
    }
}
