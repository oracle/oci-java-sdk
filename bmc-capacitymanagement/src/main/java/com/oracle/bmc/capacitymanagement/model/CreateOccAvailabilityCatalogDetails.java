/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about the create request for the availability catalog. <br>
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
        builder = CreateOccAvailabilityCatalogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOccAvailabilityCatalogDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "occCustomerGroupId",
        "namespace",
        "compartmentId",
        "base64EncodedCatalogDetails",
        "metadataDetails",
        "displayName",
        "description",
        "freeformTags",
        "definedTags"
    })
    public CreateOccAvailabilityCatalogDetails(
            String occCustomerGroupId,
            Namespace namespace,
            String compartmentId,
            String base64EncodedCatalogDetails,
            MetadataDetails metadataDetails,
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.occCustomerGroupId = occCustomerGroupId;
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.base64EncodedCatalogDetails = base64EncodedCatalogDetails;
        this.metadataDetails = metadataDetails;
        this.displayName = displayName;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the customer group. */
        @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
        private String occCustomerGroupId;

        /**
         * The OCID of the customer group.
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
        /**
         * Since all resources are at tenancy level hence this will be the ocid of the tenancy where
         * operation is to be performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Since all resources are at tenancy level hence this will be the ocid of the tenancy where
         * operation is to be performed.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The base 64 encoded string corresponding to the catalog file contents. */
        @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedCatalogDetails")
        private String base64EncodedCatalogDetails;

        /**
         * The base 64 encoded string corresponding to the catalog file contents.
         *
         * @param base64EncodedCatalogDetails the value to set
         * @return this builder
         */
        public Builder base64EncodedCatalogDetails(String base64EncodedCatalogDetails) {
            this.base64EncodedCatalogDetails = base64EncodedCatalogDetails;
            this.__explicitlySet__.add("base64EncodedCatalogDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataDetails")
        private MetadataDetails metadataDetails;

        public Builder metadataDetails(MetadataDetails metadataDetails) {
            this.metadataDetails = metadataDetails;
            this.__explicitlySet__.add("metadataDetails");
            return this;
        }
        /** The display name of the availability catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the availability catalog.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Additional information about the availability catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Additional information about the availability catalog.
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

        public CreateOccAvailabilityCatalogDetails build() {
            CreateOccAvailabilityCatalogDetails model =
                    new CreateOccAvailabilityCatalogDetails(
                            this.occCustomerGroupId,
                            this.namespace,
                            this.compartmentId,
                            this.base64EncodedCatalogDetails,
                            this.metadataDetails,
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOccAvailabilityCatalogDetails model) {
            if (model.wasPropertyExplicitlySet("occCustomerGroupId")) {
                this.occCustomerGroupId(model.getOccCustomerGroupId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("base64EncodedCatalogDetails")) {
                this.base64EncodedCatalogDetails(model.getBase64EncodedCatalogDetails());
            }
            if (model.wasPropertyExplicitlySet("metadataDetails")) {
                this.metadataDetails(model.getMetadataDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** The OCID of the customer group. */
    @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
    private final String occCustomerGroupId;

    /**
     * The OCID of the customer group.
     *
     * @return the value
     */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
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

    /**
     * Since all resources are at tenancy level hence this will be the ocid of the tenancy where
     * operation is to be performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Since all resources are at tenancy level hence this will be the ocid of the tenancy where
     * operation is to be performed.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The base 64 encoded string corresponding to the catalog file contents. */
    @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedCatalogDetails")
    private final String base64EncodedCatalogDetails;

    /**
     * The base 64 encoded string corresponding to the catalog file contents.
     *
     * @return the value
     */
    public String getBase64EncodedCatalogDetails() {
        return base64EncodedCatalogDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadataDetails")
    private final MetadataDetails metadataDetails;

    public MetadataDetails getMetadataDetails() {
        return metadataDetails;
    }

    /** The display name of the availability catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the availability catalog.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Additional information about the availability catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Additional information about the availability catalog.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("CreateOccAvailabilityCatalogDetails(");
        sb.append("super=").append(super.toString());
        sb.append("occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", base64EncodedCatalogDetails=")
                .append(String.valueOf(this.base64EncodedCatalogDetails));
        sb.append(", metadataDetails=").append(String.valueOf(this.metadataDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
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
        if (!(o instanceof CreateOccAvailabilityCatalogDetails)) {
            return false;
        }

        CreateOccAvailabilityCatalogDetails other = (CreateOccAvailabilityCatalogDetails) o;
        return java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.base64EncodedCatalogDetails, other.base64EncodedCatalogDetails)
                && java.util.Objects.equals(this.metadataDetails, other.metadataDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.base64EncodedCatalogDetails == null
                                ? 43
                                : this.base64EncodedCatalogDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataDetails == null ? 43 : this.metadataDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
