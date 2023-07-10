package dev.monczall.springplayground.models;

import dev.monczall.springplayground.models.utils.enums.PokemonType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "Pokemon's hex ID must not be null")
    private String hexId;
    @NotBlank(message = "Pokemon's name must not be null")
    @Size(min = 3, max = 30, message = "Pokemon's name length must be in range from 3 to 30")
    private String name;
    @NotBlank(message = "Pokemon's first type must not be null")
    private PokemonType typeOne;
    @NotBlank(message = "Pokemon's second type must not be null")
    private PokemonType typeTwo;
    @ManyToMany(mappedBy = "pokemon")
    private List<PokemonCatch> catches;
}
