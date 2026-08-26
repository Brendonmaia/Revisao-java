package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio23 {

    static void main() {
        double salario = 4500.00;
        String classificacao;

        if (salario <= 1500) {
            classificacao = "Salário baixo";
        } else if (salario >= 1501 && salario <= 3000) {
            classificacao = "Salário médio";
        } else if (salario >= 3001 && salario <= 7000) {
            classificacao = "Salário bom";
        } else {
            classificacao = "Salário alto";
        }

        System.out.println("Classificação do salário: " + classificacao);
    }
}

