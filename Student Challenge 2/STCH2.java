
public class STCH2 {
    static String[] txtAR;
    static int i, score,count;
    static char q;

    public static void InputString(String text) {
        txtAR = new String[text.length()];
        i = 0;
        score = 0;
        count = 0;
        
        for (int y = 0; y <= text.length(); y++) {
            i++;

            if (i <= text.length()) {
                txtAR[y] = text.substring(y, i);
                // System.out.println(text.charAt(y));// add this to a stack

                if (txtAR[y].equals("{") || txtAR[y].equals("[") || txtAR[y].equals("("))// finding an opening bracket
                count=y; 
                count++; 
                for (int n = 0; n <= text.length()-1; n++) {
                        
                        char g = text.charAt(n);
                        //String g = txtAR[n].toString();
                        //System.out.println(g);
                        if(g=='}'||g==']'||g==')'){//checking for close brackets
                            //System.out.println("Input match !!");
                            score = 0;
                        }else{
                            score++;
                        }
                    }
            }
        }
        System.out.println("Final Score: " + score);
        if(score>=0){
            System.out.println("Input mismatch");
        }else{
            System.out.println("Input Match");
        }

    }

    public static void main(String[] args) {
        InputString("{}[]");
    }

