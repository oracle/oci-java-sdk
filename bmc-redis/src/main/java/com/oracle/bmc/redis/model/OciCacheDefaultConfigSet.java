/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Default configurations for OCI Cache to manage the behavior, performance, and functionality of
 * the underlying cache engine. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciCacheDefaultConfigSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciCacheDefaultConfigSet
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "timeCreated",
        "lifecycleState",
        "softwareVersion",
        "defaultConfigurationDetails"
    })
    public OciCacheDefaultConfigSet(
            String id,
            String displayName,
            String description,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            OciCacheConfigSet.SoftwareVersion softwareVersion,
            DefaultConfigurationDetails defaultConfigurationDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.softwareVersion = softwareVersion;
        this.defaultConfigurationDetails = defaultConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the OCI Cache Default Config Set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the OCI Cache Default Config Set.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name of the OCI Cache Default Config Set. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name of the OCI Cache Default Config Set.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the OCI Cache Default Config Set. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the OCI Cache Default Config Set.
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
         * The date and time the OCI Cache Default Config Set was created. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the OCI Cache Default Config Set was created. An
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the OCI Cache Default Config Set. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the OCI Cache Default Config Set.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The engine version of the OCI Cache Default Config Set. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private OciCacheConfigSet.SoftwareVersion softwareVersion;

        /**
         * The engine version of the OCI Cache Default Config Set.
         *
         * @param softwareVersion the value to set
         * @return this builder
         */
        public Builder softwareVersion(OciCacheConfigSet.SoftwareVersion softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigurationDetails")
        private DefaultConfigurationDetails defaultConfigurationDetails;

        public Builder defaultConfigurationDetails(
                DefaultConfigurationDetails defaultConfigurationDetails) {
            this.defaultConfigurationDetails = defaultConfigurationDetails;
            this.__explicitlySet__.add("defaultConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciCacheDefaultConfigSet build() {
            OciCacheDefaultConfigSet model =
                    new OciCacheDefaultConfigSet(
                            this.id,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.lifecycleState,
                            this.softwareVersion,
                            this.defaultConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciCacheDefaultConfigSet model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("defaultConfigurationDetails")) {
                this.defaultConfigurationDetails(model.getDefaultConfigurationDetails());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the OCI Cache Default Config Set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the OCI Cache Default Config Set.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name of the OCI Cache Default Config Set. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name of the OCI Cache Default Config Set.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the OCI Cache Default Config Set. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the OCI Cache Default Config Set.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The date and time the OCI Cache Default Config Set was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the OCI Cache Default Config Set was created. An
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the OCI Cache Default Config Set. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the OCI Cache Default Config Set. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the OCI Cache Default Config Set.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The engine version of the OCI Cache Default Config Set. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final OciCacheConfigSet.SoftwareVersion softwareVersion;

    /**
     * The engine version of the OCI Cache Default Config Set.
     *
     * @return the value
     */
    public OciCacheConfigSet.SoftwareVersion getSoftwareVersion() {
        return softwareVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigurationDetails")
    private final DefaultConfigurationDetails defaultConfigurationDetails;

    public DefaultConfigurationDetails getDefaultConfigurationDetails() {
        return defaultConfigurationDetails;
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
        sb.append("OciCacheDefaultConfigSet(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", defaultConfigurationDetails=")
                .append(String.valueOf(this.defaultConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciCacheDefaultConfigSet)) {
            return false;
        }

        OciCacheDefaultConfigSet other = (OciCacheDefaultConfigSet) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(
                        this.defaultConfigurationDetails, other.defaultConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConfigurationDetails == null
                                ? 43
                                : this.defaultConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
