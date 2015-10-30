package MVC;

public class MAIN {
	public static void main(String args[]){
		View V = new View();
		Model M = new Model();
		new Controller(V, M);	
	}
}
