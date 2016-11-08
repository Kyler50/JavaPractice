package tasks;

import java.util.Scanner;

public class Gomoku {
	static final int EMPTY = 0;
	static final int WHITE = 1;
	static final int BLACK = 2;
	static int player;
	static int[][] area = new int[6][6];
	
	
	public static void place(int row, int column, int player){
		area[row][column] = 0;
		if (player == WHITE){
			area[row][column] = WHITE;
		}
		else if(player == BLACK){
			area[row][column] = BLACK;
		}
		else{
			area[row][column] = EMPTY;
		}
	}
	
	
	public static boolean hasVerticalWin(int player){
		int count = 0;
		boolean isWinner = false;
		for (int row = 0; row < area.length; row++) {
			for (int column = 0; column < area[row].length; column++) {
				if(area[row][column] == player && count < 5){
					count++;
				}
				else if(count == 5){
					isWinner = true;
					break;
				}
				else{
					isWinner = false;
					count = 0;
				}
			}
			if(isWinner){
			break;
			}
		}
		return isWinner;
	}
	
	
	public static boolean hasHorizontalWin(int player){
		int count = 0;
		boolean isWinner = false;
		for (int row = 0; row < area.length; row++) {
			for (int column = 0; column < area[row].length; column++) {
				if(area[row][column] == player && count < 5){
					count++;
				}
				else if(count == 5){
					isWinner = true;
					break;
				}
				else{
					isWinner = false;
					count = 0;
				}
			}
			if(isWinner){
				break;
			}
		}
		return isWinner;
	}
	
	
	public static boolean hasWin(int player){
		boolean isWinner = false;
		if(hasHorizontalWin(player) == true || hasVerticalWin(player) == true){
			System.out.println("Congratulation, you win!");
			isWinner = true;
		}
		isWinner = false;
		return isWinner;
	}
	
	
	public void play(){
		Scanner sc = new Scanner(System.in);
		int turn = 0;
		do {
			turn++;
			if (turn % 2 != 0) {
				player = WHITE;
				System.out.println("White turn!");
			}
			else {
				player = BLACK;
				System.out.println("Black turn!");
			}
			System.out.print("Row: ");
			int row = sc.nextInt();
			System.out.print("Column: ");
			int column = sc.nextInt();
			place(row, column, player);
			
		} while (hasWin(player) == false);
	}
	
	
	public String toS(){
		String result = "";
		for (int row = 0; row < area.length; row++) {
			result += "\n";
			for (int column = 0; column < area[row].length; column++) {
				if (area[row][column] == WHITE) {
					result += "o";
				}
				else if (area[row][column] == BLACK){
				result += "x";
				}
				else{
					result += "*";
				}
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Gomoku game = new Gomoku();
		game.play();
		System.out.print(game.toS());
	}
}
