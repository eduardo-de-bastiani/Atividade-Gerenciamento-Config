import java.util.ArrayList;

public class Colecionaveis {
    private int id;
    private String nome;
    private int data;

    private ArrayList<String> autores;
    public Colecionaveis(int id, String nome, int data, ArrayList<String> autores){
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.autores = autores;
    }
}
