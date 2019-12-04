package software;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DefaultAdapterRegistry
 * Description:
 * date: 2019/12/4 19:09
 *
 * @author JiaLeZhuang
 */

public class DefaultAdapterRegistry {
    private final List<ACAdapter> adapters=new ArrayList<>();
    public DefaultAdapterRegistry(){
        this.registerACAdapter(new AmericaACAdapter());
        this.registerACAdapter(new ChinaACAdapter());
    }
    public  ACAdapter getAdapter(AC ac) throws Exception {
        ACAdapter acAdapter=null;
        for(ACAdapter tmp: adapters){
            if(tmp.supportAC(ac)){
                acAdapter=tmp;
                break;

            }
        }
        if(acAdapter==null){
            throw new Exception("没有合适的适配器!");
        }
        return acAdapter;
    }
    
    public void registerACAdapter(ACAdapter acAdapter){
        this.adapters.add(acAdapter);
    }
    public static void main(String[] args) throws Exception {
        DefaultAdapterRegistry defaultAdapterRegistry=new DefaultAdapterRegistry();
        AC acInChina=new ACInChina();
        ACAdapter acAdapter=defaultAdapterRegistry.getAdapter(acInChina);
        acAdapter.intoDC(acInChina);
        AC acInAmerica=new ACInAmerica();
        ACAdapter acAdapter1=defaultAdapterRegistry.getAdapter(acInAmerica);
        acAdapter1.intoDC(acInAmerica);
    }
}
