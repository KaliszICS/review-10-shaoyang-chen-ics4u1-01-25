public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int n){
        if (n <= 0) {
            return "";
        }
        StringBuilder sout = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                sout.append(" ");
            }
            for (int j = 0; j < i; j++) {
                sout.append("*");
                if (j < i - 1) {
                    sout.append(" ");
                }
            }
            if (i < n) {
                sout.append("\n");
            }
        }
        return sout.toString();
    }
    public static String square(int n){
        StringBuilder sout = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    sout.append("*");
                } else {
                    if (j == 1 || j == n) {
                        sout.append("*");
                    } else {
                        sout.append(" ");
                    }
                }

            }
            if (i < n) {
                sout.append("\n");
            }
        }
        return sout.toString();
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
