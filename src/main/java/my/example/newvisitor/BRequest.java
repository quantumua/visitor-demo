package my.example.newvisitor;

public class BRequest extends BaseRequest {

    private String fieldB;

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitFromBService(this);
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    @Override
    public String toString() {
        return "BRequest{" +
                "fieldB='" + fieldB + '\'' +
                '}' + super.toString();
    }
}
