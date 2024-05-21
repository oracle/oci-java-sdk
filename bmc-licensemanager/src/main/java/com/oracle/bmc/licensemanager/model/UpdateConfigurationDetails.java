/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The compartment-specific configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"emailIds"})
    public UpdateConfigurationDetails(java.util.List<String> emailIds) {
        super();
        this.emailIds = emailIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of email IDs associated with the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailIds")
        private java.util.List<String> emailIds;

        /**
         * List of email IDs associated with the configuration.
         * @param emailIds the value to set
         * @return this builder
         **/
        public Builder emailIds(java.util.List<String> emailIds) {
            this.emailIds = emailIds;
            this.__explicitlySet__.add("emailIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConfigurationDetails build() {
            UpdateConfigurationDetails model = new UpdateConfigurationDetails(this.emailIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("emailIds")) {
                this.emailIds(model.getEmailIds());
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
     * List of email IDs associated with the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailIds")
    private final java.util.List<String> emailIds;

    /**
     * List of email IDs associated with the configuration.
     * @return the value
     **/
    public java.util.List<String> getEmailIds() {
        return emailIds;
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
        sb.append("UpdateConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("emailIds=").append(String.valueOf(this.emailIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigurationDetails)) {
            return false;
        }

        UpdateConfigurationDetails other = (UpdateConfigurationDetails) o;
        return java.util.Objects.equals(this.emailIds, other.emailIds) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.emailIds == null ? 43 : this.emailIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
