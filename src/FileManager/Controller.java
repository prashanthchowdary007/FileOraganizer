package FileManager;

import java.io.File;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source Directory to organize ");
        String sourceDir = sc.nextLine();
        if(sourceDir.isEmpty()){
            System.out.println("[❕] the input source is empty");
            return;
        }

        File sourceInput = new File(sourceDir);
        if(!sourceInput.exists()){
            System.out.println("[❌] The source path is not found.");
            return;
        }
        if(!sourceInput.isDirectory()){
            System.out.println("[❌] The source path is not a Directory");
            return;
        }
        if(sourceInput.isDirectory()){
           File[] srcDir = sourceInput.listFiles();
           if(srcDir != null){
               for(File file : srcDir){
                   String fileName = file.getName();
                   String nameOfExtension = FindExtension.getExtension(fileName);
                   String ExtensionKind = FindExtension.getExtensionKind(nameOfExtension);
                   if(ExtensionKind != null){
                       MoveManager.Organize(sourceDir,fileName,ExtensionKind);
                   }
               }
           }
        }
    }
}
