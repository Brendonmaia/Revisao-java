package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio34 {
    static void main() {
        int numero = 7;

        // Usando o operador ternário para definir se é par ou ímpar
        // "Se o resto da divisão por 2 for 0, então 'Par', senão 'Ímpar'"
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é: " + resultado);
    }
}
