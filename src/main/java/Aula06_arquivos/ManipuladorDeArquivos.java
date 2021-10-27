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

    }
