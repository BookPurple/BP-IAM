package com.bookpurple.iam.bo;

import com.bookpurple.iam.model.AbstractUserAccessCodeModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
 * Created by gauravsharma on 2019-03-10.
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class UserAccessCodeBo extends AbstractUserAccessCodeModel {

    @Builder
    public UserAccessCodeBo(Long id,
                            @NotNull @NotBlank @NotEmpty String deviceId, @NotNull @NotBlank @NotEmpty Long userId,
                            @NotNull @NotBlank @NotEmpty String userUId,
                            @NotNull @NotBlank @NotEmpty String authToken,
                            Date createdAt,
                            Date modifiedAt,
                            Date expiredAt,
                            int status) {
        super(id, deviceId, userId, userUId, authToken, createdAt, modifiedAt,expiredAt, status);
    }
}
