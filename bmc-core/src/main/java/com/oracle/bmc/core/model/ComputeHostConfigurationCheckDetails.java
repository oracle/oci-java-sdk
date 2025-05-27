/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Host Group Configuration Details Check <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeHostConfigurationCheckDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeHostConfigurationCheckDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "configurationState",
        "firmwareBundleId",
        "recycleLevel"
    })
    public ComputeHostConfigurationCheckDetails(
            Type type,
            ConfigurationState configurationState,
            String firmwareBundleId,
            RecycleLevel recycleLevel) {
        super();
        this.type = type;
        this.configurationState = configurationState;
        this.firmwareBundleId = firmwareBundleId;
        this.recycleLevel = recycleLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of configuration
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
         * The current state of the host configuration. The Host is either | CONFORMANT - current
         * state matches the desired configuration NON_CONFORMANT - current state does not match the
         * desired configuration PRE_APPLYING, APPLYING, CHECKING- transitional states UNKNOWN -
         * current state is unknown
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationState")
        private ConfigurationState configurationState;

        /**
         * The current state of the host configuration. The Host is either | CONFORMANT - current
         * state matches the desired configuration NON_CONFORMANT - current state does not match the
         * desired configuration PRE_APPLYING, APPLYING, CHECKING- transitional states UNKNOWN -
         * current state is unknown
         *
         * @param configurationState the value to set
         * @return this builder
         */
        public Builder configurationState(ConfigurationState configurationState) {
            this.configurationState = configurationState;
            this.__explicitlySet__.add("configurationState");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique firmware bundle associated with the Host Configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("firmwareBundleId")
        private String firmwareBundleId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique firmware bundle associated with the Host Configuration.
         *
         * @param firmwareBundleId the value to set
         * @return this builder
         */
        public Builder firmwareBundleId(String firmwareBundleId) {
            this.firmwareBundleId = firmwareBundleId;
            this.__explicitlySet__.add("firmwareBundleId");
            return this;
        }
        /**
         * Preferred recycle level for hosts associated with the reservation config. * {@code
         * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This
         * is the default behavior.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recycleLevel")
        private RecycleLevel recycleLevel;

        /**
         * Preferred recycle level for hosts associated with the reservation config. * {@code
         * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This
         * is the default behavior.
         *
         * @param recycleLevel the value to set
         * @return this builder
         */
        public Builder recycleLevel(RecycleLevel recycleLevel) {
            this.recycleLevel = recycleLevel;
            this.__explicitlySet__.add("recycleLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeHostConfigurationCheckDetails build() {
            ComputeHostConfigurationCheckDetails model =
                    new ComputeHostConfigurationCheckDetails(
                            this.type,
                            this.configurationState,
                            this.firmwareBundleId,
                            this.recycleLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeHostConfigurationCheckDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("configurationState")) {
                this.configurationState(model.getConfigurationState());
            }
            if (model.wasPropertyExplicitlySet("firmwareBundleId")) {
                this.firmwareBundleId(model.getFirmwareBundleId());
            }
            if (model.wasPropertyExplicitlySet("recycleLevel")) {
                this.recycleLevel(model.getRecycleLevel());
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

    /** The type of configuration */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Firmware("FIRMWARE"),
        Recycle("RECYCLE"),

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
    /** The type of configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of configuration
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The current state of the host configuration. The Host is either | CONFORMANT - current state
     * matches the desired configuration NON_CONFORMANT - current state does not match the desired
     * configuration PRE_APPLYING, APPLYING, CHECKING- transitional states UNKNOWN - current state
     * is unknown
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationState")
    private final ConfigurationState configurationState;

    /**
     * The current state of the host configuration. The Host is either | CONFORMANT - current state
     * matches the desired configuration NON_CONFORMANT - current state does not match the desired
     * configuration PRE_APPLYING, APPLYING, CHECKING- transitional states UNKNOWN - current state
     * is unknown
     *
     * @return the value
     */
    public ConfigurationState getConfigurationState() {
        return configurationState;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique firmware bundle associated with the Host Configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firmwareBundleId")
    private final String firmwareBundleId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique firmware bundle associated with the Host Configuration.
     *
     * @return the value
     */
    public String getFirmwareBundleId() {
        return firmwareBundleId;
    }

    /**
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     */
    public enum RecycleLevel implements com.oracle.bmc.http.internal.BmcEnum {
        SkipRecycle("SKIP_RECYCLE"),
        FullRecycle("FULL_RECYCLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RecycleLevel.class);

        private final String value;
        private static java.util.Map<String, RecycleLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (RecycleLevel v : RecycleLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecycleLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecycleLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecycleLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recycleLevel")
    private final RecycleLevel recycleLevel;

    /**
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     *
     * @return the value
     */
    public RecycleLevel getRecycleLevel() {
        return recycleLevel;
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
        sb.append("ComputeHostConfigurationCheckDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", configurationState=").append(String.valueOf(this.configurationState));
        sb.append(", firmwareBundleId=").append(String.valueOf(this.firmwareBundleId));
        sb.append(", recycleLevel=").append(String.valueOf(this.recycleLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeHostConfigurationCheckDetails)) {
            return false;
        }

        ComputeHostConfigurationCheckDetails other = (ComputeHostConfigurationCheckDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.configurationState, other.configurationState)
                && java.util.Objects.equals(this.firmwareBundleId, other.firmwareBundleId)
                && java.util.Objects.equals(this.recycleLevel, other.recycleLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationState == null
                                ? 43
                                : this.configurationState.hashCode());
        result =
                (result * PRIME)
                        + (this.firmwareBundleId == null ? 43 : this.firmwareBundleId.hashCode());
        result = (result * PRIME) + (this.recycleLevel == null ? 43 : this.recycleLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
