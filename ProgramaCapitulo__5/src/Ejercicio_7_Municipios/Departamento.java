package Ejercicio_7_Municipios;

import java.util.Vector;

/**
 * Esta clase denominada Departamento modela un departamento colombiano con un nombre y un vector de municipios.
 * @version 1.2/2020
 */
public class Departamento {
    private String nombre; // Atributo que identifica el nombre de un departamento
    private Vector<Municipio> municipios; // Atributo que identifica los municipios que pertenecen a un departamento

    /**
     * Constructor de la clase Departamento
     * @param nombre     Parámetro que define el nombre del departamento
     * @param municipios Parámetro que define los municipios que hacen parte del departamento
     */
    public Departamento(String nombre, Vector<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    /**
     * Método que devuelve el nombre del departamento
     * @return El nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que agrega un municipio al vector de municipios del departamento
     * @param municipio Parámetro que define el municipio a agregar al vector de municipios del departamento
     */
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    /**
     * Método que elimina un municipio del vector de municipios del departamento
     * @param nombre Parámetro que define el nombre del municipio a eliminar
     */
    public void eliminarMunicipio(String nombre) {
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.elementAt(i);
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break;
            }
        }
    }

    /**
     * Método que busca un municipio a partir de un nombre
     * @param nombre Parámetro que define el nombre del municipio a buscar
     */
    public void buscarMunicipio(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.elementAt(i);
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Municipio no encontrado.");
        }
    }

    /**
     * Método que busca municipios con una población mayor o igual a un valor dado como parámetro
     * @param población Parámetro que define una determinada cantidad de población
     */
    public void buscarMunicipioConPoblaciónMayor(int población) {
        boolean encontróMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.elementAt(i);
            if (municipio.getPoblación() >= población) {
                System.out.println(municipio.getNombre());
                encontróMunicipios = true;
            }
        }
        if (!encontróMunicipios) {
            System.out.println("No existen municipios con esta población");
        }
    }

    /**
     * Método que calcula el censo poblacional del departamento sumando la población de todos los municipios del departamento
     * @return La población total del departamento
     */
    public int calcularCensoPoblaciónDepartamento() {
        int totalCenso = 0;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.elementAt(i);
            totalCenso += municipio.getPoblación();
        }
        return totalCenso;
    }
}
