public class ReverseInputs{
//    public static void main(String [] arg){
//
//    System.out.print(taskTwo(10));
//}

    public static String taskTwo(int amountOfIntegers){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int [] collections = new int [amountOfIntegers];
        int count = 0;
        
        for (;count < collections.length; count++){
            System.out.print("Enter a score: ");
            int userInput = inputCollector.nextInt();

            collections[count] = userInput;
        }

        int swap = collections[0];
        int firstElement = 0;
        int lastElement = collections.length-1;;
        while(firstElement < lastElement){
            swap = collections[firstElement];
            collections[firstElement] = collections[lastElement];
            collections[lastElement] = swap;

            firstElement++; lastElement--;
        }

        return java.util.Arrays.toString(collections);
    }

}
