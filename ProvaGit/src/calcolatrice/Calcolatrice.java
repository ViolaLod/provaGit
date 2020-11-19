package calcolatrice;

public class Calcolatrice {
	int primoNum;
	int secondoNum;
	
	public int getPrimoNum() {
		return primoNum;
	}
	public void setPrimoNum(int primoNum) {
		this.primoNum = primoNum;
	}
	public int getSecondoNum() {
		return secondoNum;
	}
	public void setSecondoNum(int secondoNum) {
		this.secondoNum = secondoNum;
	}
	
	public int addizione (int a, int b) {
		return a+b;
	}
	
	public int sottrazione (int a, int b) {
		return a-b;
	}
	
	public int moltiplicazione (int a, int b) {
		return a*b;
	}
	
	public int divisione (int a, int b) {
		return a/b;
	}

}
