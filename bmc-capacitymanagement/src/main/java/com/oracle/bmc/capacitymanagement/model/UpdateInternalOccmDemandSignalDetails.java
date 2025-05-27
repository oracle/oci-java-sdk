/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * An internal model to update the demand signal state. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateInternalOccmDemandSignalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateInternalOccmDemandSignalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lifecycleDetails"})
    public UpdateInternalOccmDemandSignalDetails(LifecycleDetails lifecycleDetails) {
        super();
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subset of demand signal states available for operators for updating the demand
         * signal.
         *
         * <p>IN_PROGRESS -> Transitions the demand signal to IN_PROGRESS state. REJECTED ->
         * Transitions the demand signal to REJECTED state. COMPLETED -> This will transition the
         * demand signal to COMPLETED state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The subset of demand signal states available for operators for updating the demand
         * signal.
         *
         * <p>IN_PROGRESS -> Transitions the demand signal to IN_PROGRESS state. REJECTED ->
         * Transitions the demand signal to REJECTED state. COMPLETED -> This will transition the
         * demand signal to COMPLETED state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInternalOccmDemandSignalDetails build() {
            UpdateInternalOccmDemandSignalDetails model =
                    new UpdateInternalOccmDemandSignalDetails(this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInternalOccmDemandSignalDetails model) {
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The subset of demand signal states available for operators for updating the demand signal.
     *
     * <p>IN_PROGRESS -> Transitions the demand signal to IN_PROGRESS state. REJECTED -> Transitions
     * the demand signal to REJECTED state. COMPLETED -> This will transition the demand signal to
     * COMPLETED state.
     */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),
        Rejected("REJECTED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleDetails: " + key);
        }
    };
    /**
     * The subset of demand signal states available for operators for updating the demand signal.
     *
     * <p>IN_PROGRESS -> Transitions the demand signal to IN_PROGRESS state. REJECTED -> Transitions
     * the demand signal to REJECTED state. COMPLETED -> This will transition the demand signal to
     * COMPLETED state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The subset of demand signal states available for operators for updating the demand signal.
     *
     * <p>IN_PROGRESS -> Transitions the demand signal to IN_PROGRESS state. REJECTED -> Transitions
     * the demand signal to REJECTED state. COMPLETED -> This will transition the demand signal to
     * COMPLETED state.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("UpdateInternalOccmDemandSignalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInternalOccmDemandSignalDetails)) {
            return false;
        }

        UpdateInternalOccmDemandSignalDetails other = (UpdateInternalOccmDemandSignalDetails) o;
        return java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
