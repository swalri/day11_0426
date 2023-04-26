package OP;

class puls {

    public static int plus(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static int plus(int a, int b, int c) {
        return a + b + c;
    }
    
    public static int plus(int a, int b) {
        return a + b;
    }
}

public class testEx06 {
	public static void main(String[] args) {
	
		puls ts = new puls();
		System.out.println(ts.plus(1,2));
		System.out.println(ts.plus(1,2,3));
		System.out.println(ts.plus(1,2,3, 4));
		
	}
}


