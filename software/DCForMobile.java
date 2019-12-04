package software;

/**
 * ClassName: DCForMobile
 * Description:
 * date: 2019/12/4 19:19
 *
 * @author JiaLeZhuang
 */

public class DCForMobile implements DC{
    final private int dc=20;
    @Override
    public int outputDC() {
        return dc;
    }
}
