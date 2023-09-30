package FileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveManager {
    public static void Organize(String sourceDir,String fileName,String ExtensionKind) {
        Path sourceDirPath = Paths.get(sourceDir,fileName);
        Path isDirExist = Paths.get(sourceDir,ExtensionKind);
        Path destinationPath = isDirExist.resolve(fileName);

        if(!Files.exists(isDirExist)){
            try {
                System.out.print("[✅] The Folder "+ExtensionKind+" was not exist. ");
                Files.createDirectories(isDirExist);
                System.out.println("now it was created..!");
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            Files.move(sourceDirPath,destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("[→]the file "+fileName+" is moved to ["+ExtensionKind+"]");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
