import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Trapezoid {
    public static void main(String[] args) {
        String namafile = "C:\\Users\\ACER\\IdeaProjects\\Uaspl\\src\\trapezoid.csv";
        String file = "C:\\Users\\ACER\\IdeaProjects\\Uaspl\\src\\Kelilingbase.txt";
        List<luas> zr = new ArrayList<>();
        try {
            BufferedReader sr = new BufferedReader(new FileReader(namafile));
            String line;
            sr.readLine();
            while ((line = sr.readLine()) != null) {
                String[] split = line.split(",");
                luas trapesium = new luas(split[0],split[1], split[2] );
                zr.add(trapesium);

            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        for (luas luas : zr) {
            System.out.println(luas.Keliling());
        }
        zr.sort(Comparator.comparing(luas::Keliling));
        try(FileWriter fw = new FileWriter(file)){
            for (luas luas : zr){
                fw.write(luas.Keliling() + "\n");
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
