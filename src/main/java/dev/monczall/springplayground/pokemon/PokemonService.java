package dev.monczall.springplayground.pokemon;

import dev.monczall.springplayground.pokemon.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
class PokemonService {

    private final PokemonRepository pokemonRepository;

    List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }


}
