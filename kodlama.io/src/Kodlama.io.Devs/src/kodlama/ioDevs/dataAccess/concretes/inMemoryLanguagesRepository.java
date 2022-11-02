package kodlama.ioDevs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioDevs.dataAccess.abstracts.LanguagesRepository;
import kodlama.ioDevs.entities.concretes.Languages;


public class inMemoryLanguagesRepository extends Languages implements LanguagesRepository {

	List <Languages> languages;
	
	public inMemoryLanguagesRepository() throws Exception {
	 languages = new ArrayList<Languages>();
	 languages.add(new Languages(1,"Python"));
	 languages.add(new Languages(2,"C#"));
	 languages.add(new Languages(3,"Java"));
	 for(int i=1;i<=id;i++) {
		 for(int j=i+1; j==id;j++) {
			 if (languages.get(i)==languages.get(j))
			 {
				 throw new Exception("This ids not equal.");
			 }
		 }
	 }
	}
	public void set(int id, String name)
	{   
		this.id=id;
		this.name = name;
		languages.add(new Languages(id,name));
	}
	public void delete(int id)
	{
		this.id=id;
		this.name = name;
		languages.remove(id);
	}
	
	@Override
	public List<Languages> getAll(){
		return languages;
	}


}
