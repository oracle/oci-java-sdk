/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIdpGroupMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIdpGroupMappingDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"idpGroupName", "groupId"})
    public CreateIdpGroupMappingDetails(String idpGroupName, String groupId) {
        super();
        this.idpGroupName = idpGroupName;
        this.groupId = groupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the IdP group you want to map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        /**
         * The name of the IdP group you want to map.
         * @param idpGroupName the value to set
         * @return this builder
         **/
        public Builder idpGroupName(String idpGroupName) {
            this.idpGroupName = idpGroupName;
            this.__explicitlySet__.add("idpGroupName");
            return this;
        }
        /**
         * The OCID of the IAM Service {@link Group}
         * you want to map to the IdP group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        /**
         * The OCID of the IAM Service {@link Group}
         * you want to map to the IdP group.
         *
         * @param groupId the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the IdP group you want to map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
    private final String idpGroupName;

    /**
     * The name of the IdP group you want to map.
     * @return the value
     **/
    public String getIdpGroupName() {
        return idpGroupName;
    }

    /**
     * The OCID of the IAM Service {@link Group}
     * you want to map to the IdP group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

    /**
     * The OCID of the IAM Service {@link Group}
     * you want to map to the IdP group.
     *
     * @return the value
     **/
    public String getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIdpGroupMappingDetails(");
        sb.append("idpGroupName=").append(String.valueOf(this.idpGroupName));
        sb.append(", groupId=").append(String.valueOf(this.groupId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdpGroupMappingDetails)) {
            return false;
        }

        CreateIdpGroupMappingDetails other = (CreateIdpGroupMappingDetails) o;
        return java.util.Objects.equals(this.idpGroupName, other.idpGroupName)
                && java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.idpGroupName == null ? 43 : this.idpGroupName.hashCode());
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
