package flamingo.aula.revisao.basico;

import java.time.LocalDate;

public class ExercicioPrimitivos {

    static String nome = "Brendon";
    static String endereco = "Avenida Raimundo Pereira de Magalhães";
    static double salario = 1500.00;
    static LocalDate data = LocalDate.of(2026, 8, 14);

    public static void main(String[] args) {
        System.out.printf("Eu %s, morando no endereço %s, confirmo o salário de %.2f na data %s%n",
                nome, endereco, salario, data);
    }
}