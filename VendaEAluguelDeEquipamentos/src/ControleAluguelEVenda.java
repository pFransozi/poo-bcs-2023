import java.util.ArrayList;

public class ControleAluguelEVenda {

    private ArrayList<EquipamentoAlugavel> equipamentosParaAlugar;
    private ArrayList<EquipamentoVendivel> equipamentosParaVender;

    private ArrayList<EquipamentoAlugavel> getListaEquipamentoParaAlugar()
    {
        return this.equipamentosParaAlugar;
    }

    private ArrayList<EquipamentoVendivel> getListaEquipamentoParaVender()
    {
        return this.equipamentosParaVender;
    }

    public ControleAluguelEVenda()
    {
        this.equipamentosParaAlugar = new ArrayList<EquipamentoAlugavel>();
        this.equipamentosParaVender = new ArrayList<EquipamentoVendivel>();
    }

    public boolean existeEquiapmentosParaVender()
    {
        return this.getListaEquipamentoParaVender().size() > 0;
    }

    public boolean existeEquipamentosParaAlugar()
    {
        return this.getListaEquipamentoParaAlugar().size() > 0;
    }

    public void adicionarEquipamentoParavender(EquipamentoVendivel equipamento)
    {
        this.getListaEquipamentoParaVender().add(equipamento);
    }

    public void adicionarEquipamentoParaAlugar(EquipamentoAlugavel equipamento)
    {
        this.getListaEquipamentoParaAlugar().add(equipamento);
    }
    
}
