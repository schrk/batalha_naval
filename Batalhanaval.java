package batalhanaval;

import java.util.Scanner;

public class Batalhanaval {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o tamanho do tabuleiro: ");
        int tam = ler.nextInt();

        int soma1, soma2, lin, col;
        float c = 0, c1 = 0, c2 = 0;
        int[][][] tabuleiro = new int[2][tam][tam];

        for(int x = 0; x < 2; x++){
            for(int i = 0; i < tam; i++){
                for(int j = 0; j < tam; j++){
                    tabuleiro[x][i][j] = 0;
                }
            }
        }
        
        if(tam <= 2 ){
            System.out.println("---------------- Jogador 1 ----------------");

            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("---------------- Jogador 2 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;

        } else if(tam <= 5 ) {
            System.out.println("---------------- Jogador 1 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("---------------- Jogador 2 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
        } else if(tam <= 7) {
            System.out.println("---------------- Jogador 1 ----------------");

            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 3: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("---------------- Jogador 2 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 3: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
        } else if(tam <= 10) {
            System.out.println("---------------- Jogador 1 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 3: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 4: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[0][lin-1][col-1] = -1;
            
            System.out.println("---------------- Jogador 2 ----------------");
            
            System.out.println("Escolha onde colocar seu Barco 1: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 2: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 3: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            
            System.out.println("Escolha onde colocar seu Barco 4: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            tabuleiro[1][lin-1][col-1] = -1;
        }

        do{

            soma1 = 0;
            soma2 = 0;
            System.out.println("----------- Tabuleiro para Jogador 1 -----------");

            for(int i = 0; i < tam; i++){
                for(int j = 0; j < tam; j++){
                    if(tabuleiro[1][i][j] == 0 || tabuleiro[1][i][j] == 1){
                        System.out.print(" | " + tabuleiro[1][i][j]); 
                    } else if(tabuleiro[1][i][j] == -1) {
                        System.out.print(" | " + (tabuleiro[1][i][j] + 1));
                    }
                }
                System.out.println(" |");
            }

            System.out.println("---------------- Jogador 1 ----------------");
            System.out.println("Ataque: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            if(tabuleiro[1][lin-1][col-1] == -1){
                tabuleiro[1][lin-1][col-1] = 1;
                System.out.println("Em Cheio!!"); 

                c1++;
            } else {
                System.out.println("Não foi dessa vez!");
            }

            System.out.println("----------- Tabuleiro para Jogador 2 -----------");
            for(int i = 0; i < tam; i++){
                for(int j = 0; j < tam; j++){
                    if(tabuleiro[0][i][j] == 0 || tabuleiro[0][i][j] == 1){
                        System.out.print(" | " + tabuleiro[0][i][j]); 
                    } else if(tabuleiro[0][i][j] == -1) {
                        System.out.print(" | " + (tabuleiro[0][i][j] + 1));
                    }
                }
                System.out.println(" |");
            }
            System.out.println("---------------- Jogador 2 ----------------");
            System.out.println("Ataque: ");
            System.out.println("Linha: ");
            lin = ler.nextInt();
            System.out.println("Coluna: ");
            col = ler.nextInt();
            if(tabuleiro[0][lin-1][col-1] == -1){
                tabuleiro[0][lin-1][col-1] = 1;
                System.out.println("Em Cheio!!");
                c2++;
            } else {
                System.out.println("Não foi dessa vez!");
            }

            for(int i = 0; i < tam; i++){
                for(int j = 0; j < tam; j++){
                    soma1 += tabuleiro[1][i][j];
                }
            }
            for(int i = 0; i < tam; i++){
                for(int j = 0; j < tam; j++){
                    soma2 += tabuleiro[0][i][j];
                }
            }
            c++;
        }while(soma1 < 0.4*tam && soma2 < 0.4*tam);

        if(c1 >= c2){
            System.out.println("------- Fim de Jogo -------");
            System.out.println("Jogador 1 venceu!");
        } else if(c2 > c1) {
            System.out.println("------- Fim de Jogo -------");
            System.out.println("Jogador 2 venceu!");
        }

        System.out.println("Jogador 1: " + c1/c*100 + "% de acertos");
        System.out.println("Jogador 2: " + c2/c*100 + "% de acertos");
    }
}