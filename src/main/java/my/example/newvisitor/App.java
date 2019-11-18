package my.example.newvisitor;

public class App {
    public static void main(String[] args) {

        Processor processor = new ProcessorImpl();
        processor.process(getARequest());
        processor.process(getBRequest());
    }

    public static ARequest getARequest(){
        ARequest aRequest = new ARequest();
        aRequest.setField1("aField1");
        aRequest.setField2("aField2");
        aRequest.setFieldA("aFieldA");
        return aRequest;
    }

    public static BRequest getBRequest(){
        BRequest bRequest = new BRequest();
        bRequest.setField1("bField1");
        bRequest.setField2("bField2");
        bRequest.setFieldB("bFieldB");
        return bRequest;
    }
}
