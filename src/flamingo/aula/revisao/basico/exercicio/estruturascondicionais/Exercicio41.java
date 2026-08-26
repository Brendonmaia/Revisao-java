package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio41 {
    static void main() {
        double nota = 8.0;
        int presenca = 80;

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
