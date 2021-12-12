package com.github.com.prika16.diocitiesapi.countries.repository;

import com.github.com.prika16.diocitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}