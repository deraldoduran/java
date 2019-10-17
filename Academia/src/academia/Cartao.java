/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

/**
 *
 * @author duran
 */
public class Cartao extends Planos_de_Aulas {

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String realizarPagamento() {
        pagamento="R$45,00";
        return pagamento;
    }
    
}
