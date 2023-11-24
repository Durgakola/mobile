package Model;

public class Camera {
    private int mp;
    private int quality;
    private double range;

    public int getMp() {
        return mp;
    }

    public int getQuality() {
        return quality;
    }

    public double getRange() {
        return range;
    }

    public Camera(int mp, int quality, double range) {
        this.mp = mp;
        this.quality=quality;
        this.range=range;
    }
    public String toString(){
        return "Pixels "+mp+", "+"Quality "+quality+"mgp"+", "+"Range "+range;
    }
}
