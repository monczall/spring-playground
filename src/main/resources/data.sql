INSERT INTO trainers (id, email, password, login, team) VALUES (1, 'example1@example.com', 'password1', 'user1', 'VALOR');
INSERT INTO trainers (id, email, password, login, team) VALUES (2, 'example2@example.com', 'password2', 'user2', 'INSTINCT');
INSERT INTO trainers (id, email, password, login, team) VALUES (3, 'example3@example.com', 'password3', 'user3', 'MYSTIC');

INSERT INTO pokemons (id, hex_id, name, type_one, type_two) VALUES (1, '001', 'Bulbasaur', 'GRASS', 'POISON');
INSERT INTO pokemons (id, hex_id, name, type_one, type_two) VALUES (2, '004', 'Charmander', 'FIRE', 'NONE');
INSERT INTO pokemons (id, hex_id, name, type_one, type_two) VALUES (3, '007', 'Squirtle', 'WATER', 'NONE');

INSERT INTO pokemon_catches (id, trainer_id, pokemon_id, combat_power, height, weight, caught_at) VALUES (1, 1, 2, 78.5, 0.6, 8.5, '2023-07-10 12:30:00+00:00');
INSERT INTO pokemon_catches (id, trainer_id, pokemon_id, combat_power, height, weight, caught_at) VALUES (2, 2, 3, 62.1, 0.5, 7.2, '2023-07-10 15:45:00+00:00');
INSERT INTO pokemon_catches (id, trainer_id, pokemon_id, combat_power, height, weight, caught_at) VALUES (3, 3, 1, 91.2, 0.7, 9.8, '2023-07-11 09:10:00+00:00');