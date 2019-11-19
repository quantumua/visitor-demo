package my.example.newvisitor;

public interface Visitor {

    String visitFromAService(BaseRequest<ARequest> request);

    String visitFromBService(BaseRequest<BRequest> request);
}
