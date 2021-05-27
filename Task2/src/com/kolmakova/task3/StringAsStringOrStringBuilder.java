package com.kolmakova.task3;

public class StringAsStringOrStringBuilder {

    public void countTheLargestNumberOfSpaces() {
        String s = "Hello**,******world***!";
        char[] result = s.toCharArray();
        int max = 0;
        int len = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == ' ') {
                len++;
            }
            if (len > max) {
                max = len;
            } else {
                len = 0;
            }

        }
        System.out.println("(переделать)Max number of spaces is:" + max);
    }

    public void insertAfterCharacter() {
        String s = "fas";
        StringBuilder sb = new StringBuilder(s);
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                sb.append(c).append('b');
            }

        }
        System.out.println(sb.toString());
    }

    public void infoAboutPalindrome() {
        String str1 = "топот";
        String str2 = "топор";
        System.out.println("String is: " + str1);
        System.out.println("Is palindrome: " + isPalindrome(str1));
        System.out.println("String is: " + str2);
        System.out.println("Is palindrome: " + isPalindrome(str2));

    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void getWord() {
        String str = "Информатика";
        System.out.println("String: is:" + str);
        char[] char1 = new char[11];
        char[] char2 = new char[11];
        char[] char3 = new char[11];
        char[] char4 = new char[11];
        str.getChars(7, 8, char1, 1);
        System.out.println(char1);
        str.getChars(3, 4, char2, 1);
        System.out.println(char2);
        str.getChars(4, 5, char3, 1);
        System.out.println(char3);
        str.getChars(7, 8, char4, 1);
        System.out.println(char4);
        String s = String.valueOf(char1) + String.valueOf(char2) + String.valueOf(char3) + String.valueOf(char4);
        System.out.println("Final word: " + s);


    }

    public void countLetterA() {
        String s = "Макарона";
        System.out.println("String is: " + s);
        char[] result = s.toCharArray();
        int count = 0;
        for (char c : result)
            if (c == 'а')
                ++count;
        System.out.println("Letter a occurs " + count + " times");
    }

    public void duplicateCharacter() {
        String str = "Привет";
        System.out.println("String is: " + str);
        String prefix = "";
        while (!str.equals("")) {
            char c = str.charAt(0);
            prefix += "" + c + c;

            str = str.substring(1);
        }
        System.out.println("Duplicated string is: " + prefix + " ");

    }

    public void getInfoAboutSpacesAndCharacters() {
        String string = "aaaa bbbcdee ";
        System.out.println("String is: " + string);
        System.out.println("Final string is: " + deleteSpaces(removeDuplicateCharacters(string)));

    }

    public String removeDuplicateCharacters(String s) {
        StringBuilder data = new StringBuilder(s);
        for (int i = 0; i < data.length(); i++) {
            String character = String.valueOf(data.charAt(i));
            int dupIndex = data.indexOf(character, i + 1);
            while (dupIndex != -1) {
                data.deleteCharAt(dupIndex);
                dupIndex = data.indexOf(character, i + 1);
            }
        }

        return data.toString();

    }

    public String deleteSpaces(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }

    public void getInfoAboutMaxWord() {
        String str = "first second third";
        System.out.println("String is: " + str);
        System.out.println("Max word is: " + getMaxWord(str));

    }

    public String getMaxWord(String s) {
        String[] words = s.split(" ");
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        return (resstring);
    }

    public void getNumberOfUppercaseAndLowercaseLetters() {
        String upperCaseAlph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = "AlexaNdra";
        System.out.println("String is: " + str);
        int let_low = 0;
        int let_up = 0;
        for (char symbol : str.toCharArray()) {
            if (upperCaseAlph.indexOf(symbol) != -1) {
                let_up++;
            }else{
                let_low++;
            }
        }
        System.out.println("Uppercase letters: " + let_up);
        System.out.println("Lowercase letters: " + let_low);
    }
    public void determineTheNumberOfSentences(){
    String X="Today is Monday.Tough day!What can I do to avoid it?";
    System.out.println("String is: "+X);
    char[] result=X.toCharArray();
    int count=0;
    for (int i=1 ;i<X.length();i++) {
        if (result[i]=='!'|| result[i]=='.'|| result[i]=='?'){
            count++;
        }
    }
        System.out.println("Number of sentences is: "+count);

    }

//    public void sortText(){
//    String t=
//    parseText(t);
//
//    }

//    private static final String PARAGRAPH_SPLIT_REGEX = "(^\\s{2})";
//    public void parseText(String text) {
//        String[] paragraphs = text.split(PARAGRAPH_SPLIT_REGEX);
//        for (int i = 0; i < paragraphs.length; i++) {
//            System.out.println("Paragraph: " + paragraphs[i]);
//        }
//    }
}






