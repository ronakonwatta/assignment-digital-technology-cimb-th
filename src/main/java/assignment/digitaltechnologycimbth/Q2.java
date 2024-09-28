package assignment.digitaltechnologycimbth;

public class Q2 {
    protected int solve(String version1, String version2) {

        String cleanV1 = removeZeroAfterDot(version1);
        String cleanV2 = removeZeroAfterDot(version2);
        double d1 = Double.valueOf(cleanV1);
        double d2 = Double.valueOf(cleanV2);
        return Double.compare(d1, d2);
    }

    protected String removeZeroAfterDot(String version) {
        Character zero = Character.valueOf('0');
        Character dot = Character.valueOf('.');
        boolean isDot = false;
        String newVersion = "";

        for (int i = 0; i < version.length(); i++) {

            if (zero.compareTo(version.charAt(i)) == 0)
                continue;

            if (dot.compareTo(version.charAt(i)) == 0)
                isDot = true;

            if(isDot == true)
            {
                isDot = false;
                continue;
            }

            newVersion = newVersion + version.charAt(i);
        }

        return newVersion;
    }

}
