package elements.table;


public class chemicalElem implements Comparable<chemicalElem>
{
	//initalize the data
	int elementNumber;
	String elementName;
	String elementFormula;
	int atomicweight;
	
	
	//chemicalelements constructor
	public chemicalElem(int elementNumber, String elementName, String elementFormula, int atomicweight) {
		super();
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementFormula = elementFormula;
		this.atomicweight = atomicweight;
	}

	
	//Getter and setter
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
		
		System.out.println("Comparing "+elementName+" "+elementNumber+ " with "+o.elementName+" "+o.elementNumber);
		return Integer.compare(elementNumber, o.elementNumber);
	}
	
	
}