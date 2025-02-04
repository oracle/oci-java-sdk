/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The job run workload configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobRunWorkloadConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "workloadType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobRunWorkloadConfigurationDetails extends WorkloadConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("useCaseConfiguration")
        private JobRunUseCaseConfigurationDetails useCaseConfiguration;

        public Builder useCaseConfiguration(
                JobRunUseCaseConfigurationDetails useCaseConfiguration) {
            this.useCaseConfiguration = useCaseConfiguration;
            this.__explicitlySet__.add("useCaseConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobRunWorkloadConfigurationDetails build() {
            JobRunWorkloadConfigurationDetails model =
                    new JobRunWorkloadConfigurationDetails(this.useCaseConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRunWorkloadConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("useCaseConfiguration")) {
                this.useCaseConfiguration(model.getUseCaseConfiguration());
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

    @Deprecated
    public JobRunWorkloadConfigurationDetails(
            JobRunUseCaseConfigurationDetails useCaseConfiguration) {
        super();
        this.useCaseConfiguration = useCaseConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("useCaseConfiguration")
    private final JobRunUseCaseConfigurationDetails useCaseConfiguration;

    public JobRunUseCaseConfigurationDetails getUseCaseConfiguration() {
        return useCaseConfiguration;
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
        sb.append("JobRunWorkloadConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", useCaseConfiguration=").append(String.valueOf(this.useCaseConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobRunWorkloadConfigurationDetails)) {
            return false;
        }

        JobRunWorkloadConfigurationDetails other = (JobRunWorkloadConfigurationDetails) o;
        return java.util.Objects.equals(this.useCaseConfiguration, other.useCaseConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.useCaseConfiguration == null
                                ? 43
                                : this.useCaseConfiguration.hashCode());
        return result;
    }
}
