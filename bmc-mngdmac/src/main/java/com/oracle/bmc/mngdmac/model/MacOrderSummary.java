/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mngdmac.model;

/**
 * Summary information about a MacOrder.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250320")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacOrderSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacOrderSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "orderDescription",
        "orderSize",
        "ipRange",
        "isDocusigned",
        "shape",
        "timeCreated",
        "timeUpdated",
        "commitmentTerm",
        "timeBillingStarted",
        "timeBillingEnded",
        "orderStatus",
        "lifecycleState",
        "lifecycleDetails"
    })
    public MacOrderSummary(
            String id,
            String compartmentId,
            String displayName,
            String orderDescription,
            Integer orderSize,
            String ipRange,
            Boolean isDocusigned,
            MacOrder.Shape shape,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            MacOrder.CommitmentTerm commitmentTerm,
            java.util.Date timeBillingStarted,
            java.util.Date timeBillingEnded,
            MacOrder.OrderStatus orderStatus,
            MacOrder.LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.orderDescription = orderDescription;
        this.orderSize = orderSize;
        this.ipRange = ipRange;
        this.isDocusigned = isDocusigned;
        this.shape = shape;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.commitmentTerm = commitmentTerm;
        this.timeBillingStarted = timeBillingStarted;
        this.timeBillingEnded = timeBillingEnded;
        this.orderStatus = orderStatus;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the compartment to which the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderDescription")
        private String orderDescription;

        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         * @param orderDescription the value to set
         * @return this builder
         **/
        public Builder orderDescription(String orderDescription) {
            this.orderDescription = orderDescription;
            this.__explicitlySet__.add("orderDescription");
            return this;
        }
        /**
         * Number of macs requested in this MacOrder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderSize")
        private Integer orderSize;

        /**
         * Number of macs requested in this MacOrder.
         * @param orderSize the value to set
         * @return this builder
         **/
        public Builder orderSize(Integer orderSize) {
            this.orderSize = orderSize;
            this.__explicitlySet__.add("orderSize");
            return this;
        }
        /**
         * The IP Range specified by the customer for this order.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
        private String ipRange;

        /**
         * The IP Range specified by the customer for this order.
         * @param ipRange the value to set
         * @return this builder
         **/
        public Builder ipRange(String ipRange) {
            this.ipRange = ipRange;
            this.__explicitlySet__.add("ipRange");
            return this;
        }
        /**
         * Checkbox value that indicates whether the customer completed docusign process.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDocusigned")
        private Boolean isDocusigned;

        /**
         * Checkbox value that indicates whether the customer completed docusign process.
         * @param isDocusigned the value to set
         * @return this builder
         **/
        public Builder isDocusigned(Boolean isDocusigned) {
            this.isDocusigned = isDocusigned;
            this.__explicitlySet__.add("isDocusigned");
            return this;
        }
        /**
         * The requested shape for Macs in this MacOrder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private MacOrder.Shape shape;

        /**
         * The requested shape for Macs in this MacOrder.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(MacOrder.Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Enum indicating the agreed commitment term on the MacOrder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentTerm")
        private MacOrder.CommitmentTerm commitmentTerm;

        /**
         * Enum indicating the agreed commitment term on the MacOrder.
         * @param commitmentTerm the value to set
         * @return this builder
         **/
        public Builder commitmentTerm(MacOrder.CommitmentTerm commitmentTerm) {
            this.commitmentTerm = commitmentTerm;
            this.__explicitlySet__.add("commitmentTerm");
            return this;
        }
        /**
         * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingStarted")
        private java.util.Date timeBillingStarted;

        /**
         * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
         * @param timeBillingStarted the value to set
         * @return this builder
         **/
        public Builder timeBillingStarted(java.util.Date timeBillingStarted) {
            this.timeBillingStarted = timeBillingStarted;
            this.__explicitlySet__.add("timeBillingStarted");
            return this;
        }
        /**
         * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingEnded")
        private java.util.Date timeBillingEnded;

        /**
         * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
         * @param timeBillingEnded the value to set
         * @return this builder
         **/
        public Builder timeBillingEnded(java.util.Date timeBillingEnded) {
            this.timeBillingEnded = timeBillingEnded;
            this.__explicitlySet__.add("timeBillingEnded");
            return this;
        }
        /**
         * The current status of the MacOrder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderStatus")
        private MacOrder.OrderStatus orderStatus;

        /**
         * The current status of the MacOrder.
         * @param orderStatus the value to set
         * @return this builder
         **/
        public Builder orderStatus(MacOrder.OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            this.__explicitlySet__.add("orderStatus");
            return this;
        }
        /**
         * The current state of the MacOrder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MacOrder.LifecycleState lifecycleState;

        /**
         * The current state of the MacOrder.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MacOrder.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the MacOrder in more detail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the MacOrder in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacOrderSummary build() {
            MacOrderSummary model =
                    new MacOrderSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.orderDescription,
                            this.orderSize,
                            this.ipRange,
                            this.isDocusigned,
                            this.shape,
                            this.timeCreated,
                            this.timeUpdated,
                            this.commitmentTerm,
                            this.timeBillingStarted,
                            this.timeBillingEnded,
                            this.orderStatus,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacOrderSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("orderDescription")) {
                this.orderDescription(model.getOrderDescription());
            }
            if (model.wasPropertyExplicitlySet("orderSize")) {
                this.orderSize(model.getOrderSize());
            }
            if (model.wasPropertyExplicitlySet("ipRange")) {
                this.ipRange(model.getIpRange());
            }
            if (model.wasPropertyExplicitlySet("isDocusigned")) {
                this.isDocusigned(model.getIsDocusigned());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("commitmentTerm")) {
                this.commitmentTerm(model.getCommitmentTerm());
            }
            if (model.wasPropertyExplicitlySet("timeBillingStarted")) {
                this.timeBillingStarted(model.getTimeBillingStarted());
            }
            if (model.wasPropertyExplicitlySet("timeBillingEnded")) {
                this.timeBillingEnded(model.getTimeBillingEnded());
            }
            if (model.wasPropertyExplicitlySet("orderStatus")) {
                this.orderStatus(model.getOrderStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the compartment to which the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderDescription")
    private final String orderDescription;

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getOrderDescription() {
        return orderDescription;
    }

    /**
     * Number of macs requested in this MacOrder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderSize")
    private final Integer orderSize;

    /**
     * Number of macs requested in this MacOrder.
     * @return the value
     **/
    public Integer getOrderSize() {
        return orderSize;
    }

    /**
     * The IP Range specified by the customer for this order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
    private final String ipRange;

    /**
     * The IP Range specified by the customer for this order.
     * @return the value
     **/
    public String getIpRange() {
        return ipRange;
    }

    /**
     * Checkbox value that indicates whether the customer completed docusign process.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDocusigned")
    private final Boolean isDocusigned;

    /**
     * Checkbox value that indicates whether the customer completed docusign process.
     * @return the value
     **/
    public Boolean getIsDocusigned() {
        return isDocusigned;
    }

    /**
     * The requested shape for Macs in this MacOrder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final MacOrder.Shape shape;

    /**
     * The requested shape for Macs in this MacOrder.
     * @return the value
     **/
    public MacOrder.Shape getShape() {
        return shape;
    }

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Enum indicating the agreed commitment term on the MacOrder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentTerm")
    private final MacOrder.CommitmentTerm commitmentTerm;

    /**
     * Enum indicating the agreed commitment term on the MacOrder.
     * @return the value
     **/
    public MacOrder.CommitmentTerm getCommitmentTerm() {
        return commitmentTerm;
    }

    /**
     * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingStarted")
    private final java.util.Date timeBillingStarted;

    /**
     * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
     * @return the value
     **/
    public java.util.Date getTimeBillingStarted() {
        return timeBillingStarted;
    }

    /**
     * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingEnded")
    private final java.util.Date timeBillingEnded;

    /**
     * An RFC3339-formatted datetime string containing the date and time this MacOrder begins.
     * @return the value
     **/
    public java.util.Date getTimeBillingEnded() {
        return timeBillingEnded;
    }

    /**
     * The current status of the MacOrder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderStatus")
    private final MacOrder.OrderStatus orderStatus;

    /**
     * The current status of the MacOrder.
     * @return the value
     **/
    public MacOrder.OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * The current state of the MacOrder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MacOrder.LifecycleState lifecycleState;

    /**
     * The current state of the MacOrder.
     * @return the value
     **/
    public MacOrder.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the MacOrder in more detail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the MacOrder in more detail.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("MacOrderSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", orderDescription=").append(String.valueOf(this.orderDescription));
        sb.append(", orderSize=").append(String.valueOf(this.orderSize));
        sb.append(", ipRange=").append(String.valueOf(this.ipRange));
        sb.append(", isDocusigned=").append(String.valueOf(this.isDocusigned));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", commitmentTerm=").append(String.valueOf(this.commitmentTerm));
        sb.append(", timeBillingStarted=").append(String.valueOf(this.timeBillingStarted));
        sb.append(", timeBillingEnded=").append(String.valueOf(this.timeBillingEnded));
        sb.append(", orderStatus=").append(String.valueOf(this.orderStatus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacOrderSummary)) {
            return false;
        }

        MacOrderSummary other = (MacOrderSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.orderDescription, other.orderDescription)
                && java.util.Objects.equals(this.orderSize, other.orderSize)
                && java.util.Objects.equals(this.ipRange, other.ipRange)
                && java.util.Objects.equals(this.isDocusigned, other.isDocusigned)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.commitmentTerm, other.commitmentTerm)
                && java.util.Objects.equals(this.timeBillingStarted, other.timeBillingStarted)
                && java.util.Objects.equals(this.timeBillingEnded, other.timeBillingEnded)
                && java.util.Objects.equals(this.orderStatus, other.orderStatus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.orderDescription == null ? 43 : this.orderDescription.hashCode());
        result = (result * PRIME) + (this.orderSize == null ? 43 : this.orderSize.hashCode());
        result = (result * PRIME) + (this.ipRange == null ? 43 : this.ipRange.hashCode());
        result = (result * PRIME) + (this.isDocusigned == null ? 43 : this.isDocusigned.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentTerm == null ? 43 : this.commitmentTerm.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingStarted == null
                                ? 43
                                : this.timeBillingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingEnded == null ? 43 : this.timeBillingEnded.hashCode());
        result = (result * PRIME) + (this.orderStatus == null ? 43 : this.orderStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
