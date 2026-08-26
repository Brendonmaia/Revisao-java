package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio12 {
    static void main() {
        float nota = 5.5f;
        String resultado;

        if (nota >= 7) {
            resultado = "Aprovado.";

        } else {
            resultado = "Reprovado.";
        }
        System.out.println(resultado);
    }
}