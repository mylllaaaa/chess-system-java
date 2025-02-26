package board.game;

public class Piece {

	protected Position position; //posição de matriz - não será vizível na camada Chess
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //apenas classes dentro do mesmo pacote e subclasses podem acessar o tabuleiro de uma peça 
		return board;
	}
		
}
