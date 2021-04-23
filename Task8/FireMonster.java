package Task8_18;

public class FireMonster extends Monster{
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
