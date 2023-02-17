package GenealogicalTree;
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
