import random

def main():
    lista = []
    for indice in range(1,21):
        lista.append(random.randint(1,15))
    
    print(lista)
    lista.sort()

    print(lista)

if __name__ == '__main__':
    main()