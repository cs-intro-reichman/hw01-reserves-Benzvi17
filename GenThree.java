class GenThree {
	public static void main(String args[]) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

			// Delta = (Max - Min) + 1

        int a = (int) (Math.random()* (max - min)) + min;
        int b = (int) (Math.random()* (max - min)) + min;
        int c = (int) (Math.random()* (max - min)) + min;

			// In order to find the smallest figure out of the three, i first compared (a,b) and then (min{a,b},c)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("The minimal generated number was " + Math.min(Math.min(a, b), c));

    }
}


    
        
    