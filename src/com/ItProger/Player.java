package com.ItProger;

public class Player {

    public String name;
    public VARIANTS var;

    Player(){
        this.name = "Bot";

        int rnd = (int) (Math.random() * 3);
        //получаем рандомное значение из  Enam
        switch (rnd){

            case (0) :
                this.var = VARIANTS.SCISSORS;
                break;
            case (1) :
                this.var = VARIANTS.PAPER;
                break;
            case (2) :
                this.var = VARIANTS.STONE;
                break;
            default:
                System.out.println("Error");
                break;

        }
    }

    Player(String name, VARIANTS var){

        this.name = name;
        this.var = var;

    }

    public String Winner (Player num1, Player num2 ) {

        String result = null;

        System.out.println(num1.var + "  Bot VS artsiom  " + num2.var);

        if((num1.var == VARIANTS.PAPER) & (num2.var == VARIANTS.STONE))
            result = "Победил игрок с именем: " + num1.name;
        else
             if((num1.var == VARIANTS.STONE) & (num2.var == VARIANTS.SCISSORS)) result = "Победил игрок с именем: " + num1.name;
        else
             if((num1.var == VARIANTS.SCISSORS) & (num2.var == VARIANTS.PAPER)) result = "Победил игрок с именем: " + num1.name;
        else
             if(num1.var == num2.var) result = "Ничья";
        else result = "Победил игрок с именем: " + num2.name;

            return result;
    }

}
