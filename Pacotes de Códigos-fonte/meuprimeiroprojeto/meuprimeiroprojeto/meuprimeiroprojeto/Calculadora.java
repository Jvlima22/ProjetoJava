/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprojeto;
import java.util.Scanner;

/**
 *
 * @author E0525973
 */
public class Calculadora {
    double n1, n2;
    int opc;
    Scanner entrada = new Scanner(System.in);
    
    public void exibirMenu(){
            System.out.println("\n* Menu Calculadora *");
            System.out.println("* 1 - Soma           *");
            System.out.println("* 2 - Subtração      *");
            System.out.println("* 3 - Multiplicação  *");
            System.out.println("* 4 - Divisão        *");
            System.out.println("* 5 - Sair  *");
            System.out.println("********");
            
    }
            
    public void exibirOpcInval(){
           System.out.println("Opção Invalida");
           
    }
    
    public void sair(){
        System.out.println("Encerrando a Calculadora");
        System.exit(0);
    }
    
    public int escolherOpc() {
        System.out.print("Escolha a opção desejada:  ");
        opc=entrada.nextInt();
        return opc;
    }
    
    public double informarNur (){
        System.out.print("Digite o número: ");
        n1=entrada.nextDouble();
        return n1;
    }
    
    public void somar(double n1, double n2){
        System.out.println(n1 +" + "+ n2+" = "+(n1+n2));
    }
    
    public void subtracao(double n1, double n2){
        System.out.println(n1 +" - "+ n2+" = "+(n1-n2));
        
    }
    
    public void multiplicacao(double n1, double n2){
        System.out.println(n1 +" * "+ n2+" = "+(n1*n2));
    }
    
    public void divisao(double n1, double n2){
        System.out.println(n1 +" / "+ n2+" = "+(n1/n2));
    }
     
  
    
    
    
    
    
    
}