package my.example.newvisitor;

public interface Service<T extends BaseRequest> extends Visitor {
    String getCounter(T request);
}
