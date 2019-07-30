package org.launchcode.java.demos.java4python;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        String v = "Hello, World";
        System.out.println(v);
        String x = "This is a string!";
        System.out.println(x.charAt(8));
        System.out.println(x.contains(" is a "));
        String y = x.substring(2, 6);
        System.out.print(y);
        System.out.print(x.length());
        System.out.println(x.equals(v));
        System.out.println(x.toUpperCase());
        System.out.println(x.substring(4, 12).toLowerCase());
        System.out.println(x.concat(v).concat(y));
        System.out.println(x.indexOf('s'));
    }
}
