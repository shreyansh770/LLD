public class Main {
    
    public static void main(String[] args){
        FileSystem file = new File("File 1");

        Directory directory = new Directory("Diretory 1");
        directory.add(file);

        directory.ls();

    }
}
