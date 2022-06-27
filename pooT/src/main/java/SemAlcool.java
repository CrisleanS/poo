//nome: Crislean Santos Martins ra: 1913280

public class SemAlcool extends Lata implements ImpDados{
    private int qtdAcucar;
    private int valorEnergetico;
    private int cafeina;

    public void impDados(){
        System.out.println("\nid: "+getId());
        System.out.println("nome: "+getNome());
        System.out.println("quantidade: "+getQtd());
        System.out.println("preco: "+getPreco());
        System.out.println("fabricante: "+getFab().getNomeF());
        System.out.println("tipo de bebida: "+getTipo());
        System.out.println("quantidade de açucar em gramas: "+getQtdAcucar());
        System.out.println("valor energetico da bebida em kcal: "+getValorEnergetico());
        System.out.println("quantidade de cafeina em mg: "+getCafeina());
    }

    public int getQtdAcucar(){
        return qtdAcucar;    }
    
    public int getValorEnergetico(){
        return valorEnergetico;
    }
    public int getCafeina(){
        return cafeina;
    }
    public void setQtdAcucar(int qtdAcucar){
        this.qtdAcucar = qtdAcucar;
    }
    public void setValorEnergetico(int valorEnergetico){
        this.valorEnergetico = valorEnergetico;
    }
    
    public void setCafeina(int cafeina){
        this.cafeina = cafeina;
    }
    
    public void impDadosInt(){
        System.out.println("Vai uma coquinh ai!!!");
    }

    
}
