package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcoSessionEntity {
    @Id
    private Long id;
    @Column(unique=true)
    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private SessionStatus statuts;

    @OneToMany(mappedBy = "EcoSessionEntity")
    private Set<ExamEntity> examEntities;


}
