package Implementacao;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        Notebook notebookDell = director.construirNotebookDell();
        notebookDell.getAll();

        System.out.println("//////////////////////////////////////////////////////");

        Notebook notebookSamsung = director.construirNotebookSamsung();
        notebookSamsung.getAll();


    }
}
