package state.model;

import state.interfaces.EstadoPacote;
import state.estados.EstadoPedido;

public class Pacote {
    private EstadoPacote estado;

    public Pacote() {
        estado = new EstadoPedido();
    }

    public void proximaEstado() {
        estado.proximo(this);
    }

    public void estadoAnterior() {
        estado.anterior(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(EstadoPacote estado) {
        this.estado = estado;
    }
}
