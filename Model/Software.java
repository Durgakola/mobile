package Model;

public class Software {
    private int procedure;
    private String interfaces;

    public int getProcedure() {
        return procedure;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public Software(int procedure, String interfaces) {
        this.procedure = procedure;
        this.interfaces=interfaces;
    }
    public String toString(){
        return "procedure "+procedure+", "+"interfaces "+interfaces;
    }
}