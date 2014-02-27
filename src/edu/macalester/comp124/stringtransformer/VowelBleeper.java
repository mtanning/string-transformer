package edu.macalester.comp124.stringtransformer;

/**
 * Created by Micah on 2/27/14.
 */
public class VowelBleeper extends StringTransformer {

    @Override
    public String transform(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                newString += '*';
            }
            else if(s.charAt(i) == 'a') {
                newString += '*';
            }
            else if(s.charAt(i) == 'E') {
                newString += '*';
            }
            else if(s.charAt(i) == 'e') {
                newString += '*';
            }
            else if(s.charAt(i) == 'I') {
                newString += '*';
            }
            else if(s.charAt(i) == 'i') {
                newString += '*';
            }
            else if(s.charAt(i) == 'O') {
                newString += '*';
            }
            else if(s.charAt(i) == 'o') {
                newString += '*';
            }
            else if(s.charAt(i) == 'U') {
                newString += '*';
            }
            else if(s.charAt(i) == 'u') {
                newString += '*';
            }
            else {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    @Override
    public String toString() {
        return "VowelBleeper";
    }
}


