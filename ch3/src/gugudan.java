public class gugudan {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i = 2; i < 10 ; i++) {
			for(j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
