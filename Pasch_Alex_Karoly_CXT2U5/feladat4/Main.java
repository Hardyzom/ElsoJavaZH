import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        List<String> sorok = FileUtils.readLines("people.csv");
        int szamlalo = 0;
        List<String> szin = new ArrayList<>();
        
        for(String sor1 : sorok){
            if (sor1.endsWith("YELLOW")){
                szamlalo++;
                
            }
        }
        
        for(String sor1 : sorok){
            String[] tomb = sor1.split(",");
 
            
            if (szin.contains(tomb[4])){
                continue;
                
            }
            else{
                szin.add(tomb[4]);
            }
            
        }

        
        
        szin.remove(0);
        System.out.println("Colors: " + szin);
        System.out.println("The number of people whose favorite color is yellow: " + szamlalo);

        
    }
}