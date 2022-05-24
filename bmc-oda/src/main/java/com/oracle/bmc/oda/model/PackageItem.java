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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PackageItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PackageItem {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
        private String publisherId;

        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            this.__explicitlySet__.add("publisherId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
        private java.util.Date timeUploaded;

        public Builder timeUploaded(java.util.Date timeUploaded) {
            this.timeUploaded = timeUploaded;
            this.__explicitlySet__.add("timeUploaded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
        private java.util.Date timePublished;

        public Builder timePublished(java.util.Date timePublished) {
            this.timePublished = timePublished;
            this.__explicitlySet__.add("timePublished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
        private java.util.List<String> resourceTypes;

        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            this.__explicitlySet__.add("resourceTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesMetadata")
        private java.util.List<ResourceTypeMetadata> resourceTypesMetadata;

        public Builder resourceTypesMetadata(
                java.util.List<ResourceTypeMetadata> resourceTypesMetadata) {
            this.resourceTypesMetadata = resourceTypesMetadata;
            this.__explicitlySet__.add("resourceTypesMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publisherMetadata")
        private java.util.List<MetadataProperty> publisherMetadata;

        public Builder publisherMetadata(java.util.List<MetadataProperty> publisherMetadata) {
            this.publisherMetadata = publisherMetadata;
            this.__explicitlySet__.add("publisherMetadata");
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

    /**
     * Unique immutable identifier that was assigned when the Package was registered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * ID of the publisher providing the package.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
    String publisherId;

    /**
     * Name of package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Display name for the package (displayed in UI and user-facing applications).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Version of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * When the package was uploaded. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
    java.util.Date timeUploaded;

    /**
     * When the package was last published. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    java.util.Date timePublished;

    /**
     * Description of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A list of resource types describing the content of the package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypes")
    java.util.List<String> resourceTypes;

    /**
     * A map of resource type to metadata key/value map that further describes the content for the resource types in this package.. Keys are resource type names, values are a map of name/value pairs per resource type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesMetadata")
    java.util.List<ResourceTypeMetadata> resourceTypesMetadata;

    /**
     * A map of metadata key/value pairs that further describes the publisher and the platform in which the package might be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherMetadata")
    java.util.List<MetadataProperty> publisherMetadata;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonProperty("importContract")
    ImportContract importContract;

    @com.fasterxml.jackson.annotation.JsonProperty("defaultParameterValues")
    DefaultParameterValues defaultParameterValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
