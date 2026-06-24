public class backtrack {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        solvepath("", 0, 0, board);
    }

    static void solvepath(String s, int r, int c, boolean[][] board) {

        if (r == 2 && c == 2) {
            System.out.println(s);
            return;
        }

        board[r][c] = true;

        if (r > 0 && !board[r - 1][c]) {
            solvepath(s + "Up ", r - 1, c, board);
        }

        if (r < 2 && !board[r + 1][c]) {
            solvepath(s + "Down ", r + 1, c, board);
        }

        if (c < 2 && !board[r][c + 1]) {
            solvepath(s + "Right ", r, c + 1, board);
        }

        if (c > 0 && !board[r][c - 1]) {
            solvepath(s + "Left ", r, c - 1, board);
        }

        board[r][c] = false;
    }
}