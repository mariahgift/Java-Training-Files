package java_exercise_OOP;

import java.text.DecimalFormat;

import static java.lang.Math.round;

public class ShelbyPrototype {
    DecimalFormat format = new DecimalFormat("0.00");
    public double data;
    public int rotation;

    public ShelbyPrototype(double data, int rotation) {
        this.data = data;
        this.rotation = rotation;
    }

    public double circumference() {
        double radius = data / 2;
        final double pi = 3.1415;
        double circumference = (pi * (2 * radius));
        double circumRoundOff = Math.round(circumference*100.0)/100.0;
        return circumRoundOff;
    }

    public String calculate() {
        double travelDistance = (circumference() * rotation);
        double inchesToKM = (travelDistance / 39370.1);
        int kMRoundOff = (int)(round(inchesToKM));
        String inchesToKmStr = String.valueOf(kMRoundOff);
        return inchesToKmStr;

    }

    public String output() {
        String output = "";
        int index = calculate().length()-1; // 2

        for (int max_length = 6; max_length > 0; max_length--){
            if(index >= 0){
                output = "["+calculate().charAt(index)+"]"+output;
                index--;
            }else{
                output = "[0]"+ output;
            }
        }
        System.out.println(output);
        return output;
    }

    public String result() {
        String result = "The car with " + (int)data +
                " inch wheel and " + rotation +
                " wheel rotation traveled the distance of " +
                calculate() + "Km";
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        ShelbyPrototype shelby = new ShelbyPrototype(19, 457752);
        shelby.result();
    }
}


//
//import java.text.DecimalFormat;
//        import static java.lang.Math.round;
//
//public class Main {
//    DecimalFormat format = new DecimalFormat("0.00");
//    public double data;
//    public int rotation;
//
//    public Main(double data, int rotation) {
//        this.data = data;
//        this.rotation = rotation;
//    }
//
//    public double circumference() {
//        double radius = data / 2;
//        final double pi = 3.1415;
//        double circumference = (pi * (2 * radius));
//        double circumRoundOff = Math.round(circumference*100.0)/100.0;
//        return circumRoundOff;
//    }
//
//    public String calculate() {
//        double travelDistance = (circumference() * rotation);
//        double inchesToKM = (travelDistance / 39370.1);
//        int kMRoundOff = (int)(round(inchesToKM));
//        String inchesToKmStr = String.valueOf(kMRoundOff);
//
//        String output = "";
//        int index = inchesToKmStr.length()-1; // 2
//
//        for (int max_length = 6; max_length > 0; max_length--){
//            if(index >= 0){
//                output = "["+inchesToKmStr.charAt(index)+"]"+output;
//                index--;
//            }else{
//                output = "[0]"+ output;
//            }
//        }
//        System.out.println(output);
//        return output;
//    }

//    public String result() {
////        String dataStr = (str)data;
//        String result = "The car with " + (int)data + " wheel and " + rotation + " wheel rotation traveled the distance of " + kMRoundOff
//                + "Km";
//        System.out.println(result);
//        return result;
//    }

//     public static void main(String[] args) {
//         ShelbyPrototype shelby = new ShelbyPrototype(19, 457752);
// //        shelby.result();
//     }
