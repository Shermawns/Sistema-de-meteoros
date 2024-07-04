import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String tamanhomet, velocidademet, brilhomet;

        ArrayList<String> tamanho = new ArrayList<String>();
        ArrayList<String> velocidade = new ArrayList<String>();
        ArrayList<String> brilho = new ArrayList<String>();


        boolean escolha = false;

            System.out.println("Bem vindo ao Sistema de rastreamento de Meteoros!");

            while (escolha != true){
            System.out.println("Tamanho em metros: ");
            tamanhomet = obj.next();
            tamanho.add(tamanhomet);
            if (tamanhomet.equalsIgnoreCase("F")){
                escolha = true;
                break;
            }
            System.out.println("Velocidade em metros: ");
            velocidademet = obj.next();
                velocidade.add(velocidademet);
            if (velocidademet.equalsIgnoreCase("F")){
                escolha = true;
                break;
            }
            System.out.println("Brilho em metros: ");
            brilhomet = obj.next();
                brilho.add(brilhomet);
            if (brilhomet.equalsIgnoreCase("F")){
                escolha = true;
                break;
            }

            }

            System.out.println("Relatório dos meteoros registrados: ");

            for (int i = 0; i < tamanho.size(); i++){
                System.out.println("Meteoro " + (i+1) + ": ");
                System.out.println("Tamanho: " + tamanho.get(i));
                System.out.println("Velocidade: " + velocidade.get(i));
                System.out.println("Brilho: " + brilho.get(i));
                System.out.println();
            }

            }
        }