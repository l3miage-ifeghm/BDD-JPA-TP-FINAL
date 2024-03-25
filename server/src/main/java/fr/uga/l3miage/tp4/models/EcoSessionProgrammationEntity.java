package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EcoSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

    @OneToOne
    private EcoSessionEntity ecoSessionEntity;

    @OneToMany
    private Set<EcoSessionProgrammationStepEntity> ecoSessionProgrammationStepEntities;
}
