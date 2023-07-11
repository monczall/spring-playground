package dev.monczall.springplayground.catching.entities;

import dev.monczall.springplayground.pokemon.entities.Pokemon;
import dev.monczall.springplayground.trainer.entities.Trainer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pokemon_catches")
public class PokemonCatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "trainer_id", nullable = false)
    private Trainer trainer;
    @ManyToOne
    @JoinColumn(name = "pokemon_id", nullable = false)
    private Pokemon pokemon;
    @NotNull(message = "{catch.combatPower.not-null}")
    private double combatPower;
    @NotNull(message = "{catch.height.not-null}")
    private double height;
    @NotNull(message = "{catch.weight.not-null}")
    private double weight;
    @NotNull(message = "{catch.caughtAt.not-null}")
    ZonedDateTime caughtAt;
}
