/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddUserToGroupDetails.Builder.class
)
public class AddUserToGroupDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        public AddUserToGroupDetails build() {
            return new AddUserToGroupDetails(userId, groupId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String userId;

    /**
     * The OCID of the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String groupId;
}
