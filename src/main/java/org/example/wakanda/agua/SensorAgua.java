package org.example.wakanda.agua;

class SensorAgua {
    private Long id;
    private String ubicacion;
    private double nivel;
    private String estado;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
