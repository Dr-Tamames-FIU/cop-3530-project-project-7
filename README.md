# COP-3530-Project-Project-7

Project 7: Alex Pepitone, Udeme Ekpo, and Gerald Gelats

Data Structures used are: 2d arrays, array-list and HashMap


------------------------------------------------------------------------------------------------------------------------------
Contributions: 

Alex Pepitone handled the coding for TicTacToeGame, TicTacToeEngine, PlayerMap, Player, and Board methods

Alex Pepitone Detailed Contribution:

-Implemented a class that utilizes a HashMap to map player names to their corresponding Player objects.

-Created a HashMap named gamePlayers to store player information.

-Implemented a method addPlayerToGame to insert a new player into the game with the specified name and symbol.

-Implemented a method getPlayerFromGame to retrieve a Player object based on the player's name.

-Utilized ArrayLists to represent winning positions in rows, columns, and diagonals.

-Initialized wininRows, wininColumns, and wininDiagonals as ArrayLists of ArrayLists to store winning positions.

-Implemented the initializeWinnerCheck method to set up winning positions using nested loops and ArrayLists.

-Created a class to represent the Tic-Tac-Toe game board.

-Implemented methods to initialize the game board and winning positions.

-Developed methods for displaying the game board, checking move validity, making a move, checking for a win, and checking for a draw.

-Developed the main game logic for Tic-Tac-Toe.

-Implemented a constructor to initialize the game with player names and symbols.

-Created the main game loop to control the flow of the game.

-Implemented methods to handle player moves, switch players, and ask for a game replay.

-Designed the main class to run the Tic-Tac-Toe game.

-Implemented the main method to initialize player names, create a TicTacToeGame instance, and start the game.

-Created a class to represent a player in the Tic-Tac-Toe game.

-Implemented a constructor to initialize a player with a given name and symbol.

-Implemented methods to retrieve the player's name and symbol.

-Developed a class to map player names to their corresponding symbols.

-Implemented a constructor to initialize the player mapping.

-Added methods to insert a new player into the game and retrieve a player object based on the name.

----------------------------------------------------------------------------------------

Gerald Gelats: Handled coding for GameLogic and GameInputHandler methods

Gerald Gelats Detailed Contributions:

-Added ability to input Player 1 and 2 names.

-Added replay button.

-Added Interface because it allows the creation of different games in the future that also implement the 'GameLogic' interface.

-Added Error Handling when input is wrong.

-Added detailed README file.

-Added simple and brief comments to code.

----------------------------------------------------------------------------------------

Udeme Ekpo Handled the result method

Udeme Ekpo Detailed Contributions:

-Implemented a constructor to initialize the result message.

-Created a method to display the game result.

-Established a class to represent the result of a Tic-Tac-Toe game. 

---------------------------------------------------------------------------------------


Tic-Tac-Toe Game

This repository contains a console-based Tic-Tac-Toe game implemented in Java.



Notes:
   Ensure you have Java installed on your device.
    
   This program is designed to run in a console or terminal environment.
    
   If you encounter any issues, please check your Java installation and ensure that the terminal supports user input.



How to Run the Program:

1. Clone the Repository

2. Navigate to the Project Directory

3. Run the main: TicTacToeEngine

4. Follow the On-Screen Instructions:
    
    Enter the name for Player 1 (Single name like first name. Ex: Billy).

    Enter the name for Player 2 (Single name like first name. Ex: Janie).
    
    The game will prompt each player to make moves in turns, starting with Player 1 as 'X' and so forth.

    When playing the game it will ask you to input "enter your move (row and column)". Please input information as asked for, in this case a numerical value and/or integer with a space in between, not together or with a comma seperating it. (Ex: 1 1) or (Ex: 3 2)

5. Game Result:

    The game will announce the winner if there is one.
    
    If the game ends in a draw, it will display a draw message.

6. Replay:

    After the game ends, you will be prompted to play again.
    
    Type "yes" to start a new game or "no" to exit and end the program.


Enjoy playing Tic-Tac-Toe!
