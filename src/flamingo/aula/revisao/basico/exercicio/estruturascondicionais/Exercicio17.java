package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio17 {
    static void main() {
        byte idade = 18;
        boolean temCnh = false;
        String resultado;

        if (idade >= 18 && temCnh){
            resultado = "Pode dirigir.";

        }else{

            resultado = "Não pode dirigir.";
        }
        System.out.println(resultado);

    }
}
