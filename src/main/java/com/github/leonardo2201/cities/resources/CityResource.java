package com.github.leonardo2201.cities.resources;

import com.github.leonardo2201.cities.entities.City;
import com.github.leonardo2201.cities.repositories.CityRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Page<City> cities(final Pageable page) {
    return repository.findAll(page);
  }
}
