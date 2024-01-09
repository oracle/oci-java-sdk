/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher publish as private listing
 * revision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PublishListingRevisionAsPrivateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PublishListingRevisionAsPrivateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedTenancies"})
    public PublishListingRevisionAsPrivateDetails(java.util.List<String> allowedTenancies) {
        super();
        this.allowedTenancies = allowedTenancies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Allowed tenancies provided when a listing is published as private. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
        private java.util.List<String> allowedTenancies;

        /**
         * Allowed tenancies provided when a listing is published as private.
         *
         * @param allowedTenancies the value to set
         * @return this builder
         */
        public Builder allowedTenancies(java.util.List<String> allowedTenancies) {
            this.allowedTenancies = allowedTenancies;
            this.__explicitlySet__.add("allowedTenancies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublishListingRevisionAsPrivateDetails build() {
            PublishListingRevisionAsPrivateDetails model =
                    new PublishListingRevisionAsPrivateDetails(this.allowedTenancies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishListingRevisionAsPrivateDetails model) {
            if (model.wasPropertyExplicitlySet("allowedTenancies")) {
                this.allowedTenancies(model.getAllowedTenancies());
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

    /** Allowed tenancies provided when a listing is published as private. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTenancies")
    private final java.util.List<String> allowedTenancies;

    /**
     * Allowed tenancies provided when a listing is published as private.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedTenancies() {
        return allowedTenancies;
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
        sb.append("PublishListingRevisionAsPrivateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("allowedTenancies=").append(String.valueOf(this.allowedTenancies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishListingRevisionAsPrivateDetails)) {
            return false;
        }

        PublishListingRevisionAsPrivateDetails other = (PublishListingRevisionAsPrivateDetails) o;
        return java.util.Objects.equals(this.allowedTenancies, other.allowedTenancies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedTenancies == null ? 43 : this.allowedTenancies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
