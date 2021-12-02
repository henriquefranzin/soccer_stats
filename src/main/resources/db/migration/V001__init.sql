CREATE TABLE IF NOT EXISTS tb_person(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255) NOT NULL,
    birthday DATE NOT NULL,
    age INTEGER NOT NULL,
    nationality VARCHAR(108) NOT NULL,
    city VARCHAR(108) NOT NULL,
    CONSTRAINT PK_person PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_player(
    preferred_foot VARCHAR(1) NOT NULL,
    goals INTEGER NOT NULL,
    assists INTEGER NOT NULL,
    position VARCHAR(108) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_coach(
    former_player BOOL
);

CREATE TABLE IF NOT EXISTS tb_team(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255) NOT NULL,
    birthday DATE NOT NULL,
    age INTEGER NOT NULL,
    nationality VARCHAR(108) NOT NULL,
    city VARCHAR(108) NOT NULL,
    championship_id VARCHAR(36) NOT NULL,
    coach_id VARCHAR(36) NOT NULL,
    stadium_id VARCHAR(36) NOT NULL,
    CONSTRAINT PK_team PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_stadium(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(255) NOT NULL,
    birthday DATE NOT NULL,
    age INTEGER NOT NULL,
    nationality VARCHAR(108) NOT NULL,
    city VARCHAR(108) NOT NULL,
    capacity FLOAT NOT NULL,
    CONSTRAINT PK_team PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_championship(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(108) NOT NULL,
    nationality VARCHAR(108) NOT NULL,
    number_of_teams INTEGER NOT NULL,
    style VARCHAR(1) NOT NULL,
    CONSTRAINT PK_championship PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_person_championship(
    id VARCHAR(36) NOT NULL,
    person_id VARCHAR(36) NOT NULL,
    championship_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (person_id) REFERENCES tb_person(id),
    FOREIGN KEY (championship_id) REFERENCES tb_championship(id)
);

CREATE TABLE IF NOT EXISTS tb_team_championship(
    id VARCHAR(36) NOT NULL,
    team_id VARCHAR(36) NOT NULL,
    championship_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (team_id) REFERENCES tb_team(id),
    FOREIGN KEY (championship_id) REFERENCES tb_championship(id)
);

CREATE TABLE IF NOT EXISTS tb_person_team(
    id VARCHAR(36) NOT NULL,
    person_id VARCHAR(36) NOT NULL,
    team_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (person_id) REFERENCES tb_person(id),
    FOREIGN KEY (team_id) REFERENCES tb_team(id)
);

ALTER TABLE tb_team ADD CONSTRAINT FK_stadium_id FOREIGN KEY (stadium_id) REFERENCES tb_stadium(id);