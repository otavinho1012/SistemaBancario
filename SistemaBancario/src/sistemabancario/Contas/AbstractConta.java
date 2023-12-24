/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario.Contas;

/**
 *
 * @author otavio.almeida
 */

// Aqui ela não te obriga a fazer o contraro por ser uma classe Abstrata, mas ela diz que para suas subClasses vc é obrigatório
public abstract class AbstractConta implements Conta {
    protected Double saldo;


    public AbstractConta(){
        this.saldo = 0.0;
    }
    
    public AbstractConta(Double saldo) {
        this.saldo = saldo; 
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
}
