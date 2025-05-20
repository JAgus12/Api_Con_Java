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


-- Usuarios
INSERT INTO usuarios (
    activo, fecha_alta, fecha_nacimiento, direccion_id, telefono, nombre, apellido1, apellido2, email, password, rol, usuario
) VALUES
(1, '2025-04-07', '1988-05-15', 1, '654321987', 'Juan', 'Pérez', 'Gómez', 'juan.perez@example.com', 'hashed_password_1', 'ADMIN', 'juanperez')
/* (1, '2025-04-07', '1992-07-10', 2, '678945612', 'Ana', 'Sánchez', 'Martínez', 'ana.sanchez@example.com', 'hashed_password_2', 'cliente', 'anasanchez'),
(1, '2025-04-07', '1985-03-22', 3, '623456789', 'Carlos', 'Ramírez', 'López', 'carlos.ramirez@example.com', 'hashed_password_3', 'cliente', 'carlosramirez'),
(1, '2025-04-07', '1995-06-30', 4, '612345678', 'Laura', 'González', 'Morales', 'laura.gonzalez@example.com', 'hashed_password_4', 'cliente', 'lauragonzalez'),
(1, '2025-04-07', '1987-11-14', 5, '699876543', 'Pedro', 'Fernández', 'Gutiérrez', 'pedro.fernandez@example.com', 'hashed_password_5', 'cliente', 'pedrofernandez'),
(1, '2025-04-07', '1990-09-03', 6, '689765432', 'Marta', 'Díaz', 'Pérez', 'marta.diaz@example.com', 'hashed_password_6', 'cliente', 'martadiaz'),
(1, '2025-04-07', '1983-01-18', 7, '674323456', 'Javier', 'Álvarez', 'Castro', 'javier.alvarez@example.com', 'hashed_password_7', 'cliente', 'javieralvarez'),
(1, '2025-04-07', '1989-10-02', 8, '665443211', 'María', 'López', 'Hernández', 'maria.lopez@example.com', 'hashed_password_8', 'cliente', 'marialopez'),
(1, '2025-04-07', '1994-12-05', 9, '699123456', 'David', 'Martín', 'Vázquez', 'david.martin@example.com', 'hashed_password_9', 'cliente', 'davidmartin'),
(1, '2025-04-07', '1991-02-28', 10, '677894321', 'Sofía', 'García', 'Muñoz', 'sofia.garcia@example.com', 'hashed_password_10', 'cliente', 'sofiagarcia'); */

-- Direcciones



INSERT INTO productos (unidades, fecha_alta, fecha_modificacion,titulo, descripcion, created_by, tipo, update_by)
VALUES 
(50, NOW(), NOW(),'Inception', 'Cine de ciencia ficción sobre sueños.', 'admin', 'pelicula', 'admin'),
(75, NOW(), NOW(),'The Dark Knight', 'Batman lucha contra el crimen.', 'admin', 'pelicula', 'admin'),
(100, NOW(), NOW(),'Interstellar', 'Viaje espacial para salvar la humanidad.', 'admin', 'pelicula', 'admin'),
(120, NOW(), NOW(),'National Geographic', 'Revista de ciencia y naturaleza.', 'admin', 'revista', 'admin'),
(80, NOW(), NOW(),'Time', 'Revista de noticias y política.', 'admin', 'revista', 'admin'),
(150, NOW(), NOW(),'Sports Illustrated', 'Revista sobre deportes populares.', 'admin', 'revista', 'admin'),
(200, NOW(), NOW(),'The Great Gatsby', 'Historia de la decadencia en los años 20.', 'admin', 'libro', 'admin'),
(180, NOW(), NOW(),'To Kill a Mockingbird', 'Lucha contra la injusticia racial.', 'admin', 'libro', 'admin'),
(220, NOW(), NOW(),'1984', 'Sociedad totalitaria y control social.', 'admin', 'libro', 'admin');

-- Insertar detalles de películas
INSERT INTO peliculas (producto_id, duracion, director, productor, anho)
VALUES 
(1, '148 min', 'Christopher Nolan', 'Emma Thomas', '2010'),
(2, '152 min', 'Christopher Nolan', 'Charles Roven', '2008'),
(3, '169 min', 'Christopher Nolan', 'Lynda Obst', '2014');

-- Insertar detalles de libros
INSERT INTO libros (producto_id, editorial, autor, isbn)
VALUES 
(7, 'Scribner', 'F. Scott Fitzgerald', '9780743273565'),
(8, 'J.B. Lippincott & Co.', 'Harper Lee', '9780061120084'),
(9, 'Secker & Warburg', 'George Orwell', '9780451524935');


-- Insertar detalles de revistas
INSERT INTO revistas (producto_id, editorial)
VALUES 
(4, 'National Geographic Society'),
(5, 'Time Inc.'),
(6, 'Meredith Corporation');

-- Alquileres
INSERT INTO alquileres (
    alquiler_id, fecha_alta, fecha_fin, producto_id, usuario
) VALUES
(1, '2025-04-07 10:30:00', '2025-04-14 10:30:00', 1, 'juanperez'), -- Alquiler de Película 1 por Juan Pérez
(2, '2025-04-08 14:00:00', '2025-04-15 14:00:00', 1, 'anasanchez'), -- Alquiler de Película 1 por Ana Sánchez
(3, '2025-04-09 09:00:00', '2025-04-16 09:00:00', 1, 'carlosramirez'), -- Alquiler de Película 1 por Carlos Ramírez
(4, '2025-04-07 16:30:00', '2025-04-14 16:30:00', 2, 'lauragonzalez'), -- Alquiler de Película 2 por Laura González
(5, '2025-04-08 12:00:00', '2025-04-15 12:00:00', 2, 'pedrofernandez') -- Alquiler de Película 2 por Pedro Fernández




