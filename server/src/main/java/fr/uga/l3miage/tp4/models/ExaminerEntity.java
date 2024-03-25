package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("E")
public class ExaminerEntity extends UserEntity {
    private String login;
    private String passeword;

    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

}
