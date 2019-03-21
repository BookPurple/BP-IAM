package com.bookpurple.iam.bo;

import com.bookpurple.iam.model.AbstractErrorModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpResponseBo {

    @JsonProperty("authToken")
    private String authToken;

    @JsonProperty("error")
    private AbstractErrorModel abstractErrorModel;
}