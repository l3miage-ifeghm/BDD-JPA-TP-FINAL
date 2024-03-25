package fr.uga.l3miage.tp4.models;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public abstract class UserEntity {
    @Id
    private Long id;
    private String firstname;
    private String lastName;
    @Column(nullable=false,unique=true)
    private String email;

    @Column(unique=true)
    private String phoneNumber;



}
