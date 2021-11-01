fun main(args: Array<String>) {
    val nombre = "Yanira"  //Declaramos una variable y le asignamos un valor

    /*Aqui empieza nuestra estructura de control IF
    Tenemos una prueba logica (donde preguntamos si nombre no esta vacia)
    Si esto es verdad [IF] entonces vamos a imprimer la cantidad de caracteres que hay en la variable nombre
    Si esto no es verdad [else] vamos a imprimir un mensaje de error diciendo que la variable esta vacia*/

    if (nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombre.length}")
    } else {
        println("Error, la variable se encuentra vacia")
    }


    val mensaje : String = if(nombre.length > 5){
        "Tu nombre es largo"
    } else if (nombre.isEmpty()){
        "Error, la variable se encuentra vacia"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
    /*Es un mecanismo que nos proporciona el lenguaje para evaluar condiciones que son true o false y así decidir que bloque de codigo se va a ejecutar.

    Para evaluar las condiciones con la sentencia if debemos aprender el concepto de operador condicional, este operador nos van a servir para evaluar condiciones, los operadores condicional son:

    > mayor que.
    < menor que.
    >= mayor o igual que.
    <= menor o igual que
    == igualdad.
    != desigualdad.*/

    /* OPERADORES LÓGICOS
    Con los operadores logicos podremos comparar mas de una condición.

    && operador "y": con este operador todas las condiciones tienen que ser verdaderas para que se cumpla la sentencia if.

    || operador "o": basta que se cumpla una de las condiciones para que se cumpla la sentencia if.

    ! operador "no"
     */
}

