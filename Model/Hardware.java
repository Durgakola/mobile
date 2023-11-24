package Model;

public class Hardware {
    private int Ram;
    private int Rom;

    public int getRam() {
        return Ram;
    }

    public int getRom() {
        return Rom;
    }

    public Hardware(int ram, int Rom) {
        this.Ram = ram;
        this.Rom=Rom;
    }
    public String toString(){
        return "Ram "+Ram+","+"Rom "+Rom;
    }
}
