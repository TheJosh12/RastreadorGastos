public class Gasto {

    private int id;
    private String mes;
    private String descripcion;
    private Float monto;

    public Gasto() {}

    public Gasto(int id, String mes, String descripcion, Float monto) {
        this.id = id;
        this.mes = mes;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Float getMonto() { return monto; }
    public void setMonto(Float monto) { this.monto = monto; }

    @Override
    public String toString() {
       
            return String.format("| %-4d | %-10s | %-20s | $%-8.2f |", id, mes, descripcion, monto);
        
        
    }
}

