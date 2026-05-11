public class ReverseInputs{
    public static void main(String [] arg){

    System.out.print(taskOne(10));
}

    public static String taskOne(int amountOfIntegers){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int [] collections = new int [amountOfIntegers];
        int index = collections.length-1;
        int count = 0;
        
        for (;count < collections.length; count++){
            System.out.print("Enter a score: ");
            int userInput = inputCollector.nextInt();

            collections[count] = userInput;
        }


        for(int counter = 0;counter < collections.length;){
            collections[count++] = collections[index--];
            counter++;
        }

        return java.util.Arrays.toString(collections);
    }

}
