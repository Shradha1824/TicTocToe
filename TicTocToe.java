public class TicTocToe {

        public static void main(String[] args) {

                char[][] board = {{' ', ' ', ' '},
                                  {' ', ' ', ' '},
                                  {' ', ' ', ' '}};

                System.out.println(board[0][0] + "|" + board[0][1] + "|" + boar>
                System.out.println("-+-+-");
                System.out.println(board[1][0] + "|" + board[1][1] + "|" + boar>
                System.out.println("-+-+-");
                System.out.println(board[2][0] + "|" + board[2][1] + "|" + boar>

                Random random = new Random();
                 int dice = 0;
                 while (true)
                 {
                   dice = random.nextInt((2)+1);
                if(dice != 0) break;
                 }
                     System.out.println("Number of dice: " + dice);
                 if(dice == 1){ 
                      System.out.println("User Start first ");
                 }
                 else {
                   System.out.println("Computer Start first");
                 }
		                
                Scanner scanner = new Scanner(System.in);

                System.out.println("Where would you like to play? (1-9) ");

                String userInput = scanner.nextLine();

                System.out.println(userInput);

                switch(userInput) {
                case "1":
                        board[0][0] = 'X';
                        break;
                case "2":
                        board[0][1] = 'X';
                        break;
                case "3":
                        board[0][2] = 'X';
                        break;
                case "4":
                        board[1][0] = 'X';
                        break;
                case "5":
                        board[1][1] = 'X';
                        break;
                case "6":
                        board[1][2] = 'X';
                        break;
                case "7":
                         board[2][0] = 'X';
                        break;
                case "8":
                        board[2][1] = 'X';
                        break;
                case "9":
                        board[2][2] = 'X';
                        break;
                default:
                        System.out.println(":(*)");
                }

                showBoard(board);
                }
        private static void showBoard(char[][] board) {
                System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
                System.out.println("-+-+-");
                System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
                System.out.println("-+-+-");
                System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
                
         private static boolean isSpaceAvailable(char[][] board, int position) {

                        switch(position) {
                        case 1:
                                if (board[0][0] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 2:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 3:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 4 :
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 5:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                         case 6:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 7:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 8:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        case 9:
                                if (board[0][1] == ' ') {
                                        return true;
                                }
                                else {
                                        return false;
                                }
                        default:
                                return false;
                        }
                }
        }

