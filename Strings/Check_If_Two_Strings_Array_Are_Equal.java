package Strings;

public class Check_If_Two_Strings_Array_Are_Equal {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder strBuilder = new StringBuilder();
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            strBuilder.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            strBuild.append(word2[i]);
        }

        String str1 = strBuilder.toString();
        String str2 = strBuild.toString();

        if (str1.equals(str2)) {
            return true;
        }

        return false;
    }
}
