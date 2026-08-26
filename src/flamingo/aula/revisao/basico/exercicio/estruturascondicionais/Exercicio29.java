package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio29 {

    static void main() {
        double imc = 22.5; // Tentar mudar esse valor para testar as faixas!
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade"; // Qualquer valor de 30 ou mais cai aqui
        }

        System.out.println("Classificação do IMC: " + classificacao);
    }
}
