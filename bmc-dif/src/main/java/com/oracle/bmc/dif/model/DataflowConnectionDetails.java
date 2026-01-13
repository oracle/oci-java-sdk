/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of services to create private endpoint. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataflowConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataflowConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"difDependencies", "domainNames"})
    public DataflowConnectionDetails(
            java.util.List<DifDependencyDetails> difDependencies,
            java.util.List<String> domainNames) {
        super();
        this.difDependencies = difDependencies;
        this.domainNames = domainNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of DIF Service Dependency Details to create private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("difDependencies")
        private java.util.List<DifDependencyDetails> difDependencies;

        /**
         * List of DIF Service Dependency Details to create private endpoint.
         *
         * @param difDependencies the value to set
         * @return this builder
         */
        public Builder difDependencies(java.util.List<DifDependencyDetails> difDependencies) {
            this.difDependencies = difDependencies;
            this.__explicitlySet__.add("difDependencies");
            return this;
        }
        /** An array of DNS zone names. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainNames")
        private java.util.List<String> domainNames;

        /**
         * An array of DNS zone names.
         *
         * @param domainNames the value to set
         * @return this builder
         */
        public Builder domainNames(java.util.List<String> domainNames) {
            this.domainNames = domainNames;
            this.__explicitlySet__.add("domainNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataflowConnectionDetails build() {
            DataflowConnectionDetails model =
                    new DataflowConnectionDetails(this.difDependencies, this.domainNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataflowConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("difDependencies")) {
                this.difDependencies(model.getDifDependencies());
            }
            if (model.wasPropertyExplicitlySet("domainNames")) {
                this.domainNames(model.getDomainNames());
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

    /** List of DIF Service Dependency Details to create private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("difDependencies")
    private final java.util.List<DifDependencyDetails> difDependencies;

    /**
     * List of DIF Service Dependency Details to create private endpoint.
     *
     * @return the value
     */
    public java.util.List<DifDependencyDetails> getDifDependencies() {
        return difDependencies;
    }

    /** An array of DNS zone names. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainNames")
    private final java.util.List<String> domainNames;

    /**
     * An array of DNS zone names.
     *
     * @return the value
     */
    public java.util.List<String> getDomainNames() {
        return domainNames;
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
        sb.append("DataflowConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("difDependencies=").append(String.valueOf(this.difDependencies));
        sb.append(", domainNames=").append(String.valueOf(this.domainNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataflowConnectionDetails)) {
            return false;
        }

        DataflowConnectionDetails other = (DataflowConnectionDetails) o;
        return java.util.Objects.equals(this.difDependencies, other.difDependencies)
                && java.util.Objects.equals(this.domainNames, other.domainNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.difDependencies == null ? 43 : this.difDependencies.hashCode());
        result = (result * PRIME) + (this.domainNames == null ? 43 : this.domainNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
