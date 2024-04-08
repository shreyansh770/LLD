import java.util.*;
public class Directory implements FileSystem {
    
    String name;
    List<FileSystem> files;

    public Directory(String name){
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void add(FileSystem file){
        files.add(file);
    }

    public void ls(){

        System.out.println("Directory:"+this.name);

        for(FileSystem file : files){
            file.ls();
        }
    }
}
