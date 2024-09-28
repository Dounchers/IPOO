package eje3;

import java.util.ArrayList;
import java.util.List;

public class EditorGrafico{

    private List<FiguraGeometrica>figuras= new ArrayList<>();

    public float areaCubierta(){
        float sum=0;
        for(FiguraGeometrica f:figuras){
            sum+=f.area();
        }
        return sum;
    }

    public void agregarFigura(FiguraGeometrica figura){ 
        figuras.add(figura);
    }

    public void eliminarFigura(FiguraGeometrica figura){
        figuras.remove(figura);
    }

    //public void mover(int valor, String direccion):
}
