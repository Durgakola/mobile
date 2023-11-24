package Model;

public class DisplayScreen {
    private double lenght;
    private double width;
    private String displayType;

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public String getDisplayType() {
        return displayType;
    }

    public DisplayScreen(double lenght, double width, String displayType) {
        this.lenght = lenght;
        this.width=width;
        this.displayType=displayType;
    }
    public String toString(){
        return "Lenght "+lenght+", "+"Width "+width+", "+"DisplayType "+displayType;
    }
}