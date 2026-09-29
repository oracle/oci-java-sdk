/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a discovered database resource and its Data Safe target registered via a registration
 * policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RegistrationPolicyTargetDatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegistrationPolicyTargetDatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "discoveredResourceId",
        "discoveredResourceType",
        "targetDatabaseId",
        "systemTags"
    })
    public RegistrationPolicyTargetDatabaseSummary(
            String discoveredResourceId,
            DiscoveredResourceType discoveredResourceType,
            String targetDatabaseId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.discoveredResourceId = discoveredResourceId;
        this.discoveredResourceType = discoveredResourceType;
        this.targetDatabaseId = targetDatabaseId;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the discovered database resource (for example, a Database or Pluggable
         * Database) that is part of discovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveredResourceId")
        private String discoveredResourceId;

        /**
         * The ID of the discovered database resource (for example, a Database or Pluggable
         * Database) that is part of discovery.
         *
         * @param discoveredResourceId the value to set
         * @return this builder
         */
        public Builder discoveredResourceId(String discoveredResourceId) {
            this.discoveredResourceId = discoveredResourceId;
            this.__explicitlySet__.add("discoveredResourceId");
            return this;
        }
        /** The type of the discovered database resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveredResourceType")
        private DiscoveredResourceType discoveredResourceType;

        /**
         * The type of the discovered database resource.
         *
         * @param discoveredResourceType the value to set
         * @return this builder
         */
        public Builder discoveredResourceType(DiscoveredResourceType discoveredResourceType) {
            this.discoveredResourceType = discoveredResourceType;
            this.__explicitlySet__.add("discoveredResourceType");
            return this;
        }
        /** The ID of the Data Safe Target Database associated with the discovered resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
        private String targetDatabaseId;

        /**
         * The ID of the Data Safe Target Database associated with the discovered resource.
         *
         * @param targetDatabaseId the value to set
         * @return this builder
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            this.__explicitlySet__.add("targetDatabaseId");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
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

        public RegistrationPolicyTargetDatabaseSummary build() {
            RegistrationPolicyTargetDatabaseSummary model =
                    new RegistrationPolicyTargetDatabaseSummary(
                            this.discoveredResourceId,
                            this.discoveredResourceType,
                            this.targetDatabaseId,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegistrationPolicyTargetDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("discoveredResourceId")) {
                this.discoveredResourceId(model.getDiscoveredResourceId());
            }
            if (model.wasPropertyExplicitlySet("discoveredResourceType")) {
                this.discoveredResourceType(model.getDiscoveredResourceType());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseId")) {
                this.targetDatabaseId(model.getTargetDatabaseId());
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

    /**
     * The ID of the discovered database resource (for example, a Database or Pluggable Database)
     * that is part of discovery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveredResourceId")
    private final String discoveredResourceId;

    /**
     * The ID of the discovered database resource (for example, a Database or Pluggable Database)
     * that is part of discovery.
     *
     * @return the value
     */
    public String getDiscoveredResourceId() {
        return discoveredResourceId;
    }

    /** The type of the discovered database resource. */
    public enum DiscoveredResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Database("DATABASE"),
        PluggableDatabase("PLUGGABLE_DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DiscoveredResourceType.class);

        private final String value;
        private static java.util.Map<String, DiscoveredResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveredResourceType v : DiscoveredResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DiscoveredResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveredResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiscoveredResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the discovered database resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveredResourceType")
    private final DiscoveredResourceType discoveredResourceType;

    /**
     * The type of the discovered database resource.
     *
     * @return the value
     */
    public DiscoveredResourceType getDiscoveredResourceType() {
        return discoveredResourceType;
    }

    /** The ID of the Data Safe Target Database associated with the discovered resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
    private final String targetDatabaseId;

    /**
     * The ID of the Data Safe Target Database associated with the discovered resource.
     *
     * @return the value
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
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
        sb.append("RegistrationPolicyTargetDatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("discoveredResourceId=").append(String.valueOf(this.discoveredResourceId));
        sb.append(", discoveredResourceType=").append(String.valueOf(this.discoveredResourceType));
        sb.append(", targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegistrationPolicyTargetDatabaseSummary)) {
            return false;
        }

        RegistrationPolicyTargetDatabaseSummary other = (RegistrationPolicyTargetDatabaseSummary) o;
        return java.util.Objects.equals(this.discoveredResourceId, other.discoveredResourceId)
                && java.util.Objects.equals(
                        this.discoveredResourceType, other.discoveredResourceType)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.discoveredResourceId == null
                                ? 43
                                : this.discoveredResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveredResourceType == null
                                ? 43
                                : this.discoveredResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
