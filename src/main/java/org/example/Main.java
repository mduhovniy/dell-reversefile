package org.example;

/*
Original file

My name is Pavel
I am 37 years old
Today is Wednesday
Tomorrow is Thursday
My name is Pavel
I am 37 years old
Today is Wednesday
Tomorrow is Thursday
My name is Pavel
I am 37 years old
Today is Wednesday
Tomorrow is Thursday

...
...
...

==================================
Reversed file

Pavel is name My
old years 37 am I
Wednesday is Today
Thursday is Tomorrow
Pavel is name My
old years 37 am I
Wednesday is Today
Thursday is Tomorrow
Pavel is name My
old years 37 am I
Wednesday is Today
Thursday is Tomorrow
...
...
...

==================================

Operations

read(3) --> Pav
read(2) --> el
readline() --> " is name My"
readline() --> old years 37 am I
read(40) -->
Wednesday is Today
Thursday is Tomorrow
Pa
read(20) -->
vel is name My
old ye

*/

import java.io.IOException;

public class Main {
    public static void main(String[] argv) throws IOException {
        ReverseFile reverseFile = new ReverseFile("/Users/maximduhovniy/IdeaProjects/dell-reversefile/src/main/resources/test_file.txt");

        System.out.println(reverseFile.read(3));
        System.out.println(reverseFile.read(2));
        System.out.println(reverseFile.readLine());
        System.out.println(reverseFile.readLine());
        System.out.println(reverseFile.read(40));
        System.out.println(reverseFile.read(20));
        System.out.println(reverseFile.readLine());
        System.out.println(reverseFile.readLine());
    }
}