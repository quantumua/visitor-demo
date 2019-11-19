package my.example.newvisitor;

import java.util.Arrays;
import java.util.List;

public class ProcessorImpl implements Processor {

    private List<Service> services = Arrays.asList(new AServiceImpl(), new BServiceImpl());

    @Override
    public void process(BaseRequest request) {
        services.stream().map(request::accept).forEach(System.out::println);
    }
}
