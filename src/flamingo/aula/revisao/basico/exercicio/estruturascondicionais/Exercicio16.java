package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio16 {
    static void main() {
        double valorCompra = 200;
        double valorFinal;
        if (valorCompra >= 200){
            valorFinal = 200 * 0.90;
        }else {
            valorFinal = valorCompra;
        }
            System.out.println("O valor final da compra é:" + valorFinal);


    }

}
