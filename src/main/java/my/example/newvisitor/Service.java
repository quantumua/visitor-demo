package my.example.newvisitor;

public interface Service< T, E extends BaseRequest<T>> extends Visitor {
    String getCounter(E request);
}