Algoritmo "Anos, meses e dias"

Var

dsa,m,a,d: inteiro

Inicio

Escreva("Dias sem acidentes:")
leia(dsa)

a<- dsa div 360
m<- (dsa mod 360) div 30
d<- (dsa mod 360) mod 30

Escreva("Estamos a",a," Anos",m," Meses e",d," Dias sem acidentes")


Fimalgoritmo