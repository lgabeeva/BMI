public class BmiService {
    public int calculate(int weightKg; double heightMeteres;) {
        double bmi = weightKg / (heightMeteres * heightMeteres);
        return (int) bmi;
    }
}
