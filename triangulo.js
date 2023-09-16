//Area triangulo
function triangulo() {
    let base = prompt("Introduce el valor de la base: ");
    let altura = prompt("Introduce el valor de la altura: ");
    let area;

    area = (base * altura)/2;

    console.log("El resultado del area del triangulo es: " + area + "cm²");

}

triangulo();