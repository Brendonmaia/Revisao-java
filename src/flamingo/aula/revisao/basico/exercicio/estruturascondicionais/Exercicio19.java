package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio19 {
    static void main() {
        short valorCompra = 450;
        String valorFrete;

        if (valorCompra >= 200){
          valorFrete = "Frete grátis.";
        }else{
           valorFrete = "Frete de R$ 20,00.";
        }
        System.out.println(valorFrete);
    }
}