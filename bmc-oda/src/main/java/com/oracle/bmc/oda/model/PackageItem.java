/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Details of {@code Package} object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PackageItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PackageItem {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "publisherId",
        "name",
        "displayName",
        "version",
        "timeUploaded",
        "timePublished",
        "description",
        "resourceTypes",
        "resourceTypesMetadata",
        "publisherMetadata",
        "freeformTags",
        "definedTags",
        "importContract",
        "defaultParameterValues"
    })
    public PackageItem(
            String id,
            String publisherId,
            String name,
            String displayName,
            String version,
            java.util.Date timeUploaded,
            java.util.Date timePublished,
            String description,
            java.util.List<String> resourceTypes,
            java.util.List<ResourceTypeMetadata> resourceTypesMetadata,
            java.util.List<MetadataProperty> publisherMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ImportContract importContract,
            DefaultParameterValues defaultParameterValues) {
        super();
        this.id = id;
        this.publisherId = publisherId;
        this.name = name;
        this.displayName = displayName;
        this.version = version;
        this.timeUploaded = timeUploaded;
        this.timePublished = timePublished;
        this.description = description;
        this.resourceTypes = resourceTypes;
        this.resourceTypesMetadata = resourceTypesMetadata;
        this.publisherMetadata = publisherMetadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.importContract = importContract;
        this.defaultParameterValues = defaultParameterValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique immutable identifier that was assigned when the Package was registered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique immutable identifier that was assigned when the Package was registered.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * ID of the publisher providing the package.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
        private String publisherId;

        /**
         * ID of the publisher providing the package.
         *
         * @param publisherId the value to set
         * @return this builder
         **/
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            this.__explicitlySet__.add("publisherId");
            return this;
        }
        /**
         * Name of package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of package.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display name for the package (displayed in UI and user-facing applications).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the package (displayed in UI and user-facing applications).
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Version of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the package.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * When the package was uploaded. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
        private java.util.Date timeUploaded;

        /**
         * When the package was uploaded. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timeUploaded the value to set
         * @return this builder
         **/
        public Builder timeUploaded(java.util.Date timeUploaded) {
            this.timeUploaded = timeUploaded;
            this.__explicitlySet__.add("timeUploaded");
            return this;
        }
        /**
         * When the package was last published. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        /**
         * When the package was last published. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timePublished the value to set
         * @return this builder
         **/
        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }
        /**
         * Description of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the package.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A list of resource types describing the content of the package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
        private java.util.List<String> resourceTypes;

        /**
         * A list of resource types describing the content of the package.
         * @param resourceTypes the value to set
         * @return this builder
         **/
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            this.__explicitlySet__.add("resourceTypes");
            return this;
        }
        /**
         * A map of resource type to metadata key/value map that further describes the content for the resource types in this package.. Keys are resource type names, values are a map of name/value pairs per resource type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesMetadata")
        private java.util.List<ResourceTypeMetadata> resourceTypesMetadata;

        /**
         * A map of resource type to metadata key/value map that further describes the content for the resource types in this package.. Keys are resource type names, values are a map of name/value pairs per resource type.
         * @param resourceTypesMetadata the value to set
         * @return this builder
         **/
        public Builder resourceTypesMetadata(
                java.util.List<ResourceTypeMetadata> resourceTypesMetadata) {
            this.resourceTypesMetadata = resourceTypesMetadata;
            this.__explicitlySet__.add("resourceTypesMetadata");
            return this;
        }
        /**
         * A map of metadata key/value pairs that further describes the publisher and the platform in which the package might be used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherMetadata")
        private java.util.List<MetadataProperty> publisherMetadata;

        /**
         * A map of metadata key/value pairs that further describes the publisher and the platform in which the package might be used.
         * @param publisherMetadata the value to set
         * @return this builder
         **/
        public Builder publisherMetadata(java.util.List<MetadataProperty> publisherMetadata) {
            this.publisherMetadata = publisherMetadata;
            this.__explicitlySet__.add("publisherMetadata");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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

        @com.fasterxml.jackson.annotation.JsonProperty("importContract")
        private ImportContract importContract;

        public Builder importContract(ImportContract importContract) {
            this.importContract = importContract;
            this.__explicitlySet__.add("importContract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultParameterValues")
        private DefaultParameterValues defaultParameterValues;

        public Builder defaultParameterValues(DefaultParameterValues defaultParameterValues) {
            this.defaultParameterValues = defaultParameterValues;
            this.__explicitlySet__.add("defaultParameterValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PackageItem build() {
            PackageItem __instance__ =
                    new PackageItem(
                            id,
                            publisherId,
                            name,
                            displayName,
                            version,
                            timeUploaded,
                            timePublished,
                            description,
                            resourceTypes,
                            resourceTypesMetadata,
                            publisherMetadata,
                            freeformTags,
                            definedTags,
                            importContract,
                            defaultParameterValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageItem o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .publisherId(o.getPublisherId())
                            .name(o.getName())
                            .displayName(o.getDisplayName())
                            .version(o.getVersion())
                            .timeUploaded(o.getTimeUploaded())
                            .timePublished(o.getTimePublished())
                            .description(o.getDescription())
                            .resourceTypes(o.getResourceTypes())
                            .resourceTypesMetadata(o.getResourceTypesMetadata())
                            .publisherMetadata(o.getPublisherMetadata())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .importContract(o.getImportContract())
                            .defaultParameterValues(o.getDefaultParameterValues());

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
     * Unique immutable identifier that was assigned when the Package was registered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique immutable identifier that was assigned when the Package was registered.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * ID of the publisher providing the package.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
    private final String publisherId;

    /**
     * ID of the publisher providing the package.
     *
     * @return the value
     **/
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Name of package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of package.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display name for the package (displayed in UI and user-facing applications).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the package (displayed in UI and user-facing applications).
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Version of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the package.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * When the package was uploaded. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
    private final java.util.Date timeUploaded;

    /**
     * When the package was uploaded. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeUploaded() {
        return timeUploaded;
    }

    /**
     * When the package was last published. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

    /**
     * When the package was last published. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimePublished() {
        return timePublished;
    }

    /**
     * Description of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the package.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A list of resource types describing the content of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
    private final java.util.List<String> resourceTypes;

    /**
     * A list of resource types describing the content of the package.
     * @return the value
     **/
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * A map of resource type to metadata key/value map that further describes the content for the resource types in this package.. Keys are resource type names, values are a map of name/value pairs per resource type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesMetadata")
    private final java.util.List<ResourceTypeMetadata> resourceTypesMetadata;

    /**
     * A map of resource type to metadata key/value map that further describes the content for the resource types in this package.. Keys are resource type names, values are a map of name/value pairs per resource type.
     * @return the value
     **/
    public java.util.List<ResourceTypeMetadata> getResourceTypesMetadata() {
        return resourceTypesMetadata;
    }

    /**
     * A map of metadata key/value pairs that further describes the publisher and the platform in which the package might be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherMetadata")
    private final java.util.List<MetadataProperty> publisherMetadata;

    /**
     * A map of metadata key/value pairs that further describes the publisher and the platform in which the package might be used.
     * @return the value
     **/
    public java.util.List<MetadataProperty> getPublisherMetadata() {
        return publisherMetadata;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("importContract")
    private final ImportContract importContract;

    public ImportContract getImportContract() {
        return importContract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultParameterValues")
    private final DefaultParameterValues defaultParameterValues;

    public DefaultParameterValues getDefaultParameterValues() {
        return defaultParameterValues;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PackageItem(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", publisherId=").append(String.valueOf(this.publisherId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", timeUploaded=").append(String.valueOf(this.timeUploaded));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceTypes=").append(String.valueOf(this.resourceTypes));
        sb.append(", resourceTypesMetadata=").append(String.valueOf(this.resourceTypesMetadata));
        sb.append(", publisherMetadata=").append(String.valueOf(this.publisherMetadata));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", importContract=").append(String.valueOf(this.importContract));
        sb.append(", defaultParameterValues=").append(String.valueOf(this.defaultParameterValues));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageItem)) {
            return false;
        }

        PackageItem other = (PackageItem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.timeUploaded, other.timeUploaded)
                && java.util.Objects.equals(this.timePublished, other.timePublished)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceTypes, other.resourceTypes)
                && java.util.Objects.equals(this.resourceTypesMetadata, other.resourceTypesMetadata)
                && java.util.Objects.equals(this.publisherMetadata, other.publisherMetadata)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.importContract, other.importContract)
                && java.util.Objects.equals(
                        this.defaultParameterValues, other.defaultParameterValues)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.timeUploaded == null ? 43 : this.timeUploaded.hashCode());
        result =
                (result * PRIME)
                        + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypes == null ? 43 : this.resourceTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypesMetadata == null
                                ? 43
                                : this.resourceTypesMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.publisherMetadata == null ? 43 : this.publisherMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.importContract == null ? 43 : this.importContract.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultParameterValues == null
                                ? 43
                                : this.defaultParameterValues.hashCode());
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
