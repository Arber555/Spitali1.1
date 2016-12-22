create database SpitaliDB1_2

use SpitaliDB1_2

create table Sektori
(
	ID int not null primary key,
	emri varChar(50)
)

create table Salla_Operacionit
(
	id int not null primary key,
	data date,
	ora time,
	sektori_ID int foreign key references Sektori(ID)
)


create table Doktori
(
	ID int identity(1,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	data_lindjes date,
	fjalkalimi varChar(15),
	specializimi varChar(300),
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	detajet_tjera varChar(250),
	sektori_ID int foreign key references Sektori(ID)
)


create table Motra
(
	ID int identity(1,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	data_lindjes date,
	fjalkalimi varChar(15),
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	Detajet_tjera varChar(250),
	sektori_ID int foreign key references Sektori(ID)
)


create table Puntori 
(
	ID int identity(1,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	data_lindjes date,
	Detajet_tjera varChar(250)
)

create table Rescepsionisti
(
	ID int identity(0,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	data_lindjes date,
	fjalkalimi varChar(15),
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	Detajet_tjera varChar(250)
)


Create table Dhoma
(
	ID int identity(1,1) not null primary key,
	Nr_dhomes int not null,
	Nr_shtratve int,
	countP int,
	sektori_ID int foreign key references Sektori(ID)
)
insert into Pacienti values('aaa','bbbb','M','1995.12.12', '32','67.7','213243','pej', 'gd','das','23','sdfsddsf',null);

Create table Pacienti
(
	ID int identity(1,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	data_lindjes date,
	pesha float,
	gjatsia float,
	nr_telefonit int,
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	Detajet_tjera varChar(250),
	ID_dhoma int foreign key references Dhoma(ID)
)

create table Farmacisti
(
	ID int identity(1,1) not null primary key,
	emri varChar(70),
	mbiemri varChar(70),
	gjinia char,
	check(gjinia in('M','F')),
	data_lindjes date,
	fjalkalimi varChar(15),
	qyteti varChar(80),
	shteti varChar(80),
	ruga varChar(80),
	numri int,
	detajet_tjera varChar(250)
)

create table Orari 
(
	ID int not null primary key,
	data_Filimit date,
	data_Mbarimit date,
	koha_Fillimi time,
	koha_Mbarimi time,
	Rescepsionisti_ID int foreign key references Rescepsionisti(ID),
	Puntori_ID int foreign key references Puntori(ID),
	Motra_ID int foreign key references Motra(ID),
	Doktori_ID int foreign key references Doktori(ID),
	Farmacisti_ID int foreign key references Farmacisti(ID)
)

create table Historia_Pacientit
(
	ID int not null primary key,
	update_date date,
	gjendja_mjeksore varChar(250),
	pershkrimi_komponenteve varChar(250),
	doktori_ID int foreign key references Doktori(ID),
	motra_ID int foreign key references Motra(ID),
	r_ID int foreign key references Rescepsionisti(ID),
	pacienti_ID int Foreign key References Pacienti(ID)
)


create table Fatura_Pacientit
(
	ID int not null Primary key,
	data date,
	metoda_Pageses varChar(100),
	cmimi float,
	artikujt varChar(100),
	pacjenti_ID int foreign key References Pacienti(ID),
)

create table Barnat
(
	ID int identity(1,1) not null Primary key,
	emri varChar(70),
	data_skadimit date,
	cmimi float,
	pershkrimi_komponenteve varChar(250),
	Farmacisti_ID int foreign key references Farmacisti(ID),
	Fatura_ID int foreign key references Fatura_Pacientit(ID)
)
