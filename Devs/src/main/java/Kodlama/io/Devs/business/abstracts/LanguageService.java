package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	public List<Language> getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language);
	Language getById(int id);
	Language byId(int id);

}