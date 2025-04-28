/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used in detailed description create operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDetailedDescriptionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDetailedDescriptionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logo", "detailedDescription"})
    public CreateDetailedDescriptionDetails(String logo, String detailedDescription) {
        super();
        this.logo = logo;
        this.detailedDescription = detailedDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base64 encoded image to represent logo of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("logo")
        private String logo;

        /**
         * Base64 encoded image to represent logo of the object.
         *
         * @param logo the value to set
         * @return this builder
         */
        public Builder logo(String logo) {
            this.logo = logo;
            this.__explicitlySet__.add("logo");
            return this;
        }
        /** Base64 encoded rich text description of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("detailedDescription")
        private String detailedDescription;

        /**
         * Base64 encoded rich text description of the object.
         *
         * @param detailedDescription the value to set
         * @return this builder
         */
        public Builder detailedDescription(String detailedDescription) {
            this.detailedDescription = detailedDescription;
            this.__explicitlySet__.add("detailedDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDetailedDescriptionDetails build() {
            CreateDetailedDescriptionDetails model =
                    new CreateDetailedDescriptionDetails(this.logo, this.detailedDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDetailedDescriptionDetails model) {
            if (model.wasPropertyExplicitlySet("logo")) {
                this.logo(model.getLogo());
            }
            if (model.wasPropertyExplicitlySet("detailedDescription")) {
                this.detailedDescription(model.getDetailedDescription());
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

    /** Base64 encoded image to represent logo of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final String logo;

    /**
     * Base64 encoded image to represent logo of the object.
     *
     * @return the value
     */
    public String getLogo() {
        return logo;
    }

    /** Base64 encoded rich text description of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("detailedDescription")
    private final String detailedDescription;

    /**
     * Base64 encoded rich text description of the object.
     *
     * @return the value
     */
    public String getDetailedDescription() {
        return detailedDescription;
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
        sb.append("CreateDetailedDescriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logo=").append(String.valueOf(this.logo));
        sb.append(", detailedDescription=").append(String.valueOf(this.detailedDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDetailedDescriptionDetails)) {
            return false;
        }

        CreateDetailedDescriptionDetails other = (CreateDetailedDescriptionDetails) o;
        return java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.detailedDescription, other.detailedDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logo == null ? 43 : this.logo.hashCode());
        result =
                (result * PRIME)
                        + (this.detailedDescription == null
                                ? 43
                                : this.detailedDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
