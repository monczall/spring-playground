package dev.monczall.springplayground.pokemon;

import dev.monczall.springplayground.pokemon.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
