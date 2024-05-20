
package domain;


public abstract class FigurasGeometrica {
    protected String tipoFigura;
    
    //Constructor
    protected FigurasGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    //Metodo abstracto
    public abstract void dibujar();
    
    //Agregamos getters y setters

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
