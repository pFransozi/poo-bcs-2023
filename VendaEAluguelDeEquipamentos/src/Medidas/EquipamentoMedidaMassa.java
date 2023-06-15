package Medidas;

import java.io.Serializable;
import com.google.gson.GsonBuilder;

public class EquipamentoMedidaMassa implements Serializable {

    private static final long serialVersionUID = 1L;
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
        return (new GsonBuilder()).create().toJson(this);
    }

    public static EquipamentoMedidaMassa toClass(String json) {
        return (EquipamentoMedidaMassa)(new GsonBuilder())
                .create().fromJson(json, EquipamentoMedidaMassa.class);
    }

}