    package aula02;

    public class Loops {

        public static void main(String [] args) {

            Loops loop = new Loops();

            String linha1 = "Era uma vez...";
            String linha2 = "Texto da linha 2";
            String linha3 = "Texto da linha 3";
            String linha4 = "Texto da linha 4";
            String linha5 = "Fim da primeira página";
            String linha6 = "Inicio da Segunda página...";
            String linha7 = "Fim da segunda página";

            //Vetor de strings
            String [] pagina = {linha1,linha2, linha3, linha4, linha5};
            System.out.println("Vetor pagina");
            loop.lerLinhasWuile(pagina);
            loop.lerLinhasFor(pagina);

            //segundo vetor de strings
            String pagina2[] = new String [5];
            pagina2[0]= linha6;
            pagina2[1]= linha2;
            pagina2[2]= linha3;
            pagina2[3]= linha4;
            pagina2[4]= linha7;

            System.out.println("\nVetor pagina2");
            loop.lerLinhasWuile(pagina2);
            loop.lerLinhasFor(pagina2);


            String [][] livro = new String[][]{pagina, pagina2};

            loop.lerMatriz(livro);


            }


        public void lerLinhasWuile(String[] linhas) {

            int linhaAtual = 0;
            int numeroLinhas = linhas.length;

            while (linhaAtual < numeroLinhas) {
                System.out.println(linhas[linhaAtual]);
                linhaAtual++;
            }

        }

        public void lerLinhasFor(String[] linhas) {
            for(int i=0; i< linhas.length ; i++) {
                System.out.println("Posição acessada:" + i + ", valor: " + linhas[i]);
            }
        }

        public String lerLinhasWhile(String carta) {
            String livro ="";
            int linha=0;
            while(linha<5) {
                livro = livro.concat(String.valueOf(carta.charAt(linha)));
                linha++;
            }
            return livro;

        }

        public char procurarLinhaFor(String carta, char caractereProcurado) {

            char linhaEncontrada = '*';

            for (int i=0 ; i<carta.length(); i++) {
                System.out.println("Posição acessada:" +i + ", valor: "+carta.charAt(i));

                if (carta.charAt(i) == caractereProcurado) {
                    linhaEncontrada =  carta.charAt(i);
                    System.out.println("Encontrou: " + linhaEncontrada);
                    break;

                }

            }

            return linhaEncontrada;

        }

        public String lerLinhasfor(String carta) {

            String livro="";
            for (int i=0; i < carta.length() ; i++) {
                System.out.println("Posição acessada:" +i + ", valor: "+carta.charAt(i));
                livro = livro.concat(String.valueOf(carta.charAt(i)));

            }

            return livro;

        }

        //método para imprimir um livro que seria um matriz de paginas com varias linhas
        public void lerMatriz(String[][] livro) {

            System.out.println("\nImpressão do livro");
            for (int linha=0; linha < livro.length; linha++) {
                for(int pagina=0;pagina<livro[linha].length; pagina++) {
                    System.out.println(livro[linha][pagina]);
                }
                System.out.println();
            }



        }


    }






