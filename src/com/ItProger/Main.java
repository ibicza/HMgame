package com.ItProger;

public class Main {

    public static void main(String[] args) {

        Player bot = new Player();
        Player artsiom = new Player("artsiom",VARIANTS.PAPER);

        System.out.println(bot.Winner(bot, artsiom));
    }
}


