create table Moniteur (
    noM int primary key,
    nomM varchar(30),
    prenomM varchar(30),
    adresseM varchar(30),
    dateNaiss date,

);

create table Specialite (
    idSpecialite int primary key,
    nomS varchar(30),
);

create table Cours (
    codeC int primary key,
    niveau varchar(30),
    nbPlaces int, 
    dateCours date,
    noM int foreign key references Moniteur(noM),
    idSpecialite int  foreign key references Specialite(idSpecialite),
);

create table Adherent (
    noA int primary key,
    nomA varchar(30),
    prenomA varchar(30),
    telA varchar(30),
    adresseA varchar(30),
    ageA int, 
);

create table Materiel (
    codeM int primary key,
    type varchar(30),
    marque varchar(30),
    prix int,
    qteDispo int,
);

--create table Suivre(
--    codeC int primary key,
--    noA int primary key,
  --  codeC int foreign key references Cours(codeC),
   -- noA int foreign key references Adherent(noA),
--);

create table Suivre(
    noA int foreign key references Adherent(noA),
    codeC int foreign key references Cours(codeC),
    primary key(noA, codeC),
);

create table Louer(
    noA int foreign key references adherent(noA),
    codeM foreign key references Materiel(codeM),
    primary key(noA, codeM),
    quantite int,
);

insert into Moniteur (noM, nomM, prenomM, adresseM, dateNaiss)
values ( 1, 'Dupond', 'Jean', '12 route du col, Germ', '01-01-1980'),
(2, 'Martin', 'Sophie', ' Route du Lac, Loudenvielle', '13-05-1988');

insert into Specialite (idSpecialite, nomS) values
(1, 'ski'),
(2, 'snowboard'),
(3, 'raquette');

insert into Cours (codeC, niveau, nbPlaces, dateCours, noM, idSpecialite) values
(1, 'debutant', 1, '01-02-2013', 1, 2),
(2, 'intermediaire', 1, '01-01-2013', 1, 2),
(3, 'debutant', 5, '01-01-2013', 2, 1);

insert into Adherent (noA, nomA, prenomA, telA, adresseA, ageA) values
(1, 'Lars', 'Julien', '12 rue principale, Muret', '0666666666', 13).
(2, 'Salma', 'Louise', '23 route de Tarbes, Pau'. '0677777777', 26),
(3, 'Jardin', 'Lucien', "route d'Espagne, Tarbes", null, 52);
insert into Materiel (codeM, type, marque, prix, qteDispo) values
(1, 'ski', 'HyperGliss', 10, 2),
(2, 'snowboard', 'Hypergliss', 11, 3),
(3, 'raquette', 'Smash', 8, 2);
insert into Suivre (codeC, noA) values
(1, 1),
(1, 2),
(3, 1),
(2, 3);
insert into Louer (noA, codeM) values
(3, 1, 1),
(2, 1, 2);