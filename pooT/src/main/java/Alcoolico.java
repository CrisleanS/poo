//nome: Crislean Santos Martins ra: 1913280

public class Alcoolico extends Lata{
    
    private Double teorA;
    private String sensacaoA;
    private String preparo;

//Polimorfismo por sobrescrita
    public void impDados(){
        System.out.println("\nid: "+getId());
        System.out.println("ome: "+getNome());
        System.out.println("quantidade: "+getQtd());
        System.out.println("preco: "+getPreco());
        System.out.println("fabricante: "+getFab().getNomeF());
        System.out.println("tipo de bebida "+getTipo());
        System.out.println("teor alcoolico: "+getTeorA());        
        System.out.println("sensacao apos beber: "+getSensacaoA());
        System.out.println("tipo de confeccao da bebida: "+getPreparo());
    }
    public void impDadosInter(){
        System.out.println("implementendo interface");
    }
    

    public Double getTeorA(){
        return teorA;
    }
    public String getSensacaoA(){
        return sensacaoA;
    }
    public String getPreparo(){
        return preparo;
    }

    public void setTeorA(Double teorA){
        this.teorA = teorA;
    }
    public void setSensacao(String sensacaoA){
        this.sensacaoA = sensacaoA;    
    }
    public void setPreparo(String preparo){
        this.preparo = preparo;    
    }
}
