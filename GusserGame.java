import java.util.*;
class Guesser {
    int guessNum;
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class player {
    int guessNum;
    int guessNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("player guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;
void collectNumFromGuesser()
{
    Guesser g=new Guesser();
    numFromGuesser =g.guessNum();
}
void collectNumFromPlayer()
{
    player p1=new player();
    player p2=new player();
    player p3=new player();
    player p4=new player();
    numFromPlayer1=p1.guessNum();
    numFromPlayer2=p2.guessNum();
    numFromPlayer3=p3.guessNum();
    numFromPlayer4=p4.guessNum();
}
void compare() {
    if (numFromGuesser == numFromPlayer1) {
        if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4) {
            System.out.println("All player won the game");
        }
       else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
            System.out.println("Player1 and Player2 and Player3 won the game");
        }
      else  if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer4) {
            System.out.println("Player1 and Player2 and Player4 won the game");
        }
       else if (numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4) {
            System.out.println("Player1 and Player3 andPlayer4 won the game");
        }
       else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player1 and Player2 won the game");
        }
        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player1 and Player3 won the game");
        }
        else if (numFromGuesser == numFromPlayer4) {
            System.out.println("Player1 and Player4 won the game");
        } else {
            System.out.println("Player1 won the game");
        }
    }
  else if (numFromGuesser == numFromPlayer2) {
        if (numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4) {
            System.out.println("Player2 and Player3 and Player4 won the game");
        }
      else  if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player2 and Player3 won the game");
        }
       else if  (numFromGuesser == numFromPlayer4) {
            System.out.println("Player2 and Player4 won the game");
        } else {
            System.out.println("Player2 won the game");
        }
    }
   else if (numFromGuesser == numFromPlayer3) {
      if (numFromGuesser == numFromPlayer4) {
            System.out.println("Player3 and Player4 won the game");
        }
        else {
            System.out.println("Player3 won the game");
        }
    }
   else if (numFromGuesser==numFromPlayer4)
    {
        System.out.println("Player4 won the game");
    }
   else
    {
        System.out.println("All player loss the game.");
        System.out.println("Try again !");
    }
}
}
public class GusserGame {
    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
