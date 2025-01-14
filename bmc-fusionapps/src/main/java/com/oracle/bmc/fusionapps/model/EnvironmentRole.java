/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Describes the role of the FA Environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EnvironmentRole.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnvironmentRole
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currentRole",
        "standbyEnvironmentRegion",
        "standbyEnvironmentId"
    })
    public EnvironmentRole(
            CurrentRole currentRole, String standbyEnvironmentRegion, String standbyEnvironmentId) {
        super();
        this.currentRole = currentRole;
        this.standbyEnvironmentRegion = standbyEnvironmentRegion;
        this.standbyEnvironmentId = standbyEnvironmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The current role of the environment */
        @com.fasterxml.jackson.annotation.JsonProperty("currentRole")
        private CurrentRole currentRole;

        /**
         * The current role of the environment
         *
         * @param currentRole the value to set
         * @return this builder
         */
        public Builder currentRole(CurrentRole currentRole) {
            this.currentRole = currentRole;
            this.__explicitlySet__.add("currentRole");
            return this;
        }
        /** Region the standby environment is in */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyEnvironmentRegion")
        private String standbyEnvironmentRegion;

        /**
         * Region the standby environment is in
         *
         * @param standbyEnvironmentRegion the value to set
         * @return this builder
         */
        public Builder standbyEnvironmentRegion(String standbyEnvironmentRegion) {
            this.standbyEnvironmentRegion = standbyEnvironmentRegion;
            this.__explicitlySet__.add("standbyEnvironmentRegion");
            return this;
        }
        /** Fusion Environment ID of the standby environment */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyEnvironmentId")
        private String standbyEnvironmentId;

        /**
         * Fusion Environment ID of the standby environment
         *
         * @param standbyEnvironmentId the value to set
         * @return this builder
         */
        public Builder standbyEnvironmentId(String standbyEnvironmentId) {
            this.standbyEnvironmentId = standbyEnvironmentId;
            this.__explicitlySet__.add("standbyEnvironmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnvironmentRole build() {
            EnvironmentRole model =
                    new EnvironmentRole(
                            this.currentRole,
                            this.standbyEnvironmentRegion,
                            this.standbyEnvironmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnvironmentRole model) {
            if (model.wasPropertyExplicitlySet("currentRole")) {
                this.currentRole(model.getCurrentRole());
            }
            if (model.wasPropertyExplicitlySet("standbyEnvironmentRegion")) {
                this.standbyEnvironmentRegion(model.getStandbyEnvironmentRegion());
            }
            if (model.wasPropertyExplicitlySet("standbyEnvironmentId")) {
                this.standbyEnvironmentId(model.getStandbyEnvironmentId());
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

    /** The current role of the environment */
    public enum CurrentRole implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CurrentRole.class);

        private final String value;
        private static java.util.Map<String, CurrentRole> map;

        static {
            map = new java.util.HashMap<>();
            for (CurrentRole v : CurrentRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CurrentRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurrentRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CurrentRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current role of the environment */
    @com.fasterxml.jackson.annotation.JsonProperty("currentRole")
    private final CurrentRole currentRole;

    /**
     * The current role of the environment
     *
     * @return the value
     */
    public CurrentRole getCurrentRole() {
        return currentRole;
    }

    /** Region the standby environment is in */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyEnvironmentRegion")
    private final String standbyEnvironmentRegion;

    /**
     * Region the standby environment is in
     *
     * @return the value
     */
    public String getStandbyEnvironmentRegion() {
        return standbyEnvironmentRegion;
    }

    /** Fusion Environment ID of the standby environment */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyEnvironmentId")
    private final String standbyEnvironmentId;

    /**
     * Fusion Environment ID of the standby environment
     *
     * @return the value
     */
    public String getStandbyEnvironmentId() {
        return standbyEnvironmentId;
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
        sb.append("EnvironmentRole(");
        sb.append("super=").append(super.toString());
        sb.append("currentRole=").append(String.valueOf(this.currentRole));
        sb.append(", standbyEnvironmentRegion=")
                .append(String.valueOf(this.standbyEnvironmentRegion));
        sb.append(", standbyEnvironmentId=").append(String.valueOf(this.standbyEnvironmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnvironmentRole)) {
            return false;
        }

        EnvironmentRole other = (EnvironmentRole) o;
        return java.util.Objects.equals(this.currentRole, other.currentRole)
                && java.util.Objects.equals(
                        this.standbyEnvironmentRegion, other.standbyEnvironmentRegion)
                && java.util.Objects.equals(this.standbyEnvironmentId, other.standbyEnvironmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.currentRole == null ? 43 : this.currentRole.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyEnvironmentRegion == null
                                ? 43
                                : this.standbyEnvironmentRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyEnvironmentId == null
                                ? 43
                                : this.standbyEnvironmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
