/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service.impl;

import com.sharobitech.resumeapp.dao.catalog.CategoryDao;
import com.sharobitech.resumeapp.dao.catalog.CityDao;
import com.sharobitech.resumeapp.dao.catalog.ContinentDao;
import com.sharobitech.resumeapp.dao.catalog.CountryDao;
import com.sharobitech.resumeapp.dao.catalog.CurrencyDao;
import com.sharobitech.resumeapp.dao.catalog.JobPreferenceDao;
import com.sharobitech.resumeapp.dao.catalog.JobRoleDao;
import com.sharobitech.resumeapp.dao.catalog.LanguageDao;
import com.sharobitech.resumeapp.dao.catalog.LanguageFluencyDao;
import com.sharobitech.resumeapp.dao.catalog.TitleDao;
import com.sharobitech.resumeapp.dao.catalog.WorkExperienceDao;
import com.sharobitech.resumeapp.dao.catalog.WorkSectorDao;
import com.sharobitech.resumeapp.model.catalog.Category;
import com.sharobitech.resumeapp.model.catalog.City;
import com.sharobitech.resumeapp.model.catalog.Continent;
import com.sharobitech.resumeapp.model.catalog.Country;
import com.sharobitech.resumeapp.model.catalog.Currency;
import com.sharobitech.resumeapp.model.catalog.JobPreference;
import com.sharobitech.resumeapp.model.catalog.JobRole;
import com.sharobitech.resumeapp.model.catalog.Language;
import com.sharobitech.resumeapp.model.catalog.LanguageFluency;
import com.sharobitech.resumeapp.model.catalog.Title;
import com.sharobitech.resumeapp.model.catalog.WorkExperience;
import com.sharobitech.resumeapp.model.catalog.WorkSector;
import com.sharobitech.resumeapp.service.CatalogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ifnu
 */
@Service("catalogService")
@Transactional(readOnly=true)
public class CatalogServiceImpl implements CatalogService{

    @Autowired private CategoryDao categoryDao;
    @Autowired private CityDao cityDao;
    @Autowired private ContinentDao continentDao;
    @Autowired private CountryDao countryDao;
    @Autowired private CurrencyDao currencyDao;
    @Autowired private JobPreferenceDao jobPreferenceDao;
    @Autowired private JobRoleDao jobRoleDao;
    @Autowired private LanguageFluencyDao languageFluencyDao;
    @Autowired private LanguageDao languageDao;
    @Autowired private TitleDao titleDao;
    @Autowired private WorkExperienceDao workExperienceDao;
    @Autowired private WorkSectorDao workSectorDao;

    @Transactional
    public void save(Category category) {
        categoryDao.save(category);
    }
    
    @Transactional
    public void delete(Category category) {
        categoryDao.delete(category);
    }

    @Transactional(readOnly=true)
    public Category getCategory(Long id) {
        return categoryDao.findById(id);
    }

    @Transactional(readOnly=true)
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<Category> getCategories(int start, int num) {
        return categoryDao.findAll(start, num);
    }

    @Transactional
    public void save(City city) {
        cityDao.save(city);
    }

    @Transactional
    public void delete(City city) {
        cityDao.delete(city);
    }

    @Transactional(readOnly=true)
    public City getCity(Long id) {
        return cityDao.findById(id);
    }

