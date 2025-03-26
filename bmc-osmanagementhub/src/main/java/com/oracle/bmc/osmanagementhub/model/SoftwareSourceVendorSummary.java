/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information about a software source vendor, including name, operating system family, and architecture type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwareSourceVendorSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwareSourceVendorSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "osFamilies", "archTypes"})
    public SoftwareSourceVendorSummary(
            VendorName name,
            java.util.List<OsFamily> osFamilies,
            java.util.List<ArchType> archTypes) {
        super();
        this.name = name;
        this.osFamilies = osFamilies;
        this.archTypes = archTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the vendor providing the software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private VendorName name;

        /**
         * Name of the vendor providing the software source.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(VendorName name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * List of corresponding operating system families.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
        private java.util.List<OsFamily> osFamilies;

        /**
         * List of corresponding operating system families.
         * @param osFamilies the value to set
         * @return this builder
         **/
        public Builder osFamilies(java.util.List<OsFamily> osFamilies) {
            this.osFamilies = osFamilies;
            this.__explicitlySet__.add("osFamilies");
            return this;
        }
        /**
         * List of corresponding architecture types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archTypes")
        private java.util.List<ArchType> archTypes;

        /**
         * List of corresponding architecture types.
         * @param archTypes the value to set
         * @return this builder
         **/
        public Builder archTypes(java.util.List<ArchType> archTypes) {
            this.archTypes = archTypes;
            this.__explicitlySet__.add("archTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwareSourceVendorSummary build() {
            SoftwareSourceVendorSummary model =
                    new SoftwareSourceVendorSummary(this.name, this.osFamilies, this.archTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSourceVendorSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("osFamilies")) {
                this.osFamilies(model.getOsFamilies());
            }
            if (model.wasPropertyExplicitlySet("archTypes")) {
                this.archTypes(model.getArchTypes());
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
     * Name of the vendor providing the software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final VendorName name;

    /**
     * Name of the vendor providing the software source.
     * @return the value
     **/
    public VendorName getName() {
        return name;
    }

    /**
     * List of corresponding operating system families.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
    private final java.util.List<OsFamily> osFamilies;

    /**
     * List of corresponding operating system families.
     * @return the value
     **/
    public java.util.List<OsFamily> getOsFamilies() {
        return osFamilies;
    }

    /**
     * List of corresponding architecture types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archTypes")
    private final java.util.List<ArchType> archTypes;

    /**
     * List of corresponding architecture types.
     * @return the value
     **/
    public java.util.List<ArchType> getArchTypes() {
        return archTypes;
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
        sb.append("SoftwareSourceVendorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", osFamilies=").append(String.valueOf(this.osFamilies));
        sb.append(", archTypes=").append(String.valueOf(this.archTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareSourceVendorSummary)) {
            return false;
        }

        SoftwareSourceVendorSummary other = (SoftwareSourceVendorSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.osFamilies, other.osFamilies)
                && java.util.Objects.equals(this.archTypes, other.archTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.osFamilies == null ? 43 : this.osFamilies.hashCode());
        result = (result * PRIME) + (this.archTypes == null ? 43 : this.archTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
