/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about different fields used to update the demand signal delivery resource. <br>
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
        builder = UpdateInternalOccmDemandSignalDeliveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateInternalOccmDemandSignalDeliveryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "acceptedQuantity",
        "lifecycleDetails",
        "timeDelivered",
        "justification",
        "notes",
        "freeformTags",
        "definedTags"
    })
    public UpdateInternalOccmDemandSignalDeliveryDetails(
            Long acceptedQuantity,
            InternalOccmDemandSignalDelivery.LifecycleDetails lifecycleDetails,
            java.util.Date timeDelivered,
            String justification,
            String notes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.acceptedQuantity = acceptedQuantity;
        this.lifecycleDetails = lifecycleDetails;
        this.timeDelivered = timeDelivered;
        this.justification = justification;
        this.notes = notes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The quantity of the resource that OCI will supply to the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("acceptedQuantity")
        private Long acceptedQuantity;

        /**
         * The quantity of the resource that OCI will supply to the customer.
         *
         * @param acceptedQuantity the value to set
         * @return this builder
         */
        public Builder acceptedQuantity(Long acceptedQuantity) {
            this.acceptedQuantity = acceptedQuantity;
            this.__explicitlySet__.add("acceptedQuantity");
            return this;
        }
        /** The state in which we want to transition the demand signal delivery resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private InternalOccmDemandSignalDelivery.LifecycleDetails lifecycleDetails;

        /**
         * The state in which we want to transition the demand signal delivery resource.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(
                InternalOccmDemandSignalDelivery.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The date on which the OCI delivered the resource to the customers. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDelivered")
        private java.util.Date timeDelivered;

        /**
         * The date on which the OCI delivered the resource to the customers.
         *
         * @param timeDelivered the value to set
         * @return this builder
         */
        public Builder timeDelivered(java.util.Date timeDelivered) {
            this.timeDelivered = timeDelivered;
            this.__explicitlySet__.add("timeDelivered");
            return this;
        }
        /** This field could be used by OCI to communicate the reason for declining the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * This field could be used by OCI to communicate the reason for declining the request.
         *
         * @param justification the value to set
         * @return this builder
         */
        public Builder justification(String justification) {
            this.justification = justification;
            this.__explicitlySet__.add("justification");
            return this;
        }
        /** This field acts as a notes section for operators. */
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * This field acts as a notes section for operators.
         *
         * @param notes the value to set
         * @return this builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInternalOccmDemandSignalDeliveryDetails build() {
            UpdateInternalOccmDemandSignalDeliveryDetails model =
                    new UpdateInternalOccmDemandSignalDeliveryDetails(
                            this.acceptedQuantity,
                            this.lifecycleDetails,
                            this.timeDelivered,
                            this.justification,
                            this.notes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInternalOccmDemandSignalDeliveryDetails model) {
            if (model.wasPropertyExplicitlySet("acceptedQuantity")) {
                this.acceptedQuantity(model.getAcceptedQuantity());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeDelivered")) {
                this.timeDelivered(model.getTimeDelivered());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("notes")) {
                this.notes(model.getNotes());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The quantity of the resource that OCI will supply to the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("acceptedQuantity")
    private final Long acceptedQuantity;

    /**
     * The quantity of the resource that OCI will supply to the customer.
     *
     * @return the value
     */
    public Long getAcceptedQuantity() {
        return acceptedQuantity;
    }

    /** The state in which we want to transition the demand signal delivery resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final InternalOccmDemandSignalDelivery.LifecycleDetails lifecycleDetails;

    /**
     * The state in which we want to transition the demand signal delivery resource.
     *
     * @return the value
     */
    public InternalOccmDemandSignalDelivery.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The date on which the OCI delivered the resource to the customers. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDelivered")
    private final java.util.Date timeDelivered;

    /**
     * The date on which the OCI delivered the resource to the customers.
     *
     * @return the value
     */
    public java.util.Date getTimeDelivered() {
        return timeDelivered;
    }

    /** This field could be used by OCI to communicate the reason for declining the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * This field could be used by OCI to communicate the reason for declining the request.
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /** This field acts as a notes section for operators. */
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * This field acts as a notes section for operators.
     *
     * @return the value
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateInternalOccmDemandSignalDeliveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("acceptedQuantity=").append(String.valueOf(this.acceptedQuantity));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeDelivered=").append(String.valueOf(this.timeDelivered));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", notes=").append(String.valueOf(this.notes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInternalOccmDemandSignalDeliveryDetails)) {
            return false;
        }

        UpdateInternalOccmDemandSignalDeliveryDetails other =
                (UpdateInternalOccmDemandSignalDeliveryDetails) o;
        return java.util.Objects.equals(this.acceptedQuantity, other.acceptedQuantity)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeDelivered, other.timeDelivered)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.notes, other.notes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.acceptedQuantity == null ? 43 : this.acceptedQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDelivered == null ? 43 : this.timeDelivered.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result = (result * PRIME) + (this.notes == null ? 43 : this.notes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
