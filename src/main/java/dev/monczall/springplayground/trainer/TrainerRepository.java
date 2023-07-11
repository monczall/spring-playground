package dev.monczall.springplayground.trainer;

import dev.monczall.springplayground.trainer.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
