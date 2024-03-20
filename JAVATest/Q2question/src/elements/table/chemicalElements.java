package elements.table;

import java.util.Iterator;
import java.util.TreeSet;


public class chemicalElements 
{
	public static void main(String[] args) 
	{
		TreeSet<chemicalElem> ce = new TreeSet<chemicalElem>();
		ce.add(new chemicalElem(1, "Hydrogen", "H", 1));
		ce.add(new chemicalElem(8, "Oxygengen", "O", 16));
		ce.add(new chemicalElem(10, "Neon", "Ne", 20));
		ce.add(new chemicalElem(2, "Helium", "He", 4));
		ce.add(new chemicalElem(11, "Sodium", "Na", 22));
		
		Iterator<chemicalElem> chitr = ce.iterator();
		while(chitr.hasNext())
		{
			chemicalElem ele = chitr.next();
			System.out.println(ele);
		}
	}

}



class chemicalElem implements Comparable<chemicalElem>
{
	int elementNumber;
	String elementName;
	String elementFormula;
	int atomicweight;
	
	public chemicalElem(int elementNumber, String elementName, String elementFormula, int atomicweight) {
		super();
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementFormula = elementFormula;
		this.atomicweight = atomicweight;
	}

	public int getElementNumber() {
		return elementNumber;
	}

	public void setElementNumber(int elementNumber) {
		this.elementNumber = elementNumber;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementFormula() {
		return elementFormula;
	}

	public void setElementFormula(String elementFormula) {
		this.elementFormula = elementFormula;
	}

	public int getAtomicweight() {
		return atomicweight;
	}

	public void setAtomicweight(int atomicweight) {
		this.atomicweight = atomicweight;
	}

	@Override
	public String toString() {
		return "chemicalElements [elementNumber=" + elementNumber + ", elementName=" + elementName + ", elementFormula="
				+ elementFormula + ", atomicweight=" + atomicweight + "]";
	}


	@Override
	public int compareTo(chemicalElem o) {
		
		return Integer.compare(elementNumber, o.elementNumber);
	}





	
	
	
}