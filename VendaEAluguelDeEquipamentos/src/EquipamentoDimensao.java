public class EquipamentoDimensao {

    public double x;
    public double y;
    public double z;

    public void setX(double x)
    {
        this.x = x;
    }

    public double getX()
    {
        return this.x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getY()
    {
        return this.y;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    public double getZ()
    {
        return this.z;
    }

    public EquipamentoDimensao(double x, double y, double z)
    {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        
    }

    @Override
    public String toString() {
        return "X=" + this.getX()
                + "Y=" + this.getY()
                + "Z=" + this.getZ();
    }


}
