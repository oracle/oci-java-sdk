/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * PProvides the information used for the reboot job. <br>
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
        builder = RebootLifecycleStageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RebootLifecycleStageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rebootTimeoutInMins", "workRequestDetails"})
    public RebootLifecycleStageDetails(
            Integer rebootTimeoutInMins, WorkRequestDetails workRequestDetails) {
        super();
        this.rebootTimeoutInMins = rebootTimeoutInMins;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of minutes the service waits for the reboot to complete. If the instances in
         * the stage don't reboot within this time, the reboot job status is set to failed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rebootTimeoutInMins")
        private Integer rebootTimeoutInMins;

        /**
         * The number of minutes the service waits for the reboot to complete. If the instances in
         * the stage don't reboot within this time, the reboot job status is set to failed.
         *
         * @param rebootTimeoutInMins the value to set
         * @return this builder
         */
        public Builder rebootTimeoutInMins(Integer rebootTimeoutInMins) {
            this.rebootTimeoutInMins = rebootTimeoutInMins;
            this.__explicitlySet__.add("rebootTimeoutInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
        private WorkRequestDetails workRequestDetails;

        public Builder workRequestDetails(WorkRequestDetails workRequestDetails) {
            this.workRequestDetails = workRequestDetails;
            this.__explicitlySet__.add("workRequestDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RebootLifecycleStageDetails build() {
            RebootLifecycleStageDetails model =
                    new RebootLifecycleStageDetails(
                            this.rebootTimeoutInMins, this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RebootLifecycleStageDetails model) {
            if (model.wasPropertyExplicitlySet("rebootTimeoutInMins")) {
                this.rebootTimeoutInMins(model.getRebootTimeoutInMins());
            }
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
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
     * The number of minutes the service waits for the reboot to complete. If the instances in the
     * stage don't reboot within this time, the reboot job status is set to failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rebootTimeoutInMins")
    private final Integer rebootTimeoutInMins;

    /**
     * The number of minutes the service waits for the reboot to complete. If the instances in the
     * stage don't reboot within this time, the reboot job status is set to failed.
     *
     * @return the value
     */
    public Integer getRebootTimeoutInMins() {
        return rebootTimeoutInMins;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
    private final WorkRequestDetails workRequestDetails;

    public WorkRequestDetails getWorkRequestDetails() {
        return workRequestDetails;
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
        sb.append("RebootLifecycleStageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("rebootTimeoutInMins=").append(String.valueOf(this.rebootTimeoutInMins));
        sb.append(", workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RebootLifecycleStageDetails)) {
            return false;
        }

        RebootLifecycleStageDetails other = (RebootLifecycleStageDetails) o;
        return java.util.Objects.equals(this.rebootTimeoutInMins, other.rebootTimeoutInMins)
                && java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.rebootTimeoutInMins == null
                                ? 43
                                : this.rebootTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
