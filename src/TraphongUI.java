import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TraphongUI {
    private static Scanner in = new Scanner(System.in);
    private Actions command;
    private TraphngControler traphngControler;

    public TraphongUI(Actions comand) {
        this.command = command;
        this.traphngControler = traphngControler;
    }

    public String handlecommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if (this.command.equals(Actions.RB)) {
            return "Tra phong và thanh toán";
        } else if (this.command.equals(Actions.BK)) {
            return "Dat phong";
        } else {
            return " Khong hieu cau lennh";
        }
    }

    public void handleInput() {
        if (this.command.equals(Actions.RB)) {
            List<Object> list = traphongInput();
            this.traphngControler.traphong((String) list.get(1));
        } else if (this.command.equals(Actions.BK)) {
            // List<Object> list = datphongInput;
            // this.traphngControler.traphong(list.get(0), list.get(1));
        }
    }

    private List<Object> traphongInput() {
        List<Object> list = new ArrayList<>();
        System.out.println("SO PHONG");
        String sophong = in.nextLine();
        list
                .add(sophong);
        return list;
    }
}
