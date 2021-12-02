package com.soccer.stats.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @Column(name = "id", length = 36, nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "nationality", length = 108, nullable = false)
    private String nationality;

    @Column(name = "city", length = 108, nullable = false)
    private String city;

    @Column(name = "birthday", nullable = false)
    private Date birthday;

    @Column(name = "age", nullable = false)
    private Integer age;

    @OneToMany(mappedBy = "person")
    private List<PersonTeam> personTeamList;

    @OneToMany(mappedBy = "person")
    private List<PersonChampionship> personChampionshipList;
}
