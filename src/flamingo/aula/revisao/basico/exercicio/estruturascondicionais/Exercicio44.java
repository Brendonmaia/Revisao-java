package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio44 {
    static void main() {
        String emailDigitado = "teste@email.com";
        String senhaDigitada = "123456";

        String emailCorreto = "teste@email.com";
        String senhaCorreta = "123456";
        boolean contaAtiva = true;

        if (!contaAtiva) {
            System.out.println("Conta bloqueada");
        } else if (emailDigitado.equals(emailCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login realizado");
        } else {
            System.out.println("Dados inválidos");
        }
    }
}
