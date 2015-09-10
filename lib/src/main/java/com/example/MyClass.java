package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        String run = "Run!";
        String test2 = "\u0021";
        String somebody = "\u0048elp\u002c \u0049 need somebody \n";
        String anybody = "\u0048elp\u002c not just anybody \n";
        String help = "\u0048elp\u002c you know \u0049 need someone" +
                "\u002c \u0048elp\u0021";


        System.out.println(run + "\n");
        //System.out.println(test2);

        if(run.contains(test2))
        {
            System.out.println(somebody + anybody + help);
        }
        else
        {
            System.out.println("I don't like you.");
        }
    }
}
