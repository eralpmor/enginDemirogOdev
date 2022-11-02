package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageDao {
	
	List<Language> getAll();
	Language byId(int id);
	public void add(Language language);
	public void delete(int id);
	public void update(Language language);
		
}

