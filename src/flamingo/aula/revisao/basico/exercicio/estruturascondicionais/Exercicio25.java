package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio25 {

    static void main() {
        int xp = 7500;
        String patente;

        if (xp < 1000) {
            patente = "Iniciante";
        } else if (xp >= 1000 && xp <= 4999) {
            patente = "Intermediário";
        } else if (xp >= 5000 && xp <= 9999) {
            patente = "Avançado";
        } else {
            patente = "Lendário";
        }

        System.out.println("Patente do jogador: " + patente);
    }
}



