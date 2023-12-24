/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario.Clientes;

import sistemabancario.Contas.AbstractConta;
import sistemabancario.Contas.Conta;

/**
 *
 * @author otavio.almeida
 */
public final class PessoaFisica extends Cliente {

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Integer CPF) {
        super(nome, CPF);
    }
    
}
