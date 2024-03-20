package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class A5PracticeTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<chemicalElement> ce = new TreeSet<>();
		
		ce.add(new chemicalElement(1,"Hydrogen", "H", 1));
		ce.add(new chemicalElement(8, "Oxygen", "O", 16));
		ce.add(new chemicalElement(3, "Lithium", "Li", 6));
		
		Iterator<chemicalElement> chi = ce.iterator();
		
		while(chi.hasNext())
		{
			chemicalElement c = chi.next();
			System.out.println("Elements: "+c);
		}
	}
}

class chemicalElement implements Comparable<chemicalElement>
{
	int atomic_number;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	public chemicalElement(int atomic_number, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomic_number = atomic_number;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "chemicalElement [atomic_number=" + atomic_number + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	public int compareTo(chemicalElement otherelement)
	{
		System.out.println("Comparing..."+atomic_number+" with "+otherelement.atomic_number);
		
		return Integer.compare(atomic_number, otherelement.atomic_number);
		
	}
	
}