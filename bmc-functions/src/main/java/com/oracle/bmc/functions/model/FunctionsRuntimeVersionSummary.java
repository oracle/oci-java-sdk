/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Summary of the FunctionsRuntimeVersion.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FunctionsRuntimeVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FunctionsRuntimeVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "functionsRuntimeId",
        "displayName",
        "osVersion",
        "languageVersion",
        "supportedArchitectures",
        "lifecycleState",
        "metadata",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public FunctionsRuntimeVersionSummary(
            String id,
            String functionsRuntimeId,
            String displayName,
            String osVersion,
            String languageVersion,
            java.util.List<SupportedArchitectures> supportedArchitectures,
            FunctionsRuntimeVersion.LifecycleState lifecycleState,
            String metadata,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.functionsRuntimeId = functionsRuntimeId;
        this.displayName = displayName;
        this.osVersion = osVersion;
        this.languageVersion = languageVersion;
        this.supportedArchitectures = supportedArchitectures;
        this.lifecycleState = lifecycleState;
        this.metadata = metadata;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the FunctionsRuntimeVersion that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the FunctionsRuntimeVersion that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the FunctionsRuntime this resource version belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeId")
        private String functionsRuntimeId;

        /**
         * The OCID of the FunctionsRuntime this resource version belongs to.
         * @param functionsRuntimeId the value to set
         * @return this builder
         **/
        public Builder functionsRuntimeId(String functionsRuntimeId) {
            this.functionsRuntimeId = functionsRuntimeId;
            this.__explicitlySet__.add("functionsRuntimeId");
            return this;
        }
        /**
         * The display name of the FunctionsRuntimeVersion.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the FunctionsRuntimeVersion.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The version of the operating system of the FunctionsRuntime. This is the OS version that the FunctionsRuntime provides for execution of customer payloads.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * The version of the operating system of the FunctionsRuntime. This is the OS version that the FunctionsRuntime provides for execution of customer payloads.
         *
         * @param osVersion the value to set
         * @return this builder
         **/
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /**
         * The version of the programming language of the FunctionsRuntime. This is the language version that the FunctionsRuntime provides for execution of customer payloads.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageVersion")
        private String languageVersion;

        /**
         * The version of the programming language of the FunctionsRuntime. This is the language version that the FunctionsRuntime provides for execution of customer payloads.
         *
         * @param languageVersion the value to set
         * @return this builder
         **/
        public Builder languageVersion(String languageVersion) {
            this.languageVersion = languageVersion;
            this.__explicitlySet__.add("languageVersion");
            return this;
        }
        /**
         * The list of supported architectures for the FunctionsRuntimeVersion.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedArchitectures")
        private java.util.List<SupportedArchitectures> supportedArchitectures;

        /**
         * The list of supported architectures for the FunctionsRuntimeVersion.
         *
         * @param supportedArchitectures the value to set
         * @return this builder
         **/
        public Builder supportedArchitectures(
                java.util.List<SupportedArchitectures> supportedArchitectures) {
            this.supportedArchitectures = supportedArchitectures;
            this.__explicitlySet__.add("supportedArchitectures");
            return this;
        }
        /**
         * The current state of the FunctionsRuntimeVersion resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private FunctionsRuntimeVersion.LifecycleState lifecycleState;

        /**
         * The current state of the FunctionsRuntimeVersion resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(FunctionsRuntimeVersion.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details of the change in the FunctionsRuntimeVersion of the FunctionsRuntime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * Details of the change in the FunctionsRuntimeVersion of the FunctionsRuntime.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The time when the FunctionsRuntimeVersion was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the FunctionsRuntimeVersion was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time when the FunctionsRuntimeVersion was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the FunctionsRuntimeVersion was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionsRuntimeVersionSummary build() {
            FunctionsRuntimeVersionSummary model =
                    new FunctionsRuntimeVersionSummary(
                            this.id,
                            this.functionsRuntimeId,
                            this.displayName,
                            this.osVersion,
                            this.languageVersion,
                            this.supportedArchitectures,
                            this.lifecycleState,
                            this.metadata,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionsRuntimeVersionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("functionsRuntimeId")) {
                this.functionsRuntimeId(model.getFunctionsRuntimeId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("osVersion")) {
                this.osVersion(model.getOsVersion());
            }
            if (model.wasPropertyExplicitlySet("languageVersion")) {
                this.languageVersion(model.getLanguageVersion());
            }
            if (model.wasPropertyExplicitlySet("supportedArchitectures")) {
                this.supportedArchitectures(model.getSupportedArchitectures());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The OCID of the FunctionsRuntimeVersion that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the FunctionsRuntimeVersion that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the FunctionsRuntime this resource version belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeId")
    private final String functionsRuntimeId;

    /**
     * The OCID of the FunctionsRuntime this resource version belongs to.
     * @return the value
     **/
    public String getFunctionsRuntimeId() {
        return functionsRuntimeId;
    }

    /**
     * The display name of the FunctionsRuntimeVersion.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the FunctionsRuntimeVersion.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The version of the operating system of the FunctionsRuntime. This is the OS version that the FunctionsRuntime provides for execution of customer payloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * The version of the operating system of the FunctionsRuntime. This is the OS version that the FunctionsRuntime provides for execution of customer payloads.
     *
     * @return the value
     **/
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * The version of the programming language of the FunctionsRuntime. This is the language version that the FunctionsRuntime provides for execution of customer payloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageVersion")
    private final String languageVersion;

    /**
     * The version of the programming language of the FunctionsRuntime. This is the language version that the FunctionsRuntime provides for execution of customer payloads.
     *
     * @return the value
     **/
    public String getLanguageVersion() {
        return languageVersion;
    }

    /**
     **/
    public enum SupportedArchitectures {
        Arm("ARM"),
        X86("X86"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SupportedArchitectures.class);

        private final String value;
        private static java.util.Map<String, SupportedArchitectures> map;

        static {
            map = new java.util.HashMap<>();
            for (SupportedArchitectures v : SupportedArchitectures.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SupportedArchitectures(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SupportedArchitectures create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SupportedArchitectures', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of supported architectures for the FunctionsRuntimeVersion.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedArchitectures")
    private final java.util.List<SupportedArchitectures> supportedArchitectures;

    /**
     * The list of supported architectures for the FunctionsRuntimeVersion.
     *
     * @return the value
     **/
    public java.util.List<SupportedArchitectures> getSupportedArchitectures() {
        return supportedArchitectures;
    }

    /**
     * The current state of the FunctionsRuntimeVersion resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final FunctionsRuntimeVersion.LifecycleState lifecycleState;

    /**
     * The current state of the FunctionsRuntimeVersion resource.
     * @return the value
     **/
    public FunctionsRuntimeVersion.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details of the change in the FunctionsRuntimeVersion of the FunctionsRuntime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * Details of the change in the FunctionsRuntimeVersion of the FunctionsRuntime.
     * @return the value
     **/
    public String getMetadata() {
        return metadata;
    }

    /**
     * The time when the FunctionsRuntimeVersion was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the FunctionsRuntimeVersion was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time when the FunctionsRuntimeVersion was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the FunctionsRuntimeVersion was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FunctionsRuntimeVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", functionsRuntimeId=").append(String.valueOf(this.functionsRuntimeId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", languageVersion=").append(String.valueOf(this.languageVersion));
        sb.append(", supportedArchitectures=").append(String.valueOf(this.supportedArchitectures));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof FunctionsRuntimeVersionSummary)) {
            return false;
        }

        FunctionsRuntimeVersionSummary other = (FunctionsRuntimeVersionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.functionsRuntimeId, other.functionsRuntimeId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.languageVersion, other.languageVersion)
                && java.util.Objects.equals(
                        this.supportedArchitectures, other.supportedArchitectures)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.functionsRuntimeId == null
                                ? 43
                                : this.functionsRuntimeId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.languageVersion == null ? 43 : this.languageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedArchitectures == null
                                ? 43
                                : this.supportedArchitectures.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
