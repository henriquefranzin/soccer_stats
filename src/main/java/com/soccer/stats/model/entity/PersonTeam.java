package com.soccer.stats.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_person_team")
public class PersonTeam {

    @Id
    @Column(name = "id", length = 36, nullable = false)
    private String id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
}
