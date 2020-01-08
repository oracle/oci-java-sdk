/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Description of a software source to be created on the management system
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSoftwareSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateSoftwareSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchTypes archType;

        public Builder archType(ArchTypes archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
        private String maintainerName;

        public Builder maintainerName(String maintainerName) {
            this.maintainerName = maintainerName;
            this.__explicitlySet__.add("maintainerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
        private String maintainerEmail;

        public Builder maintainerEmail(String maintainerEmail) {
            this.maintainerEmail = maintainerEmail;
            this.__explicitlySet__.add("maintainerEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
        private String maintainerPhone;

        public Builder maintainerPhone(String maintainerPhone) {
            this.maintainerPhone = maintainerPhone;
            this.__explicitlySet__.add("maintainerPhone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumTypes checksumType;

        public Builder checksumType(ChecksumTypes checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
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

        public CreateSoftwareSourceDetails build() {
            CreateSoftwareSourceDetails __instance__ =
                    new CreateSoftwareSourceDetails(
                            compartmentId,
                            displayName,
                            description,
                            archType,
                            maintainerName,
                            maintainerEmail,
                            maintainerPhone,
                            checksumType,
                            parentId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSoftwareSourceDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .archType(o.getArchType())
                            .maintainerName(o.getMaintainerName())
                            .maintainerEmail(o.getMaintainerEmail())
                            .maintainerPhone(o.getMaintainerPhone())
                            .checksumType(o.getChecksumType())
                            .parentId(o.getParentId())
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

    /**
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * User friendly name for the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Information specified by the user about the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The architecture type supported by the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    ArchTypes archType;

    /**
     * Name of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
    String maintainerName;

    /**
     * Email address of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
    String maintainerEmail;

    /**
     * Phone number of the person maintaining this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
    String maintainerPhone;

    /**
     * The yum repository checksum type used by this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    ChecksumTypes checksumType;

    /**
     * OCID for the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    String parentId;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
