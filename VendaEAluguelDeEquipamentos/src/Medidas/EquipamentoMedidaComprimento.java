package Medidas;

import java.io.Serializable;
import com.google.gson.GsonBuilder;

public class EquipamentoMedidaComprimento implements Serializable {

    private static final long serialVersionUID = 1L;
    private double x;
    private double y;
    private double z;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    public EquipamentoMedidaComprimento(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);

    }

    @Override
    public String toString() {

        return (new GsonBuilder()).create().toJson(this);
    }

    public static EquipamentoMedidaComprimento toClass(String json) {
        return (EquipamentoMedidaComprimento)(new GsonBuilder())
                .create().fromJson(json, EquipamentoMedidaComprimento.class);
    }

}
