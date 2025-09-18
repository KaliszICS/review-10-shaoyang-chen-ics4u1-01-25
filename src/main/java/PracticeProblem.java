public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void square(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    if (j < n && j > 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
    }
    public static boolean hasLowercase(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                return true;
            }
        }
        return false;
    }

}
