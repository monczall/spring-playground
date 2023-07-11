package dev.monczall.springplayground.catching;

import dev.monczall.springplayground.catching.entities.PokemonCatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CatchingRepository extends JpaRepository<PokemonCatch, Long> {
}
