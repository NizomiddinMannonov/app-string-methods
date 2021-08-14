public class Second {
    public static void main(String[] args) {
        System.out.println(countHi(" hi c hi hi"));
    }


    public static int countHi(String str) {
        int javob=0;
        for(int k=0; k<str.length()-1; k++){
            if(str.substring(k,k+2).equals("hi")){
                javob++;
            }
        }
        return javob;
    }
}
