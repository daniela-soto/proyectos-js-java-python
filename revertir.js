function revertir() {
    let cadena = prompt ("Escribe la palabra a invertir: ");
    
    console.log("Tu palabra es: " + cadena);
    console.log();

    let invertido = cadena.split('').reverse().join('');

    console.log("Palabra invertida: " + invertido);
    
}
revertir();