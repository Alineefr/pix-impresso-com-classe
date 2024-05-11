import java.util.ArrayList;
import java.util.Scanner;

import classes.Conta;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Conta> contas = new ArrayList<Conta>();
        Scanner scanner = new Scanner(System.in);
        contas.add(new Conta(1, 123, 1234, 0,
                             "Aline Frescura", "118.358.419-96", 1, "1234567812345", "123" ));
        //1 - Ir até um caixa eletronico
        //ENTRADA
        //2 - Inserir 0 Cartão
        //2.1 - Ler dados do cartão
        System.out.println("Insira o numero do cartão: ");
        String numeroCartao = scanner.nextLine();
        Conta contaSaque = null;
        for(Conta conta : contas){
            // se o número do cartão for igual ao número do cartão de uma conta
            if (conta getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;
            }
        }
        if (contaSaque == null) {
            throw new Error( "Conta não encontrada");
        }
        //Inserir a senha
        System.out.println("Insira sua senha: ");
        String senha = scanner.nextLine();
        //4 - Validar a Senha
        // se a senha estiver incorreta, vai mostrar um erro e terminar o programa 
        if (!contaSaque.getSenha().equals(senha)) {
            throw new Error("Senha inválida");
        }
        //5 - Informar o valor do saque
         


        //PROCESSAMENTO
        //6 - Validar se o caixa possui saldo
        //7 - Validar se a conta possui saldo
        //8 - Liberar o dinheiro para o cliente
        //9 - Registrar a Transação

        //SAÍDA
        //10 - Encerrar a operação
        scanner.close();




    }
}
