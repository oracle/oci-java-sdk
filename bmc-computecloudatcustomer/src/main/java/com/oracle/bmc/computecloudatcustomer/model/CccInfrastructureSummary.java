/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Summary information about a Compute Cloud@Customer infrastructure.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CccInfrastructureSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CccInfrastructureSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "shortName",
        "displayName",
        "compartmentId",
        "subnetId",
        "timeCreated",
        "connectionState",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CccInfrastructureSummary(
            String id,
            String shortName,
            String displayName,
            String compartmentId,
            String subnetId,
            java.util.Date timeCreated,
            CccInfrastructure.ConnectionState connectionState,
            CccInfrastructure.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.shortName = shortName;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.connectionState = connectionState;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Compute Cloud@Customer infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * This cannot be changed once created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Compute Cloud@Customer infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * This cannot be changed once created.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The Compute Cloud@Customer infrastructure short name. This is generated at
         * the time the resource is created and cannot be changed. The short name can be
         * used when communicating with Oracle Service and may be used during the configuration
         * of the data center network.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortName")
        private String shortName;

        /**
         * The Compute Cloud@Customer infrastructure short name. This is generated at
         * the time the resource is created and cannot be changed. The short name can be
         * used when communicating with Oracle Service and may be used during the configuration
         * of the data center network.
         *
         * @param shortName the value to set
         * @return this builder
         **/
        public Builder shortName(String shortName) {
            this.shortName = shortName;
            this.__explicitlySet__.add("shortName");
            return this;
        }
        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure
         * in the Oracle Cloud Infrastructure console. Does not have to be unique and can be changed.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure
         * in the Oracle Cloud Infrastructure console. Does not have to be unique and can be changed.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
         * the infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
         * the infrastructure.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network subnet that is
         * used to communicate with Compute Cloud@Customer infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network subnet that is
         * used to communicate with Compute Cloud@Customer infrastructure.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Compute Cloud@Customer infrastructure creation date and time. An RFC3339 formatted
         * datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Compute Cloud@Customer infrastructure creation date and time. An RFC3339 formatted
         * datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current connection state of the infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
        private CccInfrastructure.ConnectionState connectionState;

        /**
         * The current connection state of the infrastructure.
         *
         * @param connectionState the value to set
         * @return this builder
         **/
        public Builder connectionState(CccInfrastructure.ConnectionState connectionState) {
            this.connectionState = connectionState;
            this.__explicitlySet__.add("connectionState");
            return this;
        }
        /**
         * The current state of the Compute Cloud@Customer infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CccInfrastructure.LifecycleState lifecycleState;

        /**
         * The current state of the Compute Cloud@Customer infrastructure.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(CccInfrastructure.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureSummary build() {
            CccInfrastructureSummary model =
                    new CccInfrastructureSummary(
                            this.id,
                            this.shortName,
                            this.displayName,
                            this.compartmentId,
                            this.subnetId,
                            this.timeCreated,
                            this.connectionState,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("shortName")) {
                this.shortName(model.getShortName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("connectionState")) {
                this.connectionState(model.getConnectionState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
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
     * The Compute Cloud@Customer infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * This cannot be changed once created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Compute Cloud@Customer infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * This cannot be changed once created.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The Compute Cloud@Customer infrastructure short name. This is generated at
     * the time the resource is created and cannot be changed. The short name can be
     * used when communicating with Oracle Service and may be used during the configuration
     * of the data center network.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortName")
    private final String shortName;

    /**
     * The Compute Cloud@Customer infrastructure short name. This is generated at
     * the time the resource is created and cannot be changed. The short name can be
     * used when communicating with Oracle Service and may be used during the configuration
     * of the data center network.
     *
     * @return the value
     **/
    public String getShortName() {
        return shortName;
    }

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure
     * in the Oracle Cloud Infrastructure console. Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure
     * in the Oracle Cloud Infrastructure console. Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
     * the infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
     * the infrastructure.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network subnet that is
     * used to communicate with Compute Cloud@Customer infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network subnet that is
     * used to communicate with Compute Cloud@Customer infrastructure.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Compute Cloud@Customer infrastructure creation date and time. An RFC3339 formatted
     * datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Compute Cloud@Customer infrastructure creation date and time. An RFC3339 formatted
     * datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current connection state of the infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
    private final CccInfrastructure.ConnectionState connectionState;

    /**
     * The current connection state of the infrastructure.
     *
     * @return the value
     **/
    public CccInfrastructure.ConnectionState getConnectionState() {
        return connectionState;
    }

    /**
     * The current state of the Compute Cloud@Customer infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CccInfrastructure.LifecycleState lifecycleState;

    /**
     * The current state of the Compute Cloud@Customer infrastructure.
     * @return the value
     **/
    public CccInfrastructure.LifecycleState getLifecycleState() {
        return lifecycleState;
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

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CccInfrastructureSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", shortName=").append(String.valueOf(this.shortName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", connectionState=").append(String.valueOf(this.connectionState));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureSummary)) {
            return false;
        }

        CccInfrastructureSummary other = (CccInfrastructureSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.shortName, other.shortName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.connectionState, other.connectionState)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.shortName == null ? 43 : this.shortName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionState == null ? 43 : this.connectionState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
