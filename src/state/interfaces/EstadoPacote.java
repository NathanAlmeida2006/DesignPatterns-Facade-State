package state.interfaces;

import state.model.Pacote;

public interface EstadoPacote {
    void proximo(Pacote pacote);

    void anterior(Pacote pacote);

    String getEstado();
}
