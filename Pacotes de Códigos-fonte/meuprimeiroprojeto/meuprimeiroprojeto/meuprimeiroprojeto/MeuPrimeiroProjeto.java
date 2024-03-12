/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprojeto;

/**
 *
 * @author E0525973
 */
public class MeuPrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1, n2;
        int opc;
        Calculadora calc = new Calculadora();
        
        
        do {
            calc.exibirMenu();
            opc=calc.escolherOpc();
            
            if(opc >=1 && opc <=4){
                n1=calc.informarNur();
                n2=calc.informarNur();
            
            if(opc==1){
                calc.somar(n1, n2);
            }
            if(opc==2){
                calc.subtracao(n1, n2);
            }
            if(opc==3){
                calc.multiplicacao(n1, n2);
            }
            if(opc==4){
                calc.divisao(n1, n2);
            }    
        }
            if(opc<1 || opc >5){
            calc.exibirOpcInval();
            }
            if(opc==5){
            calc.sair();
            }
        }while (opc!=5);
     
    }
    
}