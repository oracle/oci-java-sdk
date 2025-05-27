/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * An internal model containing details about the properties required for creating a demand signal
 * delivery resource. <br>
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
        builder = CreateInternalOccmDemandSignalDeliveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateInternalOccmDemandSignalDeliveryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "occCustomerGroupId",
        "demandSignalId",
        "demandSignalItemId",
        "acceptedQuantity",
        "justification",
        "notes",
        "freeformTags",
        "definedTags"
    })
    public CreateInternalOccmDemandSignalDeliveryDetails(
            String compartmentId,
            String occCustomerGroupId,
            String demandSignalId,
            String demandSignalItemId,
            Long acceptedQuantity,
            String justification,
            String notes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.occCustomerGroupId = occCustomerGroupId;
        this.demandSignalId = demandSignalId;
        this.demandSignalItemId = demandSignalItemId;
        this.acceptedQuantity = acceptedQuantity;
        this.justification = justification;
        this.notes = notes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the tenancy from which the demand signal delivery resource is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy from which the demand signal delivery resource is created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the corresponding customer group to which this demand signal delivery
         * resource belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
        private String occCustomerGroupId;

        /**
         * The OCID of the corresponding customer group to which this demand signal delivery
         * resource belongs to.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            this.__explicitlySet__.add("occCustomerGroupId");
            return this;
        }
        /** The OCID of the demand signal under which this delivery will be grouped. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
        private String demandSignalId;

        /**
         * The OCID of the demand signal under which this delivery will be grouped.
         *
         * @param demandSignalId the value to set
         * @return this builder
         */
        public Builder demandSignalId(String demandSignalId) {
            this.demandSignalId = demandSignalId;
            this.__explicitlySet__.add("demandSignalId");
            return this;
        }
        /** The OCID of the demand signal item corresponding to which this delivery is made. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandSignalItemId")
        private String demandSignalItemId;

        /**
         * The OCID of the demand signal item corresponding to which this delivery is made.
         *
         * @param demandSignalItemId the value to set
         * @return this builder
         */
        public Builder demandSignalItemId(String demandSignalItemId) {
            this.demandSignalItemId = demandSignalItemId;
            this.__explicitlySet__.add("demandSignalItemId");
            return this;
        }
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

        public CreateInternalOccmDemandSignalDeliveryDetails build() {
            CreateInternalOccmDemandSignalDeliveryDetails model =
                    new CreateInternalOccmDemandSignalDeliveryDetails(
                            this.compartmentId,
                            this.occCustomerGroupId,
                            this.demandSignalId,
                            this.demandSignalItemId,
                            this.acceptedQuantity,
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
        public Builder copy(CreateInternalOccmDemandSignalDeliveryDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("occCustomerGroupId")) {
                this.occCustomerGroupId(model.getOccCustomerGroupId());
            }
            if (model.wasPropertyExplicitlySet("demandSignalId")) {
                this.demandSignalId(model.getDemandSignalId());
            }
            if (model.wasPropertyExplicitlySet("demandSignalItemId")) {
                this.demandSignalItemId(model.getDemandSignalItemId());
            }
            if (model.wasPropertyExplicitlySet("acceptedQuantity")) {
                this.acceptedQuantity(model.getAcceptedQuantity());
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

    /** The OCID of the tenancy from which the demand signal delivery resource is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy from which the demand signal delivery resource is created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the corresponding customer group to which this demand signal delivery resource
     * belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
    private final String occCustomerGroupId;

    /**
     * The OCID of the corresponding customer group to which this demand signal delivery resource
     * belongs to.
     *
     * @return the value
     */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }

    /** The OCID of the demand signal under which this delivery will be grouped. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
    private final String demandSignalId;

    /**
     * The OCID of the demand signal under which this delivery will be grouped.
     *
     * @return the value
     */
    public String getDemandSignalId() {
        return demandSignalId;
    }

    /** The OCID of the demand signal item corresponding to which this delivery is made. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandSignalItemId")
    private final String demandSignalItemId;

    /**
     * The OCID of the demand signal item corresponding to which this delivery is made.
     *
     * @return the value
     */
    public String getDemandSignalItemId() {
        return demandSignalItemId;
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
        sb.append("CreateInternalOccmDemandSignalDeliveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(", demandSignalId=").append(String.valueOf(this.demandSignalId));
        sb.append(", demandSignalItemId=").append(String.valueOf(this.demandSignalItemId));
        sb.append(", acceptedQuantity=").append(String.valueOf(this.acceptedQuantity));
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
        if (!(o instanceof CreateInternalOccmDemandSignalDeliveryDetails)) {
            return false;
        }

        CreateInternalOccmDemandSignalDeliveryDetails other =
                (CreateInternalOccmDemandSignalDeliveryDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.demandSignalId, other.demandSignalId)
                && java.util.Objects.equals(this.demandSignalItemId, other.demandSignalItemId)
                && java.util.Objects.equals(this.acceptedQuantity, other.acceptedQuantity)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.demandSignalId == null ? 43 : this.demandSignalId.hashCode());
        result =
                (result * PRIME)
                        + (this.demandSignalItemId == null
                                ? 43
                                : this.demandSignalItemId.hashCode());
        result =
                (result * PRIME)
                        + (this.acceptedQuantity == null ? 43 : this.acceptedQuantity.hashCode());
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
