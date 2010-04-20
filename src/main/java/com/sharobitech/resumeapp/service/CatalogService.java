/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sharobitech.resumeapp.service;

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
import java.util.List;

/**
 *
 * @author ifnu
 */
public interface CatalogService {


    void save(Category category);
    void delete(Category category);
    Category getCategory(Long id);
    List<Category> getCategories();
    List<Category> getCategories(int start, int num);

    void save(City city);
    void delete(City city);
    City getCity(Long id);
    List<City> getCities();
    List<City> getCities(int start, int num);

    void save(Country country);
    void delete(Country country);
    Country getCountry(Long id);
    Country getCountry(String text);
    List<Country> getCountries();
    List<Country> getCountries(int start, int num);

    void save(Currency currency);
    void delete(Currency currency);
    Currency getCurrency(Long id);
    List<Currency> getCurrencies();
    List<Currency> getCurrencies(int start, int num);

    void save(Continent continent);
    void delete(Continent continent);
    Continent getContinent(Long id);
    List<Continent> getContinents();
    List<Continent> getContinents(int start, int num);

    void save(Language language);
    void delete(Language language);
    Language getLanguage(Long id);
    List<Language> getLanguages();
    List<Language> getLanguages(int start, int num);

    void save(LanguageFluency languageFluency);
    void delete(LanguageFluency languageFluency);
    LanguageFluency getLanguageFluency(Long id);
    List<LanguageFluency> getLanguageFluencys();
    List<LanguageFluency> getLanguageFluencys(int start, int num);

    void save(Title title);
    void delete(Title title);
    Title getTitle(Long id);
    List<Title> getTitles();
    List<Title> getTitles(int start, int num);

    void save(WorkExperience workExperience);
    void delete(WorkExperience workExperience);
    WorkExperience getWorkExperience(Long id);
    List<WorkExperience> getWorkExperiences();
    List<WorkExperience> getWorkExperiences(int start, int num);

    void save(WorkSector workSector);
    void delete(WorkSector workSector);
    WorkSector getWorkSector(Long id);
    List<WorkSector> getWorkSectors();
    List<WorkSector> getWorkSectors(int start, int num);

    void save(JobRole jobRole);
    void delete(JobRole jobRole);
    JobRole getJobRole(Long id);
    List<JobRole> getJobRoles();
    List<JobRole> getJobRoles(int start, int num);

    void save(JobPreference jobPreference);
    void delete(JobPreference jobPreference);
    JobPreference getJobPreference(Long id);
    List<JobPreference> getJobPreferences();
    List<JobPreference> getJobPreferences(int start, int num);

}
