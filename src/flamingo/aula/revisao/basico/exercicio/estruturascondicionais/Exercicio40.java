package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio40 {

    static void main() {
        double salario = 2500.0;

        double bonus = (salario < 3000) ? 500.0 : 200.0;

        System.out.println("Valor do bônus: R$ " + bonus);
    }
}
