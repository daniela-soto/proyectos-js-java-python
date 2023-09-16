def calcularPerimetro (lado):
    perimetro = lado*4
    return perimetro

lado_cuadrado = int(input("ingresa la longitud de un lado del cuadrado: "))


print("El perimetro del cuadrado es: ",  calcularPerimetro(lado_cuadrado))