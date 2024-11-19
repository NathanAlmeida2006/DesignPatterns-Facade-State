package facade.exemplo2;

import facade.exemplo1.SubSistemaA;

public class Facade {
    private SubSistemaA subSistemaA;
    private SubSistemaB subSistemaB;

    public Facade() {
        subSistemaA = new SubSistemaA();
        subSistemaB = new SubSistemaB();
    }

    public void operar() {
        subSistemaA.acao();
        subSistemaB.acao();
    }
}
