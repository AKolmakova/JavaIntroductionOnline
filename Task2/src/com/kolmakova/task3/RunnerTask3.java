package com.kolmakova.task3;

public class RunnerTask3 {
    public static void launch() {
        CharacterArray characterArray = new CharacterArray();
        StringAsStringOrStringBuilder stringAsStringOrStringBuilder=new StringAsStringOrStringBuilder();
        characterArray.convertFromCamelCaseToSnakeCase();
        characterArray.replaceWord();
        characterArray.countDigit();
        characterArray.countTheNumbers();
        characterArray.removeExtraSpacesInALine();
        stringAsStringOrStringBuilder.countTheLargestNumberOfSpaces();
        stringAsStringOrStringBuilder.insertAfterCharacter();
        stringAsStringOrStringBuilder.infoAboutPalindrome();
        stringAsStringOrStringBuilder.getWord();
        stringAsStringOrStringBuilder.countLetterA();
        stringAsStringOrStringBuilder.duplicateCharacter();
        stringAsStringOrStringBuilder.getInfoAboutSpacesAndCharacters();
        stringAsStringOrStringBuilder.getInfoAboutMaxWord();
        stringAsStringOrStringBuilder.getNumberOfUppercaseAndLowercaseLetters();
        stringAsStringOrStringBuilder.determineTheNumberOfSentences();

    }
}
