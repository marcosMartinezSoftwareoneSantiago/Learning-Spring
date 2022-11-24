package com.example.ejerciciosiete.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jugadores")
public class Jugador {

    public final static int BASE = 1;
    public final static int ESCOLTA = 2;
    public final static int ALERO = 3;
    public final static int ALAPIVOT = 4;
    public final static int PIVOT = 5;

    //11->15 Atlantico
    public final static int BOSTON_CELTICS = 11;
    public final static int BROOKLYN_NETS = 12;
    public final static int NEW_YORK_KNICKS = 13;
    public final static int FILADELFIA_76ERS = 14;
    public final static int TORONTO_RAPTORS = 15;

    //21->25 Sureste
    public final static int ATLANTA_HAWKS = 21;
    public final static int CHARLOTTE_HORNETS = 22;
    public final static int MIAMI_HEATS = 23;
    public final static int ORLANDO_MAGIC = 24;
    public final static int WASHINGTON_WIZARDS = 25;

    //31->35 Central
    public final static int CHICAGO_BULLS = 31;
    public final static int CLEVELAND_CAVALLIERS = 32;
    public final static int DETROIT_PISTONS = 33;
    public final static int INDIANA_PACERS = 34;
    public final static int MILWAUKEE_BUCKS = 35;

    //41->45 Pacífico
    public final static int GOLDEN_STATE_WARRIORS = 41;
    public final static int LA_CLIPPERS = 42;
    public final static int LOS_ANGELES_LAKERS = 43;
    public final static int PHOENIX_SUNS = 44;
    public final static int SACRAMENTO_KINGS = 45;

    //51->55 Noroeste
    public final static int DENVER_NUGGETS = 51;
    public final static int MINNESOTA_TIMBERWOLVES = 52;
    public final static int OKLAHOMA_CITY_THUNDER = 53;
    public final static int PORTLAND_TRAIL_BLAZERS = 54;
    public final static int UTAH_JAZZ = 55;

    //61->65 Suroeste
    public final static int DALLAS_MAVERICKS = 61;
    public final static int HOUSTON_ROCKETS = 62;
    public final static int MEMPHIS_GRIZZLIES = 63;
    public final static int NEW_ORLEANS_PELICANS = 64;
    public final static int SAN_ANTONIO_SPURS = 65;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Column(name="apellido_uno", nullable = false, length= 60)
    private String apellidoUno;

    @Column(name="apellido_dos", nullable = true)
    private String apellidoDos;
    private Double estatura;
    private Integer posicion;
    private Integer equipo;

    public Jugador() {
    }


