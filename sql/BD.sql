INSERT INTO direcciones (
    direccion_id, cp, numero, municipio, provincia, calle, ccaa, pais, puerta
) VALUES
(1, 28013, 45, 'Madrid', 'Madrid', 'Calle Mayor', 'Comunidad de Madrid', 'España', NULL),  -- Casa
(2, 08001, 12, 'Barcelona', 'Barcelona', 'La Rambla', 'Cataluña', 'España', NULL),         -- Casa
(3, 41001, 89, 'Sevilla', 'Sevilla', 'Avenida de la Constitución', 'Andalucía', 'España', '3A'), -- Piso
(4, 46001, 21, 'Valencia', 'Valencia', 'Calle Colón', 'Comunidad Valenciana', 'España', NULL), -- Casa
(5, 36201, 23, 'Vigo', 'Pontevedra', 'Calle del Progreso', 'Galicia', 'España', '2B'),        -- Piso
(6, 20001, 30, 'San Sebastián', 'Guipúzcoa', 'Boulevard Zumardia', 'País Vasco', 'España', NULL), -- Casa
(7, 50001, 17, 'Zaragoza', 'Zaragoza', 'Paseo de la Independencia', 'Aragón', 'España', '1C'),  -- Piso
(8, 35001, 55, 'Las Palmas', 'Las Palmas', 'Calle Triana', 'Canarias', 'España', NULL),        -- Casa
(9, 31001, 10, 'Pamplona', 'Navarra', 'Calle Estafeta', 'Navarra', 'España', '4D'),            -- Piso
(10, 33001, 77, 'Oviedo', 'Asturias', 'Calle Uría', 'Principado de Asturias', 'España', NULL);  -- Casa


INSERT INTO usuarios (
    activo, fecha_alta, fecha_nacimiento, direccion_id, telefono, nombre, apellido1, apellido2, email, password, rol, usuario
) VALUES (
    1, '2025-04-07', '1988-05-15', 1, '654321987', 'Juan', 'Pérez', 'Gómez', 'juan.perez@example.com', 'hashed_password_1', 'cliente', 'juanperez'
);

INSERT INTO libros (unidades, editorial, autor, descripcion, isbn, titulo, fecha_alta)
VALUES 
(5, 'Planeta', 'Carlos Ruiz Zafón', 'Una novela mágica ambientada en la Barcelona de la posguerra.', '9788408072801', 'La Sombra del Viento', CURRENT_TIMESTAMP),
(3, 'Anagrama', 'Roberto Bolaño', 'Un viaje literario por el misterio de los escritores desaparecidos.', '9788433966790', 'Los Detectives Salvajes', CURRENT_TIMESTAMP),
(7, 'Alfaguara', 'Gabriel García Márquez', 'Una historia inolvidable sobre el amor eterno y el paso del tiempo.', '9788420471839', 'El Amor en los Tiempos del Cólera', CURRENT_TIMESTAMP),
(10, 'Penguin Random House', 'George Orwell', 'Distopía sobre un régimen totalitario que vigila todos tus movimientos.', '9780451524935', '1984', CURRENT_TIMESTAMP),
(4, 'Debolsillo', 'J.R.R. Tolkien', 'La gran aventura de Frodo para destruir el Anillo Único.', '9788497593793', 'El Señor de los Anillos', CURRENT_TIMESTAMP);
