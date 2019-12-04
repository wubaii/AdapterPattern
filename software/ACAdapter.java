package software;

public interface ACAdapter {
    boolean supportAC(AC ac);
    DCForMobile intoDC(AC ac);
}
