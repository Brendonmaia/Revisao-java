package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio43 {
    static void main() {
        int idade = 20;
        boolean temCarteirinhaEstudante = true;

        if (idade < 12 || temCarteirinhaEstudante) {
            System.out.println("Meia entrada");
        } else {
            System.out.println("Inteira");
        }
    }
}
