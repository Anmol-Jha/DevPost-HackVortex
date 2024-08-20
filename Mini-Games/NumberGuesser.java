import javax.swing.*;

public class NumberGuesser {
    public static void main (String[] args){
        //hold the user's guess
        int guess = -1;

        //number of user guesses
        int count = 0;

        //create the number
        int num = (int)(Math.random()*100);

        //loop to ask user
        do{
            guess = Integer.parseInt(JOptionPane.showInputDialog("Guess number between 0 to 100!"));
            if(guess>num)
                JOptionPane.showMessageDialog(null,"Too high");

            if (guess<num)
                JOptionPane.showMessageDialog(null,"Too low");

            count++;
        }
        //keep going until user gets the number
        while(num!=guess);

        JOptionPane.showMessageDialog(null,"You guessed the number - "+num+" - in"
                +count+"guess(es)!");
    }
}
