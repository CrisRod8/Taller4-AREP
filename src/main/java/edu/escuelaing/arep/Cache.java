package edu.escuelaing.arep;

import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static Cache instance;

    private static ConcurrentHashMap<String, String> cache;

    /**
     * Clase constructora
     */
    public Cache(){
        cache = new ConcurrentHashMap<String, String>();
    }

    /**
     * Sabe si un título de una película está en el caché
     * @param title Titulo de película
     * @return Retorna valor de verdad de sí la película ha sido consultada
     */
    public boolean isOnCache(String title){
        return cache.containsKey(title);
    }

    /**
     * Añade el título de una película y su información al caché
     * @param title Título de la película a añadir
     * @param json Información de la película a añadir
     */
    public void addMovie(String title, String json){
        cache.put(title, json);
    }

    /**
     * Obtiene la descripción de la película almacenada en el caché
     * @param title Titulo de la película
     * @return Información de la película
     */
    public String getMovieDescription(String title){
        return cache.get(title);
    }

    /**
     * Obtiene la instancia de caché
     * @return Instancia del respectivo caché
     */
    public static Cache getInstance() {

        if(instance == null){
            instance = new Cache();
        }
        return instance;
    }

    /**
     * Obtiene el tamaño del caché almacenado
     * @return Películas almacenadas en el caché
     */
    public int size(){
        return cache.size();
    }

    /**
     * Limpia el caché
     */
    public void clear(){cache.clear();}
}
