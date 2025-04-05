package app;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Coin c = new Coin();

        game.getInput(p1, c);
        game.playGame(p1, p2, c);
    }

    public void getInput(Player playerOne,Coin coin){
        Scanner scanner= new Scanner(System.in);
        System.out.println(playerOne.getName()+" - Please type '"+coin.getCONST_HEADS()+"'' or '"+coin.getCONST_TAILS()+"' to choose :");
        playerOne.setGuess(scanner.nextLine());
        scanner.close();
    }

    public void playGame(Player playerOne,Player playerTwo,Coin coin){
        
        if ((playerOne.getGuess().equals(coin.getCONST_HEADS())) || (playerOne.getGuess().equals(coin.getCONST_TAILS()))) {      
            if (playerOne.getGuess().equals(coin.getCONST_HEADS())) {
                playerTwo.setGuess(coin.getCONST_TAILS());
            }else{
                playerTwo.setGuess(coin.getCONST_HEADS());
            }
        }else{
            System.out.println("Wrong Selection !");
            System.exit(0);
        }

        System.out.println(playerOne.getName()+" - Guess is : "+playerOne.getGuess());
        System.out.println(playerTwo.getName()+" - Guess is : "+playerTwo.getGuess()+" (Automatically)");
        System.out.println("Flipping the coin..");
        coin.flip();
        System.out.println("Coin flipped to : "+coin.getSide());

        if (playerOne.getGuess().equals(coin.getSide())){
            System.out.println(playerOne.getName()+" wins !");
        }else{
            System.out.println(playerTwo.getName()+" wins !");
        }
    }
}
