/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A complete description of the state of modules on a managed instance
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateModuleStreamStateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateModuleStreamStateDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"modules"})
    public UpdateModuleStreamStateDetails(java.util.List<UpdateModuleDetails> modules) {
        super();
        this.modules = modules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The modules known to a managed instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modules")
        private java.util.List<UpdateModuleDetails> modules;

        /**
         * The modules known to a managed instance
         * @param modules the value to set
         * @return this builder
         **/
        public Builder modules(java.util.List<UpdateModuleDetails> modules) {
            this.modules = modules;
            this.__explicitlySet__.add("modules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModuleStreamStateDetails build() {
            UpdateModuleStreamStateDetails __instance__ =
                    new UpdateModuleStreamStateDetails(modules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModuleStreamStateDetails o) {
            Builder copiedBuilder = modules(o.getModules());

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
     * The modules known to a managed instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modules")
    private final java.util.List<UpdateModuleDetails> modules;

    /**
     * The modules known to a managed instance
     * @return the value
     **/
    public java.util.List<UpdateModuleDetails> getModules() {
        return modules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateModuleStreamStateDetails(");
        sb.append("modules=").append(String.valueOf(this.modules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModuleStreamStateDetails)) {
            return false;
        }

        UpdateModuleStreamStateDetails other = (UpdateModuleStreamStateDetails) o;
        return java.util.Objects.equals(this.modules, other.modules)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modules == null ? 43 : this.modules.hashCode());
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
