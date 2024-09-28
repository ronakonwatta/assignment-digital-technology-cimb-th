package assignment.digitaltechnologycimbth;

public class Q2 {
    protected int solve(String version1, String version2) {


        // todo ascii check

        char[] ch1 = new char[version1.length()];
        char[] ch2 = new char[version2.length()];


        for (int i = 0; i < version1.length(); i++) {
            if(("0").equals(version1.charAt(i))) continue;

            ch1[i] = version1.charAt(i);
        }

        for (int i = 0; i < version2.length(); i++) {
            if(("0").equals(version2.charAt(i))) continue;

            ch2[i] = version2.charAt(i);
        }

        String newCh1 = ch1.toString();

        // int convertVersion1 = Integer.parseInt(newCh1);
        // int convertVersion2 = Integer.parseInt(ch2.toString());

        // if (convertVersion1 < convertVersion2)
        //     return -1;
        // if (convertVersion1 > convertVersion2)
        //     return 1;

        return 0;
    }

}
