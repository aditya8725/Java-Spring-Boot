package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class A7PracticeArrayList
{
	public static void main(String[] args) 
	{
		TreeSet<chemicalelements> ce = new TreeSet<>();
		ce.add(new chemicalelements(1, "Hydrogen", 1));
		ce.add(new chemicalelements(8, "Oxygen", 16));
		ce.add(new chemicalelements(3, "Lithium", 4));
		
		Iterator<chemicalelements> chi = ce.iterator();
		while(chi.hasNext())
		{
			chemicalelements c = chi.next();
			System.out.println(c);
		}
		
	}
}

class chemicalelements implements Comparable<chemicalelements>
{
	int atomicno;
	String atomicname;
	int atmoicwt;
	
	
	
	public chemicalelements(int atomicno, String atomicname, int atmoicwt) {
		super();
		this.atomicno = atomicno;
		this.atomicname = atomicname;
		this.atmoicwt = atmoicwt;
	}


	public int getAtomicno() {
		return atomicno;
	}


	public void setAtomicno(int atomicno) {
		this.atomicno = atomicno;
	}


	public String getAtomicname() {
		return atomicname;
	}


	public void setAtomicname(String atomicname) {
		this.atomicname = atomicname;
	}


	public int getAtmoicwt() {
		return atmoicwt;
	}


	public void setAtmoicwt(int atmoicwt) {
		this.atmoicwt = atmoicwt;
	}


	
	@Override
	public String toString() {
		return "chemicalelements [atomicno=" + atomicno + ", atomicname=" + atomicname + ", atmoicwt=" + atmoicwt + "]";
	}


	public int compareTo(chemicalelements o) {
		System.out.println("Comparing: "+atomicno+"with"+ o.atomicno);
		return Integer.compare(atomicno, o.atomicno);
	}
	
}
