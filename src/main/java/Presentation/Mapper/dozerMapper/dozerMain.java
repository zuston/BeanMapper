package Presentation.Mapper.dozerMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import static Presentation.Bean.One.$1RequestType.generateSourceBean;

/**
 * Created by zhang_jf on 2017/8/9.
 */
public class dozerMain {
    public static void main(String[] args) {
        Mapper mapper = new DozerBeanMapper();
        $1RequestType requestType = generateSourceBean();
        $1ResponseType responseType = mapper.map(requestType,$1ResponseType.class);
    }
}
