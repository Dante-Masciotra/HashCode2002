import java.io.*;
import java.util.*;
class reading{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        String [] projectDetails;//0 for people, 1 for number of projects
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        projectDetails = br.readLine().trim().split(" ");
        Contributor [] contributors = new Contributor[Integer.parseInt(projectDetails[0])];
        for(int c = 0 ; c== Integer.parseInt(projectDetails[0]);c++){
            String name = "";
            String buf = "";
            int skillNumber;
            while(!br.equals(' ')){
                name = name+br.read();
            }
            while(!br.equals(' ')){
                buf = buf+br.read();
            }
            skillNumber= Integer.parseInt(buf);

            String [] skills = new String [skillNumber];
            int [] level = new int [skillNumber];
            for(int w = 0 ; w == skillNumber;w++ ){
                while(!br.equals(' ')){
                    skills[w] = skills[w]+br.read();
                }
                while(!br.equals(' ')){
                    buf = buf+br.read();
                }
                level[w] = Integer.parseInt(buf);
            }
            contributors[c] = new Contributor(name,skillNumber,skills,level);
            

        }
    }
}
    
