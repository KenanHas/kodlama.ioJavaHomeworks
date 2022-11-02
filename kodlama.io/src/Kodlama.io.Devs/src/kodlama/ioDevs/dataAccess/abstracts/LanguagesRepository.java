package kodlama.ioDevs.dataAccess.abstracts;

import java.util.List;

import kodlama.ioDevs.entities.concretes.Languages;

public interface LanguagesRepository {
	List<Languages> getAll();

}
