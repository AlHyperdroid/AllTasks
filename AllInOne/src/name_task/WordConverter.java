package name_task;

public class WordConverter {
    public String doubleSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toBinaryString(c)).append(' ');
            answer.append(Integer.toUnsignedString(c, 10)).append(' ');
        }
        System.out.println(answer.toString());

        return answer.toString();
    }
    public String hexSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toHexString(c)).append(' ');

        }
        System.out.println(answer.toString());

        return answer.toString();
    }
    public String decimalSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toUnsignedString(c, 10)).append(' ');
        }
        System.out.println(answer.toString());

        return answer.toString();
    }
}
