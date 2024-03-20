package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class A5PracticeTreeSet2 
{
	public static void main(String[] args) 
	{
		TreeSet<ChemicalElement1> chel = new TreeSet<>();
		chel.add(new ChemicalElement1(1, "Hydrogen", "H", 1));
		chel.add(new ChemicalElement1(8, "Oxygen", "O", 16));
		chel.add(new ChemicalElement1(2, "Helium", "He", 8));
		
		Iterator<ChemicalElement1> chi = chel.iterator();
		while(chi.hasNext())
		{
			ChemicalElement1 c = chi.next();
			System.out.println(c);
		}
	}
}



class ChemicalElement1 implements Comparable<ChemicalElement1>
{
	int atmno;
	String atmName;
	String atmFormula;
	int atmWt;
	
	public ChemicalElement1(int atmno, String atmName, String atmFormula, int atmWt) {
		super();
		this.atmno = atmno;
		this.atmName = atmName;
		this.atmFormula = atmFormula;
		this.atmWt = atmWt;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atmno=" + atmno + ", atmName=" + atmName + ", atmFormula=" + atmFormula + ", atmWt="
				+ atmWt + "]";
	}
	
	public int compareTo(ChemicalElement1 otherElement)
	{
		System.out.println("Comparing: "+atmno+ " with "+ otherElement.atmno);
		return Integer.compare(atmno, otherElement.atmno);
	}
}