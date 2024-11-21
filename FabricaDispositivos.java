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
