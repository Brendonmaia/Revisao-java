package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio28 {

    static void main() {
        int plano = 2;
        String descricaoPlano;

        if (plano == 1) {
            descricaoPlano = "Plano Básico - R$ 29,90";
        } else if (plano == 2) {
            descricaoPlano = "Plano Intermediário - R$ 59,90";
        } else if (plano == 3) {
            descricaoPlano = "Plano Premium - R$ 99,90";
        } else {
            descricaoPlano = "Plano inválido";
        }
            System.out.println(descricaoPlano);

    }
}
