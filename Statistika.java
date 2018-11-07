import java.util.ArrayList;
import java.util.List;

public class Statistika {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); //reading from keyboard
		
		if (!sc.hasNextDouble()) { //if not true
			System.out.print("Nic neni na vstupu.");
		}
		
		else {
			//defining
			double maximum = sc.nextDouble(); 
			double minimum = maximum;
			double soucet = maximum;
			double aritmetickyPrumer = maximum;
			List<Double> cisla = new ArrayList<Double>();
			cisla.add(maximum);
			
			
			//max, min, sum, arithmetic
			while (sc.hasNextDouble()) { 
				double a = sc.nextDouble();
				cisla.add(a);
				
				if (a > maximum) { //finding maximum
					maximum = a;
				}
				
				else if (a < minimum) { //finding minimum
					minimum = a;
				}
				
				soucet += a; //calculating sum
				aritmetickyPrumer = soucet / cisla.size(); //calculating arithmetic mean
			}
			
			
			//standard deviation
			double soucetMocnin = 0;
			
			for (double cislo : cisla) {
				double rozdil = cislo - aritmetickyPrumer;
				double mocnina = rozdil * rozdil;
				soucetMocnin += mocnina;
			}
			
			double rozptyl = soucetMocnin / cisla.size();
			double smerodatnaOdchylka = Math.sqrt(rozptyl);			
			
			
			//printing results
			System.out.printf("Maximum ze zadanych cisel je %f \n", maximum);
			System.out.printf("Minimum ze zadanych cisel je %f \n", minimum);
			System.out.printf("Soucet zadanych cisel je %f \n", soucet);
			System.out.printf("Aritmeticky prumer zadanych cisel je %f \n", aritmetickyPrumer);
			System.out.printf("Smerodatna odchylka zadanych cisel je %f \n", smerodatnaOdchylka);
		}	
	}
}
	