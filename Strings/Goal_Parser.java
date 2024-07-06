package Strings;

public class Goal_Parser {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int n = command.length();
        int i = 0;
        while (i < n) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                i++;
            }

            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i += 2; // here we are skipping 2 charaters of '()'.'
            }

            else {
                sb.append("al");
                i += 4; // Skipping the pointer i to 3 characcter to avoid using same characters of
                        // '(al)'
            }
        }

        return sb.toString();
    }
}
