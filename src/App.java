public class App {
    public static void main(String[] args) throws Exception {
        
        //Árvore binária de busca para inteiros

        BinarySearchTree<Integer> arvore = new BinarySearchTree<>();

        //Inserção dos elementos

        arvore.add(50);
        arvore.add(30);
        arvore.add(70);
        arvore.add(20);
        arvore.add(40);
        arvore.add(60);
        arvore.add(80);

        //Identificação do percurso e chamada do método preOrdem()

        System.out.println("Percurso preOrder:");
        arvore.preOrder();


    }
}