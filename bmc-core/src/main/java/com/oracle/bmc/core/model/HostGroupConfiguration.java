/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Host group configuration <br>
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
        builder = HostGroupConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostGroupConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"target", "firmwareBundleId", "recycleLevel", "state"})
    public HostGroupConfiguration(
            String target, String firmwareBundleId, RecycleLevel recycleLevel, State state) {
        super();
        this.target = target;
        this.firmwareBundleId = firmwareBundleId;
        this.recycleLevel = recycleLevel;
        this.state = state;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Either the platform name or compute shape that the configuration is targeting */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Either the platform name or compute shape that the configuration is targeting
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /** The OCID for firmware bundle */
        @com.fasterxml.jackson.annotation.JsonProperty("firmwareBundleId")
        private String firmwareBundleId;

        /**
         * The OCID for firmware bundle
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
        /** The state of the host group configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The state of the host group configuration.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostGroupConfiguration build() {
            HostGroupConfiguration model =
                    new HostGroupConfiguration(
                            this.target, this.firmwareBundleId, this.recycleLevel, this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostGroupConfiguration model) {
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("firmwareBundleId")) {
                this.firmwareBundleId(model.getFirmwareBundleId());
            }
            if (model.wasPropertyExplicitlySet("recycleLevel")) {
                this.recycleLevel(model.getRecycleLevel());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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

    /** Either the platform name or compute shape that the configuration is targeting */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Either the platform name or compute shape that the configuration is targeting
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /** The OCID for firmware bundle */
    @com.fasterxml.jackson.annotation.JsonProperty("firmwareBundleId")
    private final String firmwareBundleId;

    /**
     * The OCID for firmware bundle
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

    /** The state of the host group configuration. */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Valid("VALID"),
        Invalid("INVALID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of the host group configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The state of the host group configuration.
     *
     * @return the value
     */
    public State getState() {
        return state;
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
        sb.append("HostGroupConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("target=").append(String.valueOf(this.target));
        sb.append(", firmwareBundleId=").append(String.valueOf(this.firmwareBundleId));
        sb.append(", recycleLevel=").append(String.valueOf(this.recycleLevel));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostGroupConfiguration)) {
            return false;
        }

        HostGroupConfiguration other = (HostGroupConfiguration) o;
        return java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.firmwareBundleId, other.firmwareBundleId)
                && java.util.Objects.equals(this.recycleLevel, other.recycleLevel)
                && java.util.Objects.equals(this.state, other.state)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.firmwareBundleId == null ? 43 : this.firmwareBundleId.hashCode());
        result = (result * PRIME) + (this.recycleLevel == null ? 43 : this.recycleLevel.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
