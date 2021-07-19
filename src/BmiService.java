public class BmiService {
    public int calculate(int weight, int height) {
        // Пришлось умножить вес на 10000, т.к. по формуле рост берется в метрах, но проще его писать в сантиметрах.
        int bmi = (weight * 10000) / (height * height);
        return bmi;
    }
}
