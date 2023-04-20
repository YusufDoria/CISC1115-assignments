public class lab7b {
    public static void main (String [] args) {

        int count = 1;
        int sum = 0;
        while(count<=5){
            sum+=count;
            count++;
        }
        System.out.printf("1+2+3+4+5=%d\n", sum);
    }
}
