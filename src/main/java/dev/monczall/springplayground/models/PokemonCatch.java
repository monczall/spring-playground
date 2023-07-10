package dev.monczall.springplayground.models;

import jakarta.persistence.*;
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
    @Column(name = "trainer_id")
    private Trainer trainer;
    @ManyToOne
    @Column(name = "pokemon_id")
    private Pokemon pokemon;
    private double combatPower;
    private double height;
    private double weight;
    ZonedDateTime caughtAt;
}
