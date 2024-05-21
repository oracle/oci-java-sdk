/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The update run details. Only a limited set of properties of a run can be updated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateRunDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "freeformTags",
        "maxDurationInMinutes",
        "idleTimeoutInMinutes"
    })
    public UpdateRunDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Long maxDurationInMinutes,
            Long idleTimeoutInMinutes) {
        super();
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.maxDurationInMinutes = maxDurationInMinutes;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
         * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxDurationInMinutes")
        private Long maxDurationInMinutes;

        /**
         * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
         * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
         *
         * @param maxDurationInMinutes the value to set
         * @return this builder
         **/
        public Builder maxDurationInMinutes(Long maxDurationInMinutes) {
            this.maxDurationInMinutes = maxDurationInMinutes;
            this.__explicitlySet__.add("maxDurationInMinutes");
            return this;
        }
        /**
         * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
         * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
        private Long idleTimeoutInMinutes;

        /**
         * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
         * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
         *
         * @param idleTimeoutInMinutes the value to set
         * @return this builder
         **/
        public Builder idleTimeoutInMinutes(Long idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            this.__explicitlySet__.add("idleTimeoutInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRunDetails build() {
            UpdateRunDetails model =
                    new UpdateRunDetails(
                            this.definedTags,
                            this.freeformTags,
                            this.maxDurationInMinutes,
                            this.idleTimeoutInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRunDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("maxDurationInMinutes")) {
                this.maxDurationInMinutes(model.getMaxDurationInMinutes());
            }
            if (model.wasPropertyExplicitlySet("idleTimeoutInMinutes")) {
                this.idleTimeoutInMinutes(model.getIdleTimeoutInMinutes());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
     * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDurationInMinutes")
    private final Long maxDurationInMinutes;

    /**
     * The maximum duration in minutes for which an Application should run. Data Flow Run would be terminated
     * once it reaches this duration from the time it transitions to {@code IN_PROGRESS} state.
     *
     * @return the value
     **/
    public Long getMaxDurationInMinutes() {
        return maxDurationInMinutes;
    }

    /**
     * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
     * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeoutInMinutes")
    private final Long idleTimeoutInMinutes;

    /**
     * The timeout value in minutes used to manage Runs. A Run would be stopped after inactivity for this amount of time period.
     * Note: This parameter is currently only applicable for Runs of type {@code SESSION}. Default value is 2880 minutes (2 days)
     *
     * @return the value
     **/
    public Long getIdleTimeoutInMinutes() {
        return idleTimeoutInMinutes;
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
        sb.append("UpdateRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", maxDurationInMinutes=").append(String.valueOf(this.maxDurationInMinutes));
        sb.append(", idleTimeoutInMinutes=").append(String.valueOf(this.idleTimeoutInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRunDetails)) {
            return false;
        }

        UpdateRunDetails other = (UpdateRunDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.maxDurationInMinutes, other.maxDurationInMinutes)
                && java.util.Objects.equals(this.idleTimeoutInMinutes, other.idleTimeoutInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDurationInMinutes == null
                                ? 43
                                : this.maxDurationInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.idleTimeoutInMinutes == null
                                ? 43
                                : this.idleTimeoutInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
