public class WattStatus {
    public static void main(String[] args) {
        //Singleton
        GerenciadorConfiguracao config = GerenciadorConfiguracao.getInstancia();
        config.setTarifaEnergia(0.75); // Exemplo de tarifa personalizada

        //Factory
        Dispositivo arCondicionado = FabricaDispositivos.criarDispositivo("ar condicionado");
        Dispositivo geladeira = FabricaDispositivos.criarDispositivo("geladeira");

        double consumoArCondicionado = arCondicionado.calcularConsumoEnergia(5); 
        double consumoGeladeira = geladeira.calcularConsumoEnergia(24); 

        System.out.println(arCondicionado.getNome() + " consumiu: " + consumoArCondicionado + " kWh");
        System.out.println(geladeira.getNome() + " consumiu: " + consumoGeladeira + " kWh");

        double custoTotal = (consumoArCondicionado + consumoGeladeira) * config.getTarifaEnergia();
        System.out.println("Custo total: " + custoTotal + " " + config.getMoeda());
    }
}
