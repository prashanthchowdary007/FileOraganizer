
// it was not used in anywere it just a thought to have. a initial stage but with out this snippet still it do greate job
// maybe in future the class file will be useful while clustering on basice of recently opend and clustering by date and year  

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
