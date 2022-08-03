public class Exercise01 {
    public static void main(String[] args) {
        int arr[] = {0,9,8,7,6,5,4};
        try {
            System.out.println(arr[6]);
        } catch (Exception e){
            System.out.println("wrong value");
        }
        System.out.println("from main");

    }
}