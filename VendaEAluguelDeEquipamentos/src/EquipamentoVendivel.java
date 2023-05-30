public abstract class EquipamentoVendivel extends Equipamento {


    private double valorFreteBase;
    private EquipamentoMedidaTempo tempoFrenteBase;

    public double getValorFreteBase()
    {
        return this.valorFreteBase;
    }
    private void setTempoFreteBase(EquipamentoMedidaTempo tempoFreteBase) {

        this.tempoFrenteBase = tempoFreteBase;
    }

    public EquipamentoMedidaTempo getTempoFreteBase()
    {
        return tempoFrenteBase;
    }

    private void setValorFreteBase(double valorFreteBase) {

        this.valorFreteBase = valorFreteBase;
    }

    public EquipamentoVendivel(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa, double valorFrete, EquipamentoMedidaTempo tempoFrete) {
        super(codigo, descricao, valorBase, dimensao, medidaMassa);
        //TODO Auto-generated constructor stub

        this.setValorFreteBase(valorFrete);
        this.setTempoFreteBase(tempoFrete);
    }

    @Override
    public double calcularValorFinal() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    public double calcularValorFrete()
    {
        return this.getValorBase();
    }

    public EquipamentoMedidaTempo calcularTempoFrete()
    {
        return this.getTempoFreteBase();
    }

}
