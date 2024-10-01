/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.model;

/**
 * Details of the security attribute to be updated for a specific security attribute namespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSecurityAttributeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSecurityAttributeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "isRetired", "validator"})
    public UpdateSecurityAttributeDetails(
            String description, Boolean isRetired, BaseSecurityAttributeValidator validator) {
        super();
        this.description = description;
        this.isRetired = isRetired;
        this.validator = validator;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The description of the security attribute during creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the security attribute during creation.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Whether the security attribute is retired. See [Managing Security
         * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRetired")
        private Boolean isRetired;

        /**
         * Whether the security attribute is retired. See [Managing Security
         * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
         *
         * @param isRetired the value to set
         * @return this builder
         */
        public Builder isRetired(Boolean isRetired) {
            this.isRetired = isRetired;
            this.__explicitlySet__.add("isRetired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validator")
        private BaseSecurityAttributeValidator validator;

        public Builder validator(BaseSecurityAttributeValidator validator) {
            this.validator = validator;
            this.__explicitlySet__.add("validator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSecurityAttributeDetails build() {
            UpdateSecurityAttributeDetails model =
                    new UpdateSecurityAttributeDetails(
                            this.description, this.isRetired, this.validator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSecurityAttributeDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRetired")) {
                this.isRetired(model.getIsRetired());
            }
            if (model.wasPropertyExplicitlySet("validator")) {
                this.validator(model.getValidator());
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

    /** The description of the security attribute during creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the security attribute during creation.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Whether the security attribute is retired. See [Managing Security
     * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRetired")
    private final Boolean isRetired;

    /**
     * Whether the security attribute is retired. See [Managing Security
     * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
     *
     * @return the value
     */
    public Boolean getIsRetired() {
        return isRetired;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validator")
    private final BaseSecurityAttributeValidator validator;

    public BaseSecurityAttributeValidator getValidator() {
        return validator;
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
        sb.append("UpdateSecurityAttributeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", isRetired=").append(String.valueOf(this.isRetired));
        sb.append(", validator=").append(String.valueOf(this.validator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSecurityAttributeDetails)) {
            return false;
        }

        UpdateSecurityAttributeDetails other = (UpdateSecurityAttributeDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRetired, other.isRetired)
                && java.util.Objects.equals(this.validator, other.validator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRetired == null ? 43 : this.isRetired.hashCode());
        result = (result * PRIME) + (this.validator == null ? 43 : this.validator.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
