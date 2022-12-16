public class STCH2 {
    static String[] txtAR;
    static int i = 0;
    static String q;

    public static void InputString(String text) {
        txtAR = new String[text.length()];

        for (int y = 0; y <= text.length(); y++) {
            i++;
            if (i <= text.length()) {
                txtAR[y] = text.substring(y, i);
                System.out.println(txtAR[y]);

                if (txtAR[y].equals("{") || txtAR[y].equals("[") || txtAR[y].equals( "("))
                    for (int n = 0; n <= text.length(); n++) {
                        char g = text.charAt(n);
                        if(g=='}'){
                            System.out.println("Input Match Found !!");
                        }else if(n == text.length()){
                            //System.out.println("Input Match Not Found !!");
                        }
                    }
            }
        }
    }

    public static void checkSymb(char T, int Size) {

    }

    public static void main(String[] args) {
        InputString("{abc}");
    }
}