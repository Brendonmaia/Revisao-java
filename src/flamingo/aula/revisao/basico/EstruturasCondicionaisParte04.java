package flamingo.aula.revisao.basico;

public class EstruturasCondicionaisParte04 {

    public static void main(String[] args) {
        double salario = 7000;

        String msgPossoDoar = "Vou doar 500 reais para o Bigas";
        String msgNaoPossoDoar = "Não vou doar, mas um dia vou conseguir";


        String resultado = salario > 5000 ? msgPossoDoar : msgNaoPossoDoar;

        System.out.println(resultado);
    }
}
