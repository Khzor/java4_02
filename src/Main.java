public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 50;
        float height = 150;

        float bmi = service.calculate(weight, height);

        System.out.printf("BMI: " + "%.2f", bmi);
    }
}
