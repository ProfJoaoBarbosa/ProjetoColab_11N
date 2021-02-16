// --- PSI M17B - projeto para trabalho autónomo, 12 e 15 de fevereiro
// O que é necessário fazer (página 5 do PDF das aulas 151 e 152):
// - aceitar o convite para colaborar no repositório deste projeto.
// - clonar o repositório com o NetBeans.
// - fazer alterações ao projeto no NetBeans, de acordo com as indicações dadas
//   no próprio projeto - VER main().

// Depois:
// - atualizar o repositório local – Team | Commit...
// - enviar o código para o repositório remoto – Team | Remote | Push…
package projetocolab;

public class Main {

    public static void main(String[] args) {
        Retangulo[] poligonos = new Retangulo[20];
        
        poligonos[0] = new Retangulo("a00000", 4, 3);
        System.out.println(poligonos[0]);
        
        // O que deve ser acrescentado ao código:
        // - na prática, repetir o código das linhas 18 e 19, mas instanciando
        //   um novo elemento do array, sem ser o de índice 0;
        // - no primeiro atributo, relativo ao nome, deve ser colocado o
        //   vosso «nome de utilizador» da conta da escola (a00000 no exemplo);
        // - para os atributos da largura e altura devem usar quaisquer valores
        //   diferentes dos já usados.
        
        // Não esquecer: depois de acrescentar o código, fazer
        //               Team | Commit
        //               Team | Remote | Push
        
        // NOVO CÓDIGO SÓ ABAIXO DESTA LINHA 
        
        // NOVO COMENTÁRIO!!!!!
        int vv = 10;
        
        // atualização.
        
        poligonos[8] = new Retangulo("a20865", 8, 6);
        System.out.println(poligonos[5]);
         
        poligonos[19] = new Retangulo("a99999", 5, 9);
        System.out.println(poligonos[5]);
                
        poligonos[5] = new Retangulo("a16799", 2, 2);
        System.out.println(poligonos[5]);
        
        poligonos[0] = new Retangulo("a20864", 4, 3);
        System.out.println(poligonos[0]);
        
        poligonos[3] = new Retangulo("a20874", 5, 8);//João Sintra
        System.out.println(poligonos[3]);
        
        poligonos[1] = new Retangulo("a20884", 3, 10); //Diogo Inês
        System.out.println(poligonos[1]);
        
        poligonos[4] = new Retangulo("a16967", 6, 9);//Francisco Furtado
        System.out.println(poligonos[4]);
        
        poligonos[7] = new Retangulo("a20881", 10, 20);//Daniel Boto
        System.out.println(poligonos[7]);
        
        poligonos[9] = new Retangulo("a20862", 15, 30);
        System.out.println(poligonos[9]);
    }
}
