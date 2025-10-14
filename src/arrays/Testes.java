package arrays;

public class Testes {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.add("Olé");
		vetor.add(3, "Elemento estranho");
		vetor.print();
	}

}
