public class hw1 {
	public static void main(String[] args) {
		int i[] = new int[5];
		for(int k=0;k<args.length;k++) {
			i[k] = Integer.parseInt(args[k]);
			i[3] += i[k];
		}
		i[4] = i[3]/3;
		System.out.println("Total : " + i[3]);
		System.out.println("Sum : " + i[4]);
		if(i[4] > 90) {
			System.out.println("Your grade is A");
		}
		else if(i[4] > 80) {
			System.out.println("Your grade is B");
		}
		else if(i[4] > 70) {
			System.out.println("Your grade is C");
		}
		else if(i[4] > 60) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Your grade is F");
		}	 
	}
}
