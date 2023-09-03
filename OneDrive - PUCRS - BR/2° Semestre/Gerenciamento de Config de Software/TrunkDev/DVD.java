import java.util.ArrayList;

class DVD extends Colecionaveis{
    private String tipo;
    private int descricao;

    public DVD(int id, String nome, int data, ArrayList<String> autores, String tipo, int descricao) {
        super(id, nome, data, autores);
        this.tipo = tipo;
        this.descricao = descricao;
    }
}
