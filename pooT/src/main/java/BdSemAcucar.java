//nome: Crislean Santos Martins ra: 1913280
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdSemAcucar {
    private SemAcucar sac;
    public List<SemAcucar> bdSac = new ArrayList<SemAcucar>();
    
    public List<SemAcucar> getBdSac(){
        return bdSac;
    }
    
    public SemAcucar cadSac(SemAcucar sac){
        if(consSacId(sac) == null){
            bdSac.add(sac);
            return sac;
        }
        else{
            return null;
         }
        
    }
    
    public SemAcucar consSacId(SemAcucar sac){
        for(int i = 0; i < bdSac.size(); i++){
            if(sac.getId() == bdSac.get(i).getId()){
                return bdSac.get(i);
            }
        }
        return null;
    }
    
    public SemAcucar removeSacId(SemAcucar sac){
        sac = consSacId(sac);
        if(sac != null){
            bdSac.remove(sac);
            return null;
        }
        else{
            return null;
        }
    }
    
    public SemAcucar atualizarSacId(SemAcucar sac){
        for(int i = 0; i <bdSac.size(); i++){
            if(sac.getId() == bdSac.get(i).getId()){
                String nome = JOptionPane.showInputDialog(null, "informe os novos dados", "novos dados", 1);
                sac.setNome(nome);
                bdSac.set(i, sac);
                return bdSac.get(i);
            }
        }
        return null;
    }
    
    
}