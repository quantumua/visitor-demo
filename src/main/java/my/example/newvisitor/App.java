package my.example.newvisitor;

public class App {
    public static void main(String[] args) {

        Processor processor = new ProcessorImpl();
        processor.process(getARequest());
        processor.process(getBRequest());
    }

    private static BaseRequest<ARequest> getARequest() {
        ARequestImpl aRequest = new ARequestImpl();
        aRequest.setField1("aField1");
        aRequest.setField2("aField2");
        return aRequest;
    }

    private static BaseRequest<BRequest> getBRequest() {
        BRequestImpl bRequest = new BRequestImpl();
        bRequest.setField1("bField1");
        bRequest.setField2("bField2");
        return bRequest;
    }
}
