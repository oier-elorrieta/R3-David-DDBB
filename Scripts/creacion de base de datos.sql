create database hosteleria;
use hosteleria;

create table establezimendu(
NIF varchar(8) primary key,
Izena varchar(25),
Dir varchar(25),
mota enum("Bar","Cafetegi","jatetxe"),
jabe varchar(25)
);

create table usuario(
DNI varchar(9) primary key,
Izena varchar(25),
Abizena varchar(25),
passw varchar(25),
ENIF varchar(8),
constraint fk_ENIF_usuario foreign key(ENIF) references establezimendu(NIF) on update cascade
);

create table hornitzaile(
Izena varchar(25) primary key,
luzatze int 
);

create table produktu(
ID int primary key,
pre_com int,
pre_ven int,
fec_cad date,
mota varchar(25),
H_izena varchar(25),
constraint fk_HIzena_produktu foreign key(H_izena) references hornitzaile(izena) on update cascade
);

create table erosi(
E_NIF varchar(8),
P_ID int,
stock int,
constraint pk_erosi primary key(E_NIF,P_ID),
constraint fk_Enif_erosi foreign key(E_NIF) references establezimendu(NIF) on update cascade,
constraint fk_PID_erosi foreign key(P_ID) references produktu(ID) on update cascade
);

create table Eragiketa (
N_trans int,
E_NIF varchar(8),
fec date,
total int,
constraint pk_Eragiketa primary key(N_trans,E_NIF),
constraint fk_ENIF_eragiketa foreign key(E_NIF) references establezimendu(NIF) on update cascade
);

create table saldu(
P_ID int,
N_Trans int,
E_NIF varchar(8),
pvp int,
kop int,
constraint pk_saldu primary key(P_ID,N_Trans,E_NIF),
constraint fk_PID_saldu foreign key(P_ID) references produktu(ID) on update cascade,
constraint fk_NtransENIF_saldu foreign key(N_Trans,E_NIF) references eragiketa (N_Trans,E_NIF) on update cascade
);

create table cliente(
NIF varchar(8) primary key,
Izena varchar(25),
Abizen varchar(25)
);

create table faktura(
N_Trans int,
E_NIF varchar(8),
c_NIF varchar(8),
constraint pk_faktura primary key(N_Trans,E_NIF),
constraint fk_NtransENIF_faktura foreign key(N_Trans,E_NIF) references eragiketa (N_Trans,E_NIF) on update cascade,
constraint fk_CNIF_faktura foreign key(C_NIF) references cliente(NIF) on update cascade
);

create table bidaltze (
N_Trans int,
E_NIF varchar(8),
Dir varchar(25),
constraint pk_bidaltze primary key(N_Trans,E_NIF),
constraint fk_NtransENIF_bidaltze foreign key(N_Trans,E_NIF) references eragiketa (N_Trans,E_NIF) on update cascade
);





