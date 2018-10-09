package social.gripp.api.utils.responces;

public class BooleanResponse {
    private String boolValue;

    public BooleanResponse(Boolean value) {
        this.boolValue = value.toString();
    }

    public String getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(String boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BooleanResponse that = (BooleanResponse) o;

        return boolValue != null ? boolValue.equals(that.boolValue) : that.boolValue == null;
    }

    @Override
    public int hashCode() {
        return boolValue != null ? boolValue.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "BooleanResponse{" +
                "boolValue='" + boolValue + '\'' +
                '}';
    }
}
