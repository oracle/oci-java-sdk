/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Association details between two monitored resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MonitoredResourceAssociation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MonitoredResourceAssociation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "associationType",
        "compartmentId",
        "tenantId",
        "sourceResourceId",
        "destinationResourceId",
        "sourceResourceDetails",
        "destinationResourceDetails",
        "timeCreated",
        "category",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MonitoredResourceAssociation(
            String associationType,
            String compartmentId,
            String tenantId,
            String sourceResourceId,
            String destinationResourceId,
            AssociationResourceDetails sourceResourceDetails,
            AssociationResourceDetails destinationResourceDetails,
            java.util.Date timeCreated,
            Category category,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.associationType = associationType;
        this.compartmentId = compartmentId;
        this.tenantId = tenantId;
        this.sourceResourceId = sourceResourceId;
        this.destinationResourceId = destinationResourceId;
        this.sourceResourceDetails = sourceResourceDetails;
        this.destinationResourceDetails = destinationResourceDetails;
        this.timeCreated = timeCreated;
        this.category = category;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Association Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private String associationType;

        /**
         * Association Type.
         *
         * @param associationType the value to set
         * @return this builder
         */
        public Builder associationType(String associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }
        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * Tenancy Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Tenancy Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
        private String sourceResourceId;

        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param sourceResourceId the value to set
         * @return this builder
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            this.__explicitlySet__.add("sourceResourceId");
            return this;
        }
        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
        private String destinationResourceId;

        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param destinationResourceId the value to set
         * @return this builder
         */
        public Builder destinationResourceId(String destinationResourceId) {
            this.destinationResourceId = destinationResourceId;
            this.__explicitlySet__.add("destinationResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceDetails")
        private AssociationResourceDetails sourceResourceDetails;

        public Builder sourceResourceDetails(AssociationResourceDetails sourceResourceDetails) {
            this.sourceResourceDetails = sourceResourceDetails;
            this.__explicitlySet__.add("sourceResourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceDetails")
        private AssociationResourceDetails destinationResourceDetails;

        public Builder destinationResourceDetails(
                AssociationResourceDetails destinationResourceDetails) {
            this.destinationResourceDetails = destinationResourceDetails;
            this.__explicitlySet__.add("destinationResourceDetails");
            return this;
        }
        /** The time when the association was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the association was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Association category. Possible values are: - System created (SYSTEM), - User created
         * using API (USER_API) - User created using tags (USER_TAG_ASSOC).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Association category. Possible values are: - System created (SYSTEM), - User created
         * using API (USER_API) - User created using tags (USER_TAG_ASSOC).
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public MonitoredResourceAssociation build() {
            MonitoredResourceAssociation model =
                    new MonitoredResourceAssociation(
                            this.associationType,
                            this.compartmentId,
                            this.tenantId,
                            this.sourceResourceId,
                            this.destinationResourceId,
                            this.sourceResourceDetails,
                            this.destinationResourceDetails,
                            this.timeCreated,
                            this.category,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredResourceAssociation model) {
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceId")) {
                this.sourceResourceId(model.getSourceResourceId());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceId")) {
                this.destinationResourceId(model.getDestinationResourceId());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceDetails")) {
                this.sourceResourceDetails(model.getSourceResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceDetails")) {
                this.destinationResourceDetails(model.getDestinationResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
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

    /** Association Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final String associationType;

    /**
     * Association Type.
     *
     * @return the value
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Tenancy Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Tenancy Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Source Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    private final String sourceResourceId;

    /**
     * Source Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    /**
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    private final String destinationResourceId;

    /**
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getDestinationResourceId() {
        return destinationResourceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceDetails")
    private final AssociationResourceDetails sourceResourceDetails;

    public AssociationResourceDetails getSourceResourceDetails() {
        return sourceResourceDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceDetails")
    private final AssociationResourceDetails destinationResourceDetails;

    public AssociationResourceDetails getDestinationResourceDetails() {
        return destinationResourceDetails;
    }

    /** The time when the association was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the association was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Association category. Possible values are: - System created (SYSTEM), - User created using
     * API (USER_API) - User created using tags (USER_TAG_ASSOC).
     */
    public enum Category implements com.oracle.bmc.http.internal.BmcEnum {
        System("SYSTEM"),
        UserApi("USER_API"),
        UserTagAssoc("USER_TAG_ASSOC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Association category. Possible values are: - System created (SYSTEM), - User created using
     * API (USER_API) - User created using tags (USER_TAG_ASSOC).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Association category. Possible values are: - System created (SYSTEM), - User created using
     * API (USER_API) - User created using tags (USER_TAG_ASSOC).
     *
     * @return the value
     */
    public Category getCategory() {
        return category;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("MonitoredResourceAssociation(");
        sb.append("super=").append(super.toString());
        sb.append("associationType=").append(String.valueOf(this.associationType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", sourceResourceId=").append(String.valueOf(this.sourceResourceId));
        sb.append(", destinationResourceId=").append(String.valueOf(this.destinationResourceId));
        sb.append(", sourceResourceDetails=").append(String.valueOf(this.sourceResourceDetails));
        sb.append(", destinationResourceDetails=")
                .append(String.valueOf(this.destinationResourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", category=").append(String.valueOf(this.category));
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
        if (!(o instanceof MonitoredResourceAssociation)) {
            return false;
        }

        MonitoredResourceAssociation other = (MonitoredResourceAssociation) o;
        return java.util.Objects.equals(this.associationType, other.associationType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.sourceResourceId, other.sourceResourceId)
                && java.util.Objects.equals(this.destinationResourceId, other.destinationResourceId)
                && java.util.Objects.equals(this.sourceResourceDetails, other.sourceResourceDetails)
                && java.util.Objects.equals(
                        this.destinationResourceDetails, other.destinationResourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceId == null ? 43 : this.sourceResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceId == null
                                ? 43
                                : this.destinationResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceDetails == null
                                ? 43
                                : this.sourceResourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceDetails == null
                                ? 43
                                : this.destinationResourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
