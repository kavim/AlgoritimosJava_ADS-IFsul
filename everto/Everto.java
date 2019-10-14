import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.util.*;

public class Everto {

    public static void main(String[] args) throws IOException {

        System.out.println(" - - - - - - - SISTEMINHA - - - - - - -");

        Opt();
    }

    public static void Opt() throws IOException {
        Scanner ler = new Scanner(System.in);
        String currentDirectory = System.getProperty("user.dir");

        System.out.println("1 - ler || 2 - Listar: || 3 - CRIAR");
        int opt = ler.nextInt();

        switch (opt) {
        case 1:
            System.out.printf("LER \n\n");
            lerArquivo();
            break;
        case 2:
            System.out.printf("LISTANDO..\n\n");
            listarArquivo(currentDirectory);
            break;
        case 3:
            System.out.printf("CRIANDO..\n\n");
            create();
            break;
        case 4:
            System.exit(1);
            break;
        default:
            Opt();
            break;

        }
    }

    public static void create() throws IOException {
        String nome = "", sobre = "", tel = "", email = "", tipo = "";
        int doc = 0;
        double valor = 0.0;
        boolean bdb = false;
        Scanner in = new Scanner(System.in);

        try {

            System.out.print("nome:");
            nome = in.nextLine();

            System.out.print("sobre:");
            sobre = in.nextLine();

            System.out.print("tel:");
            tel = in.nextLine();

            System.out.print("email:");
            email = in.nextLine();

            System.out.print("tipo:");
            tipo = in.nextLine();

            System.out.print("rg ou cedula:");
            doc = in.nextInt();

            System.out.print("DEPOSITO INICIAL:");
            valor = new Scanner(System.in).nextDouble();

            bdb = true;
        } catch (InputMismatchException e) {
            System.out.println("tipo errado de dado: ");
            Opt();
        } catch (NoSuchElementException e) {
            System.out.println("tu fez merda viste: ");
            Opt();
        } finally {

            if (bdb == true) {
                System.out.println("conta criada com sucesso");
                System.out.println("---------------------------------------------------");
                System.out.println(nome);
                System.out.println(sobre);
                System.out.println(tel);
                System.out.println(email);
                System.out.println(tipo);
                System.out.println(doc);
                System.out.println(valor);
                System.out.println("---------------------------------------------------");

                String currentDirectory = System.getProperty("user.dir");
                System.out.println("diretorio" + currentDirectory);

                int Conta = (int) (100 + Math.random() * 1000);

                FileWriter arq = new FileWriter(currentDirectory + "/" + Conta + "_" + sobre + "_" + nome + ".txt");
                PrintWriter gravarArq = new PrintWriter(arq);

                gravarArq.printf("+------------Conta------------+%n");

                gravarArq.println("Conta " + Conta);
                gravarArq.println(nome);
                gravarArq.println(tel);
                gravarArq.println(email);
                gravarArq.println(tipo);
                gravarArq.println(doc);
                gravarArq.println(valor);
                gravarArq.printf("\n\n+------------ fim ------------+%n");
                arq.close();
            }

        }
        Opt();
        in.close();

    }

    public static void lerArquivo() throws IOException {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome de arquivo texto:\n");
        String nomedoarq = ler.nextLine();

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            String currentDirectory = System.getProperty("user.dir");
            FileReader arq = new FileReader(currentDirectory + "/" + nomedoarq);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        Opt();
    }

    public static void listarArquivo(String currentDirectory) throws IOException {

        Path path = Paths.get(currentDirectory + "/");

        if (Files.exists(path)) {
            // DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            DirectoryStream<Path> dirStream = Files.newDirectoryStream(path);
            for (Path p : dirStream) {
                System.out.println(p);
            }
        } else {
            System.out.printf("nao");
        }

        Opt();
    }

}