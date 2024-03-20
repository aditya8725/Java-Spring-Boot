import java.util.Iterator;
import java.util.TreeSet;

import elements.table.*;

public class chemicalElementTest {
	public static void main(String[] args) {
		System.out.println(
				"--------------------------------TreeSet Created ------------------------------------------\n");
		TreeSet<chemicalElem> ce = new TreeSet<chemicalElem>();

		// Adding elements into the tree set

		ce.add(new chemicalElem(1, "Hydrogen", "H", 1));
		ce.add(new chemicalElem(8, "Oxygen", "O", 16));
		ce.add(new chemicalElem(10, "Neon", "Ne", 20));
		ce.add(new chemicalElem(2, "Helium", "He", 4));
		ce.add(new chemicalElem(11, "Sodium", "Na", 22));

		// Iterating to print all the output

		Iterator<chemicalElem> chitr = ce.iterator();
		System.out.println("\n----------------Chemical Elements------------\n");
		while (chitr.hasNext()) {
			chemicalElem ele = chitr.next();
			System.out.println(ele);
		}
	}

}