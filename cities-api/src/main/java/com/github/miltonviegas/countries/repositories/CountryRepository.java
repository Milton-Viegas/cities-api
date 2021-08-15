package com.github.miltonviegas.countries.repositories;

import com.github.miltonviegas.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
