package Aula06_arquivos;

import java.io.*;

public class ManipuladorDeArquivos {


        public File inicializa() {


            File arquivo = new File("C:\\meusarquivos\\nome_de_arquivo.txt");

            //verificar se o arquivo ou diretorio existe
            boolean existe = arquivo.exists();

            if (!existe) {
                try {
                    //criar o diretorio
                   //arquivo.mkdir();
                    //listar os arquivos dentro do diretórios
                    //File [] arquivos = arquivo.listFiles();
                    //deletar o arquivo
                    //arquivo.delete();
                    arquivo.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            return arquivo;
        }

        public void escreve(File arquivo, String texto, boolean sobrescrever) {
            try {
                //contrutor que recebe o objeto do tipo arquivo, instanciar o FileWriter
                //append true adiciona no final do arquivo e não sobrescreve
                FileWriter fw = new FileWriter(arquivo, !sobrescrever);
                //BufferWriter = joga o conteudo da memoria para dentro do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                //escreve o conteudo no arquivo
                bw.write(texto);
                //quebrar a linha
                bw.newLine();
                //fechar os recursos
                bw.close();
                fw.close();


            } catch (IOException e) {
                e.printStackTrace();
                //getLocalizeMessage messagem é mais remusimo que getmessge()
                System.out.println(e.getLocalizedMessage());
            }

        }

        public void leia(File arquivo) {

            try {
                //construtor que recebe o objeto do tipo arquivo
                FileReader fr = new FileReader(arquivo);
                //contrutor BufferReader recebe o File instanciado acima como parametro
                BufferedReader br = new BufferedReader(fr);

                //ficar lendo linhas enquanto houver novas linhas
                while (br.ready()) { //ler a proxima linha
                    String linha = br.readLine();
                    System.out.println(linha);
                }
                br.close();
                fr.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                //catch genérico
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        public void leiaFracao(File arquivo) {

            try {
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                while (br.ready()) {
                    String linha = br.readLine();
                    String[] pedacosDaLinha = linha.split(","); //quebrar a String com a vírgula
                    int numerador = Integer.parseInt(pedacosDaLinha[0]);
                    int denominador = Integer.parseInt(pedacosDaLinha[1]);
                    Fracao fracao = new Fracao(numerador, denominador);
                    System.out.println("Fracao\nnumerador: " + numerador);
                    System.out.println("Denominador: " + denominador);
                    System.out.println("Valor real da fração:  "+ String.format("%.2f", fracao.getValorReal()));

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                //catch genérico
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

    public void leiaPonto(File arquivo) {

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String linha = br.readLine();
                String[] pedacosDoPonto = linha.split(",");
                int x= Integer.parseInt(pedacosDoPonto[0]);
                int y = Integer.parseInt(pedacosDoPonto[1]);
                Ponto ponto1 = new Ponto(x,y);
                linha = br.readLine();
                String[] pedacosDoPonto2 = linha.split(",");
                int x2 = Integer.parseInt(pedacosDoPonto2[0]);
                int y2 = Integer.parseInt(pedacosDoPonto2[1]);
                Ponto ponto2 = new Ponto(x2, y2);

                System.out.println("Ponto1\nCoordenada X : " + ponto1.getX());
                System.out.println("Coordenada Y: " + ponto1.getY());
                System.out.println("Ponto2\nCoordenada X : " + ponto2.getX());
                System.out.println("Coordenada Y: " + ponto2.getY());
                System.out.println("Distâncias entre os pontos: " + String.format("%.2f",ponto1.distancia(ponto2)));
                ponto1.soma(ponto2);
                System.out.println("Soma dos pontos: " +ponto1);
                ponto1.subtracao(ponto2);
                ponto1.subtracao(ponto2);
                System.out.println("Subtracão dos pontos: " +ponto1);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            //catch genérico
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    }
