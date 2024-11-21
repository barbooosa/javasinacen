public interface Dispositivo {
    String getNome();
    double calcularConsumoEnergia(double horasUso);
}

// Exemplo de aparelhos
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

//Utilização de factory
public class FabricaDispositivos {
    public static Dispositivo criarDispositivo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "ar condicionado":
                return new ArCondicionado();
            case "geladeira":
                return new Geladeira();
            default:
                throw new IllegalArgumentException("Tipo de dispositivo desconhecido: " + tipo);
        }
    }
}