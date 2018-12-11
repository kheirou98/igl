import java.util.ArrayList;


public class Principale {

	public static void main(String[] args) {
		ArrayList<String> tableau=new ArrayList <String> (); // tableau dynamique qui va contenir les chaines 
		chaine chaines= new chaine(tableau); 
		tableau.add("kheirou");
		tableau.add("Med Anis");
		tableau.add("Khalid");
		tableau.add("Tahar");
		chaines.tabtochaine(tableau);

	}

}
