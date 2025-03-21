/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * A catalog containing resource availability details for a customer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccAvailabilityCatalogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccAvailabilityCatalogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "namespace",
        "compartmentId",
        "displayName",
        "description",
        "occCustomerGroupId",
        "catalogState",
        "metadataDetails",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OccAvailabilityCatalogSummary(
            String id,
            Namespace namespace,
            String compartmentId,
            String displayName,
            String description,
            String occCustomerGroupId,
            OccAvailabilityCatalog.CatalogState catalogState,
            MetadataDetails metadataDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OccAvailabilityCatalog.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.occCustomerGroupId = occCustomerGroupId;
        this.catalogState = catalogState;
        this.metadataDetails = metadataDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the availability catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the availability catalog.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The OCID of the tenancy where the availability catalog resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy where the availability catalog resides.
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
         * An user-friendly name for the availability catalog. Does not have to be unique, and is
         * changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An user-friendly name for the availability catalog. Does not have to be unique, and is
         * changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Text information about the availability catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Text information about the availability catalog.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The Customer Group OCID to which the availability catalog belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
        private String occCustomerGroupId;

        /**
         * The Customer Group OCID to which the availability catalog belongs.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            this.__explicitlySet__.add("occCustomerGroupId");
            return this;
        }
        /**
         * Represents whether this version of the availability catalog has been made available to
         * the customer. The state is No by default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogState")
        private OccAvailabilityCatalog.CatalogState catalogState;

        /**
         * Represents whether this version of the availability catalog has been made available to
         * the customer. The state is No by default.
         *
         * @param catalogState the value to set
         * @return this builder
         */
        public Builder catalogState(OccAvailabilityCatalog.CatalogState catalogState) {
            this.catalogState = catalogState;
            this.__explicitlySet__.add("catalogState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataDetails")
        private MetadataDetails metadataDetails;

        public Builder metadataDetails(MetadataDetails metadataDetails) {
            this.metadataDetails = metadataDetails;
            this.__explicitlySet__.add("metadataDetails");
            return this;
        }
        /** The time when the availability catalog was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the availability catalog was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the availability catalog was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the availability catalog was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current lifecycle state of the customer group. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OccAvailabilityCatalog.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the customer group.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OccAvailabilityCatalog.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in a Failed State.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in a Failed State.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccAvailabilityCatalogSummary build() {
            OccAvailabilityCatalogSummary model =
                    new OccAvailabilityCatalogSummary(
                            this.id,
                            this.namespace,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.occCustomerGroupId,
                            this.catalogState,
                            this.metadataDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccAvailabilityCatalogSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("occCustomerGroupId")) {
                this.occCustomerGroupId(model.getOccCustomerGroupId());
            }
            if (model.wasPropertyExplicitlySet("catalogState")) {
                this.catalogState(model.getCatalogState());
            }
            if (model.wasPropertyExplicitlySet("metadataDetails")) {
                this.metadataDetails(model.getMetadataDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the availability catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the availability catalog.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the OCI service in consideration. For example, Compute, Exadata, and so on. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     *
     * @return the value
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /** The OCID of the tenancy where the availability catalog resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy where the availability catalog resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * An user-friendly name for the availability catalog. Does not have to be unique, and is
     * changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An user-friendly name for the availability catalog. Does not have to be unique, and is
     * changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Text information about the availability catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Text information about the availability catalog.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The Customer Group OCID to which the availability catalog belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
    private final String occCustomerGroupId;

    /**
     * The Customer Group OCID to which the availability catalog belongs.
     *
     * @return the value
     */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }

    /**
     * Represents whether this version of the availability catalog has been made available to the
     * customer. The state is No by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogState")
    private final OccAvailabilityCatalog.CatalogState catalogState;

    /**
     * Represents whether this version of the availability catalog has been made available to the
     * customer. The state is No by default.
     *
     * @return the value
     */
    public OccAvailabilityCatalog.CatalogState getCatalogState() {
        return catalogState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadataDetails")
    private final MetadataDetails metadataDetails;

    public MetadataDetails getMetadataDetails() {
        return metadataDetails;
    }

    /** The time when the availability catalog was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the availability catalog was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the availability catalog was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the availability catalog was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current lifecycle state of the customer group. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OccAvailabilityCatalog.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the customer group.
     *
     * @return the value
     */
    public OccAvailabilityCatalog.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in a Failed State.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in a Failed State.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OccAvailabilityCatalogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(", catalogState=").append(String.valueOf(this.catalogState));
        sb.append(", metadataDetails=").append(String.valueOf(this.metadataDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof OccAvailabilityCatalogSummary)) {
            return false;
        }

        OccAvailabilityCatalogSummary other = (OccAvailabilityCatalogSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.catalogState, other.catalogState)
                && java.util.Objects.equals(this.metadataDetails, other.metadataDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result = (result * PRIME) + (this.catalogState == null ? 43 : this.catalogState.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataDetails == null ? 43 : this.metadataDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
