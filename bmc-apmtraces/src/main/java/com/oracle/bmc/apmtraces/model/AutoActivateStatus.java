/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Status of autoactivation for the given data key in the APM Domain.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutoActivateStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutoActivateStatus extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "dataKey"})
    public AutoActivateStatus(String state, DataKey dataKey) {
        super();
        this.state = state;
        this.dataKey = dataKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * State of autoactivation in this APM Domain.  If "ON" auto-activate is set to true, if "OFF" auto-activate is set to false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State of autoactivation in this APM Domain.  If "ON" auto-activate is set to true, if "OFF" auto-activate is set to false.
         *
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * Data key type for which auto-activate needs needs to be turned on or off.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataKey")
        private DataKey dataKey;

        /**
         * Data key type for which auto-activate needs needs to be turned on or off.
         *
         * @param dataKey the value to set
         * @return this builder
         **/
        public Builder dataKey(DataKey dataKey) {
            this.dataKey = dataKey;
            this.__explicitlySet__.add("dataKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoActivateStatus build() {
            AutoActivateStatus model = new AutoActivateStatus(this.state, this.dataKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoActivateStatus model) {
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("dataKey")) {
                this.dataKey(model.getDataKey());
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
     * State of autoactivation in this APM Domain.  If "ON" auto-activate is set to true, if "OFF" auto-activate is set to false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State of autoactivation in this APM Domain.  If "ON" auto-activate is set to true, if "OFF" auto-activate is set to false.
     *
     * @return the value
     **/
    public String getState() {
        return state;
    }

    /**
     * Data key type for which auto-activate needs needs to be turned on or off.
     *
     **/
    public enum DataKey {
        PrivateDataKey("PRIVATE_DATA_KEY"),
        PublicDataKey("PUBLIC_DATA_KEY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataKey.class);

        private final String value;
        private static java.util.Map<String, DataKey> map;

        static {
            map = new java.util.HashMap<>();
            for (DataKey v : DataKey.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataKey(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataKey create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataKey', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Data key type for which auto-activate needs needs to be turned on or off.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataKey")
    private final DataKey dataKey;

    /**
     * Data key type for which auto-activate needs needs to be turned on or off.
     *
     * @return the value
     **/
    public DataKey getDataKey() {
        return dataKey;
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
        sb.append("AutoActivateStatus(");
        sb.append("super=").append(super.toString());
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", dataKey=").append(String.valueOf(this.dataKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoActivateStatus)) {
            return false;
        }

        AutoActivateStatus other = (AutoActivateStatus) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.dataKey, other.dataKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.dataKey == null ? 43 : this.dataKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
