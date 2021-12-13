 show databases;
 create database Repechaje;
 use Repechaje;
 create table Usuario( Ci int, 
					   Nombre varchar(45), 
                       Apellido varchar(45),
                       primary key(Ci)
					);
 create table Estudiante(Ci int, 
						 nroEstudiante int, 
						 foreign key(Ci) references Usuario(Ci),
					     primary key(nroEstudiante)
					);
create table Profesor(Ci int, 
					  Matricula int, 
					  foreign key(Ci) references Usuario(Ci),
					  primary key(Matricula)
					);
create table Materia(Codigo int,
					 Nombre varchar(45),
                     primary key(Codigo)
					);
                      
                           