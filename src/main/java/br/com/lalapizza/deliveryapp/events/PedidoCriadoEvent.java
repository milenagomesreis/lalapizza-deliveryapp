package br.com.lalapizza.deliveryapp.events;

import br.com.lalapizza.deliveryapp.model.Pedido;
import org.springframework.context.ApplicationEvent;

public class PedidoCriadoEvent extends ApplicationEvent {
    private Pedido pedido;

    public PedidoCriadoEvent(Object source, Pedido pedido) {
        super(source);
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
