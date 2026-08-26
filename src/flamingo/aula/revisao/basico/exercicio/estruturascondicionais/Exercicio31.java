package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio31 {
    static void main() {

        byte idade = 12;

        String maiorDeIdade = "Você é de Maior";
        String menorDeIdade = "Você é de Menor";

        String resultado = idade > 18 ? maiorDeIdade : menorDeIdade;

        System.out.println(resultado);
    }
}
