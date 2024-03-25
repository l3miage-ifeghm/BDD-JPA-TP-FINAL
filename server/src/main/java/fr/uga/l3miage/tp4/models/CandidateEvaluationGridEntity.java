package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;

    // ManyToMany unidirectionnel on fait ManyToMany dans une seule classe c'est la classe où il part et on fait pas de mappedBy car ce dernier que dans les cas du bidirectionel
    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities ;


    @ManyToOne
    private ExamEntity exam;

    @ManyToOne
    private CandidateEntity candidateEntity;




}
