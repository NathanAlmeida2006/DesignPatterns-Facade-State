package state.estados;

import state.interfaces.EstadoPacote;
import state.model.Pacote;

public class EstadoEnviado implements EstadoPacote {
    @Override
    public void proximo(Pacote pacote) {
        pacote.setEstado(new EstadoEntregue());
    }

    @Override
    public void anterior(Pacote pacote) {
        pacote.setEstado(new EstadoPedido());
    }

    @Override
    public String getEstado() {
        return "Pacote Enviado, em trânsito";
    }
}
