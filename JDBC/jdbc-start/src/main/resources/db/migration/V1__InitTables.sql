CREATE TABLE movie
(
    id          BIGSERIAL PRIMARY KEY,
    name        TEXT NOT NULL,
    relase_date DATE NOT NULL,
    unique (name)
);