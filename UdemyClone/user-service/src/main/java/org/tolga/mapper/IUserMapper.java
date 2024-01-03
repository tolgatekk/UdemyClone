package org.tolga.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.tolga.dto.request.RegisterRequestDto;
import org.tolga.dto.response.RegisterResponseDto;
import org.tolga.repository.entity.User;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {


    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUser(final RegisterRequestDto dto);

    RegisterResponseDto toRegisterResponseDto(final User user);

}
