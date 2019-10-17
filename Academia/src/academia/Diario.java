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
public class Diario extends Planos_de_Aulas{

    @Override
    public String realizarPagamento() {
        this.pagamento="R$25,00";
        return this.pagamento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
}
