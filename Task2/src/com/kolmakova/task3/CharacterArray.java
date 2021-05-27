package com.kolmakova.task3;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterArray {

    public void convertFromCamelCaseToSnakeCase() {
        String[] strings = {"SomeString"};
        System.out.println("Source string is :");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            StringBuffer stringBuffer = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(stringBuffer, "_$0");
            }
            m.appendTail(stringBuffer);
            strings[i] = stringBuffer.toString().toLowerCase();
        }
        System.out.println("\nTransformed string is : ");
        System.out.println(Arrays.toString(strings));
    }

    public void replaceWord() {
        String s = " Im writing a world, its my first world";
        System.out.println("Source string is: "+s);
        s = s.replace("world", "letter");
        System.out.println("Transformed string is :"+ s);
    }

    public void countDigit() {
        String s = "1,14 cat 324";
        System.out.println(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("There are "+count+" digits in the string");
    }

    public void countTheNumbers(){
        String s = "40 сорок, 1 филин, 123 скворцов";
        String[] arr = s.split(" ");
        int count = 0;
        for(String str : arr) {
            try {
                Integer.parseInt(str);
            } catch(NumberFormatException e) {
                count++;
            }
        }
        System.out.println("String is : "+s);
        System.out.println(arr.length - count);

    }

    public void removeExtraSpacesInALine(){
        String text=" Hello   world  ! ";
        System.out.println("Source string:"+text);
        while(text.contains("  ")) {
            String replace = text.replace("  ", " ");
            text=replace;

        }
        System.out.println("Transformed string:"+text.trim());
    }


}


