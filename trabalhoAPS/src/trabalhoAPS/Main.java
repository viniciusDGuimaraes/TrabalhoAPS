package trabalhoAPS;

public class Main {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("1", "Vinicius Guimarães", "vinicius", "123321");
		Livro l1 = new Livro("421", "Um livro aí");
		Livro l2 = new Livro("741", "Um livro aí 2");
		Database db1 = new Database();
		Database db2 = new Database();
		db1.fazerReserva(l1, u1);
		db2.fazerReserva(l2, u1);
		db1.listarReservas();
	}
}
