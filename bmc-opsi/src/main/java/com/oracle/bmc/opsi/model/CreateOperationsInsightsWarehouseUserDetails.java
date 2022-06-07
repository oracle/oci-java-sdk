/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about a Operations Insights Warehouse User to be created. Input compartmentId MUST be the root compartment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOperationsInsightsWarehouseUserDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOperationsInsightsWarehouseUserDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationsInsightsWarehouseId",
        "compartmentId",
        "name",
        "connectionPassword",
        "isAwrDataAccess",
        "isEmDataAccess",
        "isOpsiDataAccess",
        "freeformTags",
        "definedTags"
    })
    public CreateOperationsInsightsWarehouseUserDetails(
            String operationsInsightsWarehouseId,
            String compartmentId,
            String name,
            String connectionPassword,
            Boolean isAwrDataAccess,
            Boolean isEmDataAccess,
            Boolean isOpsiDataAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
        this.compartmentId = compartmentId;
        this.name = name;
        this.connectionPassword = connectionPassword;
        this.isAwrDataAccess = isAwrDataAccess;
        this.isEmDataAccess = isEmDataAccess;
        this.isOpsiDataAccess = isOpsiDataAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
        private String operationsInsightsWarehouseId;

        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            this.__explicitlySet__.add("operationsInsightsWarehouseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
        private String connectionPassword;

        public Builder connectionPassword(String connectionPassword) {
            this.connectionPassword = connectionPassword;
            this.__explicitlySet__.add("connectionPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
        private Boolean isAwrDataAccess;

        public Builder isAwrDataAccess(Boolean isAwrDataAccess) {
            this.isAwrDataAccess = isAwrDataAccess;
            this.__explicitlySet__.add("isAwrDataAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
        private Boolean isEmDataAccess;

        public Builder isEmDataAccess(Boolean isEmDataAccess) {
            this.isEmDataAccess = isEmDataAccess;
            this.__explicitlySet__.add("isEmDataAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
        private Boolean isOpsiDataAccess;

        public Builder isOpsiDataAccess(Boolean isOpsiDataAccess) {
            this.isOpsiDataAccess = isOpsiDataAccess;
            this.__explicitlySet__.add("isOpsiDataAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOperationsInsightsWarehouseUserDetails build() {
            CreateOperationsInsightsWarehouseUserDetails __instance__ =
                    new CreateOperationsInsightsWarehouseUserDetails(
                            operationsInsightsWarehouseId,
                            compartmentId,
                            name,
                            connectionPassword,
                            isAwrDataAccess,
                            isEmDataAccess,
                            isOpsiDataAccess,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOperationsInsightsWarehouseUserDetails o) {
            Builder copiedBuilder =
                    operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .connectionPassword(o.getConnectionPassword())
                            .isAwrDataAccess(o.getIsAwrDataAccess())
                            .isEmDataAccess(o.getIsEmDataAccess())
                            .isOpsiDataAccess(o.getIsOpsiDataAccess())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * OPSI Warehouse OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
    private final String operationsInsightsWarehouseId;

    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Username for schema which would have access to AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
    private final String connectionPassword;

    public String getConnectionPassword() {
        return connectionPassword;
    }

    /**
     * Indicate whether user has access to AWR data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
    private final Boolean isAwrDataAccess;

    public Boolean getIsAwrDataAccess() {
        return isAwrDataAccess;
    }

    /**
     * Indicate whether user has access to EM data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
    private final Boolean isEmDataAccess;

    public Boolean getIsEmDataAccess() {
        return isEmDataAccess;
    }

    /**
     * Indicate whether user has access to OPSI data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
    private final Boolean isOpsiDataAccess;

    public Boolean getIsOpsiDataAccess() {
        return isOpsiDataAccess;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateOperationsInsightsWarehouseUserDetails(");
        sb.append("operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", connectionPassword=").append(String.valueOf(this.connectionPassword));
        sb.append(", isAwrDataAccess=").append(String.valueOf(this.isAwrDataAccess));
        sb.append(", isEmDataAccess=").append(String.valueOf(this.isEmDataAccess));
        sb.append(", isOpsiDataAccess=").append(String.valueOf(this.isOpsiDataAccess));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOperationsInsightsWarehouseUserDetails)) {
            return false;
        }

        CreateOperationsInsightsWarehouseUserDetails other =
                (CreateOperationsInsightsWarehouseUserDetails) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.connectionPassword, other.connectionPassword)
                && java.util.Objects.equals(this.isAwrDataAccess, other.isAwrDataAccess)
                && java.util.Objects.equals(this.isEmDataAccess, other.isEmDataAccess)
                && java.util.Objects.equals(this.isOpsiDataAccess, other.isOpsiDataAccess)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseId == null
                                ? 43
                                : this.operationsInsightsWarehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionPassword == null
                                ? 43
                                : this.connectionPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.isAwrDataAccess == null ? 43 : this.isAwrDataAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.isEmDataAccess == null ? 43 : this.isEmDataAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.isOpsiDataAccess == null ? 43 : this.isOpsiDataAccess.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
