public class Calculator {
    @Deprecated
    public Float media(Float x, Float y, Float z) {
        if (x != null && y != null && z != null) {
            Float media = (x + y + z) / 3;
            return media;
        } else {
            return null;
        }
    }
    public Float media(Float[] arr){
        return null;
    }
}
