package Presentation.Mapper.selmaMapper;

import Presentation.Bean.One.$1RequestType;
import Presentation.Bean.One.$1ResponseType;
import com.ctrip.tour.selma.SelmaMapper;
import fr.xebia.extras.selma.Selma;

/**
 * Created by zhang_jf on 2017/8/9.
 */
public class selmaMain {
    public static void main(String[] args) {
        selmaInterface selmaMapper = Selma.builder(selmaInterface.class).build();

        $1RequestType requestType = $1RequestType.generateSourceBean();
        $1ResponseType responseType = selmaMapper.convert(requestType);
    }
}
