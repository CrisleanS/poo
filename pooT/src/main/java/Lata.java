//nome: Crislean Santos Martins ra: 1913280

public class Lata{
    
    private int id;
    private String nome;
    private int qtd;
    private Double preco;
    private Fabricante fab;
    private String tipo;

    public void impDados(){
        System.out.println("\nid: "+getId());
        System.out.println("nome: "+getNome());
        System.out.println("quantidade: "+getQtd());
        System.out.println("preco: "+getPreco());
        System.out.println("fabricante: "+getFab().getNomeF());
        System.out.println("tipo de bebida: "+getTipo());
    }

    public Lata(){
        id = 0;
        nome = "";
        qtd = 0;
        preco = 0.0;
        fab = new Fabricante();
    }

    public Fabricante getFab(){
        return fab;
    }
    public void setFab(Fabricante fab){
        this.fab = fab;
    }
    
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public int getQtd(){
        return qtd;
    }
    public Double getPreco(){
        return preco;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setId(int id){
        this.id =id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    
}