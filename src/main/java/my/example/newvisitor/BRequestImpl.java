package my.example.newvisitor;

public class BRequestImpl extends BaseRequest<BRequest> {

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitFromBService(this);
    }


    @Override
    public String toString() {
        return "BRequest{}: " + super.toString();
    }
}
