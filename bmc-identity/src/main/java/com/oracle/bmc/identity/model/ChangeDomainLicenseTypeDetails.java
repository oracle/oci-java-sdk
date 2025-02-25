/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Details for updating the license type of the identity domain.
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
    builder = ChangeDomainLicenseTypeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeDomainLicenseTypeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"licenseType"})
    public ChangeDomainLicenseTypeDetails(String licenseType) {
        super();
        this.licenseType = licenseType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The license type of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        /**
         * The license type of the identity domain.
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDomainLicenseTypeDetails build() {
            ChangeDomainLicenseTypeDetails model =
                    new ChangeDomainLicenseTypeDetails(this.licenseType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDomainLicenseTypeDetails model) {
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
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
     * The license type of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final String licenseType;

    /**
     * The license type of the identity domain.
     * @return the value
     **/
    public String getLicenseType() {
        return licenseType;
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
        sb.append("ChangeDomainLicenseTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("licenseType=").append(String.valueOf(this.licenseType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDomainLicenseTypeDetails)) {
            return false;
        }

        ChangeDomainLicenseTypeDetails other = (ChangeDomainLicenseTypeDetails) o;
        return java.util.Objects.equals(this.licenseType, other.licenseType) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
