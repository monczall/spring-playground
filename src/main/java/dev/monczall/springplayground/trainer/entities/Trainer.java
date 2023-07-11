package dev.monczall.springplayground.trainer.entities;

import dev.monczall.springplayground.catching.entities.PokemonCatch;
import dev.monczall.springplayground.trainer.utils.Team;
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
@Table(name = "trainers")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "{trainer.email.not-blank}")
    private String email;
    @NotBlank(message = "{trainer.password.not-blank}")
    private String password;
    @NotBlank(message = "{trainer.login.not-blank}")
    @Size(min = 3, message = "{trainer.login.length}")
    private String login;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "{trainer.team.not-empty}")
    private Team team;
    @OneToMany(mappedBy = "trainer")
    private List<PokemonCatch> catches;
}
