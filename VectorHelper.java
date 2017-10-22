/**
 *<h1>VectorHelper<h1>
 * Le programme <b>VectorHelper</b> offre divers opérations sur les vecteurs,
 * (i.e le tri, la somme de deux vecteurs, l'inversement des éléments d'un vecteur, le min et max
 * et la multiplication des éléments par 2).
 * <p>
 * @author Aimene Hichem BOUZARA
 * @author fa_bouzara@esi.dz
 * @author Imene MEKIDECHE
 * @author fi_mekideche@esi.dz
 * @version 1.0
 * @since 15-10-2017
 */
public class VectorHelper {
	
	public int[] vecteur ;
	public int taille;
	
	public VectorHelper(int t){ 
		
		this.taille = t;
		this.vecteur=new int[taille];
		
	}
	
	
	
	public void TrieVecteur(int[] t){
        int taille=t.length, j , aux ;
        for(int i=1;i<taille;i++){ //on commence à 1 
            j=0 ; while (t[j]<t[i]) j++ ;
            aux = t[i];
            for(int k=i;k>j;k--) t[k]=t[k-1];
            t[j]=aux ;
        }
    }
	
	
	public int[] SommeVecteurs(int[] v1, int[] v2) throws Exception {
		
		  int t1 = v1.length;
		  int t2 = v2.length;
		  int[] v = new int[t1+t2];
		 
		 if (t1 != t2) throw new Exception("Les tailles des deux vecteurs ne sont pas pareils");
		 
		 for (int i=0;i<t1;i++) {

		   v[i]= v1[i]+ v2[i];
		 }
		 return v;
		} 	
	
	
	public void InverseVecteur(int[]tab){
		int i=tab.length;
		int[] result = new int[i];
		int j=0;
		
    	for (i=(tab.length-1);i>=0;i--){
			
		    result[j]= tab[i];
			
			j++;
		}	
		for( int k=0;k<tab.length;k++){
			tab[k]=result[k];	
		}
	}
	public  void MinMaxVecteur(int [] tab ) {
		
	       int max = tab[0];
	       int min = tab[0];
	       int taille= tab.length;
	       
	       for(int i = 1; i < taille; i++){
	        	int elem= tab[i];
	              if(elem > max)
	                max = elem;
	              if(elem < min)
	                min = elem;
	            }
			  
	      System.out.println("\n\nValeur minimale = "+min);
		  System.out.println("Valeur maximale = "+max);
	    }
		
	
	
	
	public  void Double(int[] tab){
		  
		  int t=tab.length;
	      
	         
	      for(int i = 0; i < t; i++){
	    	  
	         int elem= tab[i];
	         tab[i]=elem*2;
	         
	       }			  
		  
		  } 
	
	
	public  void Carre(int[] tab){
		  
		  int t=tab.length;
	         
	      for(int i = 0; i < t; i++){
	    	  
	         int elem= tab[i];
	         tab[i]=elem*elem;
	         
	       }			  
		  } 
}