    public Jugador(String nombre, String apellidoUno, String apellidoDos, Double estatura, int posicion, int equipo) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.estatura = estatura;
        this.posicion = Integer.valueOf(posicion);
        this.equipo = Integer.valueOf(equipo);
    }


    public Long getId() {
        return this.id;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return this.apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return this.apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public Double getEstatura() {
        return this.estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Integer getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getEquipo() {
        return this.equipo;
    }

    public void setEquipo(Integer equipo) {
        this.equipo = equipo;
    }

    public String getPosicionString() {
        String posicion;
        switch(this.posicion){
            case (Jugador.BASE):
                posicion = "Base";
                break;
            case (Jugador.ESCOLTA):
                posicion = "Escolta";
                break;
            case (Jugador.ALERO):
                posicion = "Alero";
                break;
            case (Jugador.ALAPIVOT):
                posicion = "Ala-pívot";
                break;
            case (Jugador.PIVOT):
                posicion = "Pívot";
                break;
            default:
                posicion = "Dato erroneo";
                break;
        }
        return posicion;
    }

    public void setPosicion(String posicion) {
        Integer result;
        posicion.toUpperCase();
        switch(posicion) {
            case ("BASE"):
                result = Integer.valueOf(Jugador.BASE);
                break;
            case ("ESCOLTA"):
                result = Integer.valueOf(Jugador.ESCOLTA);
                break;
            case ("ALERO"):
                result = Integer.valueOf(Jugador.ALERO);
                break;
            case ("ALAPIVOT"):
            case ("ALAPÍVOT"):
            case ("ALA-PIVOT"):
            case ("ALA-PÍVOT"):
            case ("ALA PIVOT"):
            case ("ALA PÍVOT"):
                result = Integer.valueOf(Jugador.ALAPIVOT);
                break;
            case ("PIVOT"):
            case ("PÍVOT"):
                result = Integer.valueOf(Jugador.PIVOT);
                break;
            default:
                result = Integer.valueOf(0);
                break;
        }
        this.posicion = result;
    }

    public String getEquipoString() {
        String equipo;
        switch(this.equipo){
            case (Jugador.BOSTON_CELTICS):
                equipo = "Boston Celtics";
                break;
            case (Jugador.BROOKLYN_NETS):
                equipo = "Brooklyn Nets";
                break;
            case (Jugador.NEW_YORK_KNICKS):
                equipo = "New York Knicks";
                break;
            case (Jugador.FILADELFIA_76ERS):
                equipo = "Filadelfia 76ers";
                break;
            case (Jugador.TORONTO_RAPTORS):
                equipo = "Toronto Raptors";
                break;
            case (Jugador.ATLANTA_HAWKS):
                equipo = "Atlanta Hawks";
                break;
            case (Jugador.CHARLOTTE_HORNETS):
                equipo = "Charlotte Hornets";
                break;
            case (Jugador.MIAMI_HEATS):
                equipo = "Miami Heats";
                break;
            case (Jugador.ORLANDO_MAGIC):
                equipo = "Orlando Magic";
                break;
            case (Jugador.WASHINGTON_WIZARDS):
                equipo = "Washington Wizards";
                break;
            case (Jugador.CHICAGO_BULLS):
                equipo = "Chicago Bulls";
                break;
            case (Jugador.CLEVELAND_CAVALLIERS):
                equipo = "Cleveland Cavalliers";
                break;
            case (Jugador.DETROIT_PISTONS):
                equipo = "Detroit Pistons";
                break;
            case (Jugador.INDIANA_PACERS):
                equipo = "Indiana Pacers";
                break;
            case (Jugador.MILWAUKEE_BUCKS):
                equipo = "Milwaukee Bucks";
                break;
            case (Jugador.GOLDEN_STATE_WARRIORS):
                equipo = "Golden State Warriors";
                break;
            case (Jugador.LA_CLIPPERS):
                equipo = "LA Clippers";
                break;
            case (Jugador.LOS_ANGELES_LAKERS):
                equipo = "Los Angeles Lakers";
                break;
            case (Jugador.PHOENIX_SUNS):
                equipo = "Phoenix Suns";
                break;
            case (Jugador.SACRAMENTO_KINGS):
                equipo = "Sacramento Kings";
                break;
            case (Jugador.DENVER_NUGGETS):
                equipo = "Denver Nuggets";
                break;
            case (Jugador.MINNESOTA_TIMBERWOLVES):
                equipo = "Minnesota TimberWolves";
                break;
            case (Jugador.OKLAHOMA_CITY_THUNDER):
                equipo = "Ockahoma City Thunder";
                break;
            case (Jugador.PORTLAND_TRAIL_BLAZERS):
                equipo = "Portland Trail Blazers";
                break;
            case (Jugador.UTAH_JAZZ):
                equipo = "Utah Jazz";
                break;
            case (Jugador.DALLAS_MAVERICKS):
                equipo = "Dallas Mavericks";
                break;
            case (Jugador.HOUSTON_ROCKETS):
                equipo = "Houston Rockets";
                break;
            case (Jugador.MEMPHIS_GRIZZLIES):
                equipo = "Memphis Grizzlies";
                break;
            case (Jugador.NEW_ORLEANS_PELICANS):
                equipo = "New Orleans Pelicans";
                break;
            case (Jugador.SAN_ANTONIO_SPURS):
                equipo = "San Antonio Spurs";
                break;    
            default:
                equipo = "Dato erroneo";
                break;
        }
        return equipo;
    }

    public void setEquipo(String equipo) {
        int result;
        equipo.toUpperCase();
        switch(equipo){
            case ("BOSTON CELTICS"):
                result = Jugador.BOSTON_CELTICS;
                break;
            case ("BROOKLYN NETS"):
                result = Jugador.BROOKLYN_NETS;
                break;
            case ("NEW YORK KNICKS"):
                result = Jugador.NEW_YORK_KNICKS;
                break;
            case ("FILADELFIA 76ERS"):
                result = Jugador.FILADELFIA_76ERS;
                break;
            case ("TORONTO RAPTORS"):
                result = Jugador.TORONTO_RAPTORS;
                break;
            case ("ATLANTA HAWKS"):
                result = Jugador.ATLANTA_HAWKS;
                break;
            case ("CHARLOTTE HORNETS"):
                result = Jugador.CHARLOTTE_HORNETS;
                break;
            case ("MIAMI HEATS"):
                result = Jugador.MIAMI_HEATS;
                break;
            case ("ORLANDO MAGIC"):
                result = Jugador.ORLANDO_MAGIC;
                break;
            case ("WASHINGTON WIZARDS"):
                result = Jugador.WASHINGTON_WIZARDS;
                break;
            case ("CHICAGO BULLS"):
                result = Jugador.CHICAGO_BULLS;
                break;
            case ("CLEVELAND CAVALLIERS"):
                result = Jugador.CLEVELAND_CAVALLIERS;
                break;
            case ("DETROIT PISTONS"):
                result = Jugador.DETROIT_PISTONS;
                break;
            case ("INDIANA PACERS"):
                result = Jugador.INDIANA_PACERS;
                break;
            case ("MILWAUKEE BUCKS"):
                result = Jugador.MILWAUKEE_BUCKS;
                break;
            case ("GOLDEN STATE WARRIORS"):
                result = Jugador.GOLDEN_STATE_WARRIORS;
                break;
            case ("LA CLIPPERS"):
                result = Jugador.LA_CLIPPERS;
                break;
            case ("LOS ANGELES LAKERS"):
                result = Jugador.LOS_ANGELES_LAKERS;
                break;
            case ("PHOENIX SUNS"):
                result = Jugador.PHOENIX_SUNS;
                break;
            case ("SACRAMENTO KINGS"):
                result = Jugador.SACRAMENTO_KINGS;
                break;
            case ("DENVER NUGGETS"):
                result = Jugador.DENVER_NUGGETS;
                break;
            case ("MINNESOTA TIMBERWOLVES"):
                result = Jugador.MINNESOTA_TIMBERWOLVES;
                break;
            case ("OKLAHOMA CITY THUNDER"):
                result = Jugador.OKLAHOMA_CITY_THUNDER;
                break;
            case ("PORTLAND TRAIL BLAZERS"):
                result = Jugador.PORTLAND_TRAIL_BLAZERS;
                break;
            case ("UTAH JAZZ"):
                result = Jugador.UTAH_JAZZ;
                break;
            case ("DALLAS MAVERICKS"):
                result = Jugador.DALLAS_MAVERICKS;
                break;
            case ("HOUSTON ROCKETS"):
                result = Jugador.HOUSTON_ROCKETS;
                break;
            case ("MEMPHIS GRIZZLIES"):
                result = Jugador.MEMPHIS_GRIZZLIES;
                break;
            case ("NEW ORLEANS PELICANS"):
                result = Jugador.NEW_ORLEANS_PELICANS;
                break;
            case ("SAN ANTONIO SPURS"):
                result = Jugador.SAN_ANTONIO_SPURS;
                break;    
            default:
                result = 0;
                break;
        }
        this.equipo = Integer.valueOf(result);
    }

}
