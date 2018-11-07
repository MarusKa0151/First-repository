public class Prvocislo {
	public static void main(String[] args) {
		//urcuje, ktere cislo je prvocislo
		double a = Double.parseDouble(args[0]);
		for (int i = 2; i < a; i++) {
			double zbytek = a % i;
				if (-0.000001 < zbytek && 0.000001 > zbytek) {
					System.out.print("Cislo je slozene.");
					break;
				}
				else {
					if (a == i + 1) {
						System.out.print("Cislo je prvocislo.");
					}
				}
		}
	}
}
					