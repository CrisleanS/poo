//nome: Crislean Santos Martins RA: 1913280

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdAlcoolico {
    private Alcoolico al;
    public List<Alcoolico> bdAl = new ArrayList<Alcoolico>();
    
    public List<Alcoolico> getBdAl(){
        return bdAl;
    }
    
    public Alcoolico cadAl(Alcoolico al){
        if(consAlId(al) == null){
            bdAl.add(al);
            return al;
        }
        else{
            return null;
         }
        
    }
    
    public Alcoolico consAlId(Alcoolico al){
        for(int i = 0; i < bdAl.size(); i++){
            if(al.getId() == bdAl.get(i).getId()){
                return bdAl.get(i);
            }
        }
        return null;
    }
    
    public Alcoolico removeAlId(Alcoolico al){
        al = consAlId(al);
        if(al != null){
            bdAl.remove(al);
            return null;
        }
        else{
            return null;
        }
    }
    
    public Alcoolico atualizarAlId(Alcoolico al){
        for(int i = 0; i <bdAl.size(); i++){
            if(al.getId() == bdAl.get(i).getId()){
                String nome = JOptionPane.showInputDialog(null, "informe os novos dados", "novos dados", 1);
                al.setNome(nome);
                bdAl.set(i, al);
                return bdAl.get(i);
            }
        }
        return null;
    }
    
    
}
