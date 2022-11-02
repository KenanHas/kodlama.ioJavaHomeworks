package kodlama.ioDevs.concretes;

import java.util.List;

import kodlama.ioDevs.business.abstracts.LanguagesService;
import kodlama.ioDevs.dataAccess.abstracts.LanguagesRepository;
import kodlama.ioDevs.entities.concretes.Languages;


public class LanguagesManager implements LanguagesService {

	private LanguagesRepository languagesRepository;
	
	
	public LanguagesManager(LanguagesRepository languagesRepository) {
	
		this.languagesRepository = languagesRepository;
	}
	@Override
	public List<Languages> getAll() {
		return languagesRepository.getAll();
	}

}
