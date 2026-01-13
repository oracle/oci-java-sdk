/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A specific product version or a specific version and succeeding. Example: 12.1 or 12.1 and above
 * for Oracle WebLogic Application server. The policy applies to the next version only, and not to
 * other versions such as, 12.1.x. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProductVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProductVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "isApplicableForAllHigherVersions"})
    public ProductVersionDetails(String version, Boolean isApplicableForAllHigherVersions) {
        super();
        this.version = version;
        this.isApplicableForAllHigherVersions = isApplicableForAllHigherVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Product version the rule is applicable. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Product version the rule is applicable.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Is rule applicable to all higher versions also */
        @com.fasterxml.jackson.annotation.JsonProperty("isApplicableForAllHigherVersions")
        private Boolean isApplicableForAllHigherVersions;

        /**
         * Is rule applicable to all higher versions also
         *
         * @param isApplicableForAllHigherVersions the value to set
         * @return this builder
         */
        public Builder isApplicableForAllHigherVersions(Boolean isApplicableForAllHigherVersions) {
            this.isApplicableForAllHigherVersions = isApplicableForAllHigherVersions;
            this.__explicitlySet__.add("isApplicableForAllHigherVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductVersionDetails build() {
            ProductVersionDetails model =
                    new ProductVersionDetails(this.version, this.isApplicableForAllHigherVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductVersionDetails model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("isApplicableForAllHigherVersions")) {
                this.isApplicableForAllHigherVersions(model.getIsApplicableForAllHigherVersions());
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

    /** Product version the rule is applicable. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Product version the rule is applicable.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** Is rule applicable to all higher versions also */
    @com.fasterxml.jackson.annotation.JsonProperty("isApplicableForAllHigherVersions")
    private final Boolean isApplicableForAllHigherVersions;

    /**
     * Is rule applicable to all higher versions also
     *
     * @return the value
     */
    public Boolean getIsApplicableForAllHigherVersions() {
        return isApplicableForAllHigherVersions;
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
        sb.append("ProductVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", isApplicableForAllHigherVersions=")
                .append(String.valueOf(this.isApplicableForAllHigherVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductVersionDetails)) {
            return false;
        }

        ProductVersionDetails other = (ProductVersionDetails) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.isApplicableForAllHigherVersions,
                        other.isApplicableForAllHigherVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.isApplicableForAllHigherVersions == null
                                ? 43
                                : this.isApplicableForAllHigherVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
