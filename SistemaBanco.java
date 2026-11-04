/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src;

/**
 *
 * @author Cefet
 */
public class SistemaBanco {

    public static void main(String[] args) {
        ContaCorrente cc = newContaCorrente(1, "Ana", 15.00);
        ContaPoupanca cp = newContaPoupanca(2, "Bruno", 0.01);
    }
    
    cc.depositar(100.00);
    cp.depositar(100.00);
    
    cc.exibirSaldo();
    cp.exibirSaldo();
    
    cc.sacar(500.00);
    cp.depositar(-10.00);
    
    FechamentoMensal[] contas = {cc, cp};
    for (FechamentoMensal c : contas) {
        c.fecharMer();
}
    cc.exibirSaldo();
    cp.exibirSaldo();
    
}
