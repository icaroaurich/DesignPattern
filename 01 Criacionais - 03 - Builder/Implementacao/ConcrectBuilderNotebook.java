package Implementacao;

public class ConcrectBuilderNotebook implements Builder{
    Notebook notebook = new Notebook();
    @Override
    public void tela(String tela) {
        notebook.tela = tela;
    }

    @Override
    public void teclado(String teclado) {
        notebook.teclado = teclado;
    }

    @Override
    public void mouse(String mouse) {
        notebook.mouse = mouse;
    }

    @Override
    public void alimentacao(String alimentacao) {
        notebook.alimentacao = alimentacao;
    }

    @Override
    public void webcam(String webcam) {
        notebook.webcam = webcam;
    }

    public Notebook getNotebook(){
        return this.notebook;
    }
    
}
