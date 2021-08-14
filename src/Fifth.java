public class Fifth {
    public static void main(String[] args) {
        System.out.println(endOther("Jasur","Ura"));
    }

    public static boolean endOther(String a, String b) {
        String str="";
        if(a.length()>b.length()){
            str=a.substring(a.length()-b.length());
            if(str.toLowerCase().equals(b.toLowerCase())){
                return true;
            }else{
                return false;
            }
        }else{
            str=b.substring(b.length()-a.length());
            if(str.toLowerCase().equals(a.toLowerCase())){
                return true;
            }else {
                return false;
            }
        }
    }

}
