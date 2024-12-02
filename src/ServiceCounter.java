import java.time.LocalDateTime;

public  class ServiceCounter implements Report{
    private String id;
    private Attendant attendant;
    private String storeName;
    private  int quantityServices;
    private LocalDateTime dateTimeServices;

    public ServiceCounter(Attendant attendant, String storeName) {
        this.id = IDGenerator.generateId();
        this.attendant = attendant;
        this.storeName = storeName;
        this.quantityServices = 0;
    }

    public  void startService() {
        quantityServices++;
        dateTimeServices = LocalDateTime.now();
    }

    @Override
    public String creatReport() {
        return "Nome do atendente: " + attendant.getName() + ", \n" +
                "Nome da loja: " + storeName + ", \n" +
                "Quantidade de atendimentos: " + quantityServices + ", \n" +
                "Data e hora do atendimento: " + dateTimeServices;
    }

    @Override
    public String toString() {
        return "Service Counter{" +
                "id=" + id +
                ", attendant='" + attendant.getName() + '\'' +
                ", storeName=" + storeName +
                '}';
    }
}