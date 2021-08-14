public class Seventh {
    public static void main(String[] args) {
        System.out.println(xyzThere("absxyz"));

    }
    public static boolean xyzThere(String str){
        return str.replace(".xyz","").contains("xyz");
    }
}
