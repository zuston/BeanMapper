package ctripTest.OneLayer.MapperInterface;

import ctripTest.OneLayer.SourceBean;
import ctripTest.OneLayer.TargetBean;
import fr.xebia.extras.selma.Mapper;

/**
 * Created by zhang_jf on 2017/8/1.
 */
@Mapper
public interface SelmaMapper {
    TargetBean convert(SourceBean sourceBean);
}
