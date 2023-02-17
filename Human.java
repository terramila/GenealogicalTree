package GenealogicalTree;



public class Human extends Person {

    private Integer birthTime;
    
    public Human(String surname,String name,String gender,Integer birthTime) {
        super(surname,name,gender);
        this.birthTime = birthTime;
    }

    
    public Integer getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Integer birthTime) {
        this.birthTime = birthTime;
    }
    
    @Override
    public String toString(){
        return "\n"+birthTime+"г. "+getSurname()+" "+getName() + "- "+getGender()+"";
        }

       
}
