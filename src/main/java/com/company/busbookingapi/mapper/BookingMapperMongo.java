package com.company.busbookingapi.mapper;

import com.company.busbookingapi.domain.dto.BookingDto;
import com.company.busbookingapi.domain.entity.BookingMongo;
import com.company.busbookingapi.mapper.base.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


import java.util.List;
@Mapper
public interface BookingMapperMongo extends IBaseMapper {
       @Mapping(source = "id", target = "id", qualifiedByName = "objectToString")
       BookingMongo toEntity(BookingDto dto);
       BookingDto toDto(BookingMongo entity);
       List<BookingMongo> toEntityList(List<BookingDto> dtoList);
       List<BookingDto> toDtoList(List<BookingMongo> entityList);
       @Named("objectToString")
       default String objectToString(Object obj) {
              return obj.toString();
       }
}
