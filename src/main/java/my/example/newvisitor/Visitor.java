package my.example.newvisitor;

public interface Visitor {

    String visitFromAService(ARequest request);

    String visitFromBService(BRequest request);
}
