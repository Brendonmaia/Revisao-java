package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio21 {
    static void main() {
        byte idade = 60;
        String resultadoIdade;

        if (idade < 12){
            resultadoIdade = "Criança.";
            
        } else if (idade >= 12 && idade <= 17) {
            resultadoIdade = "Adolescente";
            
        } else if (idade >=18 && idade <=59) {
            resultadoIdade = "Adulto";
            
        }else{
          resultadoIdade = "idoso";

        }
        System.out.println(resultadoIdade);
    }

}
