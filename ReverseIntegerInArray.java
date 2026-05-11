public class ReverseIntegerInArray{
    public static void main(String [] args){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int [] collections = new int [10] ;   
        int index = collections.length-1;     
        int count = 0;
        
        for(;count < collections.length; count++){

            System.out.print("Enter a score: ");
            int userInput = inputCollector.nextInt();

            collections[count] = userInput;

        }
        
        System.out.printf(" The array list....");
        System.out.print(java.util.Arrays.toString(collections));

        System.out.printf("%nThe first element in index 0 = %d%n", collections[0]);

       System.out.printf("%n The array list reversed ....");

        for (int counter = 0; counter < collections.length; counter++){

            collections[counter] = collections[index--];
//            System.out.printf("%5d", collections[counter]);
        }     
        System.out.print(java.util.Arrays.toString(collections));   
        System.out.printf("%n The first element in reversed array at index 0 = %d%n", collections[0]);
    }
}
