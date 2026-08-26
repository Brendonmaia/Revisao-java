package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio22 {
    static void main() {
        int nota = 9;
        String resultado;

        if (nota >= 9){
            resultado = "Excelente.";

        } else if (nota >=7) {
            resultado = "Bom.";

        } else if (nota >= 5) {
          resultado = "Recuperação.";

        }else{

        resultado = "reprovado.";

    }
        System.out.println(resultado);

    }
}
