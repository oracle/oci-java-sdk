/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = AddUserToGroupDetails.Builder.class)
public class AddUserToGroupDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("userId")
        private String userId;

        @JsonProperty("groupId")
        private String groupId;

        public AddUserToGroupDetails build() {
            return new AddUserToGroupDetails(userId, groupId);
        }

        @JsonIgnore
        public Builder copy(AddUserToGroupDetails o) {
            return userId(o.getUserId()).groupId(o.getGroupId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the user.
     **/
    @JsonProperty("userId")
    @Valid
    @NotNull
    String userId;

    /**
     * The OCID of the group.
     **/
    @JsonProperty("groupId")
    @Valid
    @NotNull
    String groupId;
}
