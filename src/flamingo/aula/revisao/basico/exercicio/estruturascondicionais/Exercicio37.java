package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio37 {

    static void main() {
        boolean temPermissao = true;

        // Usando o operador ternário (?) para definir a mensagem de acesso
        // Lê-se: "Se temPermissao for verdadeiro, então 'Acesso liberado', senão 'Acesso negado'"
        String mensagem = temPermissao ? "Acesso liberado" : "Acesso negado";

        System.out.println(mensagem);
    }
}
