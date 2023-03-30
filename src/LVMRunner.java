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
        while (!input.equalsIgnoreCase("EXIT")){
            System.out.print("cmd#: ");
            input = user.nextLine().toLowerCase();
            if (input.contains("install-drive")){
//                for (HardDrive hd: hardDriveList) {
//                    if ()
//                }
                hardDriveList.add(new HardDrive(String.valueOf(UUID.randomUUID()), input.substring(input.indexOf(" ")+1, input.lastIndexOf(" ")), Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1, input.lastIndexOf("g")))));
                System.out.println("Drive " + hardDriveList.get(hardDriveList.size()-1).getName() + " installed");
                System.out.println(hardDriveList.get(hardDriveList.size()-1));
            } else if (input.contains("pvcreate")) {
                for (HardDrive hd: hardDriveList) {
                    if (input.substring(input.lastIndexOf(" ") + 1).equals(hd.getName()) && !hd.isLinked()){
                        physicalVolumeList.add(new PhysicalVolume(String.valueOf(UUID.randomUUID()), input.substring(input.indexOf(" ")+1, input.lastIndexOf(" ")), hd));
                        hd.setLinked(true);
                    }
                }
            }
        }
    }
}
