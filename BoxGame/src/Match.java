public class Match {

    Fighther fightherOne;
    Fighther fightherTwo;


    Match(Fighther fightherOne, Fighther fightherTwo) {
        this.fightherOne = fightherOne;
        this.fightherTwo = fightherTwo;
    }


     void run() {

        while(fightherOne.health > 1 && fightherTwo.health > 1) {

            fightherOne.hit(fightherTwo);
            fightherTwo.hit(fightherOne);

        }

        if(fightherOne.health < 1 && fightherTwo.health > 1) {
            System.out.println("The winner is " + fightherTwo.name );
        } else if(fightherTwo.health < 1 && fightherOne.health > 1) {
            System.out.println("The winner is " + fightherOne.name);
        } else {
            System.out.println("Draw");
        }

    }


}
