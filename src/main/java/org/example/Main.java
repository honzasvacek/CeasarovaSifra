package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cypheredWord = zasifrujSlovo(sc.next(), sc.nextInt());

        System.out.println(cypheredWord);

        System.out.println(vylustiSlovo(cypheredWord));
    }

    public static String zasifrujSlovo(String s, int key) {
        String cypheredWord = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //charAt vybere písmeno na daném indexu ze stringu word

            int asci = (int) ch + key;

            if (asci > 122) {
                asci = 96 + (asci - 122);
            }

            if (asci < 97) {
                asci = 123 - (97 - asci);
            }

            ch = (char) asci;

            cypheredWord += ch;

        }

        return cypheredWord;
    }

    public static ArrayList<String> vylustiSlovo(String s) {
        String cypheredWord = "";

        ArrayList<String> listOfWords = new ArrayList<String>();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j); //charAt vybere písmeno na daném indexu ze stringu word

                int asci = (int) ch + i;

                if (asci > 122) {
                    asci = 96 + (asci - 122);
                }

                if (asci < 97) {
                    asci = 123 - (97 - asci);
                }

                ch = (char) asci;

                cypheredWord += ch;

            }

            listOfWords.add(cypheredWord);

            cypheredWord = "";
        }
        return listOfWords;
    }
}