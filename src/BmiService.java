public class BmiService {

    public double calculate(int weight, double height) {
        double bmiResult = weight / (height * height);
        return bmiResult;


    }

}
