package dev.monczall.springplayground.trainer.entities;

import dev.monczall.springplayground.catching.entities.PokemonCatch;
import dev.monczall.springplayground.trainer.utils.Team;
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
@Table(name = "trainers")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "{email.notnull}")
    private String email;
    @NotBlank(message = "Password must not be null")
    private String password;
    @NotBlank(message = "Login must not be null")
    @Size(min = 3, message = "Login must have at least 3 characters")
    private String login;
    @Enumerated(EnumType.STRING)
    private Team team;
    @OneToMany(mappedBy = "trainer")
    private List<PokemonCatch> catches;
}
