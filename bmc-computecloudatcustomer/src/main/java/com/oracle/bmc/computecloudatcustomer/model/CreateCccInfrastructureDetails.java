/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * The configuration details for creating Compute Cloud@Customer infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCccInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCccInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "compartmentId",
        "subnetId",
        "connectionState",
        "connectionDetails",
        "cccUpgradeScheduleId",
        "freeformTags",
        "definedTags"
    })
    public CreateCccInfrastructureDetails(
            String displayName,
            String description,
            String compartmentId,
            String subnetId,
            CccInfrastructure.ConnectionState connectionState,
            String connectionDetails,
            String cccUpgradeScheduleId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.connectionState = connectionState;
        this.connectionDetails = connectionDetails;
        this.cccUpgradeScheduleId = cccUpgradeScheduleId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure in the
         * Oracle Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure in the
         * Oracle Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A mutable client-meaningful text description of the Compute Cloud@Customer
         * infrastructure. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A mutable client-meaningful text description of the Compute Cloud@Customer
         * infrastructure. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * associated with the infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * associated with the infrastructure.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Identifier for network subnet that will be used to communicate with Compute
         * Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Identifier for network subnet that will be used to communicate with Compute
         * Cloud@Customer infrastructure.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The current connection state of the Compute Cloud@Customer infrastructure. This value
         * will default to REJECT if the value is not provided. The only valid value at creation
         * time is REJECT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
        private CccInfrastructure.ConnectionState connectionState;

        /**
         * The current connection state of the Compute Cloud@Customer infrastructure. This value
         * will default to REJECT if the value is not provided. The only valid value at creation
         * time is REJECT.
         *
         * @param connectionState the value to set
         * @return this builder
         */
        public Builder connectionState(CccInfrastructure.ConnectionState connectionState) {
            this.connectionState = connectionState;
            this.__explicitlySet__.add("connectionState");
            return this;
        }
        /** A message describing the current connection state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private String connectionDetails;

        /**
         * A message describing the current connection state in more detail.
         *
         * @param connectionDetails the value to set
         * @return this builder
         */
        public Builder connectionDetails(String connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }
        /**
         * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can
         * be upgraded at any time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cccUpgradeScheduleId")
        private String cccUpgradeScheduleId;

        /**
         * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can
         * be upgraded at any time.
         *
         * @param cccUpgradeScheduleId the value to set
         * @return this builder
         */
        public Builder cccUpgradeScheduleId(String cccUpgradeScheduleId) {
            this.cccUpgradeScheduleId = cccUpgradeScheduleId;
            this.__explicitlySet__.add("cccUpgradeScheduleId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCccInfrastructureDetails build() {
            CreateCccInfrastructureDetails model =
                    new CreateCccInfrastructureDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.subnetId,
                            this.connectionState,
                            this.connectionDetails,
                            this.cccUpgradeScheduleId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCccInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("connectionState")) {
                this.connectionState(model.getConnectionState());
            }
            if (model.wasPropertyExplicitlySet("connectionDetails")) {
                this.connectionDetails(model.getConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("cccUpgradeScheduleId")) {
                this.cccUpgradeScheduleId(model.getCccUpgradeScheduleId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure in the Oracle
     * Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure in the Oracle
     * Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A mutable client-meaningful text description of the Compute Cloud@Customer infrastructure.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A mutable client-meaningful text description of the Compute Cloud@Customer infrastructure.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * associated with the infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * associated with the infrastructure.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Identifier for network subnet that will be used to communicate with Compute Cloud@Customer
     * infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Identifier for network subnet that will be used to communicate with Compute Cloud@Customer
     * infrastructure.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The current connection state of the Compute Cloud@Customer infrastructure. This value will
     * default to REJECT if the value is not provided. The only valid value at creation time is
     * REJECT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
    private final CccInfrastructure.ConnectionState connectionState;

    /**
     * The current connection state of the Compute Cloud@Customer infrastructure. This value will
     * default to REJECT if the value is not provided. The only valid value at creation time is
     * REJECT.
     *
     * @return the value
     */
    public CccInfrastructure.ConnectionState getConnectionState() {
        return connectionState;
    }

    /** A message describing the current connection state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final String connectionDetails;

    /**
     * A message describing the current connection state in more detail.
     *
     * @return the value
     */
    public String getConnectionDetails() {
        return connectionDetails;
    }

    /**
     * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can be
     * upgraded at any time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cccUpgradeScheduleId")
    private final String cccUpgradeScheduleId;

    /**
     * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can be
     * upgraded at any time.
     *
     * @return the value
     */
    public String getCccUpgradeScheduleId() {
        return cccUpgradeScheduleId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateCccInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", connectionState=").append(String.valueOf(this.connectionState));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", cccUpgradeScheduleId=").append(String.valueOf(this.cccUpgradeScheduleId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCccInfrastructureDetails)) {
            return false;
        }

        CreateCccInfrastructureDetails other = (CreateCccInfrastructureDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.connectionState, other.connectionState)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(this.cccUpgradeScheduleId, other.cccUpgradeScheduleId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionState == null ? 43 : this.connectionState.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cccUpgradeScheduleId == null
                                ? 43
                                : this.cccUpgradeScheduleId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
