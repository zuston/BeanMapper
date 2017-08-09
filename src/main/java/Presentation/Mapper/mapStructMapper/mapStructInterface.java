package Presentation.Mapper.mapStructMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import org.mapstruct.Mapper;

/**
 * Created by zhang_jf on 2017/8/9.
 */
@Mapper
public interface mapStructInterface {
    $1ResponseType convert($1RequestType res);
}
