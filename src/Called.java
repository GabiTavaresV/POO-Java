

public class Called implements Report {
    private String clientName;
    private Attendant attendant;
    private String productName;
    private CalledState state;
    private ServiceCounter serviceCounter;

    public Called(String clientName, Attendant attendant, String productName, ServiceCounter serviceCounter ) {
        this.clientName = clientName;
        this.attendant = attendant;
        this.productName = productName;
        this.state = CalledState.ABERTO;
        this.serviceCounter = serviceCounter;
        this.serviceCounter.startService();
    }

    public String getProductName() {
        return productName;
    }

    public CalledState getState() {
        return state;
    }

    @Override
    public String creatReport() {
        return "Called{" +
                " productName='" + getProductName() + '\'' +
                ", calledState=" + getState() +
                '}';
    }

    @Override
    public String toString() {
        return "Called{" +
                " atendente='" + attendant.getName() + '\'' +
                ", productName=" + productName +
                ", estadoChamado=" + state +
                '}';
    }

}