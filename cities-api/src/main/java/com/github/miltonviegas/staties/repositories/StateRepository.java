package com.github.miltonviegas.staties.repositories;

import com.github.miltonviegas.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
