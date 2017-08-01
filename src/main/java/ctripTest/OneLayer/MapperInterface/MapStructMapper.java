package ctripTest.OneLayer.MapperInterface;

import ctripTest.OneLayer.SourceBean;
import ctripTest.OneLayer.TargetBean;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by zhang_jf on 2017/8/1.
 */
@Mapper
public interface MapStructMapper {

    MapStructMapper MAP_STRUCT_MAPPER = Mappers.getMapper(MapStructMapper.class);
    TargetBean convert(SourceBean sourceBean);
}
