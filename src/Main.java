public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        int a = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = a;
        System.out.println(myArray[0]+myArray[myArray.length/2]);
    }
}