import java.util.ArrayList;

class Livro extends Colecionaveis{
    private String editora;
    private int anoPublicado;

    public Livro(int id, String nome, int data, ArrayList<String> autores, String editora, int anoPublicado) {
        super(id, nome, data, autores);
        this.editora = editora;
        this.anoPublicado = anoPublicado;

    }
}
