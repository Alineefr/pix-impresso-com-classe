# Pix Impresso
## Etapas de uma operação de saque
 
 
1 - Ir até um caixa eletronico
2 - Inserir 0 Cartão
3 - Inserir a senha
4 - Validar a Senha
5 - Informar o valor do saque
6 - Validar se o caixa possui saldo
7 - Validar se a conta possui saldo
8 - Liberar o dinheiro para o cliente
9 - Registrar a Transação
10 - Encerrar a operação
 
 
## Classes
 
 
### Conta
- numero
- agencia
- digitoVerificador
- nome
- CPF
- tipoConta(1-Conta Corrente | 2-Conta Salário | 3-Conta Poupança)
- numeroCartao
- senha
 
### Caixa Eletronico
- idCaixaEletronico
- localizacao
- saldo

## Transação
- dataHora
- idTransacao
- valor
- tipoTransacao(C - Crédito | D - Débito)
-idConta
- idCaixaEletronico
 
