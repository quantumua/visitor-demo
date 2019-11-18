package my.example.newvisitor;

import java.util.function.Function;

public class AService implements Service<ARequest> {
    @Override
    public String getCounter(ARequest request) {
        return "From AService: " + request.toString();
    }

    @Override
    public String visitFromAService(ARequest request) {
        return getCounter(request);
    }

    @Override
    public String visitFromBService(BRequest request) {
        return getCounter(fromBRequst().apply(request));
    }

    private Function<BRequest, ARequest> fromBRequst(){
        return bRequest -> {
            ARequest aRequest = new ARequest();
            aRequest.setField1(bRequest.getField1());
            aRequest.setField2(bRequest.getField2());
            aRequest.setFieldA("Got from BRequest");
            return aRequest;
        };
    }
}
