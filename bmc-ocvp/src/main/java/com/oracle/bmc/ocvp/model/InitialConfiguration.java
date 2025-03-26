/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details of SDDC initial configuration
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InitialConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InitialConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"initialClusterConfigurations"})
    public InitialConfiguration(
            java.util.List<InitialClusterConfiguration> initialClusterConfigurations) {
        super();
        this.initialClusterConfigurations = initialClusterConfigurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The configurations for Clusters initially created in the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialClusterConfigurations")
        private java.util.List<InitialClusterConfiguration> initialClusterConfigurations;

        /**
         * The configurations for Clusters initially created in the SDDC.
         *
         * @param initialClusterConfigurations the value to set
         * @return this builder
         **/
        public Builder initialClusterConfigurations(
                java.util.List<InitialClusterConfiguration> initialClusterConfigurations) {
            this.initialClusterConfigurations = initialClusterConfigurations;
            this.__explicitlySet__.add("initialClusterConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitialConfiguration build() {
            InitialConfiguration model =
                    new InitialConfiguration(this.initialClusterConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitialConfiguration model) {
            if (model.wasPropertyExplicitlySet("initialClusterConfigurations")) {
                this.initialClusterConfigurations(model.getInitialClusterConfigurations());
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
     * The configurations for Clusters initially created in the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialClusterConfigurations")
    private final java.util.List<InitialClusterConfiguration> initialClusterConfigurations;

    /**
     * The configurations for Clusters initially created in the SDDC.
     *
     * @return the value
     **/
    public java.util.List<InitialClusterConfiguration> getInitialClusterConfigurations() {
        return initialClusterConfigurations;
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
        sb.append("InitialConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("initialClusterConfigurations=")
                .append(String.valueOf(this.initialClusterConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitialConfiguration)) {
            return false;
        }

        InitialConfiguration other = (InitialConfiguration) o;
        return java.util.Objects.equals(
                        this.initialClusterConfigurations, other.initialClusterConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.initialClusterConfigurations == null
                                ? 43
                                : this.initialClusterConfigurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
