import java.util.ArrayList;

public class chaine {
	private ArrayList<String> tableau;
	public chaine (ArrayList<String> tableau){
		this.tableau=tableau;
		
	}
	public ArrayList<String> getTableau() {
		return tableau;
	}
	public void setTableau(ArrayList<String> tableau) {
		this.tableau = tableau;
	}
	public void tabtochaine(ArrayList<String> tab){
		String chaine="";
		for(int i=0;i<tab.size();i++)
		{
			 chaine =chaine+tab.get(i)+"," ;
			
		}
		//System.out.println(chaine);
		System.out.printf("chaine: %s",(new StringBuilder(chaine)).deleteCharAt(chaine.length()-1).toString());

		
	}

}
