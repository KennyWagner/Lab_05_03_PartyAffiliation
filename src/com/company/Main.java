package com.company;

public class Main
{
    public static void main(String[] args) {
        // String response
        //Output “Please enter you party affiliation (Democrat, Republican, or Independent):
        //Input response
        //If response == “Democrat”
        //Output “You get a democrat Donkey!”
        //Else if response == “Republican”
        //Output “You get a republican elephant!”
        //Else if response == “Independent”
        //Output “You get the independent man!”
        //End if

        String response = "R";

        if (response == "D")
        {
            System.out.println("You get a Democrat Donkey!");
        }
        else if (response == "R")
        {
            System.out.println("You get a Republican elephant!");
        }
        else if(response == "I")
        {
            System.out.println("You get the independent man!");
        }
        else
        {
            System.out.println("you chose other!");
        }
    }
}
