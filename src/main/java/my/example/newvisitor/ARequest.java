package my.example.newvisitor;

public class ARequest extends BaseRequest {
    private String fieldA;
    @Override
    public String accept(Visitor visitor) {
        return visitor.visitFromAService(this);
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    @Override
    public String toString() {
        return "ARequest{" +
                "fieldA='" + fieldA + '\'' +
                '}' + super.toString();
    }
}
