/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * A summary of available OCI-managed protection capabilities in WebAppFirewallPolicy. Protection
 * capabilies checks HTTP requests/responses if they are malicious. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProtectionCapabilitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProtectionCapabilitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "version",
        "isLatestVersion",
        "groupTags",
        "type",
        "collaborativeActionThreshold",
        "collaborativeWeights"
    })
    public ProtectionCapabilitySummary(
            String key,
            String displayName,
            String description,
            Integer version,
            Boolean isLatestVersion,
            java.util.List<String> groupTags,
            Type type,
            Integer collaborativeActionThreshold,
            java.util.List<CollaborativeCapabilityWeight> collaborativeWeights) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.version = version;
        this.isLatestVersion = isLatestVersion;
        this.groupTags = groupTags;
        this.type = type;
        this.collaborativeActionThreshold = collaborativeActionThreshold;
        this.collaborativeWeights = collaborativeWeights;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique key of protection capability. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of protection capability.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The display name of protection capability. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of protection capability.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of protection capability. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of protection capability.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The version of protection capability. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version of protection capability.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The field that shows if this is the latest version of protection capability. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
        private Boolean isLatestVersion;

        /**
         * The field that shows if this is the latest version of protection capability.
         *
         * @param isLatestVersion the value to set
         * @return this builder
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            this.__explicitlySet__.add("isLatestVersion");
            return this;
        }
        /**
         * The list of unique names protection capability group tags that are associated with this
         * capability. Example: ["PCI", "Recommended"]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupTags")
        private java.util.List<String> groupTags;

        /**
         * The list of unique names protection capability group tags that are associated with this
         * capability. Example: ["PCI", "Recommended"]
         *
         * @param groupTags the value to set
         * @return this builder
         */
        public Builder groupTags(java.util.List<String> groupTags) {
            this.groupTags = groupTags;
            this.__explicitlySet__.add("groupTags");
            return this;
        }
        /**
         * The type of protection capability.
         *
         * <p>**REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module
         * of WebAppFirewallPolicy.
         *
         * <p>**RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection}
         * module of WebAppFirewallPolicy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of protection capability.
         *
         * <p>**REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module
         * of WebAppFirewallPolicy.
         *
         * <p>**RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection}
         * module of WebAppFirewallPolicy.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The default collaborative action threshold for OCI-managed collaborative protection
         * capability. Collaborative protection capabilities are made of several simple,
         * non-collaborative protection capabilities (referred to as {@code contributing
         * capabilities} later on) which have weights assigned to them. These weights can be found
         * in the {@code collaborativeWeights} array. For incoming/outgoing HTTP messages, all
         * contributing capabilities are executed and the sum of all triggered contributing
         * capabilities weights is calculated. Only if this sum is greater than or equal to {@code
         * collaborativeActionThreshold} is the incoming/outgoing HTTP message marked as malicious.
         *
         * <p>This field is ignored for non-collaborative capabilities.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
        private Integer collaborativeActionThreshold;

        /**
         * The default collaborative action threshold for OCI-managed collaborative protection
         * capability. Collaborative protection capabilities are made of several simple,
         * non-collaborative protection capabilities (referred to as {@code contributing
         * capabilities} later on) which have weights assigned to them. These weights can be found
         * in the {@code collaborativeWeights} array. For incoming/outgoing HTTP messages, all
         * contributing capabilities are executed and the sum of all triggered contributing
         * capabilities weights is calculated. Only if this sum is greater than or equal to {@code
         * collaborativeActionThreshold} is the incoming/outgoing HTTP message marked as malicious.
         *
         * <p>This field is ignored for non-collaborative capabilities.
         *
         * @param collaborativeActionThreshold the value to set
         * @return this builder
         */
        public Builder collaborativeActionThreshold(Integer collaborativeActionThreshold) {
            this.collaborativeActionThreshold = collaborativeActionThreshold;
            this.__explicitlySet__.add("collaborativeActionThreshold");
            return this;
        }
        /**
         * The weights of contributing capabilities. Defines how much each contributing capability
         * contributes towards the action threshold of a collaborative protection capability.
         *
         * <p>This field is ignored for non-collaborative capabilities.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
        private java.util.List<CollaborativeCapabilityWeight> collaborativeWeights;

        /**
         * The weights of contributing capabilities. Defines how much each contributing capability
         * contributes towards the action threshold of a collaborative protection capability.
         *
         * <p>This field is ignored for non-collaborative capabilities.
         *
         * @param collaborativeWeights the value to set
         * @return this builder
         */
        public Builder collaborativeWeights(
                java.util.List<CollaborativeCapabilityWeight> collaborativeWeights) {
            this.collaborativeWeights = collaborativeWeights;
            this.__explicitlySet__.add("collaborativeWeights");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilitySummary build() {
            ProtectionCapabilitySummary model =
                    new ProtectionCapabilitySummary(
                            this.key,
                            this.displayName,
                            this.description,
                            this.version,
                            this.isLatestVersion,
                            this.groupTags,
                            this.type,
                            this.collaborativeActionThreshold,
                            this.collaborativeWeights);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilitySummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isLatestVersion")) {
                this.isLatestVersion(model.getIsLatestVersion());
            }
            if (model.wasPropertyExplicitlySet("groupTags")) {
                this.groupTags(model.getGroupTags());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("collaborativeActionThreshold")) {
                this.collaborativeActionThreshold(model.getCollaborativeActionThreshold());
            }
            if (model.wasPropertyExplicitlySet("collaborativeWeights")) {
                this.collaborativeWeights(model.getCollaborativeWeights());
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

    /** Unique key of protection capability. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of protection capability.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The display name of protection capability. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of protection capability.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of protection capability. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of protection capability.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The version of protection capability. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version of protection capability.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /** The field that shows if this is the latest version of protection capability. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestVersion")
    private final Boolean isLatestVersion;

    /**
     * The field that shows if this is the latest version of protection capability.
     *
     * @return the value
     */
    public Boolean getIsLatestVersion() {
        return isLatestVersion;
    }

    /**
     * The list of unique names protection capability group tags that are associated with this
     * capability. Example: ["PCI", "Recommended"]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupTags")
    private final java.util.List<String> groupTags;

    /**
     * The list of unique names protection capability group tags that are associated with this
     * capability. Example: ["PCI", "Recommended"]
     *
     * @return the value
     */
    public java.util.List<String> getGroupTags() {
        return groupTags;
    }

    /**
     * The type of protection capability.
     *
     * <p>**REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module of
     * WebAppFirewallPolicy.
     *
     * <p>**RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection} module
     * of WebAppFirewallPolicy.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        RequestProtectionCapability("REQUEST_PROTECTION_CAPABILITY"),
        ResponseProtectionCapability("RESPONSE_PROTECTION_CAPABILITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of protection capability.
     *
     * <p>**REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module of
     * WebAppFirewallPolicy.
     *
     * <p>**RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection} module
     * of WebAppFirewallPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of protection capability.
     *
     * <p>**REQUEST_PROTECTION_CAPABILITY** can only be used in {@code requestProtection} module of
     * WebAppFirewallPolicy.
     *
     * <p>**RESPONSE_PROTECTION_CAPABILITY** can only be used in {@code responseProtection} module
     * of WebAppFirewallPolicy.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The default collaborative action threshold for OCI-managed collaborative protection
     * capability. Collaborative protection capabilities are made of several simple,
     * non-collaborative protection capabilities (referred to as {@code contributing capabilities}
     * later on) which have weights assigned to them. These weights can be found in the {@code
     * collaborativeWeights} array. For incoming/outgoing HTTP messages, all contributing
     * capabilities are executed and the sum of all triggered contributing capabilities weights is
     * calculated. Only if this sum is greater than or equal to {@code collaborativeActionThreshold}
     * is the incoming/outgoing HTTP message marked as malicious.
     *
     * <p>This field is ignored for non-collaborative capabilities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeActionThreshold")
    private final Integer collaborativeActionThreshold;

    /**
     * The default collaborative action threshold for OCI-managed collaborative protection
     * capability. Collaborative protection capabilities are made of several simple,
     * non-collaborative protection capabilities (referred to as {@code contributing capabilities}
     * later on) which have weights assigned to them. These weights can be found in the {@code
     * collaborativeWeights} array. For incoming/outgoing HTTP messages, all contributing
     * capabilities are executed and the sum of all triggered contributing capabilities weights is
     * calculated. Only if this sum is greater than or equal to {@code collaborativeActionThreshold}
     * is the incoming/outgoing HTTP message marked as malicious.
     *
     * <p>This field is ignored for non-collaborative capabilities.
     *
     * @return the value
     */
    public Integer getCollaborativeActionThreshold() {
        return collaborativeActionThreshold;
    }

    /**
     * The weights of contributing capabilities. Defines how much each contributing capability
     * contributes towards the action threshold of a collaborative protection capability.
     *
     * <p>This field is ignored for non-collaborative capabilities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collaborativeWeights")
    private final java.util.List<CollaborativeCapabilityWeight> collaborativeWeights;

    /**
     * The weights of contributing capabilities. Defines how much each contributing capability
     * contributes towards the action threshold of a collaborative protection capability.
     *
     * <p>This field is ignored for non-collaborative capabilities.
     *
     * @return the value
     */
    public java.util.List<CollaborativeCapabilityWeight> getCollaborativeWeights() {
        return collaborativeWeights;
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
        sb.append("ProtectionCapabilitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", isLatestVersion=").append(String.valueOf(this.isLatestVersion));
        sb.append(", groupTags=").append(String.valueOf(this.groupTags));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", collaborativeActionThreshold=")
                .append(String.valueOf(this.collaborativeActionThreshold));
        sb.append(", collaborativeWeights=").append(String.valueOf(this.collaborativeWeights));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProtectionCapabilitySummary)) {
            return false;
        }

        ProtectionCapabilitySummary other = (ProtectionCapabilitySummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.isLatestVersion, other.isLatestVersion)
                && java.util.Objects.equals(this.groupTags, other.groupTags)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.collaborativeActionThreshold, other.collaborativeActionThreshold)
                && java.util.Objects.equals(this.collaborativeWeights, other.collaborativeWeights)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestVersion == null ? 43 : this.isLatestVersion.hashCode());
        result = (result * PRIME) + (this.groupTags == null ? 43 : this.groupTags.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.collaborativeActionThreshold == null
                                ? 43
                                : this.collaborativeActionThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.collaborativeWeights == null
                                ? 43
                                : this.collaborativeWeights.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
