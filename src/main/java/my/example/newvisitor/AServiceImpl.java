package my.example.newvisitor;

import java.util.function.Function;

public class AServiceImpl implements Service<ARequest, BaseRequest<ARequest>> {

    @Override
    public String getCounter(BaseRequest<ARequest> request) {
        return request.toString();
    }

    @Override
    public String visitFromAService(BaseRequest<ARequest> request) {
        return "AServiceImpl::visitFromAService : " + getCounter(request);
    }

    @Override
    public String visitFromBService(BaseRequest<BRequest> request) {
        return "AServiceImpl::visitFromBService : " + getCounter(fromBRequest().apply(request));
    }

    private Function<BaseRequest<BRequest>, BaseRequest<ARequest>> fromBRequest() {
        return bRequest -> {
            BaseRequest<ARequest> aRequest = new ARequestImpl();
            aRequest.setField1(bRequest.getField1());
            aRequest.setField2(bRequest.getField2());
            return aRequest;
        };
    }
}
