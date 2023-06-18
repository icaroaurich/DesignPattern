package Implementacao;

public class Director{

    public Notebook construirNotebookDell(){
        ConcrectBuilderNotebook construirNotebook = new ConcrectBuilderNotebook();
        construirNotebook.tela("Tela integrada na construção do equipamento");
        construirNotebook.teclado("Teclado com numpad, bt power integrado");
        construirNotebook.mouse("touchpad bom, confia");
        construirNotebook.alimentacao("Bateria removível + fonte");
        construirNotebook.webcam("Integrada, tapada com fita isolante");

        Notebook notebook = construirNotebook.getNotebook();

        return notebook;
    }

    public Notebook construirNotebookSamsung(){
        ConcrectBuilderNotebook construirNotebook = new ConcrectBuilderNotebook();
        construirNotebook.tela("Tela integrada na construção do equipamento");
        construirNotebook.teclado("Teclado basicão, bt power separado do teclado");
        construirNotebook.mouse("touchpad bom, confia");
        construirNotebook.alimentacao("Bateria removível + fonte");
        construirNotebook.webcam("Integrada, tapada com fita isolante");

        Notebook notebook = construirNotebook.getNotebook();

        return notebook;
    }

    
}
