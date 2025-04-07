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
