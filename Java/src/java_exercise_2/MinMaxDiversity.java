package java_exercise_2;

import java.util.Scanner;
public class MinMaxDiversity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int highestNum = 0;
        int lowestNum = Integer.MAX_VALUE;
        int inputNum = 0;
        int count = 0;

        
        for (int i = 0; i < 10; i++) {
            inputNum = scan.nextInt();
            if (inputNum >= highestNum) {
                highestNum = inputNum;
            }
            if (inputNum <= lowestNum) {
                lowestNum = inputNum;
            }
            if (inputNum % 3 == 0) {
                count++;
            }
        }

        System.out.println("Highest: " + highestNum);
        System.out.println("Lowest: " + lowestNum);
        System.out.print(count + " divisible by 3");

    }
}// end of main method


//        int temp = 0;
//        for(int i=0; i < n; i++){
//            for(int j=1; j < (n-i); j++){
//                if(tenNumbers[j-1] > tenNumbers[j]){
//                    //swap elements
//                    temp = tenNumbers[j-1];
//                    tenNumbers[j-1] = tenNumbers[j];
//                    tenNumbers[j] = temp;
//                }
//            }
//        }





//    int[] tenNumbers = new int[10];
//    int n = tenNumbers.length;
//        for (int num = 0; num < n; num++) {
//        tenNumbers[num] = scan.nextInt();
//        }
//
//        int temp = 0;
//        for(int i=0; i < n; i++){
//        for(int j=1; j < (n-i); j++){
//        if(tenNumbers[j-1] > tenNumbers[j]){
//        //swap elements
//        temp = tenNumbers[j-1];
//        tenNumbers[j-1] = tenNumbers[j];
//        tenNumbers[j] = temp;
//        }
//        }
//        System.out.println("Highest: " + tenNumbers[9]);
//        System.out.println("Lowest: " + tenNumbers[0]);
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//        if (tenNumbers[i] % 3 == 0) {
//        count++;
//
//        }
//        } // end of forloop
//        System.out.print(count + " divisible by 3");
//        } }



//
//        sort(tenNumbers);
//        System.out.println("Highest " + tenNumbers[9]);
//        System.out.println("Lowest " + tenNumbers[0]);
//        countDivThree(tenNumbers);
//
//    }
//
//    static void sort(int[] tenNumbers) {
//        int n = tenNumbers.length;
//        int temp = 0;
//        for(int i=0; i < n; i++){
//            for(int j=1; j < (n-i); j++){
//                if(tenNumbers[j-1] > tenNumbers[j]){
//                    //swap elements
//                    temp = tenNumbers[j-1];
//                    tenNumbers[j-1] = tenNumbers[j];
//                    tenNumbers[j] = temp;
//                }
//            }
//        }
//    } // end of method sort
//
//    static void countDivThree(int[] tenNumbers) {
//        int n = tenNumbers.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (tenNumbers[i] % 3 == 0) {
//                count++;
//
//            }
//        } // end of forloop
//        System.out.println(count + " divisible by 3");
//    }




