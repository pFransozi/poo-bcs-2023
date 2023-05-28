public class EquipamentoVendivel extends Equipamento {

    public EquipamentoVendivel(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa) {
        super(codigo, descricao, valorBase, dimensao, medidaMassa);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularValorFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

}
