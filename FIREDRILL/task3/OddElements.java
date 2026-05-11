public class OddElements{
    public static void main(String [] arg){

    int [] collections = {11,22,33,44,55,66,77,88,99,100};
    System.out.print(taskThree(collections));
}

    public static String taskThree(int [] collections){
        int counter = 0;
        int index = 0;
        for(; counter < collections.length; counter++){
            if (collections[counter] % 2 != 0){
                collections[index++] = collections[counter];
            }
        }
            int odd [] = new int [index];
            for(int count = 0; count < odd.length; count++){

                odd[count] = collections[count];
            }
        return java.util.Arrays.toString(odd);
    }

}
