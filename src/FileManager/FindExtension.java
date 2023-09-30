package FileManager;

import java.util.HashMap;
import java.util.Map;

public class FindExtension {
    public static String getExtension(String fileName){
        int dot = fileName.lastIndexOf(".");
        if(dot > 0 && dot < fileName.length()-1){
            return fileName.substring(dot);
        }
        return "";
    }
    public static String getExtensionKind(String ExtensionName){
        Map<String,String> extensionToName = new HashMap<>();

        // Video Extensions
        extensionToName.put(".mp4", "Movies");
        extensionToName.put(".avi", "Movies");
        extensionToName.put(".mkv", "Movies");
        extensionToName.put(".mov", "Movies");
        extensionToName.put(".wmv", "Movies");
        extensionToName.put(".flv", "Movies");
        extensionToName.put(".webm", "Movies");
        extensionToName.put(".m4v", "Movies");
        extensionToName.put(".3gp", "Movies");
        extensionToName.put(".mpeg", "Movies");
        extensionToName.put(".mpg", "Movies");
        extensionToName.put(".rm", "Movies");
        extensionToName.put(".swf", "Movies");
        extensionToName.put(".vob", "Movies");
        extensionToName.put(".ogv", "Movies");
        extensionToName.put(".divx", "Movies");
        extensionToName.put(".rmvb", "Movies");
        extensionToName.put(".ts", "Movies");
        extensionToName.put(".f4v", "Movies");
        extensionToName.put(".h264", "Movies");
        extensionToName.put(".m2ts", "Movies");
        extensionToName.put(".mts", "Movies");
        extensionToName.put(".dv", "Movies");
        extensionToName.put(".3g2", "Movies");

        // Audio Extensions
        extensionToName.put(".mp3", "Music");
        extensionToName.put(".wav", "Music");
        extensionToName.put(".flac", "Music");
        extensionToName.put(".m4a", "Music");
        extensionToName.put(".ogg", "Music");
        extensionToName.put(".wma", "Music");
        extensionToName.put(".aac", "Music");
        extensionToName.put(".ac3", "Music");
        extensionToName.put(".aiff", "Music");
        extensionToName.put(".amr", "Music");
        extensionToName.put(".au", "Music");
        extensionToName.put(".mid", "Music");
        extensionToName.put(".midi", "Music");
        extensionToName.put(".mp2", "Music");
        extensionToName.put(".ra", "Music");
        extensionToName.put(".tta", "Music");
        extensionToName.put(".ape", "Music");
        extensionToName.put(".opus", "Music");
        extensionToName.put(".pcm", "Music");

// PowerPoint Extensions
        extensionToName.put(".ppt", "PPTs");
        extensionToName.put(".pptx", "PPTs");
        extensionToName.put(".pps", "PPTs");
        extensionToName.put(".ppsx", "PPTs");
        extensionToName.put(".odp", "PPTs");
        extensionToName.put(".key", "PPTs");

// Excel Extensions
        extensionToName.put(".xls", "Xls");
        extensionToName.put(".xlsx", "Xls");
        extensionToName.put(".xlsb", "Xls");
        extensionToName.put(".xlsm", "Xls");
        extensionToName.put(".xlt", "Xls");
        extensionToName.put(".xltx", "Xls");
        extensionToName.put(".xltm", "Xls");
        extensionToName.put(".ods", "Xls");
        extensionToName.put(".csv", "Xls");

        // Text Extensions
        extensionToName.put(".txt", "Text");
        extensionToName.put(".pdf", "Text");
        extensionToName.put(".doc", "Text");
        extensionToName.put(".docx", "Text");
        extensionToName.put(".odt", "Text");
        extensionToName.put(".rtf", "Text");
        extensionToName.put(".html", "Text");
        extensionToName.put(".htm", "Text");
        extensionToName.put(".xml", "Text");

        // Image Extensions
        extensionToName.put(".jpg", "Images");
        extensionToName.put(".jpeg", "Images");
        extensionToName.put(".png", "Images");
        extensionToName.put(".gif", "Images");
        extensionToName.put(".bmp", "Images");
        extensionToName.put(".tiff", "Images");
        extensionToName.put(".tif", "Images");
        extensionToName.put(".webp", "Images");
        extensionToName.put(".svg", "Images");
        extensionToName.put(".eps", "Images");
        extensionToName.put(".raw", "Images");
        extensionToName.put(".psd", "Images");
        extensionToName.put(".ai", "Images");

        if(extensionToName.containsKey(ExtensionName)){
            return extensionToName.get(ExtensionName);
        }
        return  null;
    }
}
