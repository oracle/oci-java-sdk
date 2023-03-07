/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The update environment configuration details object for managed container
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDefaultModelDeploymentEnvironmentConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "environmentConfigurationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDefaultModelDeploymentEnvironmentConfigurationDetails
        extends UpdateModelDeploymentEnvironmentConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Environment variables to set for the web server container.
         * The size of envVars must be less than 2048 bytes.
         * Key should be under 32 characters.
         * Key should contain only letters, digits and underscore (_)
         * Key should start with a letter.
         * Key should have at least 2 characters.
         * Key should not end with underscore eg. {@code TEST_}
         * Key if added cannot be empty. Value can be empty.
         * No specific size limits on individual Values. But overall environment variables is limited to 2048 bytes.
         * Key can't be reserved Model Deployment environment variables.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * Environment variables to set for the web server container.
         * The size of envVars must be less than 2048 bytes.
         * Key should be under 32 characters.
         * Key should contain only letters, digits and underscore (_)
         * Key should start with a letter.
         * Key should have at least 2 characters.
         * Key should not end with underscore eg. {@code TEST_}
         * Key if added cannot be empty. Value can be empty.
         * No specific size limits on individual Values. But overall environment variables is limited to 2048 bytes.
         * Key can't be reserved Model Deployment environment variables.
         *
         * @param environmentVariables the value to set
         * @return this builder
         **/
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDefaultModelDeploymentEnvironmentConfigurationDetails build() {
            UpdateDefaultModelDeploymentEnvironmentConfigurationDetails model =
                    new UpdateDefaultModelDeploymentEnvironmentConfigurationDetails(
                            this.environmentVariables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDefaultModelDeploymentEnvironmentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
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
    public UpdateDefaultModelDeploymentEnvironmentConfigurationDetails(
            java.util.Map<String, String> environmentVariables) {
        super();
        this.environmentVariables = environmentVariables;
    }

    /**
     * Environment variables to set for the web server container.
     * The size of envVars must be less than 2048 bytes.
     * Key should be under 32 characters.
     * Key should contain only letters, digits and underscore (_)
     * Key should start with a letter.
     * Key should have at least 2 characters.
     * Key should not end with underscore eg. {@code TEST_}
     * Key if added cannot be empty. Value can be empty.
     * No specific size limits on individual Values. But overall environment variables is limited to 2048 bytes.
     * Key can't be reserved Model Deployment environment variables.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * Environment variables to set for the web server container.
     * The size of envVars must be less than 2048 bytes.
     * Key should be under 32 characters.
     * Key should contain only letters, digits and underscore (_)
     * Key should start with a letter.
     * Key should have at least 2 characters.
     * Key should not end with underscore eg. {@code TEST_}
     * Key if added cannot be empty. Value can be empty.
     * No specific size limits on individual Values. But overall environment variables is limited to 2048 bytes.
     * Key can't be reserved Model Deployment environment variables.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
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
        sb.append("UpdateDefaultModelDeploymentEnvironmentConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDefaultModelDeploymentEnvironmentConfigurationDetails)) {
            return false;
        }

        UpdateDefaultModelDeploymentEnvironmentConfigurationDetails other =
                (UpdateDefaultModelDeploymentEnvironmentConfigurationDetails) o;
        return java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        return result;
    }
}
