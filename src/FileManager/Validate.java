package FileManager;

import java.io.File;

public class Validate {
    public void isFolderExits(String folderName){
        File folder = new File(folderName);
        if(!folder.exists()){
            System.out.println("The"+folder.getName()+"not exist");
            if(folder.mkdir()) {
                System.out.println("Adding a folder and moving the files into the created folder");
            }
        }
    }
}
