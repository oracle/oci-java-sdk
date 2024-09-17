/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about the association of capacity requests with the corresponding resources handed over
 * by oracle. <br>
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
        builder = OccHandoverResourceBlockSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccHandoverResourceBlockSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "namespace",
        "occCustomerGroupId",
        "handoverDate",
        "handoverResourceName",
        "totalHandoverQuantity",
        "associatedCapacityRequests",
        "placementDetails"
    })
    public OccHandoverResourceBlockSummary(
            String id,
            String compartmentId,
            Namespace namespace,
            String occCustomerGroupId,
            java.util.Date handoverDate,
            String handoverResourceName,
            Long totalHandoverQuantity,
            java.util.List<AssociatedCapacityRequestDetails> associatedCapacityRequests,
            PlacementDetails placementDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.namespace = namespace;
        this.occCustomerGroupId = occCustomerGroupId;
        this.handoverDate = handoverDate;
        this.handoverResourceName = handoverResourceName;
        this.totalHandoverQuantity = totalHandoverQuantity;
        this.associatedCapacityRequests = associatedCapacityRequests;
        this.placementDetails = placementDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource block. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource block.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment where the resource block's are placed. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the resource block's are placed.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the OCI service in consideration. For example Compute, Exadata and so on. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example Compute, Exadata and so on.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The OCID of the customer group for which the resources were provisioned. */
        @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
        private String occCustomerGroupId;

        /**
         * The OCID of the customer group for which the resources were provisioned.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            this.__explicitlySet__.add("occCustomerGroupId");
            return this;
        }
        /** The date on which the resource was handed over to the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("handoverDate")
        private java.util.Date handoverDate;

        /**
         * The date on which the resource was handed over to the customer.
         *
         * @param handoverDate the value to set
         * @return this builder
         */
        public Builder handoverDate(java.util.Date handoverDate) {
            this.handoverDate = handoverDate;
            this.__explicitlySet__.add("handoverDate");
            return this;
        }
        /**
         * The name of the resource handed over by oracle. For instance for compute namespace this
         * will be the name of the bare metal hardware resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("handoverResourceName")
        private String handoverResourceName;

        /**
         * The name of the resource handed over by oracle. For instance for compute namespace this
         * will be the name of the bare metal hardware resource.
         *
         * @param handoverResourceName the value to set
         * @return this builder
         */
        public Builder handoverResourceName(String handoverResourceName) {
            this.handoverResourceName = handoverResourceName;
            this.__explicitlySet__.add("handoverResourceName");
            return this;
        }
        /** The total quantity of the resource that was made available to the customer by Oracle. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalHandoverQuantity")
        private Long totalHandoverQuantity;

        /**
         * The total quantity of the resource that was made available to the customer by Oracle.
         *
         * @param totalHandoverQuantity the value to set
         * @return this builder
         */
        public Builder totalHandoverQuantity(Long totalHandoverQuantity) {
            this.totalHandoverQuantity = totalHandoverQuantity;
            this.__explicitlySet__.add("totalHandoverQuantity");
            return this;
        }
        /**
         * A list containing details about the capacity requests against which the resources were
         * provisioned by oracle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedCapacityRequests")
        private java.util.List<AssociatedCapacityRequestDetails> associatedCapacityRequests;

        /**
         * A list containing details about the capacity requests against which the resources were
         * provisioned by oracle.
         *
         * @param associatedCapacityRequests the value to set
         * @return this builder
         */
        public Builder associatedCapacityRequests(
                java.util.List<AssociatedCapacityRequestDetails> associatedCapacityRequests) {
            this.associatedCapacityRequests = associatedCapacityRequests;
            this.__explicitlySet__.add("associatedCapacityRequests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("placementDetails")
        private PlacementDetails placementDetails;

        public Builder placementDetails(PlacementDetails placementDetails) {
            this.placementDetails = placementDetails;
            this.__explicitlySet__.add("placementDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccHandoverResourceBlockSummary build() {
            OccHandoverResourceBlockSummary model =
                    new OccHandoverResourceBlockSummary(
                            this.id,
                            this.compartmentId,
                            this.namespace,
                            this.occCustomerGroupId,
                            this.handoverDate,
                            this.handoverResourceName,
                            this.totalHandoverQuantity,
                            this.associatedCapacityRequests,
                            this.placementDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccHandoverResourceBlockSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("occCustomerGroupId")) {
                this.occCustomerGroupId(model.getOccCustomerGroupId());
            }
            if (model.wasPropertyExplicitlySet("handoverDate")) {
                this.handoverDate(model.getHandoverDate());
            }
            if (model.wasPropertyExplicitlySet("handoverResourceName")) {
                this.handoverResourceName(model.getHandoverResourceName());
            }
            if (model.wasPropertyExplicitlySet("totalHandoverQuantity")) {
                this.totalHandoverQuantity(model.getTotalHandoverQuantity());
            }
            if (model.wasPropertyExplicitlySet("associatedCapacityRequests")) {
                this.associatedCapacityRequests(model.getAssociatedCapacityRequests());
            }
            if (model.wasPropertyExplicitlySet("placementDetails")) {
                this.placementDetails(model.getPlacementDetails());
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

    /** The OCID of the resource block. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource block.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment where the resource block's are placed. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the resource block's are placed.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the OCI service in consideration. For example Compute, Exadata and so on. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example Compute, Exadata and so on.
     *
     * @return the value
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /** The OCID of the customer group for which the resources were provisioned. */
    @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
    private final String occCustomerGroupId;

    /**
     * The OCID of the customer group for which the resources were provisioned.
     *
     * @return the value
     */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }

    /** The date on which the resource was handed over to the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("handoverDate")
    private final java.util.Date handoverDate;

    /**
     * The date on which the resource was handed over to the customer.
     *
     * @return the value
     */
    public java.util.Date getHandoverDate() {
        return handoverDate;
    }

    /**
     * The name of the resource handed over by oracle. For instance for compute namespace this will
     * be the name of the bare metal hardware resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("handoverResourceName")
    private final String handoverResourceName;

    /**
     * The name of the resource handed over by oracle. For instance for compute namespace this will
     * be the name of the bare metal hardware resource.
     *
     * @return the value
     */
    public String getHandoverResourceName() {
        return handoverResourceName;
    }

    /** The total quantity of the resource that was made available to the customer by Oracle. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalHandoverQuantity")
    private final Long totalHandoverQuantity;

    /**
     * The total quantity of the resource that was made available to the customer by Oracle.
     *
     * @return the value
     */
    public Long getTotalHandoverQuantity() {
        return totalHandoverQuantity;
    }

    /**
     * A list containing details about the capacity requests against which the resources were
     * provisioned by oracle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedCapacityRequests")
    private final java.util.List<AssociatedCapacityRequestDetails> associatedCapacityRequests;

    /**
     * A list containing details about the capacity requests against which the resources were
     * provisioned by oracle.
     *
     * @return the value
     */
    public java.util.List<AssociatedCapacityRequestDetails> getAssociatedCapacityRequests() {
        return associatedCapacityRequests;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placementDetails")
    private final PlacementDetails placementDetails;

    public PlacementDetails getPlacementDetails() {
        return placementDetails;
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
        sb.append("OccHandoverResourceBlockSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(", handoverDate=").append(String.valueOf(this.handoverDate));
        sb.append(", handoverResourceName=").append(String.valueOf(this.handoverResourceName));
        sb.append(", totalHandoverQuantity=").append(String.valueOf(this.totalHandoverQuantity));
        sb.append(", associatedCapacityRequests=")
                .append(String.valueOf(this.associatedCapacityRequests));
        sb.append(", placementDetails=").append(String.valueOf(this.placementDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccHandoverResourceBlockSummary)) {
            return false;
        }

        OccHandoverResourceBlockSummary other = (OccHandoverResourceBlockSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.handoverDate, other.handoverDate)
                && java.util.Objects.equals(this.handoverResourceName, other.handoverResourceName)
                && java.util.Objects.equals(this.totalHandoverQuantity, other.totalHandoverQuantity)
                && java.util.Objects.equals(
                        this.associatedCapacityRequests, other.associatedCapacityRequests)
                && java.util.Objects.equals(this.placementDetails, other.placementDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result = (result * PRIME) + (this.handoverDate == null ? 43 : this.handoverDate.hashCode());
        result =
                (result * PRIME)
                        + (this.handoverResourceName == null
                                ? 43
                                : this.handoverResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.totalHandoverQuantity == null
                                ? 43
                                : this.totalHandoverQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedCapacityRequests == null
                                ? 43
                                : this.associatedCapacityRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.placementDetails == null ? 43 : this.placementDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
