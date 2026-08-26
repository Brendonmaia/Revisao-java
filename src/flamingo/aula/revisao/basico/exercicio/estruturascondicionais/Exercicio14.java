package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio14 {
    static void main() {

        boolean emailCorreto = true;
        boolean senhaCorreta = false;
        String resultado;

        if (emailCorreto && senhaCorreta){
        resultado = "Login realizado com sucesso.";
    }else{
            resultado ="Email ou senha inválidos.";
        }
        System.out.println(resultado);
        }
}
