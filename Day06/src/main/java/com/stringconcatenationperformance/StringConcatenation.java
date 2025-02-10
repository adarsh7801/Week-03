package com.stringconcatenationperformance;

public class StringConcatenation {


    //concat with String
    public static String concatenateWithString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }

        return str;
    }

    //concat with StringBuilder
    public static StringBuilder concatenateWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb;
    }

    //concat with StringBuffer
    public static StringBuffer concatenateWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        return sb;
    }


}
