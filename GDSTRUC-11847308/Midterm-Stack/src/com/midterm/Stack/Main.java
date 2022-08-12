package com.midterm.Stack;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random();

        LinkedStack stack = new LinkedStack();

        stack.push(new Card (1, "Joker"));
        stack.push(new Card (2, "Nanomachines, Son!"));
        stack.push(new Card (3, "You gotta be kidding me!"));
        stack.push(new Card (4, "Can't fret over every egg"));
        stack.push(new Card (5, "Why won't you die?!"));
        stack.push(new Card (6, "Kamisato Ayaya?!"));
        stack.push(new Card (7, "Kamisato Ayaya?!"));
        stack.push(new Card (8, "Kamisato Ayaya?!"));
        stack.push(new Card (9, "Kamisato Ayaya?!"));
        stack.push(new Card (10, "Kamisato Ayaya?!"));
        stack.push(new Card (11, "Tao ho!~"));
        stack.push(new Card (12, "Tao ho!~"));
        stack.push(new Card (13, "Tao ho!~"));
        stack.push(new Card (14, "Tao ho!~"));
        stack.push(new Card (15, "Tao ho!~"));
        stack.push(new Card (16, "Daynona"));
        stack.push(new Card (17, "Daynona"));
        stack.push(new Card (18, "Daynona"));
        stack.push(new Card (19, "Daynona"));
        stack.push(new Card (20, "Daynona"));
        stack.push(new Card (21, "Monami"));
        stack.push(new Card (22, "Monami"));
        stack.push(new Card (23, "Monami"));
        stack.push(new Card (24, "Monami"));
        stack.push(new Card (25, "Monami"));
        stack.push(new Card (26, "Kajuha Bazhooka!!"));
        stack.push(new Card (27, "Kajuha Bazhooka!!"));
        stack.push(new Card (28, "Kajuha Bazhooka!!"));
        stack.push(new Card (29, "Kajuha Bazhooka!!"));
        stack.push(new Card (30, "Kajuha Bazhooka!!"));


        stack.printStack();


    }

    }
