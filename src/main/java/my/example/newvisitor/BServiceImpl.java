package my.example.newvisitor;

import java.util.function.Function;

public class BServiceImpl implements  Service<BRequest, BaseRequest<BRequest>>{

    @Override
    public String getCounter(BaseRequest<BRequest> request) {
        return request.toString();
    }

    @Override
    public String visitFromAService(BaseRequest<ARequest> request) {
        return "BServiceImpl::visitFromAService : " + getCounter(fromARequest().apply(request));
    }

    @Override
    public String visitFromBService(BaseRequest<BRequest> request) {
        return "BServiceImpl::visitFromBService : " + getCounter(request);
    }

    private Function<BaseRequest<ARequest>, BaseRequest<BRequest>> fromARequest() {
        return aRequest -> {
            BaseRequest<BRequest> bRequest = new BRequestImpl();
            bRequest.setField1(aRequest.getField1());
            bRequest.setField2(aRequest.getField2());
            return bRequest;
        };
    }

}
