package javacorre.J.modificadorFinal.classes;

public class Comprador {
    private String noome;

    @Override
    public String toString() {
        return "Comprador{" +
                "noome='" + noome + '\'' +
                '}';
    }

    public String getNoome(String vem) {
        return noome;
    }

    public void setNoome(String noome) {
        this.noome = noome;
    }
}
