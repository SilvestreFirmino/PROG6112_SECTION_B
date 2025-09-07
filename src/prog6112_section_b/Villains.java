package prog6112_section_b;

class Villains extends Heroes {
    private String villainName;
    private String villainPower;
    private String villainSkills;

    public Villains(String villainName, String villainPower, String villainSkills) {
        super(villainName, villainPower, villainSkills);
        this.villainName = villainName;
        this.villainPower = villainPower;
        this.villainSkills = villainSkills;
    }

    @Override
    public void display() {
        System.out.println(villainName + " is plotting evil with power: " + villainPower);
    }

    @Override
    public void skills() {
        System.out.println(villainName + " is using " + villainSkills + " to outsmart the heroes\n");
    }

    public String getVillainName() { return villainName; }
    public String getVillainPower() { return villainPower; }
    public String getVillainSkills() { return villainSkills; }
}
