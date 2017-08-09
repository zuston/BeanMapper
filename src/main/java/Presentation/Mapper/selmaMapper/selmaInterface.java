package Presentation.Mapper.selmaMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

/**
 * Created by zhang_jf on 2017/8/9.
 */
@Mapper
public interface selmaInterface {
    @Maps(
            withIgnoreFields = {"dataChangedCreateTime"}
    )
    $1ResponseType convert($1RequestType res);
}
