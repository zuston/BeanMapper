package ctripTest.SecondLayer.MapperInterface;

import ctripTest.SecondLayer.SBean;
import ctripTest.SecondLayer.TBean;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by zhang_jf on 2017/8/2.
 */
@Mapper
public interface MapStructMapper {

    MapStructMapper MAP_STRUCT_MAPPER = Mappers.getMapper(MapStructMapper.class);
    TBean convert(SBean sourceBean);
}