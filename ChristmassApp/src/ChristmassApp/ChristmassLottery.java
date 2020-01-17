package ChristmassApp;

import java.util.*;

public class ChristmassLottery {
    public static void main(String[] args) {
        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(new FamilyMember("Janina", "Meander"));
        familyMembers.add(new FamilyMember("Ewa", "Zaruby"));
        familyMembers.add(new FamilyMember("Kama", "Zaruby"));
        familyMembers.add(new FamilyMember("Marysia", "Polaka"));
        familyMembers.add(new FamilyMember("Marek", "Polaka"));
        familyMembers.add(new FamilyMember("Noela", "Loziska"));
        familyMembers.add(new FamilyMember("Filip", "Loziska"));

        HashMap<FamilyMember, FamilyMember> lotteryPairs = lottery(familyMembers);
        lotteryPairs.forEach((k, v) -> System.out.println((k + " gives a present to " + v)));
    }


    private static HashMap <FamilyMember, FamilyMember> lottery(List<FamilyMember> donors) {
        HashMap<FamilyMember, FamilyMember> lottery = new HashMap<>();

        List<FamilyMember> recipients = new ArrayList<>();
        recipients.addAll(donors);

        Collections.shuffle(recipients);

        for (int i = 0; i < donors.size(); i++) {
            FamilyMember donor = donors.get(i);
            for (int j = 0; j < recipients.size(); j++) {
                FamilyMember recipient = recipients.get(j);
                if (!donor.getHousehold().equals(recipient.getHousehold())) {
                    lottery.put(donors.get(i), recipient);
                    recipients.remove(recipient);
                    break;
                }
            }
        }
        return lottery;
    }
}
