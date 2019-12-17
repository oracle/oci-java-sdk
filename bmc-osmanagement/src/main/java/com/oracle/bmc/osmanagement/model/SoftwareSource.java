/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A software source contains a collection of packages
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SoftwareSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SoftwareSource {
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

        @com.fasterxml.jackson.annotation.JsonProperty("repoType")
        private String repoType;

        public Builder repoType(String repoType) {
            this.repoType = repoType;
            this.__explicitlySet__.add("repoType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchTypes archType;

        public Builder archType(ArchTypes archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentName")
        private String parentName;

        public Builder parentName(String parentName) {
            this.parentName = parentName;
            this.__explicitlySet__.add("parentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumTypes checksumType;

        public Builder checksumType(ChecksumTypes checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
        private String gpgKeyUrl;

        public Builder gpgKeyUrl(String gpgKeyUrl) {
            this.gpgKeyUrl = gpgKeyUrl;
            this.__explicitlySet__.add("gpgKeyUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyId")
        private String gpgKeyId;

        public Builder gpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            this.__explicitlySet__.add("gpgKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyFingerprint")
        private String gpgKeyFingerprint;

        public Builder gpgKeyFingerprint(String gpgKeyFingerprint) {
            this.gpgKeyFingerprint = gpgKeyFingerprint;
            this.__explicitlySet__.add("gpgKeyFingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private Integer packages;

        public Builder packages(Integer packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedManagedInstances")
        private java.util.List<Id> associatedManagedInstances;

        public Builder associatedManagedInstances(java.util.List<Id> associatedManagedInstances) {
            this.associatedManagedInstances = associatedManagedInstances;
            this.__explicitlySet__.add("associatedManagedInstances");
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

        public SoftwareSource build() {
            SoftwareSource __instance__ =
                    new SoftwareSource(
                            id,
                            compartmentId,
                            displayName,
                            description,
                            repoType,
                            archType,
                            url,
                            parentId,
                            parentName,
                            checksumType,
                            maintainerName,
                            maintainerEmail,
                            maintainerPhone,
                            gpgKeyUrl,
                            gpgKeyId,
                            gpgKeyFingerprint,
                            status,
                            lifecycleState,
                            packages,
                            associatedManagedInstances,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSource o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .repoType(o.getRepoType())
                            .archType(o.getArchType())
                            .url(o.getUrl())
                            .parentId(o.getParentId())
                            .parentName(o.getParentName())
                            .checksumType(o.getChecksumType())
                            .maintainerName(o.getMaintainerName())
                            .maintainerEmail(o.getMaintainerEmail())
                            .maintainerPhone(o.getMaintainerPhone())
                            .gpgKeyUrl(o.getGpgKeyUrl())
                            .gpgKeyId(o.getGpgKeyId())
                            .gpgKeyFingerprint(o.getGpgKeyFingerprint())
                            .status(o.getStatus())
                            .lifecycleState(o.getLifecycleState())
                            .packages(o.getPackages())
                            .associatedManagedInstances(o.getAssociatedManagedInstances())
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
     * OCID for the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

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
     * Type of the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repoType")
    String repoType;

    /**
     * The architecture type supported by the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    ArchTypes archType;

    /**
     * URL for the repostiory
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    /**
     * OCID for the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    String parentId;

    /**
     * Display name the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentName")
    String parentName;

    /**
     * The yum repository checksum type used by this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    ChecksumTypes checksumType;

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
     * URL of the GPG key for this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
    String gpgKeyUrl;

    /**
     * ID of the GPG key for this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyId")
    String gpgKeyId;

    /**
     * Fingerprint of the GPG key for this software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyFingerprint")
    String gpgKeyFingerprint;
    /**
     * status of the software source.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status of the software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The current state of the Software Source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * Number of packages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    Integer packages;

    /**
     * list of the Managed Instances associated with this Software Sources
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedManagedInstances")
    java.util.List<Id> associatedManagedInstances;

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
