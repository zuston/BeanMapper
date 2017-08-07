package com.ctrip.tour.orika;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

import java.sql.Timestamp;
import java.util.*;

/**
 * Created by zhang_jf on 2017/8/7.
 */
public class orikaShow {

    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        // Mapping List
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("numbersParts[0]", "firstName")
                .field("numbersParts[1]", "lastName")
                .register();

        // Mapping HashMap
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("namePartsHm['first']", "firstName")
                .field("namePartsHm[\"last\"]", "lastName")
                .register();

        // Mapping nested elements
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("name.first", "firstName")
                .register();

        // Mapping multi-occurrence elements
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .field("names{fullName}", "personalNames{key}")
                .field("names{}", "personalNames{value}")
                .register();

        // Custom Converters
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        converterFactory.registerConverter("date2Calendar",new MyConverter());
        mapperFactory.classMap(BasicPerson.class, BasicPersonDto.class)
                .fieldMap("birthDay","birthDay")
                .converter("date2Calendar").add()
                .register();
    }
}


class BasicPerson {
    private List<String> nameParts;
    private HashMap<String, String> namePartsHm;
    private Name name;
    private List<Name> names;

    private Date birthDay;

}
class BasicPersonDto {
    private String firstName;
    private String lastName;

    private Map<String, Name> personalNames;
    private Calendar birthDay;
}
class Name {
    private String first;
    private String last;
    private String fullName;
}

// type convert implements
class MyConverter extends BidirectionalConverter<Date, Calendar> {

    @Override
    public Calendar convertTo(Date date, Type<Calendar> type) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    @Override
    public Date convertFrom(Calendar calendar, Type<Date> type) {
        Date date = calendar.getTime();
        return date;
    }
}
