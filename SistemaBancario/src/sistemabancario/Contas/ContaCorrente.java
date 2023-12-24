/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario.Contas;

import javax.swing.JOptionPane;

/**
 *
 * @author otavio.almeida
 */
public class ContaCorrente extends AbstractConta{

    public ContaCorrente() {
    }

    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public Double saldo() {
        return getSaldo();
    }

    @Override
    public Boolean Transferencia(Double valor) {
        if (valor <= 0.0) { 
            JOptionPane.showConfirmDialog(null, "Você não pode transferir valores negativos/zerados");
            return false;
        }
         if (valor > getSaldo()) {
            JOptionPane.showConfirmDialog(null, "Você não pode transferir mais do que a sua quantidade de saldo");
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public Boolean Deposito(Double valor) {
        if (valor <= 0.0) {
            JOptionPane.showConfirmDialog(null, "Você não pode depositar valores negativos/zerados");
            return false;
        }
        saldo += valor;
        return true;
    }
    
}
