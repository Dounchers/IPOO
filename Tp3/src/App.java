import eje3.*;

public class App {
    public static void main(String[] args){
        EditorGrafico editor=new EditorGrafico();      
        editor.agregarFigura(new Circulo(5));
        editor.agregarFigura(new Triangulo(3, 4));
        editor.agregarFigura(new Cuadrado(5));
        editor.agregarFigura(new Rectangulo(6, 6));
        System.out.println(editor.areaCubierta());
    }
}
