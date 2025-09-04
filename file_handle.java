import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Persons implements Serializable {
    String name,reg,cout;
    public static List<Persons> persons =  new ArrayList<Persons>();

    public Persons(String name, String reg, String cout) {
        this.name = name;
        this.reg = reg;
        this.cout = cout;
    }

    public static void addpersons(String s, String r, String c) throws IOException {
        Persons p = new Persons(s,r,c);
        persons.add(p);
        FileOutputStream fos = new FileOutputStream("src/Person.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(persons);
        oos.close();
        fos.close();
    }
    public static void loadpersons() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/Person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        persons= (List<Persons>) ois.readObject();
        fis.close();
        ois.close();
    }
    public static void showperson(){
        for(Persons h: persons){
            System.out.println(h);
        }
    }


    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", reg='" + reg + '\'' +
                ", cout='" + cout + '\'' +
                '}';
    }
}





public class file_handle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persons.loadpersons();
        int check = 1;
        String pname,regno,contact;
        Scanner sc = new Scanner(System.in);
        while (check==1){
            System.out.println("1.Add Persons \n2.Display persons\n3.Exit");
            int choice =  sc.nextInt();
            switch(choice){



                case 1:
                    System.out.println("how many persons do u want to add");
                    int per = sc.nextInt();
                    for(int i=1; i<=per; i++){
                        System.out.println("Enter Name");
                        pname= sc.next();
                        System.out.println("enter Registration number");
                        regno= sc.next();
                        System.out.println("Enter the contact number");
                        contact= sc.next();
                        Persons.addpersons(pname,regno,contact);
                    }
                    break;

                case 2:
                {Persons.showperson();
                    break;}

                case 3:
                {check =0;
                    break;}
                default:
                    System.out.println("invalid input");

            }
        }

    }
}