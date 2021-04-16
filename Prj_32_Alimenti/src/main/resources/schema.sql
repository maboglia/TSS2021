CREATE TABLE libro (
  id int,
  titolo varchar(255),
  pagine int,
  prezzo decimal(6,2),
  editore_id int 
);

INSERT INTO libro (id, titolo, pagine, prezzo, editore_id) VALUES
(1, 'Alchimista (L'')', 12, '10.00', 1),
(2, 'Cinquanta sfumature di grigio', 10, '560.00', 1),
(3, 'Dieci piccoli indiani', 10, '208.00', 1),
(4, 'Don Chisciotte della Mancha', 20, '12.00', 3),
(5, 'Harry Potter e la Pietra Filosofale', 9, '302.00', 4),
(6, 'Il Codice da Vinci', 11, '512.00', 1);