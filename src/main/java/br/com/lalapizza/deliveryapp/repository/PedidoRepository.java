package br.com.lalapizza.deliveryapp.repository;

import br.com.lalapizza.deliveryapp.model.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoRepository {
    public Pedido salva(Pedido pedido) {
        System.out.println("Pedido salvo");
        return pedido;
    }
}
