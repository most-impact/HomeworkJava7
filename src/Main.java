public class Main {
    public static void main(String[] args) {
        //Task 1
        int [] integerArray = new int [3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        double [] floatArray = {1.57, 7.654, 9.986};
        int [] myArray = {5, 6, 7};

        //Task 2
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i != integerArray.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i]);
            if (i != floatArray.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length-1) {
                System.out.print(", ");
            }
        }

        System.out.println('\n');
        //Task 3
        for (int i = integerArray.length-1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = floatArray.length-1; i >= 0; i--) {
            System.out.print(floatArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println('\n');
        //Task 4
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 1) {
                integerArray[i] += 1;
            }
            System.out.print(integerArray[i]);
            if (i != integerArray.length-1) {
                System.out.print(", ");
            }
        }
    }
}