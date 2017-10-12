/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateIdpGroupMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateIdpGroupMappingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        public Builder idpGroupName(String idpGroupName) {
            this.idpGroupName = idpGroupName;
            this.__explicitlySet__.add("idpGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIdpGroupMappingDetails build() {
            UpdateIdpGroupMappingDetails __instance__ =
                    new UpdateIdpGroupMappingDetails(idpGroupName, groupId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
