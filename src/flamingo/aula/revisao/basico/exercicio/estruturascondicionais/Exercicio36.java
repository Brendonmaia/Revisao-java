package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio36 {
    static void main() {
        boolean usuarioLogado = true;


        // Lê-se: "Se usuarioLogado for verdadeiro, então 'Usuário logado', senão 'Usuário desconectado'"
        String mensagem = usuarioLogado ? "Usuário logado" : "Usuário desconectado";

        System.out.println(mensagem);
    }
}

