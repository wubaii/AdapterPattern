package software;

/**
 * ClassName: ChinaACAdapter
 * Description:
 * date: 2019/12/4 18:58
 *
 * @author JiaLeZhuang
 */

public class ChinaACAdapter implements ACAdapter{
    @Override
    public boolean supportAC(AC ac) {
        return ac instanceof ACInChina;
    }

    @Override
    public DCForMobile intoDC(AC ac) {
        int adapterInput =ac.outputAC();
        DCForMobile dcForMobile=new DCForMobile();
        System.out.format("适配器输入为%d,适配器输出为%d  \n",adapterInput,dcForMobile.outputDC());
        return dcForMobile;
    }
}
