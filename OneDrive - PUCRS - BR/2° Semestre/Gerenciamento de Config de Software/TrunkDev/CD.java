import java.util.ArrayList;

class CD extends Colecionaveis{
    private String generoMusical;
    private String[] faixas;

    public CD(int id, String nome, int data, ArrayList<String> autores, String generoMusical,String[] faixas) {
        super(id, nome, data, autores);
        this.generoMusical = generoMusical;
        this.faixas = faixas;
    }
}


