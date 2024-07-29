package day12;

import java.util.*;



public class test1
{
    public boolean issafe(int row , int col , char[][] board)
    {
        // horizontol
        for(int j = 0 ; j < board.length ; j++ )
        {
            if(board[row][j] == 'Q')
            {
                return false;
            }
        }
        // vertical
        for(int i = 0 ; i < board.length ; i++)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        // upperleft
        int r = row;
        for(int c = col ; c >= 0&&r>=0 ;r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // upperright
        r = row;
        for(int c = col ; c < board.length&&r >=0 ;r--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // lowerleft
        for(int c = col ; c >= 0&&r<board.length;r++,c--)
        {
            if(board[r][c] == 'Q')
            {
                return false;
            }
        }

        // lowerright
        r = row;
        for(int c = col ; c < board.length && r < board.length;c++,r++)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        return true;

    }
    public void saveboard(char [][] board,List<List<String>>allboard)
    {
        String row = "";
        List<String>newboard = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++ )
        {
            row="";
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(board[i][j] == 'Q')
                {
                    row += 'Q';
                }
                else{
                    row +='.';
                }
               
            }
            newboard.add(row);
        }
        allboard.add(newboard);
    }

    public void helper(char[][] board,List<List<String>>allboards,int col)
    {
        if (col == board.length) 
        {
            saveboard(board,allboards);
            return;
        }
        for(int row = 0 ; row < board.length;row++)
        {
            if(issafe(row,col,board))
            {
                board[row][col]='Q';
                helper(board, allboards, col+1);
                board[row][col]='.';
            }
        }
    }


    public List<List<String>>solvequeen(int n)
    {
        List<List<String>>allboard = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                board[i][j] = '.';
            }
        }
        helper(board,allboard,0);
        return allboard;
    }
    {

    }
    public static void main(String[]args)
    {
        test1 solution = new test1();
        int n = 4;
        List<List<String>> result = solution.solvequeen(n);

        for(List<String>board:result)
        {
            for(String row : board)
            {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}