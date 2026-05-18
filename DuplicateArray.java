public class DuplicateArray{
    public static void main(String [] args){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int [] collections = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};   
        int index = 0;     
        int count = 0;
        for(;count < 10; count++){
            System.out.print("Enter a score from [10 - 100]: ");
            int userInput = inputCollector.nextInt();

            if (userInput >= 10 && userInput <= 100){
//                collections[index++] = userInput;

                int sameNumber;
                for (sameNumber = 0; sameNumber < index; sameNumber++){ 
                    if (collections[sameNumber] == userInput){
                        break;
                    }
               }
                if (sameNumber == index){
                    collections[index++] = userInput;
                }
            }
            

            else{
                System.out.print("\nInvalid! score must be between [10 - 100]\nInput a score from [10 to 100]: ");
                userInput = inputCollector.nextInt();
  
            }
        }
        for (int collectionsCount = 0; collectionsCount < collections.length; collectionsCount++){
            if(collections[collectionsCount] != -1){
                System.out.printf("%d ",collections[collectionsCount]);
            }
        }
//        System.out.print(java.util.Arrays.toString(collections));
    }
}
