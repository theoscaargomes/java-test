package project;

public class Carro {
    
// Atributos
public String marca;
public int ano;
public int marcha;
public boolean ligado;

// Metodos
public void ligar(){

    if(this.ligado == false){
        this.ligado=true;
        System.out.println("Carro ligado.");
    }
    else{
        System.out.println("O carro ja esta ligado.");
    }


}

public void desligar(){

    if (this.ligado == true){
        System.out.println("Carro desligado.");
        this.ligado = false;

    }
    else {
        System.out.println("O carro ja está desligado.");
    }
    

}

public void trocarMarcha(){
    System.out.println("Marcha trocada.");

}

}