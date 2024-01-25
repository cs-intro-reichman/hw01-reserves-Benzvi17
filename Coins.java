class Coins {
	public static void main(String args[]) {
         int x = Integer.parseInt(args[0]);
         int quarter = 25;
         int mod = x%quarter;
         int div = x/quarter;
        System.out.println("Use " + div + " quarters " + "and " + mod + " cents ");
    }

    }