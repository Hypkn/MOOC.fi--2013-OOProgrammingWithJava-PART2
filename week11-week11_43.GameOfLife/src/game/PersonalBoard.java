/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Dev
 */
public class PersonalBoard extends GameOfLifeBoard {

    private Random rand = new Random();

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    public void turnToLiving(int x, int y) {
        if (checkRange(x, y)) {
            boolean[][] board = getBoard();
            board[x][y] = true;
        }

    }

    public void turnToDead(int x, int y) {
        if (checkRange(x, y)) {
            boolean[][] board = getBoard();
            board[x][y] = false;
        }

    }

    public boolean isAlive(int x, int y) {
        if (checkRange(x, y)) {
            boolean[][] board = getBoard();
            return board[x][y];
        } else {
            return false;
        }
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        boolean board[][] = getBoard();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (rand.nextDouble() < probabilityForEachCell) {
                    board[i][j] = true;
                }
            }
        }
    }

   
    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int howMany = 0;
        boolean[][] board = getBoard();
        // check north west, north, north east
        if ((x - 1) >= 0) { // make sure you don't access to outside board
            if ((y - 1) >= 0) { // make sure you don't access to outside board
                if ((board[x - 1][y - 1]) == true) // check north west
                {
                    howMany++; //
                }
            }
            if ((board[x - 1][y]) == true) // check north
            {
                howMany++; //
            }
            if ((y + 1) <= (getHeight() - 1)) { // make sure you don't access to outside board
                if ((board[x - 1][y + 1]) == true) // check north east
                {
                    howMany++; // 
                }
            }
        }
        // check south west, south, south east 
        if ((x + 1) <= (getWidth() - 1)) { // make sure you don't access to outside board
            if ((y - 1) >= 0) { // make sure you don't access to outside board
                if (board[x + 1][y - 1] == true) // check south west
                {
                    howMany++;
                }
            }
            if (board[x + 1][y] == true) // check south
            {
                howMany++;
            }
            if ((y + 1) <= (getHeight() - 1)) { // make sure you don't access to outside board
                if (board[x + 1][y + 1] == true) // check north east
                {
                    howMany++; // 
                }
            }
        }
        // check due west, due east 
        if ((y - 1) >= 0) { // make sure you don't access to outside board
            if (board[x][y - 1] == true) // check due west
            {
                howMany++; //
            }
        }
        if ((y + 1) <= (getHeight() - 1)) { // make sure you don't access to outside board
            if (board[x][y + 1] == true) // check due east
            {
                howMany++;
            }
        }
        return howMany;
    }


    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if(livingNeighbours < 2){
            turnToDead(x, y);
        } else if( (livingNeighbours  == 3  || livingNeighbours == 2) && isAlive(x,y) )
        {
            
        }else if(livingNeighbours > 3){
            turnToDead(x, y);
        }else if(livingNeighbours == 3){
            turnToLiving(x, y);
        }
    }

    private boolean checkRange(int x, int y) {
        return (x >= 0 && x < getWidth() && y >= 0 && y < getHeight());
    }
}
