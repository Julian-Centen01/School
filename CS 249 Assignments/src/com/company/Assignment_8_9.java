
import java.util.Scanner;
public class Assignment_8_9 {
    public static void main(String[] args)
    {
        char[][] ttt = new char [3][3];
        int x,y;
        boolean win = false;
        boolean draw = false;
        Scanner scan = new Scanner(System.in);
        for(y = 0 ; y < 3; y++)
        {
            for(x = 0; x < 3; x++)
            ttt[x][y] = ' ';
        }

        System.out.println("-------");
        System.out.format("|%c|%c|%c|\n",ttt[0][0], ttt[1][0],ttt[2][0] );
        System.out.println("-------");
        System.out.format("|%c|%c|%c|\n",ttt[0][1], ttt[1][1],ttt[2][1] );
        System.out.println("-------");
        System.out.format("|%c|%c|%c|\n",ttt[0][2], ttt[1][2],ttt[2][2] );
        System.out.println("-------");

        while (!win && !draw)
        {
            if (!win && !draw) {
                System.out.print("Enter a row (0,1, or 2 for player X: ");
                x = scan.nextInt();
                System.out.print("Enter a column (0,1,or 2) for player X: ");
                y = scan.nextInt();

                ttt[x][y] = 'X';
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][0], ttt[1][0], ttt[2][0]);
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][1], ttt[1][1], ttt[2][1]);
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][2], ttt[1][2], ttt[2][2]);
                System.out.println("-------");

                if
                (
                        (ttt[0][0] == 'X' && ttt[0][1] == 'X' && ttt[0][2] == 'X') ||
                                (ttt[1][0] == 'X' && ttt[1][1] == 'X' && ttt[1][2] == 'X')||
                                (ttt[2][0] == 'X' && ttt[2][1] == 'X' && ttt[2][2] == 'X')||
                                (ttt[0][0] == 'X' && ttt[1][0] == 'X' && ttt[2][0] == 'X')||
                                (ttt[0][1] == 'X' && ttt[1][1] == 'X' && ttt[2][1] == 'X')||
                                (ttt[0][2] == 'X' && ttt[1][2] == 'X' && ttt[2][2] == 'X')||
                                (ttt[0][0] == 'X' && ttt[1][1] == 'X' && ttt[2][2] == 'X')||
                                (ttt[2][0] == 'X' && ttt[1][1] == 'X' && ttt[0][2] == 'X')
                ) {
                    win = true;
                    System.out.println("Player X wins!");
                }
            }
            draw = true;
            for(y = 0 ; y < 3; y++)
            {
                for(x = 0; x < 3; x++)
                {
                    if (ttt[x][y] == ' ')
                        draw = false;
                }
            }

            if (!win && !draw) {
                System.out.print("Enter a row (0,1, or 2 for player O: ");
                x = scan.nextInt();
                System.out.print("Enter a column (0,1,or 2) for player O: ");
                y = scan.nextInt();

                ttt[x][y] = 'O';
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][0], ttt[1][0], ttt[2][0]);
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][1], ttt[1][1], ttt[2][1]);
                System.out.println("-------");
                System.out.format("|%c|%c|%c|\n", ttt[0][2], ttt[1][2], ttt[2][2]);
                System.out.println("-------");

                if
                (
                        (ttt[0][0] == 'O' && ttt[0][1] == 'O' && ttt[0][2] == 'O') ||
                                (ttt[1][0] == 'O' && ttt[1][1] == 'O' && ttt[1][2] == 'O')||
                                (ttt[2][0] == 'O' && ttt[2][1] == 'O' && ttt[2][2] == 'O')||
                                (ttt[0][0] == 'O' && ttt[1][0] == 'O' && ttt[2][0] == 'O')||
                                (ttt[0][1] == 'O' && ttt[1][1] == 'O' && ttt[2][1] == 'O')||
                                (ttt[0][2] == 'O' && ttt[1][2] == 'O' && ttt[2][2] == 'O')||
                                (ttt[0][0] == 'O' && ttt[1][1] == 'O' && ttt[2][2] == 'O')||
                                (ttt[2][0] == 'O' && ttt[1][1] == 'O' && ttt[0][2] == 'O')
                ) {
                    win = true;
                    System.out.println("Player O wins!");
                }
            }
            draw = true;
            for(y = 0 ; y < 3; y++)
            {
                for(x = 0; x < 3; x++)
                {
                    if (ttt[x][y] == ' ')
                        draw = false;
                }
            }
        }
        if (draw)
            System.out.println("Draw");

    }
}
