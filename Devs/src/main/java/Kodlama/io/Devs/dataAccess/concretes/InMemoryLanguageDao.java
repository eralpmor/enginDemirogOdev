package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageDao;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository
public  class InMemoryLanguageDao implements LanguageDao{
	
    List<Language> languages;
    
    @Autowired
	public InMemoryLanguageDao() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "C++"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
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
	public void update(Language language ) {
		
	}

 
}