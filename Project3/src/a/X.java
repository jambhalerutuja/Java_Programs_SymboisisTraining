package a;

public class X {
	public String pb="Public";
	String df="Default";
	private String pr="Private";
	protected String pt="Protected";
	
	public static void main(String[] args) {
		X obj1=new X();
		System.out.println(obj1.pb);
		System.out.println(obj1.df);
		System.out.println(obj1.pr);
		System.out.println(obj1.pt);
		

	}

}
