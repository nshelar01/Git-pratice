
public class encapsulation {
private int a;
private int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println();
encapsulation ep =new encapsulation();
ep.setA(30);
ep.setB(45);
System.out.println(ep.getA());
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
