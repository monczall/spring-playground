DROP TABLE IF EXISTS pokemons;
DROP TABLE IF EXISTS trainers;
DROP TABLE IF EXISTS pokemon_catches;

CREATE TABLE pokemons (
    id BIGINT PRIMARY KEY,
    hex_id VARCHAR NOT NULL,
    name VARCHAR(30) NOT NULL,
    type_one VARCHAR NOT NULL,
    type_two VARCHAR NOT NULL
);

CREATE TABLE trainers (
    id BIGINT PRIMARY KEY,
    email VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    login VARCHAR NOT NULL,
    team VARCHAR NOT NULL
);

CREATE TABLE pokemon_catches (
    id BIGINT PRIMARY KEY,
    trainer_id BIGINT NOT NULL,
    pokemon_id BIGINT NOT NULL,
    combat_power DOUBLE PRECISION,
    height DOUBLE PRECISION,
    weight DOUBLE PRECISION,
    caught_at TIMESTAMP WITH TIME ZONE
);