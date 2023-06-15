package Equipamentos;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;
import Medidas.EquipamentoMedidaTempo;
import Medidas.EquipamentoUnidadeTempo;

public class EquipamentoVendivelPerfuracao extends EquipamentoVendivel{

    private double ajusteValorFrete;
    private EquipamentoMedidaTempo ajustaTempoFrete;

    public double getAjusteValorFrete()
    {
        return this.ajusteValorFrete;
    }

    private void setAjustaValorFrete(double ajusteValorFrete)
    {
        this.ajusteValorFrete = ajusteValorFrete;
    }

    public EquipamentoMedidaTempo getAjusteTempoFrete()
    {
        return this.ajustaTempoFrete;
    }

    private void setAjusteTempoFrete(EquipamentoMedidaTempo ajustaTempoFrete)
    {
        this.ajustaTempoFrete = ajustaTempoFrete;
    }

    public EquipamentoVendivelPerfuracao(EquipamentoTipo tipo, int codigo, String descricao, double valorBase, EquipamentoMedidaComprimento dimensao,
            EquipamentoMedidaMassa medidaMassa, double valorFrete, EquipamentoMedidaTempo tempoFrete) {
        super(tipo, codigo, descricao, valorBase, dimensao, medidaMassa, valorFrete, tempoFrete);
    
        this.setAjustaValorFrete(1.15);
        this.setAjusteTempoFrete(new EquipamentoMedidaTempo(7, EquipamentoUnidadeTempo.dia));
    
    }

    @Override
    public double calcularValorFinal() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public double calcularValorFrete()
    {
        //para equipamentos de perfuracao, o frete precisa ser ajustado em 1.15
        return this.getValorBase() * this.getAjusteValorFrete();
    }

    @Override
    public EquipamentoMedidaTempo calcularTempoFrete()
    {

        if (super.getTempoFreteBase().getUnidade() == this.getAjusteTempoFrete().getUnidade())
            return new EquipamentoMedidaTempo(
                            super.getTempoFreteBase().getTempo() + this.getAjusteTempoFrete().getTempo()
                            , this.getAjusteTempoFrete().getUnidade());
        else
            throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public String toString() {
        return (new GsonBuilder()).create().toJson(this);
    }
}
