package Presentation.Mapper.modelMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import org.modelmapper.ModelMapper;

/**
 * Created by zhang_jf on 2017/8/9.
 */
public class modelMapperMain {
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();
        $1RequestType requestType = $1RequestType.generateSourceBean();
        $1ResponseType responseType = modelMapper.map(requestType,$1ResponseType.class);
    }
}
