public class Geladeira implements Dispositivo {
    private static final double CONSUMO_POR_HORA = 0.1; 

    @Override
    public String getNome() {
        return "Geladeira";
    }

    @Override
    public double calcularConsumoEnergia(double horasUso) {
        return horasUso * CONSUMO_POR_HORA; 
    }
}
