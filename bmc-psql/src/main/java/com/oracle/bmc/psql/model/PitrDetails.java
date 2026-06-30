/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Point-in-time recovery details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PitrDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PitrDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pitrState", "recoveryTimeWindows"})
    public PitrDetails(PitrState pitrState, java.util.List<PitrTimeWindow> recoveryTimeWindows) {
        super();
        this.pitrState = pitrState;
        this.recoveryTimeWindows = recoveryTimeWindows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The current state of the point-in-time recovery of the db system. */
        @com.fasterxml.jackson.annotation.JsonProperty("pitrState")
        private PitrState pitrState;

        /**
         * The current state of the point-in-time recovery of the db system.
         *
         * @param pitrState the value to set
         * @return this builder
         */
        public Builder pitrState(PitrState pitrState) {
            this.pitrState = pitrState;
            this.__explicitlySet__.add("pitrState");
            return this;
        }
        /** List of point-in-time recovery windows. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryTimeWindows")
        private java.util.List<PitrTimeWindow> recoveryTimeWindows;

        /**
         * List of point-in-time recovery windows.
         *
         * @param recoveryTimeWindows the value to set
         * @return this builder
         */
        public Builder recoveryTimeWindows(java.util.List<PitrTimeWindow> recoveryTimeWindows) {
            this.recoveryTimeWindows = recoveryTimeWindows;
            this.__explicitlySet__.add("recoveryTimeWindows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PitrDetails build() {
            PitrDetails model = new PitrDetails(this.pitrState, this.recoveryTimeWindows);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PitrDetails model) {
            if (model.wasPropertyExplicitlySet("pitrState")) {
                this.pitrState(model.getPitrState());
            }
            if (model.wasPropertyExplicitlySet("recoveryTimeWindows")) {
                this.recoveryTimeWindows(model.getRecoveryTimeWindows());
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

    /** The current state of the point-in-time recovery of the db system. */
    public enum PitrState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Updating("UPDATING"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PitrState.class);

        private final String value;
        private static java.util.Map<String, PitrState> map;

        static {
            map = new java.util.HashMap<>();
            for (PitrState v : PitrState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PitrState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PitrState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PitrState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the point-in-time recovery of the db system. */
    @com.fasterxml.jackson.annotation.JsonProperty("pitrState")
    private final PitrState pitrState;

    /**
     * The current state of the point-in-time recovery of the db system.
     *
     * @return the value
     */
    public PitrState getPitrState() {
        return pitrState;
    }

    /** List of point-in-time recovery windows. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryTimeWindows")
    private final java.util.List<PitrTimeWindow> recoveryTimeWindows;

    /**
     * List of point-in-time recovery windows.
     *
     * @return the value
     */
    public java.util.List<PitrTimeWindow> getRecoveryTimeWindows() {
        return recoveryTimeWindows;
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
        sb.append("PitrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pitrState=").append(String.valueOf(this.pitrState));
        sb.append(", recoveryTimeWindows=").append(String.valueOf(this.recoveryTimeWindows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PitrDetails)) {
            return false;
        }

        PitrDetails other = (PitrDetails) o;
        return java.util.Objects.equals(this.pitrState, other.pitrState)
                && java.util.Objects.equals(this.recoveryTimeWindows, other.recoveryTimeWindows)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pitrState == null ? 43 : this.pitrState.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryTimeWindows == null
                                ? 43
                                : this.recoveryTimeWindows.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
