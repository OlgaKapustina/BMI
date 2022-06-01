public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 54;
        double growth = 1.65;
        double mass = service.calculate(weight, growth);
        System.out.println(mass);
    }
}