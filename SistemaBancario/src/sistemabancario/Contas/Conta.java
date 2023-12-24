/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemabancario.Contas;

/**
 *
 * @author otavio.almeida
 */
public interface Conta {
 
   Double saldo();
   
   Boolean Transferencia(Double valor);
   
   Boolean Deposito(Double valor);
}
