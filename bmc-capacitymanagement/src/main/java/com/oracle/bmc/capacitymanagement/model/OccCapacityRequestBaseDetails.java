/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details of the create capacity request. This model serves as a base for different namespaces.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OccCapacityRequestBaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OccCapacityRequestBaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceType",
        "workloadType",
        "sourceWorkloadType",
        "expectedHandoverQuantity",
        "dateExpectedHandover",
        "actualHandoverQuantity",
        "dateActualHandover",
        "availabilityDomain",
        "associatedOccHandoverResourceBlockList",
        "resourceName",
        "demandQuantity"
    })
    public OccCapacityRequestBaseDetails(
            String resourceType,
            String workloadType,
            String sourceWorkloadType,
            Long expectedHandoverQuantity,
            java.util.Date dateExpectedHandover,
            Long actualHandoverQuantity,
            java.util.Date dateActualHandover,
            String availabilityDomain,
            java.util.List<AssociatedOccHandoverResourceBlock>
                    associatedOccHandoverResourceBlockList,
            String resourceName,
            Long demandQuantity) {
        super();
        this.resourceType = resourceType;
        this.workloadType = workloadType;
        this.sourceWorkloadType = sourceWorkloadType;
        this.expectedHandoverQuantity = expectedHandoverQuantity;
        this.dateExpectedHandover = dateExpectedHandover;
        this.actualHandoverQuantity = actualHandoverQuantity;
        this.dateActualHandover = dateActualHandover;
        this.availabilityDomain = availabilityDomain;
        this.associatedOccHandoverResourceBlockList = associatedOccHandoverResourceBlockList;
        this.resourceName = resourceName;
        this.demandQuantity = demandQuantity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the resource against which the user wants to place a capacity request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of the resource against which the user wants to place a capacity request.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The type of the workload (Generic/ROW).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private String workloadType;

        /**
         * The type of the workload (Generic/ROW).
         * @param workloadType the value to set
         * @return this builder
         **/
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /**
         * The WorkloadType from where capacity request are to be transferred.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkloadType")
        private String sourceWorkloadType;

        /**
         * The WorkloadType from where capacity request are to be transferred.
         * @param sourceWorkloadType the value to set
         * @return this builder
         **/
        public Builder sourceWorkloadType(String sourceWorkloadType) {
            this.sourceWorkloadType = sourceWorkloadType;
            this.__explicitlySet__.add("sourceWorkloadType");
            return this;
        }
        /**
         * The incremental quantity of resources supplied as the provisioning is underway.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expectedHandoverQuantity")
        private Long expectedHandoverQuantity;

        /**
         * The incremental quantity of resources supplied as the provisioning is underway.
         * @param expectedHandoverQuantity the value to set
         * @return this builder
         **/
        public Builder expectedHandoverQuantity(Long expectedHandoverQuantity) {
            this.expectedHandoverQuantity = expectedHandoverQuantity;
            this.__explicitlySet__.add("expectedHandoverQuantity");
            return this;
        }
        /**
         * The date on which the latest increment to supplied quantity of resources was delivered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedHandover")
        private java.util.Date dateExpectedHandover;

        /**
         * The date on which the latest increment to supplied quantity of resources was delivered.
         * @param dateExpectedHandover the value to set
         * @return this builder
         **/
        public Builder dateExpectedHandover(java.util.Date dateExpectedHandover) {
            this.dateExpectedHandover = dateExpectedHandover;
            this.__explicitlySet__.add("dateExpectedHandover");
            return this;
        }
        /**
         * The actual handed over quantity of resources at the time of request resolution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actualHandoverQuantity")
        private Long actualHandoverQuantity;

        /**
         * The actual handed over quantity of resources at the time of request resolution.
         * @param actualHandoverQuantity the value to set
         * @return this builder
         **/
        public Builder actualHandoverQuantity(Long actualHandoverQuantity) {
            this.actualHandoverQuantity = actualHandoverQuantity;
            this.__explicitlySet__.add("actualHandoverQuantity");
            return this;
        }
        /**
         * The date on which the actual handover quantity of resources is delivered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dateActualHandover")
        private java.util.Date dateActualHandover;

        /**
         * The date on which the actual handover quantity of resources is delivered.
         * @param dateActualHandover the value to set
         * @return this builder
         **/
        public Builder dateActualHandover(java.util.Date dateActualHandover) {
            this.dateActualHandover = dateActualHandover;
            this.__explicitlySet__.add("dateActualHandover");
            return this;
        }
        /**
         * The availability domain of the resource which is to be transferred. Note that this is only required for Capacity Request Transfer requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the resource which is to be transferred. Note that this is only required for Capacity Request Transfer requests.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * A list containing details about occHandoverResourceBlocks which were handed over for the corresponding resource name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedOccHandoverResourceBlockList")
        private java.util.List<AssociatedOccHandoverResourceBlock>
                associatedOccHandoverResourceBlockList;

        /**
         * A list containing details about occHandoverResourceBlocks which were handed over for the corresponding resource name.
         *
         * @param associatedOccHandoverResourceBlockList the value to set
         * @return this builder
         **/
        public Builder associatedOccHandoverResourceBlockList(
                java.util.List<AssociatedOccHandoverResourceBlock>
                        associatedOccHandoverResourceBlockList) {
            this.associatedOccHandoverResourceBlockList = associatedOccHandoverResourceBlockList;
            this.__explicitlySet__.add("associatedOccHandoverResourceBlockList");
            return this;
        }
        /**
         * The name of the COMPUTE server shape for which the request is made. Do not use CAPACITY_CONSTRAINT as the resource name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the COMPUTE server shape for which the request is made. Do not use CAPACITY_CONSTRAINT as the resource name.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The number of compute server's with name <resourceName> required by the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
        private Long demandQuantity;

        /**
         * The number of compute server's with name <resourceName> required by the user.
         * @param demandQuantity the value to set
         * @return this builder
         **/
        public Builder demandQuantity(Long demandQuantity) {
            this.demandQuantity = demandQuantity;
            this.__explicitlySet__.add("demandQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccCapacityRequestBaseDetails build() {
            OccCapacityRequestBaseDetails model =
                    new OccCapacityRequestBaseDetails(
                            this.resourceType,
                            this.workloadType,
                            this.sourceWorkloadType,
                            this.expectedHandoverQuantity,
                            this.dateExpectedHandover,
                            this.actualHandoverQuantity,
                            this.dateActualHandover,
                            this.availabilityDomain,
                            this.associatedOccHandoverResourceBlockList,
                            this.resourceName,
                            this.demandQuantity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccCapacityRequestBaseDetails model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("sourceWorkloadType")) {
                this.sourceWorkloadType(model.getSourceWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("expectedHandoverQuantity")) {
                this.expectedHandoverQuantity(model.getExpectedHandoverQuantity());
            }
            if (model.wasPropertyExplicitlySet("dateExpectedHandover")) {
                this.dateExpectedHandover(model.getDateExpectedHandover());
            }
            if (model.wasPropertyExplicitlySet("actualHandoverQuantity")) {
                this.actualHandoverQuantity(model.getActualHandoverQuantity());
            }
            if (model.wasPropertyExplicitlySet("dateActualHandover")) {
                this.dateActualHandover(model.getDateActualHandover());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("associatedOccHandoverResourceBlockList")) {
                this.associatedOccHandoverResourceBlockList(
                        model.getAssociatedOccHandoverResourceBlockList());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("demandQuantity")) {
                this.demandQuantity(model.getDemandQuantity());
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
     * The type of the resource against which the user wants to place a capacity request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of the resource against which the user wants to place a capacity request.
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The type of the workload (Generic/ROW).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final String workloadType;

    /**
     * The type of the workload (Generic/ROW).
     * @return the value
     **/
    public String getWorkloadType() {
        return workloadType;
    }

    /**
     * The WorkloadType from where capacity request are to be transferred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceWorkloadType")
    private final String sourceWorkloadType;

    /**
     * The WorkloadType from where capacity request are to be transferred.
     * @return the value
     **/
    public String getSourceWorkloadType() {
        return sourceWorkloadType;
    }

    /**
     * The incremental quantity of resources supplied as the provisioning is underway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedHandoverQuantity")
    private final Long expectedHandoverQuantity;

    /**
     * The incremental quantity of resources supplied as the provisioning is underway.
     * @return the value
     **/
    public Long getExpectedHandoverQuantity() {
        return expectedHandoverQuantity;
    }

    /**
     * The date on which the latest increment to supplied quantity of resources was delivered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedHandover")
    private final java.util.Date dateExpectedHandover;

    /**
     * The date on which the latest increment to supplied quantity of resources was delivered.
     * @return the value
     **/
    public java.util.Date getDateExpectedHandover() {
        return dateExpectedHandover;
    }

    /**
     * The actual handed over quantity of resources at the time of request resolution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualHandoverQuantity")
    private final Long actualHandoverQuantity;

    /**
     * The actual handed over quantity of resources at the time of request resolution.
     * @return the value
     **/
    public Long getActualHandoverQuantity() {
        return actualHandoverQuantity;
    }

    /**
     * The date on which the actual handover quantity of resources is delivered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateActualHandover")
    private final java.util.Date dateActualHandover;

    /**
     * The date on which the actual handover quantity of resources is delivered.
     * @return the value
     **/
    public java.util.Date getDateActualHandover() {
        return dateActualHandover;
    }

    /**
     * The availability domain of the resource which is to be transferred. Note that this is only required for Capacity Request Transfer requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the resource which is to be transferred. Note that this is only required for Capacity Request Transfer requests.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * A list containing details about occHandoverResourceBlocks which were handed over for the corresponding resource name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedOccHandoverResourceBlockList")
    private final java.util.List<AssociatedOccHandoverResourceBlock>
            associatedOccHandoverResourceBlockList;

    /**
     * A list containing details about occHandoverResourceBlocks which were handed over for the corresponding resource name.
     *
     * @return the value
     **/
    public java.util.List<AssociatedOccHandoverResourceBlock>
            getAssociatedOccHandoverResourceBlockList() {
        return associatedOccHandoverResourceBlockList;
    }

    /**
     * The name of the COMPUTE server shape for which the request is made. Do not use CAPACITY_CONSTRAINT as the resource name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the COMPUTE server shape for which the request is made. Do not use CAPACITY_CONSTRAINT as the resource name.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The number of compute server's with name <resourceName> required by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
    private final Long demandQuantity;

    /**
     * The number of compute server's with name <resourceName> required by the user.
     * @return the value
     **/
    public Long getDemandQuantity() {
        return demandQuantity;
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
        sb.append("OccCapacityRequestBaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", sourceWorkloadType=").append(String.valueOf(this.sourceWorkloadType));
        sb.append(", expectedHandoverQuantity=")
                .append(String.valueOf(this.expectedHandoverQuantity));
        sb.append(", dateExpectedHandover=").append(String.valueOf(this.dateExpectedHandover));
        sb.append(", actualHandoverQuantity=").append(String.valueOf(this.actualHandoverQuantity));
        sb.append(", dateActualHandover=").append(String.valueOf(this.dateActualHandover));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", associatedOccHandoverResourceBlockList=")
                .append(String.valueOf(this.associatedOccHandoverResourceBlockList));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", demandQuantity=").append(String.valueOf(this.demandQuantity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccCapacityRequestBaseDetails)) {
            return false;
        }

        OccCapacityRequestBaseDetails other = (OccCapacityRequestBaseDetails) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.sourceWorkloadType, other.sourceWorkloadType)
                && java.util.Objects.equals(
                        this.expectedHandoverQuantity, other.expectedHandoverQuantity)
                && java.util.Objects.equals(this.dateExpectedHandover, other.dateExpectedHandover)
                && java.util.Objects.equals(
                        this.actualHandoverQuantity, other.actualHandoverQuantity)
                && java.util.Objects.equals(this.dateActualHandover, other.dateActualHandover)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.associatedOccHandoverResourceBlockList,
                        other.associatedOccHandoverResourceBlockList)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.demandQuantity, other.demandQuantity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceWorkloadType == null
                                ? 43
                                : this.sourceWorkloadType.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedHandoverQuantity == null
                                ? 43
                                : this.expectedHandoverQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.dateExpectedHandover == null
                                ? 43
                                : this.dateExpectedHandover.hashCode());
        result =
                (result * PRIME)
                        + (this.actualHandoverQuantity == null
                                ? 43
                                : this.actualHandoverQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.dateActualHandover == null
                                ? 43
                                : this.dateActualHandover.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedOccHandoverResourceBlockList == null
                                ? 43
                                : this.associatedOccHandoverResourceBlockList.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.demandQuantity == null ? 43 : this.demandQuantity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
