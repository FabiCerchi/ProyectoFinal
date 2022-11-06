package clinica;

import clinica.prestacion.Prestacion;
import clinica.prestacion.Turno;
import individuos.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Clinica {
    private static Clinica instance;
    private Director director;
    private ArrayList<Persona> pacientes = new ArrayList<Persona>();
    private ArrayList<Prestacion> prestaciones = new ArrayList<Prestacion>();
    private HashMap<Especialidad,ArrayList<Turno>> especialidadesConSusTurnos = new HashMap<>();

    private Clinica() {
    }

    public static Clinica getInstance() {
        if (instance == null) {
            instance = new Clinica();
        }
        return instance;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Prestacion> getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(ArrayList prestaciones) {
        this.prestaciones = prestaciones;
    }

    public ArrayList<Persona> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Persona> pacientes) {
        this.pacientes = pacientes;
    }

    public HashMap<Especialidad, ArrayList<Turno>> getEspecialidadesConSusTurnos() {
        return especialidadesConSusTurnos;
    }

    public void setEspecialidadesConSusTurnos(HashMap<Especialidad, ArrayList<Turno>> especialidadesConSusTurnos) {
        this.especialidadesConSusTurnos = especialidadesConSusTurnos;
    }

    public void agregarPrestacion(Prestacion nuevaPrestacion) {
        this.prestaciones.add(nuevaPrestacion);
    }

    public void elimnarPrestacio(Integer nroPrestacion) {
        this.prestaciones.remove(nroPrestacion);
    }

}
