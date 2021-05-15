package com.github.leonardo2201.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.leonardo2201.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
