import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Barbara Rodrigues de Carvalho Esteves";
        String tipoConta = "Conta Corrente";
        double saldo = 3000;
        double deposito = 0, saque = 0, transf = 0;
        int conta = 0, agencia = 0;

        System.out.println("*********************************************************");
        System.out.println("Dados iniciais do cliente\n");
        System.out.println("Nome:                 " + nome);
        System.out.println("Tipo de conta:        " + tipoConta);
        System.out.printf("Saldo inicial:        %.2f \n", saldo);
        System.out.println("********************************************************");

        int operacao = 0;
        while (operacao != 5) {
            System.out.println("\n Operações...\n");
            System.out.println("1 - Consultar valores");
            System.out.println("2 - Depósito de valor");
            System.out.println("3 - Saque de valor");
            System.out.println("4 - Transferir valor");
            System.out.println("5 - sair");
            System.out.println("Digite a opção desejada: ");
             operacao = scanner.nextInt();

              switch (operacao) {
                  case 1:
                      System.out.println("** Menu de consulta de valores **");
                      System.out.printf("Seu saldo atual é: R$ %.2f", saldo);
                      ;
                      break;

                  case 2:
                      System.out.println("** Menu de Depósito **");
                      System.out.println("Digite o valor que deseja depositar:");
                      deposito = scanner.nextDouble();
                      saldo = saldo + deposito;
                      System.out.println("Depósito realizado com sucesso!!");
                      break;

                  case 3:
                      System.out.println("** Menu de saque **");
                      System.out.println("Digite o valor que deseja sacar:");
                      saque = scanner.nextDouble();
                        if (saque <= saldo){
                            saldo = saldo - saque;
                            System.out.println("Retire as notas no local indicado");
                        }else{
                            System.out.println("Saldo insuficiente!!");
                        }

                      break;

                  case 4:
                      System.out.println("** Menu de transferência **");
                      System.out.println("Digite a Conta e Agencia do destinatário: ");
                      conta = scanner.nextInt();
                      agencia = scanner.nextInt();
                      System.out.println("Digite o valor que deseja transferir:");
                      transf = scanner.nextDouble();
                      if (transf <= saldo){
                          saldo = saldo - transf;
                          System.out.println("Transferência realizada com sucesso!");
                      }else{
                          System.out.println("Saldo insuficiente!!");
                      }
                      break;

                  default:
                      System.out.println("Obrigada e volte sempre!");
                      break;
              }
        }

    }
}