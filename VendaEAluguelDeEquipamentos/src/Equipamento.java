
public abstract class Equipamento {

    private int codigo;
    private String descricao;
    private double valorBase;
    private EquipamentoDimensao dimensao;
    private EquipamentoMedidaMassa medidaMassa;

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    private void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return this.valorBase;
    }

    private void setDimensao(EquipamentoDimensao dimensao)
    {
        this.dimensao = dimensao;
    }

    public EquipamentoDimensao getDimensao()
    {
        return this.dimensao;
    }

    private void setMedidaMassa(EquipamentoMedidaMassa medidaMassa)
    {
        this.medidaMassa = medidaMassa;
    }

    public EquipamentoMedidaMassa getMedidaMassa()
    {
        return this.medidaMassa;
    }

    public Equipamento(int codigo, String descricao, double valorBase
                        , EquipamentoDimensao dimensao, EquipamentoMedidaMassa medidaMassa) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setValorBase(valorBase);
        this.setDimensao(dimensao);
        this.setMedidaMassa(medidaMassa);
    }

    public abstract double calcularValorFinal();

    @Override
    public String toString() {
        return "Código" + this.getCodigo()
                + " - " + this.getDescricao()
                + ". R$ " + this.getValorBase();
    }

    public void printInfo() {
        System.out.println("Item Info:");
        System.out.println(this.toString());
        System.out.println("Dimensões: " + this.getDimensao().toString());
        System.out.println("Massa: " + this.getMedidaMassa().toString());
    }

}
