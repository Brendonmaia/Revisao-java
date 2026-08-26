package flamingo.aula.revisao.basico.exercicio.estruturascondicionais;

public class Exercicio30 {

        static void main() {
            int tipoCliente = 8;
            String cliente;
            double descontoCliente = 0.0;
            double valorCompra = 500;

            if (tipoCliente == 1 ){
               descontoCliente = 0.0;
                cliente ="Cliente comum";
             
            } else if (tipoCliente == 2) {
                descontoCliente = 0.05;
                        cliente = "Cliente bronze";

                
            } else if (tipoCliente == 3) {
                descontoCliente = 0.10;
                cliente = "Cliente prata";

            }else if (tipoCliente == 4) {
                descontoCliente = 0.15;
                cliente = "Cliente ouro";

            }else{
                descontoCliente = 0.0;
                      cliente = "Invalido";
            }
            System.out.println(cliente);
            }
    }



