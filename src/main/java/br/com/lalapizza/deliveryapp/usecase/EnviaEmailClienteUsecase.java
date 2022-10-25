package br.com.lalapizza.deliveryapp.usecase;

import br.com.lalapizza.deliveryapp.events.PedidoCriadoEvent;
import br.com.lalapizza.deliveryapp.model.Pedido;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EnviaEmailClienteUsecase {

    public void executa(Pedido pedido) {
        System.out.println("Email Enviado para Cliente com o pedido: " + pedido);
    }

    @EventListener
    public void escutaEvento(PedidoCriadoEvent pedidoCriadoEvent) {
        System.out.println("[EnviaEmailClienteUsecase] Recebendo evento de pedido criado");

        executa(pedidoCriadoEvent.getPedido());
    }
}
