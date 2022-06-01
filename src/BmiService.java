public class BmiService {
    public double calculate(int weight, double growth) {
        return weight / (growth * growth);
    }
}
