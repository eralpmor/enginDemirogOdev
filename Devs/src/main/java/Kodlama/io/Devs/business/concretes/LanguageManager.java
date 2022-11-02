package Kodlama.io.Devs.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageDao;
import Kodlama.io.Devs.entities.concretes.Language;



@Service
public class LanguageManager implements LanguageService{
	private LanguageDao languageDao;
    
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public List<Language> getAll() {
		return null;
	}

	@Override
	public Language byId(int id) {
		return null;
	}

	@Override
	public void add(Language language) {
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public void update(Language language) {
		
	}

	@Override
	public Language getById(int id) {
		return null;
	}


	
}
