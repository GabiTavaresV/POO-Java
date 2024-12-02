public class Main {
    public static void main(String[] args) {

        Attendant attendant1 = new Attendant( "Gabriela Tavares", "gabi@email.com");
        Attendant attendant2 = new Attendant( "João da Silva", "joao@email.com");
        System.out.println(attendant1 + " \n " + attendant2);

        ServiceCounter serviceCounter1 = new ServiceCounter( attendant1, "Loja Joia");
        ServiceCounter serviceCounter2 = new ServiceCounter( attendant2, "Loja Meli");

        Called called1 = new Called("Maria Joaquina", attendant1, "Notebook", serviceCounter1);
        System.out.println("\n\n"+ called1);
        System.out.println("\n\n"+ called1.creatReport());

        Called called2 = new Called("Francisco José", attendant1, "Maquininha cartão", serviceCounter1);
        System.out.println("\n\n"+ called2);
        System.out.println("\n\n"+ called2.creatReport());

        Called called3 = new Called("Mariana Lima", attendant2, "Impressora", serviceCounter2);
        System.out.println("\n\n"+ called3);
        System.out.println("\n\n"+ called3.creatReport());

        serviceCounter1.startService();
        System.out.println("\n\n"+ serviceCounter1.creatReport());

        serviceCounter2.startService();
        System.out.println("\n\n"+ serviceCounter2.creatReport());


    }
}

