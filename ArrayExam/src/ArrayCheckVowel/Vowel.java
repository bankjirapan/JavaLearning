
package ArrayCheckVowel;

/**
 *
 * @author bankcom
 */
public class Vowel {
    
    public static void main(String[] args) {
        
        
        String[] vowel = {"a","e","b","d","h","c","u"};
        
        int a=0,e=0,I=0,o=0,u=0;
        
        for(int i=0; i<vowel.length; i++){
            if(vowel[i].equalsIgnoreCase("a")){
                a++;
            } else if(vowel[i].equalsIgnoreCase("i")){
                e++;
            } else if(vowel[i].equalsIgnoreCase("o")){
                I++;
            } else if(vowel[i].equalsIgnoreCase("u")){
                u++;
            }
        }
        
     
    
        
        
    }
    
}
