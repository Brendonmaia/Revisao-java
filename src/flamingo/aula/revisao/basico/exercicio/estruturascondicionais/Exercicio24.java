package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio24 {

    static void main() {
        double temperatura = 28.5;
        String classificacao;

        if (temperatura < 15) {
            classificacao = "Frio";
        } else if (temperatura >= 15 && temperatura <= 25) {
            classificacao = "Agradável";
        } else if (temperatura >= 26 && temperatura <= 35) {
            classificacao = "Quente";
        } else {
            classificacao = "Muito quente";
        }

        System.out.println("A temperatura está: " + classificacao);
    }
}
