
public class STCH2 {
    static String[] txtAR;
    static int i = 0, score;
    static char q;

    public static void InputString(String text) {
        txtAR = new String[text.length()];

        for (int y = 0; y <= text.length(); y++) {
            i++;
            score = 0;
            if (i <= text.length()) {
                txtAR[y] = text.substring(y, i);
                // System.out.println(text.charAt(y));// add this to a stack

                if (txtAR[y].equals("{") || txtAR[y].equals("[") || txtAR[y].equals("("))
                    for (int n = 1; n <= text.length() - 1; n++) {

                        char g = text.charAt(n);

                        if (g == '}' || g == ']' || g == ')') {
                            System.out.println("Input Match !!");
                            score = 0;
                        } else {
                            score++;
                            System.out.println("Input Misatch !! Score: " + score + " char: " + g);
                        }
                        System.out.println("Final Score: " + score + " char: " + g);

                    }
            }
        }

    }

    public static void main(String[] args) {
        InputString("{fvffvfv]fvfv}");
    }

