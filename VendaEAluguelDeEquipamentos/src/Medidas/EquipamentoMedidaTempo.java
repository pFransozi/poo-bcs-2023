package Medidas;

import java.io.Serializable;
import com.google.gson.GsonBuilder;

public class EquipamentoMedidaTempo implements Serializable {

    private double tempo;
    private EquipamentoUnidadeTempo unidade;

    public double getTempo()
    {
        return this.tempo;
    }

    public void setTempo(double tempo)
    {
        this.tempo = tempo;
    }

    public EquipamentoUnidadeTempo getUnidade()
    {
        return this.unidade;
    }

    public void setUnidade(EquipamentoUnidadeTempo unidade)
    {
        this.unidade = unidade;
    }

    public EquipamentoMedidaTempo(double tempo, EquipamentoUnidadeTempo unidade)
    {
        this.setTempo(tempo);
        this.setUnidade(unidade);
    }

    @Override
    public String toString() {
        return (new GsonBuilder()).create().toJson(this);
    }

    public static EquipamentoMedidaTempo toClass(String json) {
        return (EquipamentoMedidaTempo)(new GsonBuilder())
                .create().fromJson(json, EquipamentoMedidaTempo.class);
    }
    
}
