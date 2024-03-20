package DAO;

import java.util.List;

import Entity.Library;

public interface LibraryDao 
{
	//poji
	//CRUD
	void createLibrary(Library libobj);
	void updateLibrary(Library libobj);
	void deleteLibrary(int bookno);
	Library readLibrary(int bookno);
	List<Library> readLibrarys();	

}
