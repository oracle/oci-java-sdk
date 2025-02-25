/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) The 'AllowedDomainLicenseTypeSummary' object contains information about the license type of the identity domain.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AllowedDomainLicenseTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AllowedDomainLicenseTypeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "licenseType", "description"})
    public AllowedDomainLicenseTypeSummary(String name, String licenseType, String description) {
        super();
        this.name = name;
        this.licenseType = licenseType;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The license type name.
         * <p>
         * Example: "Oracle Apps Premium"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The license type name.
         * <p>
         * Example: "Oracle Apps Premium"
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The license type identifier.
         * <p>
         * Example: "oracle-apps-premium"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        /**
         * The license type identifier.
         * <p>
         * Example: "oracle-apps-premium"
         *
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /**
         * The license type description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The license type description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedDomainLicenseTypeSummary build() {
            AllowedDomainLicenseTypeSummary model =
                    new AllowedDomainLicenseTypeSummary(
                            this.name, this.licenseType, this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedDomainLicenseTypeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * The license type name.
     * <p>
     * Example: "Oracle Apps Premium"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The license type name.
     * <p>
     * Example: "Oracle Apps Premium"
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The license type identifier.
     * <p>
     * Example: "oracle-apps-premium"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final String licenseType;

    /**
     * The license type identifier.
     * <p>
     * Example: "oracle-apps-premium"
     *
     * @return the value
     **/
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * The license type description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The license type description.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("AllowedDomainLicenseTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedDomainLicenseTypeSummary)) {
            return false;
        }

        AllowedDomainLicenseTypeSummary other = (AllowedDomainLicenseTypeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
