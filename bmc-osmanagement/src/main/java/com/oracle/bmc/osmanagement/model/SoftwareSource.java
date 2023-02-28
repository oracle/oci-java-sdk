/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A software source contains a collection of packages <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SoftwareSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SoftwareSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "repoType",
        "archType",
        "url",
        "parentId",
        "parentName",
        "checksumType",
        "maintainerName",
        "maintainerEmail",
        "maintainerPhone",
        "gpgKeyUrl",
        "gpgKeyId",
        "gpgKeyFingerprint",
        "status",
        "lifecycleState",
        "packages",
        "associatedManagedInstances",
        "freeformTags",
        "definedTags"
    })
    public SoftwareSource(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String repoType,
            ArchTypes archType,
            String url,
            String parentId,
            String parentName,
            ChecksumTypes checksumType,
            String maintainerName,
            String maintainerEmail,
            String maintainerPhone,
            String gpgKeyUrl,
            String gpgKeyId,
            String gpgKeyFingerprint,
            Status status,
            LifecycleStates lifecycleState,
            Integer packages,
            java.util.List<Id> associatedManagedInstances,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.repoType = repoType;
        this.archType = archType;
        this.url = url;
        this.parentId = parentId;
        this.parentName = parentName;
        this.checksumType = checksumType;
        this.maintainerName = maintainerName;
        this.maintainerEmail = maintainerEmail;
        this.maintainerPhone = maintainerPhone;
        this.gpgKeyUrl = gpgKeyUrl;
        this.gpgKeyId = gpgKeyId;
        this.gpgKeyFingerprint = gpgKeyFingerprint;
        this.status = status;
        this.lifecycleState = lifecycleState;
        this.packages = packages;
        this.associatedManagedInstances = associatedManagedInstances;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID for the Software Source */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the Software Source
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID for the Compartment */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** User friendly name for the software source */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User friendly name for the software source
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Information specified by the user about the software source */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information specified by the user about the software source
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Type of the Software Source */
        @com.fasterxml.jackson.annotation.JsonProperty("repoType")
        private String repoType;

        /**
         * Type of the Software Source
         *
         * @param repoType the value to set
         * @return this builder
         */
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            this.__explicitlySet__.add("repoType");
            return this;
        }
        /** The architecture type supported by the Software Source */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchTypes archType;

        /**
         * The architecture type supported by the Software Source
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchTypes archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /** URL for the repostiory */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * URL for the repostiory
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** OCID for the parent software source, if there is one */
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * OCID for the parent software source, if there is one
         *
         * @param parentId the value to set
         * @return this builder
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /** Display name the parent software source, if there is one */
        @com.fasterxml.jackson.annotation.JsonProperty("parentName")
        private String parentName;

        /**
         * Display name the parent software source, if there is one
         *
         * @param parentName the value to set
         * @return this builder
         */
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            this.__explicitlySet__.add("parentName");
            return this;
        }
        /** The yum repository checksum type used by this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumTypes checksumType;

        /**
         * The yum repository checksum type used by this software source
         *
         * @param checksumType the value to set
         * @return this builder
         */
        public Builder checksumType(ChecksumTypes checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }
        /** Name of the person maintaining this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
        private String maintainerName;

        /**
         * Name of the person maintaining this software source
         *
         * @param maintainerName the value to set
         * @return this builder
         */
        public Builder maintainerName(String maintainerName) {
            this.maintainerName = maintainerName;
            this.__explicitlySet__.add("maintainerName");
            return this;
        }
        /** Email address of the person maintaining this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
        private String maintainerEmail;

        /**
         * Email address of the person maintaining this software source
         *
         * @param maintainerEmail the value to set
         * @return this builder
         */
        public Builder maintainerEmail(String maintainerEmail) {
            this.maintainerEmail = maintainerEmail;
            this.__explicitlySet__.add("maintainerEmail");
            return this;
        }
        /** Phone number of the person maintaining this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
        private String maintainerPhone;

        /**
         * Phone number of the person maintaining this software source
         *
         * @param maintainerPhone the value to set
         * @return this builder
         */
        public Builder maintainerPhone(String maintainerPhone) {
            this.maintainerPhone = maintainerPhone;
            this.__explicitlySet__.add("maintainerPhone");
            return this;
        }
        /** URL of the GPG key for this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
        private String gpgKeyUrl;

        /**
         * URL of the GPG key for this software source
         *
         * @param gpgKeyUrl the value to set
         * @return this builder
         */
        public Builder gpgKeyUrl(String gpgKeyUrl) {
            this.gpgKeyUrl = gpgKeyUrl;
            this.__explicitlySet__.add("gpgKeyUrl");
            return this;
        }
        /** ID of the GPG key for this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyId")
        private String gpgKeyId;

        /**
         * ID of the GPG key for this software source
         *
         * @param gpgKeyId the value to set
         * @return this builder
         */
        public Builder gpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            this.__explicitlySet__.add("gpgKeyId");
            return this;
        }
        /** Fingerprint of the GPG key for this software source */
        @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyFingerprint")
        private String gpgKeyFingerprint;

        /**
         * Fingerprint of the GPG key for this software source
         *
         * @param gpgKeyFingerprint the value to set
         * @return this builder
         */
        public Builder gpgKeyFingerprint(String gpgKeyFingerprint) {
            this.gpgKeyFingerprint = gpgKeyFingerprint;
            this.__explicitlySet__.add("gpgKeyFingerprint");
            return this;
        }
        /** status of the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status of the software source.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The current state of the Software Source. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the Software Source.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Number of packages */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private Integer packages;

        /**
         * Number of packages
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(Integer packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }
        /** list of the Managed Instances associated with this Software Sources */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedManagedInstances")
        private java.util.List<Id> associatedManagedInstances;

        /**
         * list of the Managed Instances associated with this Software Sources
         *
         * @param associatedManagedInstances the value to set
         * @return this builder
         */
        public Builder associatedManagedInstances(java.util.List<Id> associatedManagedInstances) {
            this.associatedManagedInstances = associatedManagedInstances;
            this.__explicitlySet__.add("associatedManagedInstances");
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

        public SoftwareSource build() {
            SoftwareSource model =
                    new SoftwareSource(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.repoType,
                            this.archType,
                            this.url,
                            this.parentId,
                            this.parentName,
                            this.checksumType,
                            this.maintainerName,
                            this.maintainerEmail,
                            this.maintainerPhone,
                            this.gpgKeyUrl,
                            this.gpgKeyId,
                            this.gpgKeyFingerprint,
                            this.status,
                            this.lifecycleState,
                            this.packages,
                            this.associatedManagedInstances,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
            if (model.wasPropertyExplicitlySet("repoType")) {
                this.repoType(model.getRepoType());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("parentName")) {
                this.parentName(model.getParentName());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("maintainerName")) {
                this.maintainerName(model.getMaintainerName());
            }
            if (model.wasPropertyExplicitlySet("maintainerEmail")) {
                this.maintainerEmail(model.getMaintainerEmail());
            }
            if (model.wasPropertyExplicitlySet("maintainerPhone")) {
                this.maintainerPhone(model.getMaintainerPhone());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyUrl")) {
                this.gpgKeyUrl(model.getGpgKeyUrl());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyId")) {
                this.gpgKeyId(model.getGpgKeyId());
            }
            if (model.wasPropertyExplicitlySet("gpgKeyFingerprint")) {
                this.gpgKeyFingerprint(model.getGpgKeyFingerprint());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
            }
            if (model.wasPropertyExplicitlySet("associatedManagedInstances")) {
                this.associatedManagedInstances(model.getAssociatedManagedInstances());
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

    /** OCID for the Software Source */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the Software Source
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID for the Compartment */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** User friendly name for the software source */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User friendly name for the software source
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Information specified by the user about the software source */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information specified by the user about the software source
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Type of the Software Source */
    @com.fasterxml.jackson.annotation.JsonProperty("repoType")
    private final String repoType;

    /**
     * Type of the Software Source
     *
     * @return the value
     */
    public String getRepoType() {
        return repoType;
    }

    /** The architecture type supported by the Software Source */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchTypes archType;

    /**
     * The architecture type supported by the Software Source
     *
     * @return the value
     */
    public ArchTypes getArchType() {
        return archType;
    }

    /** URL for the repostiory */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL for the repostiory
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** OCID for the parent software source, if there is one */
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * OCID for the parent software source, if there is one
     *
     * @return the value
     */
    public String getParentId() {
        return parentId;
    }

    /** Display name the parent software source, if there is one */
    @com.fasterxml.jackson.annotation.JsonProperty("parentName")
    private final String parentName;

    /**
     * Display name the parent software source, if there is one
     *
     * @return the value
     */
    public String getParentName() {
        return parentName;
    }

    /** The yum repository checksum type used by this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    private final ChecksumTypes checksumType;

    /**
     * The yum repository checksum type used by this software source
     *
     * @return the value
     */
    public ChecksumTypes getChecksumType() {
        return checksumType;
    }

    /** Name of the person maintaining this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerName")
    private final String maintainerName;

    /**
     * Name of the person maintaining this software source
     *
     * @return the value
     */
    public String getMaintainerName() {
        return maintainerName;
    }

    /** Email address of the person maintaining this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerEmail")
    private final String maintainerEmail;

    /**
     * Email address of the person maintaining this software source
     *
     * @return the value
     */
    public String getMaintainerEmail() {
        return maintainerEmail;
    }

    /** Phone number of the person maintaining this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("maintainerPhone")
    private final String maintainerPhone;

    /**
     * Phone number of the person maintaining this software source
     *
     * @return the value
     */
    public String getMaintainerPhone() {
        return maintainerPhone;
    }

    /** URL of the GPG key for this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyUrl")
    private final String gpgKeyUrl;

    /**
     * URL of the GPG key for this software source
     *
     * @return the value
     */
    public String getGpgKeyUrl() {
        return gpgKeyUrl;
    }

    /** ID of the GPG key for this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyId")
    private final String gpgKeyId;

    /**
     * ID of the GPG key for this software source
     *
     * @return the value
     */
    public String getGpgKeyId() {
        return gpgKeyId;
    }

    /** Fingerprint of the GPG key for this software source */
    @com.fasterxml.jackson.annotation.JsonProperty("gpgKeyFingerprint")
    private final String gpgKeyFingerprint;

    /**
     * Fingerprint of the GPG key for this software source
     *
     * @return the value
     */
    public String getGpgKeyFingerprint() {
        return gpgKeyFingerprint;
    }

    /** status of the software source. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

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
    /** status of the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status of the software source.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The current state of the Software Source. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the Software Source.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Number of packages */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final Integer packages;

    /**
     * Number of packages
     *
     * @return the value
     */
    public Integer getPackages() {
        return packages;
    }

    /** list of the Managed Instances associated with this Software Sources */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedManagedInstances")
    private final java.util.List<Id> associatedManagedInstances;

    /**
     * list of the Managed Instances associated with this Software Sources
     *
     * @return the value
     */
    public java.util.List<Id> getAssociatedManagedInstances() {
        return associatedManagedInstances;
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
        sb.append("SoftwareSource(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", repoType=").append(String.valueOf(this.repoType));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", parentName=").append(String.valueOf(this.parentName));
        sb.append(", checksumType=").append(String.valueOf(this.checksumType));
        sb.append(", maintainerName=").append(String.valueOf(this.maintainerName));
        sb.append(", maintainerEmail=").append(String.valueOf(this.maintainerEmail));
        sb.append(", maintainerPhone=").append(String.valueOf(this.maintainerPhone));
        sb.append(", gpgKeyUrl=").append(String.valueOf(this.gpgKeyUrl));
        sb.append(", gpgKeyId=").append(String.valueOf(this.gpgKeyId));
        sb.append(", gpgKeyFingerprint=").append(String.valueOf(this.gpgKeyFingerprint));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(", associatedManagedInstances=")
                .append(String.valueOf(this.associatedManagedInstances));
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
        if (!(o instanceof SoftwareSource)) {
            return false;
        }

        SoftwareSource other = (SoftwareSource) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.repoType, other.repoType)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.parentName, other.parentName)
                && java.util.Objects.equals(this.checksumType, other.checksumType)
                && java.util.Objects.equals(this.maintainerName, other.maintainerName)
                && java.util.Objects.equals(this.maintainerEmail, other.maintainerEmail)
                && java.util.Objects.equals(this.maintainerPhone, other.maintainerPhone)
                && java.util.Objects.equals(this.gpgKeyUrl, other.gpgKeyUrl)
                && java.util.Objects.equals(this.gpgKeyId, other.gpgKeyId)
                && java.util.Objects.equals(this.gpgKeyFingerprint, other.gpgKeyFingerprint)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(
                        this.associatedManagedInstances, other.associatedManagedInstances)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.repoType == null ? 43 : this.repoType.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.parentName == null ? 43 : this.parentName.hashCode());
        result = (result * PRIME) + (this.checksumType == null ? 43 : this.checksumType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerName == null ? 43 : this.maintainerName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerEmail == null ? 43 : this.maintainerEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.maintainerPhone == null ? 43 : this.maintainerPhone.hashCode());
        result = (result * PRIME) + (this.gpgKeyUrl == null ? 43 : this.gpgKeyUrl.hashCode());
        result = (result * PRIME) + (this.gpgKeyId == null ? 43 : this.gpgKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.gpgKeyFingerprint == null ? 43 : this.gpgKeyFingerprint.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedManagedInstances == null
                                ? 43
                                : this.associatedManagedInstances.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
