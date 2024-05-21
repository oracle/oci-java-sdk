/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * List of Compartments to include in the discovery.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GiCompartmentIdFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GiCompartmentIdFilter extends GiFleetDiscoveryFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /**
         * List of Compartments OCIDs to include in the discovery.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
        private java.util.List<String> identifiers;

        /**
         * List of Compartments OCIDs to include in the discovery.
         *
         * @param identifiers the value to set
         * @return this builder
         **/
        public Builder identifiers(java.util.List<String> identifiers) {
            this.identifiers = identifiers;
            this.__explicitlySet__.add("identifiers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GiCompartmentIdFilter build() {
            GiCompartmentIdFilter model = new GiCompartmentIdFilter(this.mode, this.identifiers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GiCompartmentIdFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("identifiers")) {
                this.identifiers(model.getIdentifiers());
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

    @Deprecated
    public GiCompartmentIdFilter(Mode mode, java.util.List<String> identifiers) {
        super(mode);
        this.identifiers = identifiers;
    }

    /**
     * List of Compartments OCIDs to include in the discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifiers")
    private final java.util.List<String> identifiers;

    /**
     * List of Compartments OCIDs to include in the discovery.
     *
     * @return the value
     **/
    public java.util.List<String> getIdentifiers() {
        return identifiers;
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
        sb.append("GiCompartmentIdFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", identifiers=").append(String.valueOf(this.identifiers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiCompartmentIdFilter)) {
            return false;
        }

        GiCompartmentIdFilter other = (GiCompartmentIdFilter) o;
        return java.util.Objects.equals(this.identifiers, other.identifiers) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.identifiers == null ? 43 : this.identifiers.hashCode());
        return result;
    }
}
