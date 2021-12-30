package footballDemo;

public class footballTeam {
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public footballTeam(String name) {
	super();
	this.name = name;
}
@Override
 public String toString() {
	return name;
	
}
}
