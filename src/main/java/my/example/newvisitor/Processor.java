package my.example.newvisitor;

public interface Processor<T extends BaseRequest> {
    void process(T request);
}
