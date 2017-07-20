/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIdpGroupMappingDetails.Builder.class
)
public class CreateIdpGroupMappingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        public CreateIdpGroupMappingDetails build() {
            return new CreateIdpGroupMappingDetails(idpGroupName, groupId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIdpGroupMappingDetails o) {
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
     * The name of the IdP group you want to map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String idpGroupName;

    /**
     * The OCID of the IAM Service {@link Group}
     * you want to map to the IdP group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String groupId;
}
