/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario.Clientes;

import java.util.ArrayList;
import java.util.List;
import sistemabancario.Contas.AbstractConta;
import sistemabancario.Contas.Conta;
import sistemabancario.Contas.TipoDeConta;

/**
 *
 * @author otavio.almeida
 */
public abstract class Cliente {
    protected String nome;
    protected Integer CPF;
    protected AbstractConta tipoConta;
    protected TipoDeConta conta;
    
    protected  List<AbstractConta> contas = new ArrayList<>();
    
    public Cliente(){
    }
       
    public Cliente(String nome, Integer CPF){
           this.nome = nome;
           this.CPF = CPF;
    }
    
    public void AddConta(AbstractConta conta){
        contas.add(conta);
        this.tipoConta = conta;
    }

    public AbstractConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(AbstractConta tipoConta) {
        this.tipoConta = tipoConta;
    }
  
    public Integer tipoDeConta(int escolha){
            if (escolha == 2) {
                 this.conta = TipoDeConta.POUPANCA;
                 return 2;
            }else{
                this.conta = TipoDeConta.CORRENTE;
                return 1;
            }
    }

    public List<AbstractConta> getContas() {
        return contas;
    }

    public TipoDeConta getConta() {
        return conta;
    }

    public void setConta(TipoDeConta conta) {
        this.conta = conta;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }
       
    @Override
    public String toString() {
        return getNome() + " " + getCPF() + " " + getTipoConta() + " " + getConta() + " " + tipoConta.getSaldo();

    }
}
