/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Provides which configuration details to get. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FetchProtectedDatabaseConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FetchProtectedDatabaseConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configurationType"})
    public FetchProtectedDatabaseConfigurationDetails(ConfigurationType configurationType) {
        super();
        this.configurationType = configurationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Currently has four config options ALL, TNSNAMES, HOSTS and CABUNDLE. All will return a
         * zipped folder containing the contents of both tnsnames and the certificateChainPem.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationType")
        private ConfigurationType configurationType;

        /**
         * Currently has four config options ALL, TNSNAMES, HOSTS and CABUNDLE. All will return a
         * zipped folder containing the contents of both tnsnames and the certificateChainPem.
         *
         * @param configurationType the value to set
         * @return this builder
         */
        public Builder configurationType(ConfigurationType configurationType) {
            this.configurationType = configurationType;
            this.__explicitlySet__.add("configurationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FetchProtectedDatabaseConfigurationDetails build() {
            FetchProtectedDatabaseConfigurationDetails model =
                    new FetchProtectedDatabaseConfigurationDetails(this.configurationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchProtectedDatabaseConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("configurationType")) {
                this.configurationType(model.getConfigurationType());
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
     * Currently has four config options ALL, TNSNAMES, HOSTS and CABUNDLE. All will return a zipped
     * folder containing the contents of both tnsnames and the certificateChainPem.
     */
    public enum ConfigurationType implements com.oracle.bmc.http.internal.BmcEnum {
        Cabundle("CABUNDLE"),
        Tnsnames("TNSNAMES"),
        Hosts("HOSTS"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, ConfigurationType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigurationType v : ConfigurationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConfigurationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigurationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConfigurationType: " + key);
        }
    };
    /**
     * Currently has four config options ALL, TNSNAMES, HOSTS and CABUNDLE. All will return a zipped
     * folder containing the contents of both tnsnames and the certificateChainPem.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationType")
    private final ConfigurationType configurationType;

    /**
     * Currently has four config options ALL, TNSNAMES, HOSTS and CABUNDLE. All will return a zipped
     * folder containing the contents of both tnsnames and the certificateChainPem.
     *
     * @return the value
     */
    public ConfigurationType getConfigurationType() {
        return configurationType;
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
        sb.append("FetchProtectedDatabaseConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("configurationType=").append(String.valueOf(this.configurationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchProtectedDatabaseConfigurationDetails)) {
            return false;
        }

        FetchProtectedDatabaseConfigurationDetails other =
                (FetchProtectedDatabaseConfigurationDetails) o;
        return java.util.Objects.equals(this.configurationType, other.configurationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configurationType == null ? 43 : this.configurationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
