public class ReverseInputs{
//    public static void main(String [] arg){
//
//    System.out.print(taskTwo(10));
//}

    public static String taskTwo(int amountOfIntegers){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int [] collections = new int [amountOfIntegers];
        int index = collections.length -1;
        int count = 0;
        
        for (;count < collections.length; count++){
            System.out.print("Enter a score: ");
            int userInput = inputCollector.nextInt();

            collections[count] = userInput;
        }

        int counter = 0;
        while(counter < index){
            int temp = collections[counter];
            collections[counter] = collections[index];
            collections[index] = temp;

            counter++; index--;
        }

        return java.util.Arrays.toString(collections);
    }

}
