package com.soccer.stats.model.entity;

import com.soccer.stats.model.enums.StyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "championship")
@Entity
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
public class Championship {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Convert()
    @Column(name = "style")
    private StyleEnum style;
}
