/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabancario;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import sistemabancario.Clientes.Cliente;
import sistemabancario.Clientes.PessoaFisica;
import sistemabancario.Clientes.PessoaJuridica;
import sistemabancario.Contas.AbstractConta;
import sistemabancario.Contas.ContaCorrente;
import sistemabancario.Contas.ContaPoupanca;

/**
 * Projeto de Sistema Bancário Crie um sistema bancário simplificado com as
 * seguintes especificações:
 *
 * O sistema deve permitir o registro de clientes com nome e CPF. Cada cliente
 * pode ter uma ou mais contas bancárias. As contas bancárias devem suportar
 * operações básicas como depósito, saque e transferência. Implemente
 * funcionalidades para consultar o saldo e o das operações realizadas. O
 * sistema deve ser capaz de diferenciar entre contas correntes e poupanças,
 * aplicando regras específicas para cada tipo. Garanta que o sistema seja
 * seguro e que as operações só possam ser realizadas após autenticação do
 * cliente. Espero que este projeto seja um bom ponto de partida para você
 * praticar e identificar os diferentes componentes de um sistema orientado a
 * objetos. Boa sorte E no final, transferir de um Cliente para o outro
 *
 * @author otavio.almeida
 */
public class SistemaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (var input = new Scanner(System.in)) {
            BoasVindas();
 
            
            Cliente cliente = CadastroCliente();
            
            CadastrarContas(cliente);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void CadastrarContas(Cliente cliente) {
        var input = new Scanner(System.in);
        AbstractConta conta = null;
        System.out.print("Qual seu tipo de conta: \n 1.Corrente \n2.Poupanca");
        int escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Digite uma resposta valida");            
            escolha = input.nextInt();
        }
        
        System.out.print("Digite um saldo inicial pra sua conta: ");
        Double saldoInicial = input.nextDouble();        
        
        if (escolha == 2) {
            conta = new ContaPoupanca(saldoInicial);
            cliente.tipoDeConta(escolha);
        } else {
            conta = new ContaCorrente(saldoInicial);
            cliente.tipoDeConta(escolha);
        }
        cliente.AddConta(conta);
        
        System.out.print("Deseja depositar na sua conta \n 1.Sim \n 2.Nao \n ?");
        int escolha2 = input.nextInt();
        
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("Digite uma resposta valida");            
            escolha2 = input.nextInt();
        }
        
        if (escolha2 == 1) {
            System.out.print("Digite o valor que deseja depositar");
            Double valor = input.nextDouble();
            cliente.getTipoConta().Deposito(valor);
        }
        
        System.out.print("Deseja transferir para a conta \n 1.Sim \n 2.Nao \n ?");
        int escolha3 = input.nextInt();
        while (escolha3 != 1 && escolha3 != 2) {
            System.out.println("Digite uma resposta valida");            
            escolha2 = input.nextInt();
        }
        
        if (escolha3 == 1) {
            System.out.print("Digite o valor que deseja transferir");
            Double valor = input.nextDouble();
            cliente.getTipoConta().Transferencia(valor);
        }
        System.out.println(cliente.toString());
    }
    
    public static void BoasVindas() {
        var input = new Scanner(System.in);
        System.out.println("Olá bem vindo ao sistema de banco");
        System.out.print("Deseja criar uma conta? \n 1.Sim \n 2.Nao \n");
        int escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Digite uma resposta valida");            
            escolha = input.nextInt();
        }
        
        if (escolha == 2) {
            System.out.println("Obrigado pela sua atencao");            
            return;
        }
    }
    
    public static Cliente CadastroCliente() {
        Cliente cliente = null;
        var input = new Scanner(System.in);
        System.out.print("Certo, vamos la, digite seu nome:");
        input.next();
        String nome = input.nextLine();
        
        System.out.print("Digite seu cpf:");
        int cpf = input.nextInt();
        
        System.out.print("Que tipo de pessoa você é : \n 1.Fisica 2.Juridica");
        int escolha = input.nextInt();
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Digite uma resposta valida");            
            escolha = input.nextInt();
        }
        
        if (escolha == 2) {
            cliente = new PessoaJuridica(nome, cpf);
        } else {
            cliente = new PessoaFisica(nome, cpf);
        }
        
        return cliente;
    }
    
}
