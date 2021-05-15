package com.github.leonardo2201.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.leonardo2201.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
