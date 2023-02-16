    package GenealogicalTree;

    import java.util.*;
    import java.io.*;
    import java.lang.String;


    class Human {
        
        public String surname;
        public String name;
        public String gender;
        public Integer birthTime; 
    
    public Human(String surname,String name,String gender,Integer birthTime) 
    {
            this.surname = surname;
            this.name = name;
            this.gender = gender;
            this.birthTime = birthTime;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    ///////////////
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        ///////////
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        ///////////
        public Integer getBirthTime() {
            return birthTime;
        }

        public void setBirthTime(Integer birthTime) {
            this.birthTime = birthTime;
        }
        ////////////
        @Override

        public String toString(){
            return "\n"+birthTime+"г. "+surname+" "+name + "- "+gender+"";
            }
        }
    public class HumanList{
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

                    
                ArrayList<Integer> birthTimeList = new ArrayList<>();
                birthTimeList.add(human1.birthTime);
                birthTimeList.add(human2.birthTime);
                birthTimeList.add(human3.birthTime);
                birthTimeList.add(human4.birthTime);
                birthTimeList.add(human5.birthTime);
                birthTimeList.add(human6.birthTime);
                birthTimeList.add(human7.birthTime);
                birthTimeList.add(human8.birthTime);
                birthTimeList.add(human9.birthTime);
                birthTimeList.add(human10.birthTime);
                

                ArrayList<String> surnameL = new ArrayList<>();
                surnameL.add(human1.surname);
                surnameL.add(human2.surname);
                surnameL.add(human3.surname);
                surnameL.add(human4.surname);
                surnameL.add(human5.surname);
                surnameL.add(human6.surname);
                surnameL.add(human7.surname);
                surnameL.add(human8.surname);
                surnameL.add(human9.surname);
                surnameL.add(human10.surname);


                ArrayList<String> nameL = new ArrayList<>();
                nameL.add(human1.name);
                nameL.add(human2.name);
                nameL.add(human3.name);
                nameL.add(human4.name);
                nameL.add(human5.name);
                nameL.add(human6.name);
                nameL.add(human7.name);
                nameL.add(human8.name);
                nameL.add(human9.name);
                nameL.add(human10.name);


                ArrayList<String> genders = new ArrayList<>();
                genders.add(human1.gender);
                genders.add(human2.gender);
                genders.add(human3.gender);
                genders.add(human4.gender);
                genders.add(human5.gender);
                genders.add(human6.gender);
                genders.add(human7.gender);
                genders.add(human8.gender);
                genders.add(human9.gender);
                genders.add(human10.gender);

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

                System.out.println("Введите 1- дедушки; 2- бабушки; 3- папы; 4- мамы; 5- мальчики; 6- девочки.");
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
        }
    }
    