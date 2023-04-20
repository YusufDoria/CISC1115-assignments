import java.util.Scanner;

public class lab9a {
    public static boolean findNum(int [] arr, int userNum) {
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == userNum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args) {
        int [] arr=new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("Enter a number to search for:");
        int userNum = sc.nextInt();
        sc.close();
        System.out.printf(findNum(arr, userNum) ? "%d Exixts in array\n" : "%d doesn't exist in array\n", userNum);
    }
}
