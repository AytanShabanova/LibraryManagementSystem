package com.example.librarymanagementsystem.mapstruct;

import com.example.librarymanagementsystem.model.dto.request.RegisterRequest;
import com.example.librarymanagementsystem.model.entity.User;
import com.example.librarymanagementsystem.model.security.MyUserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface UserMapper {
    MyUserDetails usertoUserDetails(User user);

    User registerRequestToUser(RegisterRequest registerRequest);
}
