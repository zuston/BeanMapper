package Presentation.Mapper.orikaMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Created by zhang_jf on 2017/8/9.
 */
public class orikaMain {
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap($1RequestType.class,$1ResponseType.class)
                .byDefault()
                .register();
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        $1RequestType requestType = $1RequestType.generateSourceBean();
        $1ResponseType responseType = mapperFacade.map(requestType,$1ResponseType.class);
    }
}
