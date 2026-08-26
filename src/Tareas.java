public class Tareas {
    private String descripcion;
    private int prioridad;


    public Tareas(String descripcion, boolean completada, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }   

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String toString() {
        return "Tarea: " + descripcion + ", Prioridad: " + prioridad;
    }

}
