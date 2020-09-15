

package sistema.livro;


public class Publicação {
    
     Livro cap3=new Livro();
     
       public void Abrir(){
           if(cap3.isAberto()==false){
               cap3.setAberto(true);
           }
}
       
       public void Fechar(){
           if(cap3.isAberto()==true){
               cap3.setAberto(false);
           }
}
       
  
       
       
       public void AvançarPag(){
           cap3.setTotPags(+1);
}
       
       public void VoltarPag(){
            cap3.setTotPags(-1);
       }
         
       
}
