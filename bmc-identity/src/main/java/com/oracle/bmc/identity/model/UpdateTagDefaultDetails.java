/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTagDefaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTagDefaultDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "isRequired"})
    public UpdateTagDefaultDetails(String value, Boolean isRequired) {
        super();
        this.value = value;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The default value for the tag definition. This will be applied to all resources created
         * in the Compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The default value for the tag definition. This will be applied to all resources created
         * in the Compartment.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * If you specify that a value is required, a value is set during resource creation (either
         * by the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         *
         * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
         * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
         * during resource creation.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * If you specify that a value is required, a value is set during resource creation (either
         * by the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         *
         * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
         * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
         * during resource creation.
         *
         * <p>Example: {@code false}
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTagDefaultDetails build() {
            UpdateTagDefaultDetails model =
                    new UpdateTagDefaultDetails(this.value, this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTagDefaultDetails model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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

    /**
     * The default value for the tag definition. This will be applied to all resources created in
     * the Compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The default value for the tag definition. This will be applied to all resources created in
     * the Compartment.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource creation
     * is blocked.
     *
     * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
     * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
     * during resource creation.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource creation
     * is blocked.
     *
     * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
     * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
     * during resource creation.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("UpdateTagDefaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTagDefaultDetails)) {
            return false;
        }

        UpdateTagDefaultDetails other = (UpdateTagDefaultDetails) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
