import java.util.Scanner;


public class hw7 {
    public static int gradeResponse(char [] key, char [] input) {
        int total = 0;
        for (int i=0; i<10; i++){
            if (key[i] == input[i]){
                total++;
            }
        }
        return total*10;
    }
    public static boolean didPass(int grade){
        if (grade > 60){
            return true;
        }
        return false;
    }
    public static void main (String [] args) {
        char [] key = {'a', 'c', 'd', 'b', 'a', 'd', 'c', 'b', 'c', 'b'};
        char [] input = new char [10];
        Scanner getInput = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.printf("Enter answer for question %d\n", i+1);
            char answer = getInput.next().charAt(0);
            input[i] = answer;
        }
        getInput.close();

        if (didPass(gradeResponse(key, input))){
            System.out.printf("You passed with a grade of %d", gradeResponse(key, input));
        }
        else {
            System.out.printf("You failed with a grade of %d", gradeResponse(key, input));
        }
    }
}