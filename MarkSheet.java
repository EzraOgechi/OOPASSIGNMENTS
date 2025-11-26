public class MarkSheet {
    public static void main(String[] args) {

        // --- Student 1 ---
        String regNumber1 = "C026-01-1136/2023";
        String fullName1 = "Ezra Ndinya Ogechi";
        int CCS2207_1 = 68, SMA2207_1 = 67, CCS2208_1 = 67, CCS2209_1 = 70, CCS2210_1 = 60, CCS2211_1 = 70, IGS2202_1 = 90;
        int total1 = CCS2207_1 + SMA2207_1 + CCS2208_1 + CCS2209_1 + CCS2210_1 + CCS2211_1 + IGS2202_1;
        double avg1 = total1 / 7.0;
        String grade1 = "A";

        // --- Student 2 ---
        String regNumber2 = "C026-01-1137/2024";
        String fullName2 = "Victor Milema";
        int CCS2207_2 = 69, SMA2207_2 = 68, CCS2208_2 = 68, CCS2209_2 = 71, CCS2210_2 = 61, CCS2211_2 = 71, IGS2202_2 = 91;
        int total2 = CCS2207_2 + SMA2207_2 + CCS2208_2 + CCS2209_2 + CCS2210_2 + CCS2211_2 + IGS2202_2;
        double avg2 = total2 / 7.0;
        String grade2 = "A";

        // --- Student 3 ---
        String regNumber3 = "C026-01-1213/2025";
        String fullName3 = "John Peterson";
        int CCS2207_3 = 67, SMA2207_3 = 68, CCS2208_3 = 58, CCS2209_3 = 70, CCS2210_3 = 62, CCS2211_3 = 72, IGS2202_3 = 80;
        int total3 = CCS2207_3 + SMA2207_3 + CCS2208_3 + CCS2209_3 + CCS2210_3 + CCS2211_3 + IGS2202_3;
        double avg3 = total3 / 7.0;
        String grade3 = "B";

        // --- Student 4 ---
        String regNumber4 = "C026-01-2139/2026";
        String fullName4 = "Peter Peterson";
        int CCS2207_4 = 67, SMA2207_4 = 78, CCS2208_4 = 58, CCS2209_4 = 78, CCS2210_4 = 72, CCS2211_4 = 77, IGS2202_4 = 98;
        int total4 = CCS2207_4 + SMA2207_4 + CCS2208_4 + CCS2209_4 + CCS2210_4 + CCS2211_4 + IGS2202_4;
        double avg4 = total4 / 7.0;
        String grade4 = "A";

        // --- Student 5 ---
        String regNumber5 = "C026-01-3139/2027";
        String fullName5 = "James Peter";
        int CCS2207_5 = 60, SMA2207_5 = 76, CCS2208_5 = 59, CCS2209_5 = 67, CCS2210_5 = 70, CCS2211_5 = 79, IGS2202_5 = 91;
        int total5 = CCS2207_5 + SMA2207_5 + CCS2208_5 + CCS2209_5 + CCS2210_5 + CCS2211_5 + IGS2202_5;
        double avg5 = total5 / 7.0;
        String grade5 = "A";

        // --- Output Section ---
        System.out.println("===========================================================================================================================================================");
        System.out.println("Reg No.\t\t\tFull Name\t\t\tCCS2207\tSMA2207\tCCS2208\tCCS2209\tCCS2210\tCCS2211\tIGS2202\tXX\t\tTotal\t\tAverage\t\tGrade");
        System.out.println("===========================================================================================================================================================");

        System.out.println(regNumber1 + "\t" + fullName1 + "\t" + CCS2207_1 + "\t" + SMA2207_1 + "\t" + CCS2208_1 + "\t" + CCS2209_1 + "\t" + CCS2210_1 + "\t" + CCS2211_1 + "\t" + IGS2202_1 + "\tXX\t\t" + total1 + "\t\t" + avg1 + "\t\t" + grade1);
        System.out.println(regNumber2 + "\t" + fullName2 + "\t\t" + CCS2207_2 + "\t" + SMA2207_2 + "\t" + CCS2208_2 + "\t" + CCS2209_2 + "\t" + CCS2210_2 + "\t" + CCS2211_2 + "\t" + IGS2202_2 + "\tXX\t\t" + total2 + "\t\t" + avg2 + "\t\t" + grade2);
        System.out.println(regNumber3 + "\t" + fullName3 + "\t\t" + CCS2207_3 + "\t" + SMA2207_3 + "\t" + CCS2208_3 + "\t" + CCS2209_3 + "\t" + CCS2210_3 + "\t" + CCS2211_3 + "\t" + IGS2202_3 + "\tXX\t\t" + total3 + "\t\t" + avg3 + "\t\t" + grade3);
        System.out.println(regNumber4 + "\t" + fullName4 + "\t\t" + CCS2207_4 + "\t" + SMA2207_4 + "\t" + CCS2208_4 + "\t" + CCS2209_4 + "\t" + CCS2210_4 + "\t" + CCS2211_4 + "\t" + IGS2202_4 + "\tXX\t\t" + total4 + "\t\t" + avg4 + "\t\t" + grade4);
        System.out.println(regNumber5 + "\t" + fullName5 + "\t\t" + CCS2207_5 + "\t" + SMA2207_5 + "\t" + CCS2208_5 + "\t" + CCS2209_5 + "\t" + CCS2210_5 + "\t" + CCS2211_5 + "\t" + IGS2202_5 + "\tXX\t\t" + total5 + "\t\t" + avg5 + "\t\t" + grade5);

        System.out.println("===========================================================================================================================================================");
    }
}

