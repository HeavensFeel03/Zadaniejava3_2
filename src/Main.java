public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;      //вес
        double heightM = 1.87;      //рост
        int index = (int) service.calculate(weightKg, heightM);

        System.out.println(index);
    }

}