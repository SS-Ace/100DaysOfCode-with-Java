package com.company;

public class Main {


    public static void displayHighScorePosition(String name,int pos){
System.out.println(name+" managed to get into position "+pos+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int pos;
        if(score>=1000){
            return pos=1;
        }

        else if(score>=500&&score<1000){
           return pos=2;
        }

        else if(score>=100&&score<500){
           return pos=3;
        }

       else {
            return 4;
        }
    }

    public static void main(String[] args) {
      displayHighScorePosition("Rahul",calculateHighScorePosition(1500));
        displayHighScorePosition("Sam",calculateHighScorePosition(900));
        displayHighScorePosition("Rohan",calculateHighScorePosition(400));
        displayHighScorePosition("Samuel",calculateHighScorePosition(50));
    }
}
