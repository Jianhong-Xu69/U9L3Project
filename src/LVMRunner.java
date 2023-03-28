import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.UUID;

public class LVMRunner {

    public static ArrayList<HardDrive> hardDriveList = new ArrayList<HardDrive>();
    public static ArrayList<PhysicalVolume> physicalVolumeList = new ArrayList<PhysicalVolume>();
    public static ArrayList<VolumeGroup> volumeGroupList = new ArrayList<VolumeGroup>();
    public static ArrayList<LogicalVolumes> logicalVolumeList = new ArrayList<LogicalVolumes>();


    public static void main(String[] args) {
//        try {
//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        Scanner user = new Scanner(System.in);
        String input = "";
        System.out.println("Welcome to the LVM system.");
        while (input.equalsIgnoreCase("EXIT")){
            System.out.print("cmd#: ");
            input = user.nextLine().toLowerCase();
            if (input.contains("install")){
                hardDriveList.add(new HardDrive(UUID.randomUUID(), input.substring(8,)))
            }
        }
    }
}
