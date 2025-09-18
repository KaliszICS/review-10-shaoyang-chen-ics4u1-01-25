public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int n){
        StringBuilder sout = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sout.append("*");
            }
            sout.append("\n");
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
                    if (j < n && j > 1) {
                        sout.append(" ");
                    } else {
                        sout.append("*");
                    }
                }

            }
            sout.append("\n");
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
