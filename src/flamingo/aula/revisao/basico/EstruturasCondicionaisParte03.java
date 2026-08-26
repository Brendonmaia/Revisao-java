package flamingo.aula.revisao.basico;

public class EstruturasCondicionaisParte03 {
    static void main() {
        //if - elseif - else
        /*
        * Infantil < 15
        * Juvenil >= 15 e < 18
        * adulto >= 18
        * */
        byte idade = 20;
        String resultado;

        if (idade < 15) {
            resultado = "Infantil";

        }else if (idade < 18) {
            resultado =  "Juvenil";

        }else {
      resultado = "Adulto";
        }
        System.out.println(resultado);
    }
}
