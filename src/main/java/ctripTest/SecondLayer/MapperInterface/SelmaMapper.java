package ctripTest.SecondLayer.MapperInterface;

import ctripTest.SecondLayer.SBean;
import ctripTest.SecondLayer.TBean;
import fr.xebia.extras.selma.Mapper;

/**
 * Created by zhang_jf on 2017/8/2.
 */
@Mapper
public interface SelmaMapper {
    TBean convert(SBean sBean);
}
