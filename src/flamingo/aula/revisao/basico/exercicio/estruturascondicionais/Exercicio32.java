package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio32 {
    static void main() {
        double nota = 7.0;
        String AlunoReprovado = "Reprovado";
        String AlunoAprovado = "Aprovado";

        String resultado = nota > 5 ? AlunoAprovado : AlunoReprovado;
        System.out.println(resultado);
    }
}
