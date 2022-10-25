package br.com.lalapizza.deliveryapp.model;

import java.math.BigDecimal;

public class Pedido {
    private String[] itens;
    private BigDecimal valorTotal;
    private String formaDePagamento;
    private String emailCliente;

    public String[] getItens() {
        return itens;
    }

    public void setItens(String[] itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itens=" + itens +
                ", valorTotal=" + valorTotal +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                '}';
    }
}
