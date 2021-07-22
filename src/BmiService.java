public class BmiService {
    public float calculate(float weight, float height) {
        // Пришлось умножить вес на 10000, т.к. по формуле рост берется в метрах, но проще его писать в сантиметрах.
        float bmi = (weight * 10000) / (height * height);
        return bmi;
    }
}
