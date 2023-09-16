function conversion() {
    let celsius = prompt("Ingrese Grados Celsius a convertir: ");
    let fahrenheit;

    fahrenheit = (celsius * 1.8)+32;

    console.log("La conversion es: " + fahrenheit + "°F");
}

conversion();