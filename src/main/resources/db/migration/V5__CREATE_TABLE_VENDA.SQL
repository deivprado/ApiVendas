CREATE TABLE venda (
    id SERIAL PRIMARY KEY,
    data TIMESTAMP DEFAULT now() NOT NULL,
    cliente_id INTEGER NOT NULL REFERENCES cliente(id),
    vendedor_id INTEGER NOT NULL REFERENCES vendedor(id),
    total DECIMAL(10,2) NOT NULL
);