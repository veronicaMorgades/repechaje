use Repechaje;

/*Usuario*/
insert into Usuario(Ci, Nombre, Apellido) values (54471580, 'Veronica', 'Morgades'),
( 54312835, 'Pepe', 'Diaz'),
( 6551235, 'Roberto', 'Sanchez');
insert into Usuario( Ci, Nombre, Apellido) values(87541236, 'Agusto', 'Perez'),
(65471582, 'Juan', 'Altez');

/*Estudiante*/
insert into Estudiante( Ci, nroEstudiante) values( 54471580, 0365),
(54312835, 5874),
(6551235, 6548);

/*Profesor*/
insert into Profesor( Ci, Matricula) values(87541236, 8753),
(65471582, 5624);

/*Materia*/

insert into Materia( Codigo, Nombre) values (001, 'Programacion'),
(002, 'Bases de datos'),
(003, 'Sistemas');