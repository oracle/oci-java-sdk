/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties for defining auto failover configuration. <br>
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
        builder = AutoFailoverConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutoFailoverConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managedAutoFailover", "failoverTargets"})
    public AutoFailoverConfiguration(
            ManagedAutoFailover managedAutoFailover, java.util.List<String> failoverTargets) {
        super();
        this.managedAutoFailover = managedAutoFailover;
        this.failoverTargets = failoverTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The state of managed auto failover. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedAutoFailover")
        private ManagedAutoFailover managedAutoFailover;

        /**
         * The state of managed auto failover.
         *
         * @param managedAutoFailover the value to set
         * @return this builder
         */
        public Builder managedAutoFailover(ManagedAutoFailover managedAutoFailover) {
            this.managedAutoFailover = managedAutoFailover;
            this.__explicitlySet__.add("managedAutoFailover");
            return this;
        }
        /** Specifies the {@code DB_UNIQUE_NAME} of the data guard group member databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("failoverTargets")
        private java.util.List<String> failoverTargets;

        /**
         * Specifies the {@code DB_UNIQUE_NAME} of the data guard group member databases.
         *
         * @param failoverTargets the value to set
         * @return this builder
         */
        public Builder failoverTargets(java.util.List<String> failoverTargets) {
            this.failoverTargets = failoverTargets;
            this.__explicitlySet__.add("failoverTargets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoFailoverConfiguration build() {
            AutoFailoverConfiguration model =
                    new AutoFailoverConfiguration(this.managedAutoFailover, this.failoverTargets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoFailoverConfiguration model) {
            if (model.wasPropertyExplicitlySet("managedAutoFailover")) {
                this.managedAutoFailover(model.getManagedAutoFailover());
            }
            if (model.wasPropertyExplicitlySet("failoverTargets")) {
                this.failoverTargets(model.getFailoverTargets());
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

    /** The state of managed auto failover. */
    public enum ManagedAutoFailover implements com.oracle.bmc.http.internal.BmcEnum {
        Enable("ENABLE"),
        Disable("DISABLE"),
        ;

        private final String value;
        private static java.util.Map<String, ManagedAutoFailover> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedAutoFailover v : ManagedAutoFailover.values()) {
                map.put(v.getValue(), v);
            }
        }

        ManagedAutoFailover(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedAutoFailover create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ManagedAutoFailover: " + key);
        }
    };
    /** The state of managed auto failover. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedAutoFailover")
    private final ManagedAutoFailover managedAutoFailover;

    /**
     * The state of managed auto failover.
     *
     * @return the value
     */
    public ManagedAutoFailover getManagedAutoFailover() {
        return managedAutoFailover;
    }

    /** Specifies the {@code DB_UNIQUE_NAME} of the data guard group member databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("failoverTargets")
    private final java.util.List<String> failoverTargets;

    /**
     * Specifies the {@code DB_UNIQUE_NAME} of the data guard group member databases.
     *
     * @return the value
     */
    public java.util.List<String> getFailoverTargets() {
        return failoverTargets;
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
        sb.append("AutoFailoverConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("managedAutoFailover=").append(String.valueOf(this.managedAutoFailover));
        sb.append(", failoverTargets=").append(String.valueOf(this.failoverTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoFailoverConfiguration)) {
            return false;
        }

        AutoFailoverConfiguration other = (AutoFailoverConfiguration) o;
        return java.util.Objects.equals(this.managedAutoFailover, other.managedAutoFailover)
                && java.util.Objects.equals(this.failoverTargets, other.failoverTargets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedAutoFailover == null
                                ? 43
                                : this.managedAutoFailover.hashCode());
        result =
                (result * PRIME)
                        + (this.failoverTargets == null ? 43 : this.failoverTargets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
