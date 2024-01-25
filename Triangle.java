class Triangle {
	public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean x = (a+b>c);
        boolean y = (b+c>a);
        boolean z = (a+c>b);
        boolean Tri = x && y && z ;
        System.out.println( a + ", " + b +", " + c +": " + x);
    }
    }