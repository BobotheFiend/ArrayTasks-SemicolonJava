public class StoreInputs{
//    public static void main(String [] arg){
//
//    System.out.print(taskOne(10));
//}

    public static String taskOne(int amountOfIntegers){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int [] collections = new int [amountOfIntegers];
        int count = 0;
        for (;count < collections.length; count++){
            System.out.print("Enter a score: ");
            int userInput = inputCollector.nextInt();

            collections[count] = userInput;
        }
        return java.util.Arrays.toString(collections);
    }

}
