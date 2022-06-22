package edu.hue.jk.lpl01;

import java.util.Scanner;

public class UpperCase {
    public static void main (String [] args) {
        boolean  flag= true;
        do {
            Scanner sr = new Scanner(System.in);
            System.out.println("输入字符串：");
            String s = sr.nextLine();
            if (s.equals("Bye!") ){
                return;
            }
            System.out.println("选择第几位字符转换为大写形式：");
            int n = sr.nextInt();
            char x = Case(s, n);
            System.out.println("转换后的大写字符为："+x+"\n");
        }while(flag);
    }

    public static char Case(String s,int n){
        String k = s.toUpperCase();
        char g = k.charAt(n-1);
        if (check(g))
            return g;
        else return ' ';
    }

    public static boolean check(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A'  && c <='Z'))
            return true;
        else
            return false;
    }
}
