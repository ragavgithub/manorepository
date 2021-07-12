package encap;

public class Tencap {
	public void add(int a,int b) {
		System.out.println("double");
	}
	public void add(int a,int b,int c) {
		System.out.println("triple"+(a+b+c));
	}
void add(String hal) {
	System.out.println(hal);
}
	public static void main(String[] args) {
		Tencap ob=new Tencap();
		ob.add("hai this is over loading");
		//System.out.println(ob.add(a+b));
	
	}

}
