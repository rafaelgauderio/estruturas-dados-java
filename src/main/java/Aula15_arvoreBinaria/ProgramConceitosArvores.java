package Aula15_arvoreBinaria;

import jdk.swing.interop.SwingInterOpUtils;

public class ProgramConceitosArvores {

    public static void main(String[] args) {
        System.out.println("\nÁRVORES" +
                "\nSão estruturas de dados NÃO-LINEAR, ou seja, podem ter mais um predecessor e successor." +
                "\nÁrvore é um tipo específico de grafo." +
                "\nNa árvore cada nó pode ter mai de um sucessor, mas apenas um predecessor." +
                "\nPrimeiro nó é a RAIZ da árvore." +
                "\nFolha é o último nó de uma árvore." +
                "\nEstruturas adequadas para representar dados organizados em HIERARQUIAS." +
                "\nExemplo: Sistemas de diretórios, árvore de vida.");

        System.out.println("\nTERMINOLOGIA" +
                "\nPAI: predecessor único de um nó." +
                "\nFILHOS: sucessores de um nó." +
                "\nGRAU: grau de um nó é o seu número de filhos." +
                "\nFOLHA: É um nó sem filhos, ou seja, grau 0. Seria o último nó da árvore" +
                "\nRAIZ é o único nó sem pai." +
                "\nSUBÁRVORE é um subconjunto de nós ligados da árvore" +
                "\nALTURA: Caminho mais longo de uma árvore. Profunidade máxima" +
                "\nRAMOS: arcos que ligam os nós" +
                "\nCOMPRIMENTO: É o número de ramos de um caminho" +
                "\nPROFUNDIDADE do nó: É o comprimento do caminho desde a raíz até esse nó" +
                "\nARIDADE: grau máximo de nó");

        System.out.println("\nÁRVORE BINÁRIA" +
                "\nPossui aridade 2" +
                "\nCada nó possui no máximo 2 filhos. 1 filho esquerdo e 1 filho direito");

    }
}
