package com.soccer.stats.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Data
@Table(name = "person_championship")
@Entity
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
public class PersonChampionship {

    @Id
    @Column(name = "id")
    private String id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "championship_id", nullable = false)
    private Championship championship;
}
