import java.util.Scanner;

public class Boostraps {
    private static Room room;
    private static Actions traphngControler;

    public static void main(String[] args) throws InterruptedException {
        TraphongUI traphongUI = new TraphongUI(traphngControler);
        TraphngControler traphngControler = new TraphngControler(room);
        Scanner in = new Scanner(System.in);
        Room room = new Room();
        System.out.println("Welcome to the luxury hotel \n(To exit type");
        while (true) {
            Thread.sleep(5000);
            displayOpition(traphngControler);
            String promt = getPrompt(traphngControler);
            System.out.println(promt);
            String rep = in.nextLine();
            String resCMD;
            if (rep.toUpperCase().equals(Actions.RB)) {
                resCMD = traphongUI.handlecommand(rep);
                System.out.println(resCMD);
            }
            // if (resCMD != null && resCMD.equals("khong hieu lenh")) {
            // traphongUI.handleInput();
            // }
        }

    }

    private static String getPrompt(TraphngControler traphngControler) {
        if (traphngControler.getRoom().traphong()) {
            return "";
        }
        return "Xac nhan" + traphngControler.getRoom().getSophong();
    }

    private static void displayOpition(TraphngControler traphngControler) {
        System.out.println("----------- MENU ----------------");
        String str = "";
        if (traphngControler.getRoom().traphong()) {
            System.out.println("Enter 1 chức năng:\n" +
                    "[BA] tra phong");
        } else {
            System.out.println("Enter 1 câu lênh:\n" + "[XN] xac nhan");
        }
    }
}
