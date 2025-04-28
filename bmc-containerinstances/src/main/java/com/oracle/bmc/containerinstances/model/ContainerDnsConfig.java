/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * DNS settings for containers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerDnsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerDnsConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nameservers", "searches", "options"})
    public ContainerDnsConfig(
            java.util.List<String> nameservers,
            java.util.List<String> searches,
            java.util.List<String> options) {
        super();
        this.nameservers = nameservers;
        this.searches = searches;
        this.options = options;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** IP address of the name server.. */
        @com.fasterxml.jackson.annotation.JsonProperty("nameservers")
        private java.util.List<String> nameservers;

        /**
         * IP address of the name server..
         *
         * @param nameservers the value to set
         * @return this builder
         */
        public Builder nameservers(java.util.List<String> nameservers) {
            this.nameservers = nameservers;
            this.__explicitlySet__.add("nameservers");
            return this;
        }
        /** Search list for hostname lookup. */
        @com.fasterxml.jackson.annotation.JsonProperty("searches")
        private java.util.List<String> searches;

        /**
         * Search list for hostname lookup.
         *
         * @param searches the value to set
         * @return this builder
         */
        public Builder searches(java.util.List<String> searches) {
            this.searches = searches;
            this.__explicitlySet__.add("searches");
            return this;
        }
        /** Options allows certain internal resolver variables to be modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<String> options;

        /**
         * Options allows certain internal resolver variables to be modified.
         *
         * @param options the value to set
         * @return this builder
         */
        public Builder options(java.util.List<String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerDnsConfig build() {
            ContainerDnsConfig model =
                    new ContainerDnsConfig(this.nameservers, this.searches, this.options);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerDnsConfig model) {
            if (model.wasPropertyExplicitlySet("nameservers")) {
                this.nameservers(model.getNameservers());
            }
            if (model.wasPropertyExplicitlySet("searches")) {
                this.searches(model.getSearches());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
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

    /** IP address of the name server.. */
    @com.fasterxml.jackson.annotation.JsonProperty("nameservers")
    private final java.util.List<String> nameservers;

    /**
     * IP address of the name server..
     *
     * @return the value
     */
    public java.util.List<String> getNameservers() {
        return nameservers;
    }

    /** Search list for hostname lookup. */
    @com.fasterxml.jackson.annotation.JsonProperty("searches")
    private final java.util.List<String> searches;

    /**
     * Search list for hostname lookup.
     *
     * @return the value
     */
    public java.util.List<String> getSearches() {
        return searches;
    }

    /** Options allows certain internal resolver variables to be modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.List<String> options;

    /**
     * Options allows certain internal resolver variables to be modified.
     *
     * @return the value
     */
    public java.util.List<String> getOptions() {
        return options;
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
        sb.append("ContainerDnsConfig(");
        sb.append("super=").append(super.toString());
        sb.append("nameservers=").append(String.valueOf(this.nameservers));
        sb.append(", searches=").append(String.valueOf(this.searches));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerDnsConfig)) {
            return false;
        }

        ContainerDnsConfig other = (ContainerDnsConfig) o;
        return java.util.Objects.equals(this.nameservers, other.nameservers)
                && java.util.Objects.equals(this.searches, other.searches)
                && java.util.Objects.equals(this.options, other.options)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nameservers == null ? 43 : this.nameservers.hashCode());
        result = (result * PRIME) + (this.searches == null ? 43 : this.searches.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
