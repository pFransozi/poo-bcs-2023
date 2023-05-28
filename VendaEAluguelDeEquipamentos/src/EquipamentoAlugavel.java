import java.util.Date;

public abstract class EquipamentoAlugavel extends Equipamento {

    private int maxDiasAluguel;
    private Date dataAluguel;

    private void setMaxDiasAluguel(int maxDiasAluguel) {
        this.maxDiasAluguel = maxDiasAluguel;
    }

    public int getMaxDiasAluguel() {
        return this.maxDiasAluguel;
    }

    private void setDataAluguel(Date dataAluguel)
    {
        this.dataAluguel = dataAluguel;
    }

    public Date getDataAluguel()
    {
        return this.dataAluguel;
    }

    public EquipamentoAlugavel(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel,
            Date dataAluguel) {

        super(codigo, descricao, valorBase, dimensao, medidaMassa);

        this.setMaxDiasAluguel(maxDiasAluguel);
        this.setDataAluguel(dataAluguel);
    }

    @Override
    public double calcularValorFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    public Date dataEntregaAluguel()
    {
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Equipamento Alugavel");
        System.out.println("Dias de Aluguel: " + this.getMaxDiasAluguel());
        System.out.println("Data Inicio Aluguel: " + this.getDataAluguel());
    }

}
