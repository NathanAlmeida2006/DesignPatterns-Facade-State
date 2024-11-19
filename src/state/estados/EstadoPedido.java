package state.estados;

import state.interfaces.EstadoPacote;
import state.model.Pacote;

public class EstadoPedido implements EstadoPacote {
    @Override
    public void proximo(Pacote pacote) {
        pacote.setEstado(new EstadoEnviado());
    }

    @Override
    public void anterior(Pacote pacote) {
        System.out.println("O pacote já está em seu estado inicial");
    }

    @Override
    public String getEstado() {
        return "Pedido realizado , aguardando envio";
    }
}
