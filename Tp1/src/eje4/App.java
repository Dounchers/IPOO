package eje4;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Crear artículos
        Artículo articulo1 = new Artículo(10, 100); // peso: 10, precio: 100
        articulo1.setNombre("Articulo 1");
        articulo1.setVencimiento(new Date());

        Artículo articulo2 = new Artículo(20, 200); // peso: 20, precio: 200
        articulo2.setNombre("Articulo 2");
        articulo2.setVencimiento(new Date());

        // Crear una caja y agregar artículos
        Caja caja = new Caja();
        caja.agregarArticulo(articulo1);
        caja.agregarArticulo(articulo2);

        // Crear un contenedor y agregar la caja
        Contenedor contenedor = new Contenedor();
        contenedor.setId(1);
        contenedor.setPaisDestino("Argentina");
        contenedor.setPesoMax(100);
        
        contenedor.agregarProducto(caja);

        // Crear una empresa y agregar el contenedor
        Empresa empresa = new Empresa();
        empresa.setNombre("Mi Empresa");
        empresa.setDireccion("Calle Falsa 123");
        
        empresa.agregarContenedor(contenedor);

        // Mostrar resultados
        System.out.println("Peso del contenedor: " + empresa.pesoContenedor(contenedor)); // Debería mostrar la suma de los pesos de los artículos
        System.out.println("Valor del contenedor: " + empresa.valorDeLosArticulos(contenedor)); // Debería mostrar la suma de los precios de los artículos
        System.out.println("Peso total de todos los contenedores: " + empresa.pesoContenedores()); // Suma de todos los pesos de los contenedores
        System.out.println("Valor total de todos los artículos en todos los contenedores: " + empresa.valorDeTodosLosArticulo()); // Suma de todos los precios de los artículos en todos los contenedores
    }
}
