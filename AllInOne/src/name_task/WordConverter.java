package name_task;

public class WordConverter {
    public String DoubleSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toBinaryString(c)).append(' ');
            answer.append(Integer.toUnsignedString(c, 10)).append(' ');
        }
        System.out.println(answer.toString());

        return answer.toString();
    }
    public String HexSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toHexString(c)).append(' ');

        }
        System.out.println(answer.toString());

        return answer.toString();
    }
    public String DecimalSystem(String s) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            answer.append(Integer.toUnsignedString(c, 10)).append(' ');
        }
        System.out.println(answer.toString());

        return answer.toString();
    }
}
