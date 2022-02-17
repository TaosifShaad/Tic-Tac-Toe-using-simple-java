import java.util.Scanner;
public class testertic{


// Create game and initialize it.

// First player will be 'x'
  public static void main(String [] args){
  Scanner sd=new Scanner(System.in);
   int q=0;int w=0; 
TicTacToe game = new TicTacToe();

 

// Player 'x' places a mark in the top right corner row 0, column 2

// These values are based on a zero index array, so you may need to simply take in a row 1 and subtract 1 from it if you want that.
for (int a=0;a<9;a++){
System.out.println("enter");
  int Q=sd.nextInt();
//int W=sd.nextInt();
  if(Q==1){q=0;w=0;}
  else
    if(Q==2){q=0;w=1;}
  else
    if(Q==3){q=0;w=2;}
  else
    if(Q==4){q=1;w=0;}
  else
    if(Q==5){q=1;w=1;}
  else
    if(Q==6){q=1;w=2;}
  else
    if(Q==7){q=2;w=0;}
  else
    if(Q==8){q=2;w=1;}
  else
    if(Q==9){q=2;w=2;}
  
  game.placeMark(q,w);
game.changePlayer();
 

// Lets print the board

game.printBoard();
//}
 

// Did we have a winner?

if (game.checkForWin()) {

   System.out.println("We have a winner! Congrats!");

   //System.exit(0);

}

else if (game.isBoardFull()) {

   System.out.println("Appears we have a draw!");

  // System.exit(0);

}
}
 

// No winner or draw, switch players to 'o'

//game.changePlayer();

 

// Repeat steps again for placing mark and checking game status...
  }}