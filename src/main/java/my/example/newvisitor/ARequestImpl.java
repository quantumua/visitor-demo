package my.example.newvisitor;

public class ARequestImpl extends BaseRequest<ARequest> {
       @Override
    public String accept(Visitor visitor) {
        return visitor.visitFromAService(this);
    }

    @Override
    public String toString() {
        return "ARequest{}: " + super.toString();
    }
}
