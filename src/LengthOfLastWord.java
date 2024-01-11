public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            --i;
        int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
            --i;

        return lastIndex - i;
    }
}
