public class Main {


    public static void main(String[] args) {



        Fighther kunLao = new Fighther("Kun Lao", 15, 25, 200, 20);
        Fighther leoKing = new Fighther("leoKing", 18, 50, 200, 20);



        Match match = new Match(kunLao, leoKing);
        match.run();
    }


}
