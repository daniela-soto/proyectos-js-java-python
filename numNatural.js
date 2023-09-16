function naturales() {
    let numFinal = parseInt(prompt ("Hasta qué numero será la cuenta?: "));
    let suma;

    suma = numFinal*(numFinal+1)/2;

    console.log("La suma de numeros naturales es: " + suma);

}

naturales();