public class EquipamentoMedidaMassa {

    private double massa;
    private EquipamentoUnidadeMassa unidade;

    public double getMassa() {
        return this.massa;
    }

    private void setMassa(double massa) {
        this.massa = massa;
    }

    public EquipamentoUnidadeMassa getUnidadeMassa() {
        return this.unidade;
    }

    private void setUnidadeMassa(EquipamentoUnidadeMassa unidade) {
        this.unidade = unidade;
    }

    public EquipamentoMedidaMassa(double massa, EquipamentoUnidadeMassa unidade) {
        this.setMassa(massa);
        this.setUnidadeMassa(unidade);
    }

    @Override
    public String toString() {
        return this.getMassa() + " " + this.getUnidadeMassa().toString();
    }

}