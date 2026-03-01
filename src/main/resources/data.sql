INSERT INTO
    profesor (nombre)
VALUES
    ('Prof. Jirafales'),
    ('Severus Snape'),
    ('Albus Dumbledore'),
    ('Edna Krabappel'),
    ('Walter White');

INSERT INTO
    materia (nombre, id_profesor)
VALUES
    ('Aritmética', 1),
    ('Pociones', 2),
    ('Magia', 3),
    ('Historia', 4),
    ('Química', 5);

INSERT INTO
    alumno (nombre, apellido)
VALUES
    ('Bart', 'Simpson'),
    ('Harry', 'Potter'),
    ('Hermione', 'Granger'),
    ('Ron', 'Weasley'),
    ('Lisa', 'Simpson');

INSERT INTO
    alumno_materia (id_alumno, id_materia)
VALUES
    (1, 1),
    (2, 2),
    (2, 3),
    (3, 3),
    (5, 5);