package com.codedotorg;

public class GameLogic {

    /** Whether or not the game is over */
    private boolean gameOver;

    /**
     * Constructor for the GameLogic class.
     * Initializes the gameOver variable to false.
     */
    public GameLogic() {
        gameOver = false;
    }

    /**
     * Returns a random choice of "rock", "paper", or
     * "scissors" for the computer player.
     * 
     * @return a String representing the computer's choice
     */
    public String getComputerChoice() {
        int ran = (int) (Math.random()*3)+1;
        if(ran == 1)
            return "Rock";
        else if(ran == 2)
            return "Paper";
        else if(ran==3)
            return "Scissors";
        return "";
    }

    /**
     * Determines the winner of a rock-paper-scissors game based on the user's predicted class and the computer's choice.
     * @param predictedClass The user's predicted class.
     * @param computerChoice The computer's choice.
     * @return A string containing the computer choice, user choice, and the result of the game.
     */
    public String determineWinner(String predictedClass, String computerChoice) {
        String ret = "Computer " + computerChoice +", Player " + predictedClass + " result ";
        if(predictedClass.equals(computerChoice)){
            return ret+"Tie";
        }
        else if((predictedClass.equalsIgnoreCase("Rock")&&computerChoice.equalsIgnoreCase("Scissors"))||(predictedClass.equalsIgnoreCase("Scissors")&&computerChoice.equalsIgnoreCase("Paper"))||(predictedClass.equalsIgnoreCase("Paper")&&computerChoice.equalsIgnoreCase("Rock"))){
            return ret+"Player wins";
        }
        else if(predictedClass.equalsIgnoreCase("Nothing")){
            return "No results if nothing is entered";
        }
        return ret+"Computer wins";
    }

    /**
     * Sets the game over flag to true and returns a
     * string indicating a tie result.
     * 
     * @return A string indicating a tie result.
     */
    public String getTieResult() {
        gameOver = true;
        return "There was a tie.";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the user has won.
     * 
     * @return a string indicating that the user has won
     */
    public String getUserWinnerResult() {
        gameOver = true;
        return "The User has won the game.";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the computer has won.
     * 
     * @return A string indicating that the player has lost.
     */
    public String getComputerWinnerResult() {
        gameOver = true;
        return "The Computer has won the game.";
    }

    /**
     * Returns whether the game is over or not.
     * 
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Resets the game logic by setting the gameOver flag to false.
     */
    public void resetLogic() {
        gameOver = false;
    }

}
