package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class EcoSessionProgrammationStepEntity {
    @Id
    private Long id;
    private final LocalDateTime dateTime = LocalDateTime.now();


    @Column(unique=true)
    private String code;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private EcoSessionProgrammationEntity ecoSessionProgrammationEntity;


}
