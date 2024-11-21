public class GerenciadorConfiguracao {
    private static GerenciadorConfiguracao instancia;
    private String moeda;
    private double tarifaEnergia; 

    private GerenciadorConfiguracao() {
        this.moeda = "BRL";
        this.tarifaEnergia = 0.5; 
    }

    public static GerenciadorConfiguracao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracao();
        }
        return instancia;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getTarifaEnergia() {
        return tarifaEnergia;
    }

    public void setTarifaEnergia(double tarifaEnergia) {
        this.tarifaEnergia = tarifaEnergia;
    }
}
