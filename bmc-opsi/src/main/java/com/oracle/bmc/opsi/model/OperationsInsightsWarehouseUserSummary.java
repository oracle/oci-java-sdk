/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a Operations Insights Warehouse User.
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
    builder = OperationsInsightsWarehouseUserSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperationsInsightsWarehouseUserSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationsInsightsWarehouseId",
        "id",
        "compartmentId",
        "name",
        "connectionPassword",
        "isAwrDataAccess",
        "isEmDataAccess",
        "isOpsiDataAccess",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    public OperationsInsightsWarehouseUserSummary(
            String operationsInsightsWarehouseId,
            String id,
            String compartmentId,
            String name,
            String connectionPassword,
            Boolean isAwrDataAccess,
            Boolean isEmDataAccess,
            Boolean isOpsiDataAccess,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OperationsInsightsWarehouseUserLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.connectionPassword = connectionPassword;
        this.isAwrDataAccess = isAwrDataAccess;
        this.isEmDataAccess = isEmDataAccess;
        this.isOpsiDataAccess = isOpsiDataAccess;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OPSI Warehouse OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseId")
        private String operationsInsightsWarehouseId;

        /**
         * OPSI Warehouse OCID
         * @param operationsInsightsWarehouseId the value to set
         * @return this builder
         **/
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            this.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            this.__explicitlySet__.add("operationsInsightsWarehouseId");
            return this;
        }
        /**
         * Hub User OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Hub User OCID
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Username for schema which would have access to AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Username for schema which would have access to AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
        private String connectionPassword;

        /**
         * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
         * @param connectionPassword the value to set
         * @return this builder
         **/
        public Builder connectionPassword(String connectionPassword) {
            this.connectionPassword = connectionPassword;
            this.__explicitlySet__.add("connectionPassword");
            return this;
        }
        /**
         * Indicate whether user has access to AWR data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
        private Boolean isAwrDataAccess;

        /**
         * Indicate whether user has access to AWR data.
         * @param isAwrDataAccess the value to set
         * @return this builder
         **/
        public Builder isAwrDataAccess(Boolean isAwrDataAccess) {
            this.isAwrDataAccess = isAwrDataAccess;
            this.__explicitlySet__.add("isAwrDataAccess");
            return this;
        }
        /**
         * Indicate whether user has access to EM data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
        private Boolean isEmDataAccess;

        /**
         * Indicate whether user has access to EM data.
         * @param isEmDataAccess the value to set
         * @return this builder
         **/
        public Builder isEmDataAccess(Boolean isEmDataAccess) {
            this.isEmDataAccess = isEmDataAccess;
            this.__explicitlySet__.add("isEmDataAccess");
            return this;
        }
        /**
         * Indicate whether user has access to OPSI data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
        private Boolean isOpsiDataAccess;

        /**
         * Indicate whether user has access to OPSI data.
         * @param isOpsiDataAccess the value to set
         * @return this builder
         **/
        public Builder isOpsiDataAccess(Boolean isOpsiDataAccess) {
            this.isOpsiDataAccess = isOpsiDataAccess;
            this.__explicitlySet__.add("isOpsiDataAccess");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time at which the resource was last updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time at which the resource was last updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Possible lifecycle states
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperationsInsightsWarehouseUserLifecycleState lifecycleState;

        /**
         * Possible lifecycle states
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(
                OperationsInsightsWarehouseUserLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsWarehouseUserSummary build() {
            OperationsInsightsWarehouseUserSummary __instance__ =
                    new OperationsInsightsWarehouseUserSummary(
                            operationsInsightsWarehouseId,
                            id,
                            compartmentId,
                            name,
                            connectionPassword,
                            isAwrDataAccess,
                            isEmDataAccess,
                            isOpsiDataAccess,
                            freeformTags,
                            definedTags,
                            systemTags,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsWarehouseUserSummary o) {
            Builder copiedBuilder =
                    operationsInsightsWarehouseId(o.getOperationsInsightsWarehouseId())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .connectionPassword(o.getConnectionPassword())
                            .isAwrDataAccess(o.getIsAwrDataAccess())
                            .isEmDataAccess(o.getIsEmDataAccess())
                            .isOpsiDataAccess(o.getIsOpsiDataAccess())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails());

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

    /**
     * OPSI Warehouse OCID
     * @return the value
     **/
    public String getOperationsInsightsWarehouseId() {
        return operationsInsightsWarehouseId;
    }

    /**
     * Hub User OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Hub User OCID
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Username for schema which would have access to AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Username for schema which would have access to AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionPassword")
    private final String connectionPassword;

    /**
     * User provided connection password for the AWR Data,  Enterprise Manager Data and Operations Insights OPSI Hub.
     * @return the value
     **/
    public String getConnectionPassword() {
        return connectionPassword;
    }

    /**
     * Indicate whether user has access to AWR data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAwrDataAccess")
    private final Boolean isAwrDataAccess;

    /**
     * Indicate whether user has access to AWR data.
     * @return the value
     **/
    public Boolean getIsAwrDataAccess() {
        return isAwrDataAccess;
    }

    /**
     * Indicate whether user has access to EM data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEmDataAccess")
    private final Boolean isEmDataAccess;

    /**
     * Indicate whether user has access to EM data.
     * @return the value
     **/
    public Boolean getIsEmDataAccess() {
        return isEmDataAccess;
    }

    /**
     * Indicate whether user has access to OPSI data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOpsiDataAccess")
    private final Boolean isOpsiDataAccess;

    /**
     * Indicate whether user has access to OPSI data.
     * @return the value
     **/
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

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Possible lifecycle states
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperationsInsightsWarehouseUserLifecycleState lifecycleState;

    /**
     * Possible lifecycle states
     * @return the value
     **/
    public OperationsInsightsWarehouseUserLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OperationsInsightsWarehouseUserSummary(");
        sb.append("operationsInsightsWarehouseId=")
                .append(String.valueOf(this.operationsInsightsWarehouseId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", connectionPassword=").append(String.valueOf(this.connectionPassword));
        sb.append(", isAwrDataAccess=").append(String.valueOf(this.isAwrDataAccess));
        sb.append(", isEmDataAccess=").append(String.valueOf(this.isEmDataAccess));
        sb.append(", isOpsiDataAccess=").append(String.valueOf(this.isOpsiDataAccess));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationsInsightsWarehouseUserSummary)) {
            return false;
        }

        OperationsInsightsWarehouseUserSummary other = (OperationsInsightsWarehouseUserSummary) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseId, other.operationsInsightsWarehouseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.connectionPassword, other.connectionPassword)
                && java.util.Objects.equals(this.isAwrDataAccess, other.isAwrDataAccess)
                && java.util.Objects.equals(this.isEmDataAccess, other.isEmDataAccess)
                && java.util.Objects.equals(this.isOpsiDataAccess, other.isOpsiDataAccess)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
