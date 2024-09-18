package com.br.javaPrractise;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Practise {
    public static void main(String args[]) throws ParseException {
//        String name = "Azeez";
//        for(int i=0;i<name.length();i++){
//            int count=0;
//            for(int j=0;j<name.length();j++){
//                if(name.charAt(j)==name.charAt(i)){
//                    count++;
//                }
//            }
//        }

        String str = "aabcccd";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!(result.contains(Character.toString(str.charAt(i))))) {
                result += " " + str.charAt(i);
                result += " : " + count;
            }

        }

        System.out.println(result);

    }
}