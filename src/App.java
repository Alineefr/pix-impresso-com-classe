import java.util.ArrayList;
import java.util.Scanner;

import classes.CaixaEletronico;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaSalario;
import classes.Transacao;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(new ContaCorrente(1, 123, 1234, 0,
                "Aline Frescura", "118.358.419-96",
                "1234567812345", "123", 1000));

        contas.add(new ContaSalario(2, 123, 1234, 0,
                "Aline Frescura", "118.358.419-96",
                "1234567812345", "123",2000));

        contas.add(new ContaPoupanca(3, 123, 1234, 0,
                "Aline Frescura", "118.358.419-96",
                "1234567812345", "123",3000));
        // TODO - Criar uma lista de caixas eletrônicas
        // TODO - Criar objetos do tipo caixa eletrônica

        ArrayList<CaixaEletronico> caixaEletronicos = new ArrayList<CaixaEletronico>();
        caixaEletronicos.add(new CaixaEletronico(1, "PB-Centro", 3.000));
        caixaEletronicos.add(new CaixaEletronico(2, "PB-Fraron", 5.000));
        caixaEletronicos.add(new CaixaEletronico(3, "PB-Aeroporto", 8.000));
       
        //Lista de transações
        ArrayList<Transacao> Transacao = new ArrayList<Transacao>();

        Scanner scanner = new Scanner(System.in);

        // 1 - Ir até um caixa eletronico
        // ENTRADA
        // 2 - Inserir 0 Cartão
        // 2.1 - Ler dados do cartão
        System.out.println("Insira o numero do cartão: ");
        String numeroCartao = scanner.nextLine();

        // Buscando a conta pelo número do cartão
        Conta contaSaque = null;
        for (Conta conta : contas) {
            // se o número do cartão for igual ao número do cartão de uma conta
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;
            }
        }

        // se a conta for nula, vai mostrar o erro e terminar o programa
        if (contaSaque == null) {
            scanner.close();
            throw new Error("Conta não encontrada!");
        }
        // Inserir a senha
        System.out.println("Insira sua senha: ");
        String senha = scanner.nextLine();
        // scanner.close();

        // 4 - Validar a Senha
        // se a senha estiver incorreta, vai mostrar um erro e terminar o programa
        if (!contaSaque.getSenha().equals(senha)) {
            throw new Error("Senha inválida");
        }
        // 5 - Informar o valor do saque
        System.out.println("Informe o valor do saque");
        double valorSaque = scanner.nextDouble();




        // TODO - 5.1 - Informar o id do Caixa Eletrônico
        System.out.println("Insira seu caixa: ");
        int IdCaixa = scanner.nextInt();

        scanner.close();
        
        // TODO - 5.2 - Buscar o caixa eletrônico na lista
        
        CaixaEletronico localCaixa = null;

        for (CaixaEletronico caixaEletronico : caixaEletronicos) {
            if (caixaEletronico.getIdCaixaEletronico() == IdCaixa) {
                localCaixa = caixaEletronico;
                break;
            }

        }
        if (localCaixa == null) {
            throw new Error("Caixa Eletrônico não encontrado ");
        }


        // PROCESSAMENTO
        // 6 - Validar se o caixa possui saldo
        if (caixaSaque.getSaldo() < valorSaque) {
            throw new Error("Caixa Eletrônico sem saldo");
        }

        // 7 - Validar se a conta possui saldo
        if (contaSaque.getSaldo() < valorSaque) {
            throw new Error("Conta sem saldo");
        }

        // 8 - Liberar o dinheiro para o cliente
        System.out.println("Por favor aguarde... \n O dinheiro estará disponível em instantes");

        // 9 - Registrar a Transação
        Transacao transacao = new Transacao(1,
                contaSaque.getIdConta(),
                caixaSaque.getIdCaixaEletronico(),
                valorSaque,
                'D');
        transacoes.add(transacao);

        // SAÍDA
        // 10 - Encerrar a operação
        System.out.println("Operação concluída! \n Obrigado por utilizar o sistema Pix Impresso");

    }
}
