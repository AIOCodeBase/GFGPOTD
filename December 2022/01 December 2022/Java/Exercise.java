//HI

package pilotezebs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Question 1
		Scanner lireScanner=new Scanner(System.in);
		System.out.println("Entrer une phrase de votre choix: ");
		String phraseString=lireScanner.nextLine();
		System.out.println("votre phrase est:"+phraseString);
		System.out.println("le decoupage de votre phrase donne: ");
		List listeElementArrayList=List.of(phraseString.split(" "));//Vous pouvez egalement utiliser StringTokenizer
		for(Object elt: listeElementArrayList) {
			System.out.println(elt);
		}
		
// 		Question 2	
		Map<Integer, String>stringInt=new HashMap<>();
		stringInt.put(7, "paris");
		stringInt.put(5, "rome");
		stringInt.put(1, "manchester");
		stringInt.put(3, "barcelone");
		System.out.println("paris, rome, manchester, barcelone");
		System.out.println("Entrer une phrase de votre choix contenant les pays ci-dessus: ");
		String phrase=lireScanner.nextLine();
		ArrayList liste=new ArrayList<>(Arrays.asList(phrase.split(" ")));
		for(Entry<Integer, String>entry:stringInt.entrySet()) {
			for(int i=0;i<liste.size();i++) {
				if(entry.getValue().equals(liste.get(i))) {
					System.out.println("YOOOO"+entry.getKey());
					liste.set(i, entry.getKey());	
				}
			}
		}
		System.out.println("Nous avons fixé et remplacer les chaines par leur key:");
		for(Object elt: liste) {
			System.out.print(elt+" ");
		}
		
		
		
	}

}
