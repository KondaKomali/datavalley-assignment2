public class Main {
    public static void main(String[] args) {
        String text = "type here to search";
        String withoutSpaces = text.replaceAll("\\s", "");
        System.out.print("Odd-position characters: ");
        for (int i = 0; i < withoutSpaces.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(withoutSpaces.charAt(i));
            }
        }
    }
}
