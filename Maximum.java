public class Maximum {
    public static void main(String[] args) {
        //čte to znaky z klávesnice, které (někdo) zadává
		java.util.Scanner sc = new java.util.Scanner(System.in);
		if (!sc.hasNextInt()) { //nepravda
			System.out.print("Nic neni na vstupu.");
		}
		else {
			int max = sc.nextInt();
			while (sc.hasNextInt()) { 
				int a = sc.nextInt();
				if (a > max) {
					max = a;
				}
			}
			System.out.printf("%d", max);
			
		}
	}
}
       
