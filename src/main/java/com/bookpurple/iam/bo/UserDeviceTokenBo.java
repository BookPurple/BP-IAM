package com.bookpurple.iam.bo;

import com.bookpurple.iam.model.AbstractUserDeviceTokenModel;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/*
 * Created by Gaurav Sharma on 21 Mar 2019
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class UserDeviceTokenBo extends AbstractUserDeviceTokenModel {

    @Builder
    public UserDeviceTokenBo(Long id,
                             @NotNull @NotBlank @NotEmpty String deviceId,
                             @NotNull @NotBlank @NotEmpty Long userId,
                             @NotNull @NotBlank @NotEmpty String userUId,
                             @NotNull @NotBlank @NotEmpty String deviceToken,
                             Date createdAt,
                             Date modifiedAt,
                             int installStatus) {
        super(id, deviceId, userId, userUId, deviceToken, createdAt, modifiedAt, installStatus);
    }
}
