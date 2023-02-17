package GenealogicalTree;

import java.util.*;
import java.io.*;
import java.lang.String;
import java.lang.Integer;


public class Main{
    /**
     * @param args
     */
    public static void main(String[] args){
        
        
    
        Human human1 = new Human("Ivanenko","Aleks","male",1945);
        Human human2 = new Human("Ivanenko","Aleksandra","female",1948);
        Human human3 = new Human("Fedoruk","Andrey","male",1947);
        Human human4 = new Human("Fedoruk","Anna","female",1950);
        Human human5 = new Human("Ivanenko","Denis","male",1985);
        Human human6 = new Human("Ivanenko","Alla","female",1987);
        Human human7 = new Human("Fedoruk","Gennadiy","male",1979);
        Human human8 = new Human("Fedoruk","Inna","female",1981);
        Human human9 = new Human("Ivanenko","Oleg","male",2010);
        Human human10 = new Human("Fedoruk","Olga","female",2015);

                
            

            ArrayList<String> surnameL = new ArrayList<>();
            surnameL.add(human1.getSurname());
            surnameL.add(human2.getSurname());
            surnameL.add(human3.getSurname());
            surnameL.add(human4.getSurname());
            surnameL.add(human5.getSurname());
            surnameL.add(human6.getSurname());
            surnameL.add(human7.getSurname());
            surnameL.add(human8.getSurname());
            surnameL.add(human9.getSurname());
            surnameL.add(human10.getSurname());


            ArrayList<String> nameL = new ArrayList<>();
            nameL.add(human1.getName());
            nameL.add(human2.getName());
            nameL.add(human3.getName());
            nameL.add(human4.getName());
            nameL.add(human5.getName());
            nameL.add(human6.getName());
            nameL.add(human7.getName());
            nameL.add(human8.getName());
            nameL.add(human9.getName());
            nameL.add(human10.getName());

            ArrayList<Integer> birthTimeList = new ArrayList<>();
            birthTimeList.add(human1.getBirthTime());
            birthTimeList.add(human2.getBirthTime());
            birthTimeList.add(human3.getBirthTime());
            birthTimeList.add(human4.getBirthTime());
            birthTimeList.add(human5.getBirthTime());
            birthTimeList.add(human6.getBirthTime());
            birthTimeList.add(human7.getBirthTime());
            birthTimeList.add(human8.getBirthTime());
            birthTimeList.add(human9.getBirthTime());
            birthTimeList.add(human10.getBirthTime());
            
            ArrayList<String> genders = new ArrayList<>();
            genders.add(human1.getGender());
            genders.add(human2.getGender());
            genders.add(human3.getGender());
            genders.add(human4.getGender());
            genders.add(human5.getGender());
            genders.add(human6.getGender());
            genders.add(human7.getGender());
            genders.add(human8.getGender());
            genders.add(human9.getGender());
            genders.add(human10.getGender());

            List<Human> humans = new ArrayList<>(Arrays.asList(human1,human2,human3,human4,human5,human6,human7,human8,human9,human10));
                
            System.out.println(humans);
            System.out.println();

            try(FileOutputStream note =new FileOutputStream("humans.txt");
            PrintStream printStream = new PrintStream(note))
            {
            printStream.println(humans);
        
            System.out.println("Список есть в файле.");
            System.out.println();
            }
            catch(IOException ex){
        
            System.out.println(ex.getMessage());
            }  

            System.out.println("Enter 1- grandfathers; 2- grandmothers; 3- fathers; 4- mothers; 5- boys; 6- girls, 7- Ivanenkovi, 8-Fedoruki.");
            Scanner scan = new Scanner(System.in);
            int parametr = scan.nextInt();
            scan.close();
            



        if(parametr == 1){
            for(int i=0; i<birthTimeList.size(); i++){
                if(birthTimeList.get(i) >= 1945 && birthTimeList.get(i) <= 1978 && genders.get(i) == "male"){
                System.out.print("\n"+"Grandfather"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                }
            }
            
        }
        if(parametr == 2){
            for(int i=0; i<birthTimeList.size(); i++){
                if(birthTimeList.get(i) >= 1945 && birthTimeList.get(i) <= 1978 && genders.get(i) == "female"){
                System.out.print("\n"+"Grandmother"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                }
            }
        }
        if(parametr == 3){
             for(int i=0; i<birthTimeList.size(); i++){
                 if(birthTimeList.get(i) >= 1979 && birthTimeList.get(i) <= 2000 && genders.get(i) == "male"){
                    System.out.print("\n"+"Father"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                 }
             }
        }
        if(parametr == 4){
              for(int i=0; i<birthTimeList.size(); i++){
                 if(birthTimeList.get(i) >= 1979 && birthTimeList.get(i) <= 2000 && genders.get(i) == "female"){
                    System.out.print("\n"+"Mother"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                 }
              }
         }
         if(parametr == 5){
              for(int i=0; i<birthTimeList.size(); i++){
                 if(birthTimeList.get(i) >= 2001 && genders.get(i) == "male"){
                    System.out.print("\n"+"ChildBoy"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                  }
               }
          }
          if(parametr == 6){
              for(int i=0; i<birthTimeList.size(); i++){
                  if(birthTimeList.get(i) >= 2001 && genders.get(i) == "female"){
                    System.out.print("\n"+"ChildGirl"+": "+birthTimeList.get(i)+" year"+" "+surnameL.get(i)+" "+nameL.get(i));
                  }
              }
          }
          if(parametr == 7){
                System.out.print("Ivanenkovi: ");
                for(int i =0; i< birthTimeList.size();i++){
                    if(surnameL.get(i)=="Ivanenko"){
                    System.out.print("\n"+ surnameL.get(i)+" "+nameL.get(i)+" - "+birthTimeList.get(i)+"г.");
                    }
                }
           }
           if(parametr == 8){
                System.out.print("Fedoruki: ");
                for(int i =0; i< birthTimeList.size();i++){
                    if(surnameL.get(i)=="Fedoruk"){
                    System.out.print("\n"+ surnameL.get(i)+" "+nameL.get(i)+" - "+birthTimeList.get(i)+"г.");
                    }
                }
            }
    }
}
