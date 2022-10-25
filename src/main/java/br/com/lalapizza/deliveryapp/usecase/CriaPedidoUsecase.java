package br.com.lalapizza.deliveryapp.usecase;

import br.com.lalapizza.deliveryapp.events.PedidoCriadoEvent;
import br.com.lalapizza.deliveryapp.model.Pedido;
import br.com.lalapizza.deliveryapp.repository.PedidoRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CriaPedidoUsecase {

    private PedidoRepository pedidoRepository;
    private ApplicationEventPublisher applicationEventPublisher;

    public CriaPedidoUsecase(PedidoRepository pedidoRepository,
                             ApplicationEventPublisher applicationEventPublisher) {
        this.pedidoRepository = pedidoRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Pedido cria(Pedido pedido) {

        System.out.println("Criando pedido");

        Pedido pedidoSalvo = pedidoRepository.salva(pedido);

        publishEvent(pedidoSalvo);

        System.out.println("Pedido Criado");

        return pedidoSalvo;
    }

    private void publishEvent(Pedido pedido) {
        PedidoCriadoEvent pedidoCriadoEvent = new PedidoCriadoEvent(this, pedido);

        applicationEventPublisher.publishEvent(pedidoCriadoEvent);
    }



}
