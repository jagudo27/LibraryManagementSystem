package autor;

/**
 * The type DTOAutor class encapsulate the details for the Autor (Author) entity.
 *
 * @version 1.1
 */
public class DTOAutor {
    private Integer id;
    private String nombre;

    /**
     * Instantiates a new Dto autor (Author).
     *
     * @param nombre the name
     */
    public DTOAutor(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets nombre.
     *
     * @return the name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Returns a string representation of the DTOAutor object.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nombre: " + nombre;
    }
}


