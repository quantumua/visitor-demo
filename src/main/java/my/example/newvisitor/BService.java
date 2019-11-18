package my.example.newvisitor;

import java.util.function.Function;

public class BService implements Service<BRequest> {
    @Override
    public String getCounter(BRequest request) {
        return "From BService: " + request.toString();
    }

    @Override
    public String visitFromAService(ARequest request) {
        return getCounter(fromARequest().apply(request));
    }

    @Override
    public String visitFromBService(BRequest request) {
        return getCounter(request);
    }

    private Function<ARequest, BRequest> fromARequest() {
        return aRequest -> {
            BRequest bRequest1 = new BRequest();
            bRequest1.setField1(aRequest.getField1());
            bRequest1.setField2(aRequest.getField2());
            bRequest1.setFieldB("Got from ARequest");
            return bRequest1;
        };
    }
}
