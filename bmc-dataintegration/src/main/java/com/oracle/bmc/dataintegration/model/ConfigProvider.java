/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the configuration provider.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfigProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigProvider {
    @Deprecated
    @java.beans.ConstructorProperties({"bindings", "childProviders"})
    public ConfigProvider(
            java.util.Map<String, ParameterValue> bindings,
            java.util.Map<String, ConfigProvider> childProviders) {
        super();
        this.bindings = bindings;
        this.childProviders = childProviders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The configuration provider bindings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bindings")
        private java.util.Map<String, ParameterValue> bindings;

        /**
         * The configuration provider bindings.
         * @param bindings the value to set
         * @return this builder
         **/
        public Builder bindings(java.util.Map<String, ParameterValue> bindings) {
            this.bindings = bindings;
            this.__explicitlySet__.add("bindings");
            return this;
        }
        /**
         * The child providers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childProviders")
        private java.util.Map<String, ConfigProvider> childProviders;

        /**
         * The child providers.
         * @param childProviders the value to set
         * @return this builder
         **/
        public Builder childProviders(java.util.Map<String, ConfigProvider> childProviders) {
            this.childProviders = childProviders;
            this.__explicitlySet__.add("childProviders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigProvider build() {
            ConfigProvider __instance__ = new ConfigProvider(bindings, childProviders);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigProvider o) {
            Builder copiedBuilder = bindings(o.getBindings()).childProviders(o.getChildProviders());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The configuration provider bindings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bindings")
    private final java.util.Map<String, ParameterValue> bindings;

    /**
     * The configuration provider bindings.
     * @return the value
     **/
    public java.util.Map<String, ParameterValue> getBindings() {
        return bindings;
    }

    /**
     * The child providers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childProviders")
    private final java.util.Map<String, ConfigProvider> childProviders;

    /**
     * The child providers.
     * @return the value
     **/
    public java.util.Map<String, ConfigProvider> getChildProviders() {
        return childProviders;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigProvider(");
        sb.append("bindings=").append(String.valueOf(this.bindings));
        sb.append(", childProviders=").append(String.valueOf(this.childProviders));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigProvider)) {
            return false;
        }

        ConfigProvider other = (ConfigProvider) o;
        return java.util.Objects.equals(this.bindings, other.bindings)
                && java.util.Objects.equals(this.childProviders, other.childProviders)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bindings == null ? 43 : this.bindings.hashCode());
        result =
                (result * PRIME)
                        + (this.childProviders == null ? 43 : this.childProviders.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
