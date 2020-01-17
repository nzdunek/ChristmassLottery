package ChristmassApp;

public class FamilyMember {
    private String name;
    private String household;

    FamilyMember(String name, String pair) {
        this.name = name;
        this.household = pair;
    }

    public String getName() {
        return name;
    }

    String getHousehold() {
        return household;
    }

    @Override
    public String toString() {
        return name;
    }
}
