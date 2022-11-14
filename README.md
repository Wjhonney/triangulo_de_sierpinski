# Triângulo de Sierpinski
 O Triângulo de Sierpinski é um exemplo de fractal autossimilar, é uma figura que necessita de uma pilha de processos ou de alguma estrutura de dados auxiliar, similar a pilha de processos.
 
## Como mudar o nível?
 Para mudar o nível máximo do triangulo basta mudar a chamada de função na linha 30 da classe desenho </br>
 `criaTrianguloRecu(g, 0, 5, 0, ordenada, abscissa / 2, 0, abscissa, ordenada);` </br>
 o terceiro argumento diz o nível máximo que será calculado, altere para a quantidade desejada. </br>
## O triângulo mostrado pode não ser uma representação fiel do número digitado!
É importante ressaltar que apesar da máquina calcular até o último nível digitado, o triangulo pode não ser mostrado até esse nível. Isso acontece pois a área preta tende ao "0", porém nunca será "0". A premissa anterior somada ao fato de que não existem pontos de píxeis "infinitesimais", isso é de pontos de píxeis de dimensões infinitesimais, provam que não haverá uma representação homogênea do triângulo branco.
