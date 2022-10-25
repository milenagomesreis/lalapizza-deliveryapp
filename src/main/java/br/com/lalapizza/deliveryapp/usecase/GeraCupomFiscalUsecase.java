package br.com.lalapizza.deliveryapp.usecase;

import br.com.lalapizza.deliveryapp.events.PedidoCriadoEvent;
import br.com.lalapizza.deliveryapp.model.Pedido;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GeraCupomFiscalUsecase {

    public void executa(Pedido pedido) {
        System.out.println("Cumpom gerado para o pedido: " + pedido);
    }

    @EventListener
    public void escutaEvento(PedidoCriadoEvent pedidoCriadoEvent) {
        System.out.println("[GeraCupomFiscalUsecase] Recebendo evento de pedido criado");

        executa(pedidoCriadoEvent.getPedido());
    }
}
