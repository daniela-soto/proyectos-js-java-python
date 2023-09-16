import numpy
import sys

print("Multiplicacion de matrices")
r1 = int(input("Numero de renglones de la Matriz 1: "))
c1 = int(input("Numero de columnas de la Matriz 1: "))
r2 = int(input("Numero de renglones de la Matriz 2: "))
c2 = int(input("Numero de columnas de la Matriz 2: "))

if (c1 != r2):
    print("No se puede hacer la multiplicacion")
    sys.exit()

matriz1 = numpy.zeros((r1,c1))
matriz2 = numpy.zeros((r2,c2))
matrizr = numpy.zeros((r1,c2))

print("Introduce los elementos de la matriz 1")
for r in range(0, r1):
    for c in range (0,c1):
        matriz1 [r,c] =input("Elemento a[" + str(r+1) + "," + str(c+1) + "]")
print("Introduce los elementos de la matriz 2")
for r in range(0, r2):
    for c in range (0,c2):
        matriz2 [r,c] =input("Elemento a[" + str(r+1) + "," + str(c+1) + "]")

for r in range (0,r1):
    for c in range (0,c2):
        for k in range (0,r2):
            matrizr [r,c]+=matriz1[r,k]*matriz2[k,c]

print(matrizr)
