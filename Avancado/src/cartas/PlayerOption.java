package cartas;

public enum PlayerOption {
    ONEMORE(1, "(1) - One more"),
    STOP(2, "(2) - Stop"),
    DOUBLECARD(3, "(3) - Double cards"),
    EXIT(0, "(0) - Exit");

    private int option;
    private String desc;

    PlayerOption(int option, String desc) {
        this.option = option;
        this.desc = desc;
    }

    public int getOption() {
        return option;
    }

    public String getDesc() {
        return desc;
    }

    public static PlayerOption getfromInt(int opt) {
        for(PlayerOption o : PlayerOption.values()) {
            if (o.getOption() == opt) {
                return o;
            }
        }
        return null;
    }
}
