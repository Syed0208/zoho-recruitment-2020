public class Question1 {
    static void printPattern(int n){
        int curr = 0, temp = n;
        while (curr < n) {
            for (int i = n; i > temp; i--) {
                System.out.print(i + " ");
            }
            for (int j = temp; j > 0; j--) {
                System.out.print(temp + " ");
            }
            System.out.println();
            curr ++;
            temp--;
        }
    }
    public static void main(String [] args){
        int n = 5;
        printPattern(n);
    }
}
