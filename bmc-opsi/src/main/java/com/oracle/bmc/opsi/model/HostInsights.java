/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Operations Insights host related operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostInsights.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostInsights extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostInsights"})
    public HostInsights(Object hostInsights) {
        super();
        this.hostInsights = hostInsights;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Host Insights Object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostInsights")
        private Object hostInsights;

        /**
         * Host Insights Object.
         * @param hostInsights the value to set
         * @return this builder
         **/
        public Builder hostInsights(Object hostInsights) {
            this.hostInsights = hostInsights;
            this.__explicitlySet__.add("hostInsights");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostInsights build() {
            HostInsights model = new HostInsights(this.hostInsights);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostInsights model) {
            if (model.wasPropertyExplicitlySet("hostInsights")) {
                this.hostInsights(model.getHostInsights());
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
     * Host Insights Object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostInsights")
    private final Object hostInsights;

    /**
     * Host Insights Object.
     * @return the value
     **/
    public Object getHostInsights() {
        return hostInsights;
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
        sb.append("HostInsights(");
        sb.append("super=").append(super.toString());
        sb.append("hostInsights=").append(String.valueOf(this.hostInsights));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostInsights)) {
            return false;
        }

        HostInsights other = (HostInsights) o;
        return java.util.Objects.equals(this.hostInsights, other.hostInsights)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostInsights == null ? 43 : this.hostInsights.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
