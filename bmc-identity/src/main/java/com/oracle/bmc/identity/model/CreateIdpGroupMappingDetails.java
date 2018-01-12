/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIdpGroupMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateIdpGroupMappingDetails {
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

        public CreateIdpGroupMappingDetails build() {
            CreateIdpGroupMappingDetails __instance__ =
                    new CreateIdpGroupMappingDetails(idpGroupName, groupId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIdpGroupMappingDetails o) {
            Builder copiedBuilder = idpGroupName(o.getIdpGroupName()).groupId(o.getGroupId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    String idpGroupName;

    /**
     * The OCID of the IAM Service {@link Group}
     * you want to map to the IdP group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    String groupId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
