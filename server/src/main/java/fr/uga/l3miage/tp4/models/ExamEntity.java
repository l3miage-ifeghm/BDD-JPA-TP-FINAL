package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Column(unique=true)
    private String name;

    int weight;
    @OneToMany(mappedBy = "ExamEntity")
    private Set<CandidateEvaluationGridEntity> CandidateEvaluationGridEntities;

    @ManyToOne
    private EcoSessionEntity ecoSessionEntity;

    @ManyToMany
    private Set<SkillEntity>skillEntities;



}
