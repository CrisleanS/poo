//nome: Crislean Santos Martins ra: 1913280

public class SemAcucar extends Lata{
    private String sensacaoSA;
    private String efeitoSA;
    private String origem;
//polimorfismo por sobrescrita
    public void impDados(){
        System.out.println("\nid: "+getId());
        System.out.println("nome: "+getNome());
        System.out.println("quantidade: "+getQtd());
        System.out.println("preco: "+getPreco());
        System.out.println("fabricante: "+getFab().getNomeF());
        System.out.println("tipo de bebida "+getTipo());
        System.out.println("sensacao apos beber: "+getSensacaoSA());
        System.out.println("efeitos apos beber: "+getEfeitoSA());
        System.out.println("origem da bebida: "+getOrigem());
    }



    
    public String getSensacaoSA(){
        return sensacaoSA;
    }
    public String getEfeitoSA(){
        return efeitoSA;
    }
    public String getOrigem(){
        return origem;
    }
    
    public void setSensacaoSA(String sensacaoSA){
        this.sensacaoSA = sensacaoSA;
    }
    public void setEfeitoSA(String efeitoSA){
        this.efeitoSA = efeitoSA;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }
    
}
