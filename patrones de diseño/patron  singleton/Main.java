void main() {

    Singleton objeto1 = Singleton.getInstance();
    Singleton objeto2 = Singleton.getInstance();

    objeto1.mostrarMensaje();

    println();

    println("¿Es la misma instancia?");
    println(objeto1 == objeto2);

    println("HashCode objeto1: " + objeto1.hashCode());
    println("HashCode objeto2: " + objeto2.hashCode());

}