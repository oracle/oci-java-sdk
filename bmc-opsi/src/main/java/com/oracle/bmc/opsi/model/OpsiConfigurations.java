/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * An OPSI configuration resource is a container for storing custom values for customizable configuration items exposed by Operations Insights.
 * <p>
 * Operations Insights exposes different sets of customizable configuration items through different OPSI configuration types.
 * UX_CONFIGURATION: OPSI configuration resource of this type can be created only once in each compartment. It is a compartment level singleton resource.
 * <p>
 * When configuration values, for an OPSI configuration type that supports compartment level singleton (e.g: UX_CONFIGURATION) resource, are queried for a compartment,
 * following will be the order of preference.
 * 1. If the specified compartment has an OPSI configuration resource, first preference will be given to the custom values inside that.
 * 2. If the root compartment has an OPSI configuration resource, it will be considered as applicable to all compartments of that tenency,
 * hence second preference will be given to the custom values inside that.
 * 3. Default configuration will be considered as a final fallback option.
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
    builder = OpsiConfigurations.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpsiConfigurations extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"opsiConfigurations"})
    public OpsiConfigurations(Object opsiConfigurations) {
        super();
        this.opsiConfigurations = opsiConfigurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OPSI Configuration Object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opsiConfigurations")
        private Object opsiConfigurations;

        /**
         * OPSI Configuration Object.
         * @param opsiConfigurations the value to set
         * @return this builder
         **/
        public Builder opsiConfigurations(Object opsiConfigurations) {
            this.opsiConfigurations = opsiConfigurations;
            this.__explicitlySet__.add("opsiConfigurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiConfigurations build() {
            OpsiConfigurations model = new OpsiConfigurations(this.opsiConfigurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiConfigurations model) {
            if (model.wasPropertyExplicitlySet("opsiConfigurations")) {
                this.opsiConfigurations(model.getOpsiConfigurations());
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
     * OPSI Configuration Object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opsiConfigurations")
    private final Object opsiConfigurations;

    /**
     * OPSI Configuration Object.
     * @return the value
     **/
    public Object getOpsiConfigurations() {
        return opsiConfigurations;
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
        sb.append("OpsiConfigurations(");
        sb.append("super=").append(super.toString());
        sb.append("opsiConfigurations=").append(String.valueOf(this.opsiConfigurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiConfigurations)) {
            return false;
        }

        OpsiConfigurations other = (OpsiConfigurations) o;
        return java.util.Objects.equals(this.opsiConfigurations, other.opsiConfigurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.opsiConfigurations == null
                                ? 43
                                : this.opsiConfigurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
