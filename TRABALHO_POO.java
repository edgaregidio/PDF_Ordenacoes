
public class TRABALHO_POO {
	
	/*
	 * Faculdade Sul Americana
	 
	Sistemas de Informação
	Estrutura de Dados
	Clovis de Alencar, Jefferson Patrício, Edgar Egídio.
	
	“Busca e Ordenação de Vetores”
	Goiânia
	2018
	Relatório de Execução
	
	1 – Introdução
	Este relatório irá retratar sobre a busca e ordenação de vetores. O
	trabalho foi proposto pelo professor Luiz Mário Lustosa Pascoal e
	seu objetivo é ordenar, buscar palavras de 3 (três) dicionários de
	idiomas ao redor do mundo, além de computar o tempo gasto para
	cada tarefa implementada. A linguagem de programação utilizada é
	a JAVA e a ferramenta utilizada para o desenvolvimento dos
	algoritmos foi o Eclipse Neon.3.
	Para o trabalho de ordenação foi criado um pacote com cinco
	classes onde foram implementados os algoritmos:
	 SelectionSort;
	 BubbleSort;
	 InsertionSort;
	 MergeSort;
	 QuickSort;
	Para o trabalho de computação de tempo de cada tarefa foram
	utilizados os métodos:
	 System.nanoTime();
	 System.currentTimeMillis();
	Para o trabalho de busca foi criado um pacote com duas classes e
	desenvolvido os métodos:
	
	 Busca Sequencial;
	 Busca Binária;
	
	Para o trabalho de controle foi criada uma classe principal, onde
	se gerencia todos os algorítimos de busca, ordenação e
	computação de tempo de máquina.
	
	2 – Desenvolvimento (Ordenação)
	
	2.1 – SelectionSort (Ordenação por Seleção):
	Objetivo: Salvar os menores elementos nas primeiras posições do
	vetor.
	 Salva o primeiro elemento em uma variável “menor”;
	 Compara o valor da variável com todo o vetor;
	 Caso encontre um valor menor, é inserido na variável e o
	valor da variável é inserido na posição do vetor;
	 Após percorrer todo o vetor, e encontrar o menor valor, salva
	o valor da variável na primeira posição do vetor;
	 Repete-se o processo para a segunda, terceira, quarta ... N
	posições até que todo o vetor esteja ordenado.
	Vantagens: O algoritmo de ordenação mais simples.
	Desvantagens: Dependendo do tamanho do vetor, perde –se em
	desempenho.
	
	2.2 – BubbleSort (Ordenação por bolha);
	Objetivo: Flutuar o maior elemento para a última posição do vetor.
	 Compara os elementos dois a dois;
	 Compara o primeiro elemento com o segundo, o valor maior
	fica na segunda posição;
	 Compara o segundo elemento com o terceiro, o valor maior
	fica na terceira posição, e assim por diante;
	 Após percorrer todo o vetor com esse processo é comparada
	as duas últimas posições, atribuindo o maior valor a última
	posição;
	 Última posição completa, o elemento não terá sua posição
	alterada;
	 Repete-se o processo até que todo o vetor esteja ordenado.
	Vantagens: Simples de ser implementado;
	Desvantagens: Mesmo se o vetor estiver ordenado, ele fará
	comparações, atrapalhando seu desempenho.
	
	2.3 InsertionSort (Ordenação por inserção)
	Objetivo: Dividir o vetor em 2 seguimentos: Elementos ordenados e
	elementos não ordenados, após isso organizar os elementos nas
	posições.
	 Compara os elementos dois a dois;
	 Retira-se o primeiro elemento do seguimento não ordenado e
	o coloca na posição correta, dentro do seguimento de valores
	ordenados;
	 Repete-se o processo até que todos os elementos do
	seguimento não-ordenado tenham passado para o
	seguimento ordenado;
	Vantagens: Estável. Um bom método para se utilizar quando o
	vetor está “quase” ordenado.
	Desvantagens: Não é apropriado para vetores grandes, pois
	seu desempenho está na ordem n².
	
	2.4 MergeSort (Ordenação por intercalação):
	Objetivo: Dividir e tratar separadamente cada posição do vetor,
	comparar os elementos e reorganizar o vetor.
	 É recursivo;
	 Quebrar a entrada em pedaços menores até se obter 1
	elemento;
	 Trata cada pedaço separadamente;
	 Compara dois elementos e os ordena de acordo com seu
	valor;
	 Compara quatro elementos e os ordena de acordo com seu
	valor;
	 Ao final se combina os resultados parciais ordenando todo o
	vetor;
	Vantagens: Indicado para aplicações que exigem restrição de
	tempo.
	Desvantagens: Utiliza memória auxiliar.
	
	2.5 QuickSort (Ordenação por troca de partição)
	Objetivo: Dividir o vetor em duas partes, por meio de um pivô;
	 Escolhe-se um elemento aleatório, “pivô”;
	 Avança pela esquerda até achar um elemento maior que o
	pivô;
	 Retrocede pela direita até achar um elemento menor que o
	pivô;
	 Troca-se um elemento pelo outro, elemento da esquerda pelo
	elemento da direita;
	 Repete-se a troca até que os dois ponteiros apontem para um
	elemento;
	 Divide-se o vetor em elementos maior que o pivô de um lado,
	elementos menor que o pivô do outro lado;
	 Repete o processo da escolha do pivô, ordenação e quebra.
	 Os resultados são combinados para produzir um resultado
	final.
	Vantagens: É o algoritmo de ordenação interna mais rápido que se
	conhece para uma ampla variedade de situações. Provavelmente é
	o mais utilizado.
	Desvantagens: Se o pivô for escolhido arbitrariamente em um dos
	extremos do vetor, haverá queda de desempenho.
	3 - Desenvolvimento (Busca)
	
	
	3.1 Busca Binária:
	Objetivo: Dividir o vetor ordenado com o objetivo de encontrar um
	elemento x;
	 Determina-se o meio do vetor;
	 Verifica-se se o elemento do meio do vetor é igual a x, se for
	igual a busca termina;
	 Se x for menor que o elemento do meio do vetor, repete-se a
	busca na parte esquerda do vetor;
	 Se x for maior que o elemento do meio do vetor, repete-se a
	busca a direita do vetor;
	 A busca termina sem sucesso se o elemento não for
	encontrado no vetor;
	Vantagens: Realiza a busca eficientemente em vetores
	ordenados.
	Desvantagens: O vetor precisa estar ordenado.
	
	
	3.2 Busca Sequencial ou Linear:
	Objetivo: Percorrer todo o vetor com o objetivo de encontrar um
	elemento x;
	 Inicia-se a busca na primeira posição;
	 Para cada posição compara-se se o elemento é igual ou não
	ao elemento x;
	 A busca termina se for encontrada o elemento x;
	 Se a checagem percorrer todo o vetor e não for encontrado o
	elemento x, a busca termina e gera uma mensagem que não
	há o elemento x no vetor.
	Vantagens: Método de busca simples.
	Desvantagens: Compara posições desnecessárias do vetor, o
	que compromete o desempenho do algoritmo.
	4 – Desenvolvimento (Computação de Tempo)
	4.1 System.nanoTime();
	Recebe o tempo de máquina em nano segundos.
	4.2 System.currentTimeMillis();
	Recebe o tempo de máquina em milissegundos.
	4.3 setTempoMili(TempoFinal - TempoInicial);
	Considera o tempo anterior à ordenação/busca do vetor e o tempo
	posterior, é realizado a subtração do tempo final com o tempo inicial
	e pode obter o tempo em Milissegundos da ordenação do vetor.
	4.4 setTempoNano(TempoFinal - TempoInicial);
	Considera o tempo anterior à ordenação/busca do vetor e o tempo
	posterior, é realizado a subtração do tempo final com o tempo inicial
	e pode obter o tempo em Nanosegundos da ordenação do vetor.
	
	5 – Análise de Desempenho
	Após implementados e testados todos os algorítimos de busca e
	ordenação temos os seguintes resultados:
	 Algorítimos de ordenação:
	Maior velocidade: QuickSort
	Menor velocidade: Bubble Sort
	Maior complexidade: Merge Sort
	Menor complexidade: Bubble Sort
	Abaixo temos um exemplo bem aleatório de alguns testes de
	ordenação em milissegundos e nanosegundos com as cinco
	ordenações usando o dicionário English(American):
	TEMPO DE ORDENAÇÃO
	MILISSEGUNDOS NANOSEGUNDOS
	Bubble Sort 9318 9317386679
	Insertion Sort 2653 2652479612
	Selection Sort 5068 5067533637
	Merge Sort 1460 1460006158
	Quick Sort 57 56046709
	 Algoritmos de busca:
	Escolhido duas palavras aleatoriamente de cada dicionário:
	TEMPO DE BUSCA EM NANOSEGUNDOS
	PALAVRAS BINÁRIA SEQUENCIAL
	zombie/MS 6997 19383900
	steakhouse/SM 1400 25143225
	suplente/S 6532 14648608
	chirriantemente 2333 4860320
	abacaxi/B 6531 5457946
	emplastácio/B 1399 8927071
	 Dificuldades de implementação:
	As maiores dificuldades de implementação no momento do
	desenvolvimento foram nos seguintes métodos:
	Leitura de Arquivo:
	Por ser algo aprendido recentemente, foram apresentadas
	algumas dificuldades na implementação do método,
	apresentando estouro das posições do vetor e dificuldade
	na leitura do tamanho.
	Busca Binária:
	Problemas relacionados à busca binária pelo fato de não
	encontrar um método adequado para buscar Strings e pela
	falta de conhecimento em relação à ordenação do vetor,
	pois necessita estar ordenado para realizar a busca
	eficientemente.
	OBS: Os arquivos .txt contendo os dicionários necessários para
	teste do sistema se encontram dentro da pasta do projeto, sendo
	assim necessário ser extraída a pasta para algum diretório ou
	desktop. Os arquivos estão nomeados com os seguintes nomes:
	English(American)1;
	Portuguese(Brazilian)2;
	Spanish3.
	*/

}
