package Presentation.Mapper.mapStructMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import org.mapstruct.factory.Mappers;

/**
 * Created by zhang_jf on 2017/8/9.
 */
public class mapStructMain {
    public static void main(String[] args) {
        mapStructInterface mapStructInterface = Mappers.getMapper(Presentation.Mapper.mapStructMapper.mapStructInterface.class);
        $1RequestType requestType = $1RequestType.generateSourceBean();
        $1ResponseType responseType = mapStructInterface.convert(requestType);
    }
}
