package br.com.lalapizza.deliveryapp.api;

import br.com.lalapizza.deliveryapp.model.Pedido;
import br.com.lalapizza.deliveryapp.usecase.CriaPedidoUsecase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private CriaPedidoUsecase criaPedidoUsecase;

    public PedidoController(CriaPedidoUsecase criaPedidoUsecase) {
        this.criaPedidoUsecase = criaPedidoUsecase;
    }

    @PostMapping(consumes = { APPLICATION_JSON_VALUE }, produces = { APPLICATION_JSON_VALUE })
    public ResponseEntity<Pedido> criaPedido(@RequestBody Pedido pedido) {
        Pedido pedidoCriado = criaPedidoUsecase.cria(pedido);

        System.out.println("Pedido Criado");

        return ResponseEntity.ok(pedidoCriado);
    }
}
