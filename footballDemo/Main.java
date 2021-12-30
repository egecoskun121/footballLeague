package footballDemo;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		footballTeam s=new footballTeam("Galatasaray");
		footballTeam b=new footballTeam("Fenerbahce");
		footballTeam x=new footballTeam("Trabzonspor");
		footballTeam y=new footballTeam("Besiktas");
		footballTeam q=new footballTeam("Basaksehir");
		
		ArrayList <footballTeam> teams=new ArrayList<>();
		if(teams.size()%2==1) {
			teams.add(new footballTeam("Bay"));
		}
		teams.add(q);
		teams.add(s);
		teams.add(b);
		teams.add(y);
		teams.add(x);
		
		 HashMap<footballTeam,footballTeam> teams2 = new HashMap<>();
		 
		 for(int i=0;i<teams.size();i++) {
			 for(int j=4;j>=0;j--) {
				 teams2.put(teams.get(i),teams.get(j));
				 
			 }
		 }
		 for(footballTeam tms:teams2.keySet()) {
			 System.out.println(tms + "vs"+teams2.get(tms));
		 }
		 
		
		
		

	}

}