    @Transactional(readOnly=true)
    public List<City> getCities() {
        return cityDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<City> getCities(int start, int num) {
        return cityDao.findAll(start, num);
    }

    @Transactional
    public void save(Country country) {
        countryDao.save(country);
    }

    @Transactional
    public void delete(Country country) {
        countryDao.delete(country);
    }

    @Transactional(readOnly=true)
    public Country getCountry(Long id) {
        return countryDao.findById(id);
    }

    public Country getCountry(String text) {
        return countryDao.findByName(text);
    }

    @Transactional(readOnly=true)
    public List<Country> getCountries() {
        return countryDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<Country> getCountries(int start, int num) {
        return countryDao.findAll(start, num);
    }

    @Transactional
    public void save(Continent continent) {
        continentDao.save(continent);
    }

    @Transactional
    public void delete(Continent continent) {
        continentDao.delete(continent);
    }

    @Transactional(readOnly=true)
    public Continent getContinent(Long id) {
        return continentDao.findById(id);
    }

    @Transactional(readOnly=true)
    public List<Continent> getContinents() {
        return continentDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<Continent> getContinents(int start, int num) {
        return continentDao.findAll(start, num);
    }

    @Transactional
    public void save(Title title) {
        titleDao.save(title);
    }

    @Transactional
    public void delete(Title title) {
        titleDao.delete(title);
    }

    @Transactional(readOnly=true)
    public Title getTitle(Long id) {
        return titleDao.findById(id);
    }

    @Transactional(readOnly=true)
    public List<Title> getTitles() {
        return titleDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<Title> getTitles(int start, int num) {
        return titleDao.findAll(start, num);
    }
    
    @Transactional
    public void save(WorkExperience workExperience) {
        workExperienceDao.save(workExperience);
    }

    @Transactional
    public void delete(WorkExperience workExperience) {
        workExperienceDao.delete(workExperience);
    }

    @Transactional(readOnly=true)
    public WorkExperience getWorkExperience(Long id) {
        return workExperienceDao.findById(id);
    }

    @Transactional(readOnly=true)
    public WorkExperience getWorkExperience(String name) {
        return workExperienceDao.findByName(name);
    }

    @Transactional(readOnly=true)
    public List<WorkExperience> getWorkExperiences() {
        return workExperienceDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<WorkExperience> getWorkExperiences(int start, int num) {
        return workExperienceDao.findAll(start, num);
    }

    @Transactional
    public void save(WorkSector workSector) {
        workSectorDao.save(workSector);
    }

    @Transactional
    public void delete(WorkSector workSector) {
        workSectorDao.delete(workSector);
    }

    @Transactional(readOnly=true)
    public WorkSector getWorkSector(Long id) {
        return workSectorDao.findById(id);
    }

    @Transactional(readOnly=true)
    public WorkSector getWorkSector(String name) {
        return workSectorDao.findByName(name);
    }

    @Transactional(readOnly=true)
    public List<WorkSector> getWorkSectors() {
        return workSectorDao.findAll();
    }

    @Transactional(readOnly=true)
    public List<WorkSector> getWorkSectors(int start, int num) {
        return workSectorDao.findAll(start, num);
    }

    @Transactional
    public void save(Currency currency) {
        currencyDao.save(currency);
    }

    @Transactional
    public void delete(Currency currency) {
        currencyDao.delete(currency);
    }

    public Currency getCurrency(Long id) {
        return currencyDao.findById(id);
    }

    public List<Currency> getCurrencies() {
        return currencyDao.findAll();
    }

    public List<Currency> getCurrencies(int start, int num) {
        return currencyDao.findAll(start, num);
    }

    @Transactional
    public void save(JobRole jobRole) {
        jobRoleDao.save(jobRole);
    }

    @Transactional
    public void delete(JobRole jobRole) {
        jobRoleDao.delete(jobRole);
    }

    public JobRole getJobRole(Long id) {
        return jobRoleDao.findById(id);
    }

    public List<JobRole> getJobRoles() {
        return jobRoleDao.findAll();
    }

    public List<JobRole> getJobRoles(int start, int num) {
        return jobRoleDao.findAll(start, num);
    }

    @Transactional
    public void save(JobPreference jobPreference) {
        jobPreferenceDao.save(jobPreference);
    }

    @Transactional
    public void delete(JobPreference jobPreference) {
        jobPreferenceDao.delete(jobPreference);
    }

    public JobPreference getJobPreference(Long id) {
        return jobPreferenceDao.findById(id);
    }

    public List<JobPreference> getJobPreferences() {
        return jobPreferenceDao.findAll();
    }

    public List<JobPreference> getJobPreferences(int start, int num) {
        return jobPreferenceDao.findAll(start, num);
    }

    @Transactional
    public void save(Language language) {
        languageDao.save(language);
    }

    @Transactional
    public void delete(Language language) {
        languageDao.delete(language);
    }

    public Language getLanguage(Long id) {
        return languageDao.findById(id);
    }

    public List<Language> getLanguages() {
        return languageDao.findAll();
    }

    public List<Language> getLanguages(int start, int num) {
        return languageDao.findAll(start, num);
    }

    @Transactional
    public void save(LanguageFluency languageFluency) {
        languageFluencyDao.save(languageFluency);
    }

    @Transactional
    public void delete(LanguageFluency languageFluency) {
        languageFluencyDao.delete(languageFluency);
    }

    public LanguageFluency getLanguageFluency(Long id) {
        return languageFluencyDao.findById(id);
    }

    public List<LanguageFluency> getLanguageFluencys() {
        return languageFluencyDao.findAll();
    }

    public List<LanguageFluency> getLanguageFluencys(int start, int num) {
        return languageFluencyDao.findAll(start, num);
    }

}
