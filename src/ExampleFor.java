public class ExampleFor {
    public static void main(String[] args) {
        String name = "Alisherbek";
        int count = 0;
        name = name.toLowerCase();
        for (int j = 0; j < name.length(); j++) {
            if (name.charAt(j) == 'e') {
                count++;
            }
        }
    }
}
