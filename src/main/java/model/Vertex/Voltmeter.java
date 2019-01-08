package model.Vertex;


public class Voltmeter extends Vertex {

    private String name = "Voltmeter";
    private double voltage = 1;
    private boolean isConnected;

    @Override
    public double getParameter() {
        return voltage;
    }

    @Override
    public void setParameter(double parameter) {
        voltage = parameter;
    }

    public void draw() {
        System.out.println(name);
    }
    public boolean isConnected(){
        return isConnected;
    }
}