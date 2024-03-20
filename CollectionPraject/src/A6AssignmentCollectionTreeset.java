import java.util.*;

public class A6AssignmentCollectionTreeset 
{
	public static void main(String[] args) 
	{
		TreeSet<ChemicalElements> Pt = new TreeSet<>();
		System.out.println("Periodic Table....");
		
		Pt.add(new ChemicalElements("Hydrogen","H",1,1));
		Pt.add(new ChemicalElements("Carbon","C",6,12));
		Pt.add(new ChemicalElements("Nitrogen","N",7,14));
		Pt.add(new ChemicalElements("Helium","He",2,4));
		Pt.add(new ChemicalElements("Lithium","Li",3,6));
		Pt.add(new ChemicalElements("Flourine","F",9,18));
		Pt.add(new ChemicalElements("Neon","Ne",10,20));
		Pt.add(new ChemicalElements("Berylium","Be",4,9));
		Pt.add(new ChemicalElements("Boron","B",5,10));
		Pt.add(new ChemicalElements("Oxygen","O",8,16));
		
		
		System.out.println("Content is added into periodic table");
		
		Iterator<ChemicalElements> elementIter = Pt.iterator();
		while(elementIter.hasNext())
		{
			ChemicalElements e = elementIter.next();
			System.out.println("Chemical Elements: "+e);
		}
	}
}

class ChemicalElements implements Comparable<ChemicalElements>
{
	String name;
	String symbol;
	int atomicNumber;
	int atomicwt;

	
	public ChemicalElements(String name, String symbol, int atomicNumber, int atomicwt) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
		this.atomicwt = atomicwt;
	}

	

	@Override
	public String toString() {
		return "ChemicalElements [name=" + name + ", symbol=" + symbol + ", atomicNumber=" + atomicNumber
				+ ", atomicwt=" + atomicwt + "]";
	}



	@Override
	public int compareTo(ChemicalElements o) {
		// TODO Auto-generated method stub
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
}