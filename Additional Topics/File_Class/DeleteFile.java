package File_Class;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        //creates a file object
        File file = new File("File.txt");

        //deletes the file
        //if the deletion was successful, then it will return true
        boolean value = file.delete();
        if(value) System.out.println("The file is deleted");
        else System.out.println("The file is not deleted");
    }
}
