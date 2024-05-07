# Conta Terminal 🏦

Este é um programa simples em Java para simular uma conta bancária para teste de execução no terminal.

## Funcionalidades

- Solicita o número da conta (apenas números).
- Solicita o saldo (apenas números).
- Solicita o nome do cliente (apenas letras).
- Solicita o número da agência (apenas números).
- Exibe os dados do cliente.

## Verificações de Entrada

O programa inclui verificações para garantir que as entradas do usuário sejam válidas:

- Para o número da conta e agência, apenas números são aceitos. Utiliza-se expressões regulares (regex) para validar essas entradas. O regex usado é `[0-9]+`. Você pode aprender mais sobre regex [aqui](https://www.regular-expressions.info/).
- Para o nome do cliente, apenas letras são aceitas. Um loop é usado para verificar cada caractere da entrada e garantir que apenas letras sejam aceitas.

## Documentação do Uso do Terminal

Para saber mais sobre como usar o terminal, consulte a documentação oficial [aqui](https://www.gnu.org/software/bash/manual/bash.html).


## Como executar

Certifique-se de ter o Java instalado em sua máquina. Em seguida, compile e execute o programa com os seguintes comandos:

```bash
javac ContaTerminal.java
java ContaTerminal
