/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateIdpGroupMappingDetails.Builder.class
)
public class UpdateIdpGroupMappingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        public UpdateIdpGroupMappingDetails build() {
            return new UpdateIdpGroupMappingDetails(idpGroupName, groupId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIdpGroupMappingDetails o) {
            return idpGroupName(o.getIdpGroupName()).groupId(o.getGroupId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The idp group name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
    String idpGroupName;

    /**
     * The OCID of the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    String groupId;
}
