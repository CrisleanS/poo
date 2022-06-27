//nome: Crislean Santos Martins RA: 1913280

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdSemAlcool {
    private SemAlcool sa;
    public List<SemAlcool> bdSa = new ArrayList<SemAlcool>();
    
    public List<SemAlcool> getBdSa(){
        return bdSa;
    }
    
    public SemAlcool cadSa(SemAlcool sa){
        if(consSaId(sa) == null){
            bdSa.add(sa);
            return sa;
        }
        else{
            return null;
         }
        
    }
    
    public SemAlcool consSaId(SemAlcool sa){
        for(int i = 0; i < bdSa.size(); i++){
            if(sa.getId() == bdSa.get(i).getId()){
                return bdSa.get(i);
            }
        }
        return null;
    }
    
    public SemAlcool removeSaId(SemAlcool sa){
        sa = consSaId(sa);
        if(sa != null){
            bdSa.remove(sa);
            return null;
        }
        else{
            return null;
        }
    }
    
    public SemAlcool atualizarSaId(SemAlcool sa){
        for(int i = 0; i <bdSa.size(); i++){
            if(sa.getId() == bdSa.get(i).getId()){
                String nome = JOptionPane.showInputDialog(null, "informe os novos dados", "novos dados", 1);
                sa.setNome(nome);
                bdSa.set(i, sa);
                return bdSa.get(i);
            }
        }
        return null;
    }
    
    
}
