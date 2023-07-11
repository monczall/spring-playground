package dev.monczall.springplayground.pokemon.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.monczall.springplayground.catching.entities.PokemonCatch;
import dev.monczall.springplayground.pokemon.utils.PokemonType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "{pokemon.id.hex.not-blank}")
    private String hexId;
    @NotBlank(message = "{pokemon.name.not-blank}")
    @Size(min = 3, max = 30, message = "{pokemon.name.length}")
    private String name;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "{pokemon.type.first.not-empty}")
    private PokemonType typeOne;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "{pokemon.type.second.not-empty}")
    private PokemonType typeTwo;
    @JsonIgnore
    @OneToMany(mappedBy = "pokemon")
    private List<PokemonCatch> catches;
}
