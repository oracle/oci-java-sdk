/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Contains the details required to configure a catalog item. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigureCatalogItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigureCatalogItemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageNamespace",
        "bucketName",
        "objectName",
        "compartmentId",
        "catalogListingId",
        "catalogListingVersionId",
        "inputVariables",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ConfigureCatalogItemDetails(
            String storageNamespace,
            String bucketName,
            String objectName,
            String compartmentId,
            String catalogListingId,
            String catalogListingVersionId,
            java.util.List<KeyValueProperty> inputVariables,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.storageNamespace = storageNamespace;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.compartmentId = compartmentId;
        this.catalogListingId = catalogListingId;
        this.catalogListingVersionId = catalogListingVersionId;
        this.inputVariables = inputVariables;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle Cloud Object Storage namespace where the artifact or variables are stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageNamespace")
        private String storageNamespace;

        /**
         * The Oracle Cloud Object Storage namespace where the artifact or variables are stored.
         *
         * @param storageNamespace the value to set
         * @return this builder
         */
        public Builder storageNamespace(String storageNamespace) {
            this.storageNamespace = storageNamespace;
            this.__explicitlySet__.add("storageNamespace");
            return this;
        }
        /**
         * The name of the Object Storage bucket that contains the catalog item configuration
         * object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the Object Storage bucket that contains the catalog item configuration
         * object.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The name of the object file in the specified bucket containing catalog item configuration
         * details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object file in the specified bucket containing catalog item configuration
         * details.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** OCID of the Compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the Compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The unique identifier of the catalog listing to which configuration applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogListingId")
        private String catalogListingId;

        /**
         * The unique identifier of the catalog listing to which configuration applies.
         *
         * @param catalogListingId the value to set
         * @return this builder
         */
        public Builder catalogListingId(String catalogListingId) {
            this.catalogListingId = catalogListingId;
            this.__explicitlySet__.add("catalogListingId");
            return this;
        }
        /** The unique identifier for the specific version of the catalog listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogListingVersionId")
        private String catalogListingVersionId;

        /**
         * The unique identifier for the specific version of the catalog listing.
         *
         * @param catalogListingVersionId the value to set
         * @return this builder
         */
        public Builder catalogListingVersionId(String catalogListingVersionId) {
            this.catalogListingVersionId = catalogListingVersionId;
            this.__explicitlySet__.add("catalogListingVersionId");
            return this;
        }
        /**
         * Array of key value pairs specifying variables or parameters to be used when configuring
         * the catalog item.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inputVariables")
        private java.util.List<KeyValueProperty> inputVariables;

        /**
         * Array of key value pairs specifying variables or parameters to be used when configuring
         * the catalog item.
         *
         * @param inputVariables the value to set
         * @return this builder
         */
        public Builder inputVariables(java.util.List<KeyValueProperty> inputVariables) {
            this.inputVariables = inputVariables;
            this.__explicitlySet__.add("inputVariables");
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

        public ConfigureCatalogItemDetails build() {
            ConfigureCatalogItemDetails model =
                    new ConfigureCatalogItemDetails(
                            this.storageNamespace,
                            this.bucketName,
                            this.objectName,
                            this.compartmentId,
                            this.catalogListingId,
                            this.catalogListingVersionId,
                            this.inputVariables,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigureCatalogItemDetails model) {
            if (model.wasPropertyExplicitlySet("storageNamespace")) {
                this.storageNamespace(model.getStorageNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("catalogListingId")) {
                this.catalogListingId(model.getCatalogListingId());
            }
            if (model.wasPropertyExplicitlySet("catalogListingVersionId")) {
                this.catalogListingVersionId(model.getCatalogListingVersionId());
            }
            if (model.wasPropertyExplicitlySet("inputVariables")) {
                this.inputVariables(model.getInputVariables());
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

    /** The Oracle Cloud Object Storage namespace where the artifact or variables are stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageNamespace")
    private final String storageNamespace;

    /**
     * The Oracle Cloud Object Storage namespace where the artifact or variables are stored.
     *
     * @return the value
     */
    public String getStorageNamespace() {
        return storageNamespace;
    }

    /**
     * The name of the Object Storage bucket that contains the catalog item configuration object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the Object Storage bucket that contains the catalog item configuration object.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The name of the object file in the specified bucket containing catalog item configuration
     * details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object file in the specified bucket containing catalog item configuration
     * details.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** OCID of the Compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the Compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier of the catalog listing to which configuration applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogListingId")
    private final String catalogListingId;

    /**
     * The unique identifier of the catalog listing to which configuration applies.
     *
     * @return the value
     */
    public String getCatalogListingId() {
        return catalogListingId;
    }

    /** The unique identifier for the specific version of the catalog listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogListingVersionId")
    private final String catalogListingVersionId;

    /**
     * The unique identifier for the specific version of the catalog listing.
     *
     * @return the value
     */
    public String getCatalogListingVersionId() {
        return catalogListingVersionId;
    }

    /**
     * Array of key value pairs specifying variables or parameters to be used when configuring the
     * catalog item.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inputVariables")
    private final java.util.List<KeyValueProperty> inputVariables;

    /**
     * Array of key value pairs specifying variables or parameters to be used when configuring the
     * catalog item.
     *
     * @return the value
     */
    public java.util.List<KeyValueProperty> getInputVariables() {
        return inputVariables;
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
        sb.append("ConfigureCatalogItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageNamespace=").append(String.valueOf(this.storageNamespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", catalogListingId=").append(String.valueOf(this.catalogListingId));
        sb.append(", catalogListingVersionId=")
                .append(String.valueOf(this.catalogListingVersionId));
        sb.append(", inputVariables=").append(String.valueOf(this.inputVariables));
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
        if (!(o instanceof ConfigureCatalogItemDetails)) {
            return false;
        }

        ConfigureCatalogItemDetails other = (ConfigureCatalogItemDetails) o;
        return java.util.Objects.equals(this.storageNamespace, other.storageNamespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.catalogListingId, other.catalogListingId)
                && java.util.Objects.equals(
                        this.catalogListingVersionId, other.catalogListingVersionId)
                && java.util.Objects.equals(this.inputVariables, other.inputVariables)
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
                        + (this.storageNamespace == null ? 43 : this.storageNamespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogListingId == null ? 43 : this.catalogListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogListingVersionId == null
                                ? 43
                                : this.catalogListingVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.inputVariables == null ? 43 : this.inputVariables.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
