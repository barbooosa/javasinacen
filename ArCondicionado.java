public class ArCondicionado implements Dispositivo {
    private static final double CONSUMO_POR_HORA = 1.5; 

    @Override
    public String getNome() {
        return "Ar Condicionado";
    }

    @Override
    public double calcularConsumoEnergia(double horasUso) {
        return horasUso * CONSUMO_POR_HORA; 
    }
}
