/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The overview summary is used to represent an array item that shall be used to represent the
 * overview of the catalog resources along with their corresponding capacity requests. <br>
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
        builder = OccOverviewSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccOverviewSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "periodValue",
        "resourceName",
        "totalAvailable",
        "totalDemanded",
        "totalSupplied",
        "totalRejected",
        "totalCancelled",
        "totalUnfulfilled",
        "workloadTypeBreakdownBlob",
        "capacityRequestsBlob",
        "unit"
    })
    public OccOverviewSummary(
            String compartmentId,
            String periodValue,
            String resourceName,
            Long totalAvailable,
            Long totalDemanded,
            Long totalSupplied,
            Long totalRejected,
            Long totalCancelled,
            Long totalUnfulfilled,
            String workloadTypeBreakdownBlob,
            String capacityRequestsBlob,
            String unit) {
        super();
        this.compartmentId = compartmentId;
        this.periodValue = periodValue;
        this.resourceName = resourceName;
        this.totalAvailable = totalAvailable;
        this.totalDemanded = totalDemanded;
        this.totalSupplied = totalSupplied;
        this.totalRejected = totalRejected;
        this.totalCancelled = totalCancelled;
        this.totalUnfulfilled = totalUnfulfilled;
        this.workloadTypeBreakdownBlob = workloadTypeBreakdownBlob;
        this.capacityRequestsBlob = capacityRequestsBlob;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment from which the api call is made. This will be used for
         * authorizing the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment from which the api call is made. This will be used for
         * authorizing the request.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the month along with year for which this summary corresponds to. */
        @com.fasterxml.jackson.annotation.JsonProperty("periodValue")
        private String periodValue;

        /**
         * The name of the month along with year for which this summary corresponds to.
         *
         * @param periodValue the value to set
         * @return this builder
         */
        public Builder periodValue(String periodValue) {
            this.periodValue = periodValue;
            this.__explicitlySet__.add("periodValue");
            return this;
        }
        /** The name of the resource for which we have aggregated the value. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource for which we have aggregated the value.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The quantity of the resource which is available at the end of the period of
         * aggregationDetails model in consideration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalAvailable")
        private Long totalAvailable;

        /**
         * The quantity of the resource which is available at the end of the period of
         * aggregationDetails model in consideration.
         *
         * @param totalAvailable the value to set
         * @return this builder
         */
        public Builder totalAvailable(Long totalAvailable) {
            this.totalAvailable = totalAvailable;
            this.__explicitlySet__.add("totalAvailable");
            return this;
        }
        /**
         * The quantity of the resource which is demanded by customers via capacity requests against
         * the resource name at the end of the time period in consideration for overview.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalDemanded")
        private Long totalDemanded;

        /**
         * The quantity of the resource which is demanded by customers via capacity requests against
         * the resource name at the end of the time period in consideration for overview.
         *
         * @param totalDemanded the value to set
         * @return this builder
         */
        public Builder totalDemanded(Long totalDemanded) {
            this.totalDemanded = totalDemanded;
            this.__explicitlySet__.add("totalDemanded");
            return this;
        }
        /**
         * The quantity of the resource which is supplied by Oracle to the customer against the
         * resource name at the end of the time period in consideration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSupplied")
        private Long totalSupplied;

        /**
         * The quantity of the resource which is supplied by Oracle to the customer against the
         * resource name at the end of the time period in consideration.
         *
         * @param totalSupplied the value to set
         * @return this builder
         */
        public Builder totalSupplied(Long totalSupplied) {
            this.totalSupplied = totalSupplied;
            this.__explicitlySet__.add("totalSupplied");
            return this;
        }
        /** The quantity of the resource which is rejected by Oracle. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalRejected")
        private Long totalRejected;

        /**
         * The quantity of the resource which is rejected by Oracle.
         *
         * @param totalRejected the value to set
         * @return this builder
         */
        public Builder totalRejected(Long totalRejected) {
            this.totalRejected = totalRejected;
            this.__explicitlySet__.add("totalRejected");
            return this;
        }
        /**
         * The quantity of the resource which is cancelled by the customer. Once the capacity
         * request was submitted, the customer can still cancel it. This field sums up those values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCancelled")
        private Long totalCancelled;

        /**
         * The quantity of the resource which is cancelled by the customer. Once the capacity
         * request was submitted, the customer can still cancel it. This field sums up those values.
         *
         * @param totalCancelled the value to set
         * @return this builder
         */
        public Builder totalCancelled(Long totalCancelled) {
            this.totalCancelled = totalCancelled;
            this.__explicitlySet__.add("totalCancelled");
            return this;
        }
        /**
         * The quantity of the resource which Oracle was unable to supply. For a given capacity
         * request, Oracle sometimes cannot supply the entire value demanded by the customer. In
         * such cases a partial value is provided, thereby leaving behind a portion of unfulfilled
         * values. This field sums that up.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalUnfulfilled")
        private Long totalUnfulfilled;

        /**
         * The quantity of the resource which Oracle was unable to supply. For a given capacity
         * request, Oracle sometimes cannot supply the entire value demanded by the customer. In
         * such cases a partial value is provided, thereby leaving behind a portion of unfulfilled
         * values. This field sums that up.
         *
         * @param totalUnfulfilled the value to set
         * @return this builder
         */
        public Builder totalUnfulfilled(Long totalUnfulfilled) {
            this.totalUnfulfilled = totalUnfulfilled;
            this.__explicitlySet__.add("totalUnfulfilled");
            return this;
        }
        /**
         * A raw json blob containing breakdown of totalAvailable, totalDemanded, totalSupplied,
         * totalRejected, totalCancelled and totalUnfulfilled by workload types
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadTypeBreakdownBlob")
        private String workloadTypeBreakdownBlob;

        /**
         * A raw json blob containing breakdown of totalAvailable, totalDemanded, totalSupplied,
         * totalRejected, totalCancelled and totalUnfulfilled by workload types
         *
         * @param workloadTypeBreakdownBlob the value to set
         * @return this builder
         */
        public Builder workloadTypeBreakdownBlob(String workloadTypeBreakdownBlob) {
            this.workloadTypeBreakdownBlob = workloadTypeBreakdownBlob;
            this.__explicitlySet__.add("workloadTypeBreakdownBlob");
            return this;
        }
        /**
         * A raw json blob containing all the capacity requests corresponding to the resource name
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityRequestsBlob")
        private String capacityRequestsBlob;

        /**
         * A raw json blob containing all the capacity requests corresponding to the resource name
         *
         * @param capacityRequestsBlob the value to set
         * @return this builder
         */
        public Builder capacityRequestsBlob(String capacityRequestsBlob) {
            this.capacityRequestsBlob = capacityRequestsBlob;
            this.__explicitlySet__.add("capacityRequestsBlob");
            return this;
        }
        /**
         * The unit e.g SERVER in which the above values like totalAvailable, totalSupplied etc is
         * measured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit e.g SERVER in which the above values like totalAvailable, totalSupplied etc is
         * measured.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccOverviewSummary build() {
            OccOverviewSummary model =
                    new OccOverviewSummary(
                            this.compartmentId,
                            this.periodValue,
                            this.resourceName,
                            this.totalAvailable,
                            this.totalDemanded,
                            this.totalSupplied,
                            this.totalRejected,
                            this.totalCancelled,
                            this.totalUnfulfilled,
                            this.workloadTypeBreakdownBlob,
                            this.capacityRequestsBlob,
                            this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccOverviewSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("periodValue")) {
                this.periodValue(model.getPeriodValue());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("totalAvailable")) {
                this.totalAvailable(model.getTotalAvailable());
            }
            if (model.wasPropertyExplicitlySet("totalDemanded")) {
                this.totalDemanded(model.getTotalDemanded());
            }
            if (model.wasPropertyExplicitlySet("totalSupplied")) {
                this.totalSupplied(model.getTotalSupplied());
            }
            if (model.wasPropertyExplicitlySet("totalRejected")) {
                this.totalRejected(model.getTotalRejected());
            }
            if (model.wasPropertyExplicitlySet("totalCancelled")) {
                this.totalCancelled(model.getTotalCancelled());
            }
            if (model.wasPropertyExplicitlySet("totalUnfulfilled")) {
                this.totalUnfulfilled(model.getTotalUnfulfilled());
            }
            if (model.wasPropertyExplicitlySet("workloadTypeBreakdownBlob")) {
                this.workloadTypeBreakdownBlob(model.getWorkloadTypeBreakdownBlob());
            }
            if (model.wasPropertyExplicitlySet("capacityRequestsBlob")) {
                this.capacityRequestsBlob(model.getCapacityRequestsBlob());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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
     * The OCID of the compartment from which the api call is made. This will be used for
     * authorizing the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment from which the api call is made. This will be used for
     * authorizing the request.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the month along with year for which this summary corresponds to. */
    @com.fasterxml.jackson.annotation.JsonProperty("periodValue")
    private final String periodValue;

    /**
     * The name of the month along with year for which this summary corresponds to.
     *
     * @return the value
     */
    public String getPeriodValue() {
        return periodValue;
    }

    /** The name of the resource for which we have aggregated the value. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource for which we have aggregated the value.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The quantity of the resource which is available at the end of the period of
     * aggregationDetails model in consideration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalAvailable")
    private final Long totalAvailable;

    /**
     * The quantity of the resource which is available at the end of the period of
     * aggregationDetails model in consideration.
     *
     * @return the value
     */
    public Long getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * The quantity of the resource which is demanded by customers via capacity requests against the
     * resource name at the end of the time period in consideration for overview.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalDemanded")
    private final Long totalDemanded;

    /**
     * The quantity of the resource which is demanded by customers via capacity requests against the
     * resource name at the end of the time period in consideration for overview.
     *
     * @return the value
     */
    public Long getTotalDemanded() {
        return totalDemanded;
    }

    /**
     * The quantity of the resource which is supplied by Oracle to the customer against the resource
     * name at the end of the time period in consideration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupplied")
    private final Long totalSupplied;

    /**
     * The quantity of the resource which is supplied by Oracle to the customer against the resource
     * name at the end of the time period in consideration.
     *
     * @return the value
     */
    public Long getTotalSupplied() {
        return totalSupplied;
    }

    /** The quantity of the resource which is rejected by Oracle. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalRejected")
    private final Long totalRejected;

    /**
     * The quantity of the resource which is rejected by Oracle.
     *
     * @return the value
     */
    public Long getTotalRejected() {
        return totalRejected;
    }

    /**
     * The quantity of the resource which is cancelled by the customer. Once the capacity request
     * was submitted, the customer can still cancel it. This field sums up those values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCancelled")
    private final Long totalCancelled;

    /**
     * The quantity of the resource which is cancelled by the customer. Once the capacity request
     * was submitted, the customer can still cancel it. This field sums up those values.
     *
     * @return the value
     */
    public Long getTotalCancelled() {
        return totalCancelled;
    }

    /**
     * The quantity of the resource which Oracle was unable to supply. For a given capacity request,
     * Oracle sometimes cannot supply the entire value demanded by the customer. In such cases a
     * partial value is provided, thereby leaving behind a portion of unfulfilled values. This field
     * sums that up.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnfulfilled")
    private final Long totalUnfulfilled;

    /**
     * The quantity of the resource which Oracle was unable to supply. For a given capacity request,
     * Oracle sometimes cannot supply the entire value demanded by the customer. In such cases a
     * partial value is provided, thereby leaving behind a portion of unfulfilled values. This field
     * sums that up.
     *
     * @return the value
     */
    public Long getTotalUnfulfilled() {
        return totalUnfulfilled;
    }

    /**
     * A raw json blob containing breakdown of totalAvailable, totalDemanded, totalSupplied,
     * totalRejected, totalCancelled and totalUnfulfilled by workload types
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadTypeBreakdownBlob")
    private final String workloadTypeBreakdownBlob;

    /**
     * A raw json blob containing breakdown of totalAvailable, totalDemanded, totalSupplied,
     * totalRejected, totalCancelled and totalUnfulfilled by workload types
     *
     * @return the value
     */
    public String getWorkloadTypeBreakdownBlob() {
        return workloadTypeBreakdownBlob;
    }

    /** A raw json blob containing all the capacity requests corresponding to the resource name */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityRequestsBlob")
    private final String capacityRequestsBlob;

    /**
     * A raw json blob containing all the capacity requests corresponding to the resource name
     *
     * @return the value
     */
    public String getCapacityRequestsBlob() {
        return capacityRequestsBlob;
    }

    /**
     * The unit e.g SERVER in which the above values like totalAvailable, totalSupplied etc is
     * measured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit e.g SERVER in which the above values like totalAvailable, totalSupplied etc is
     * measured.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
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
        sb.append("OccOverviewSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", periodValue=").append(String.valueOf(this.periodValue));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", totalAvailable=").append(String.valueOf(this.totalAvailable));
        sb.append(", totalDemanded=").append(String.valueOf(this.totalDemanded));
        sb.append(", totalSupplied=").append(String.valueOf(this.totalSupplied));
        sb.append(", totalRejected=").append(String.valueOf(this.totalRejected));
        sb.append(", totalCancelled=").append(String.valueOf(this.totalCancelled));
        sb.append(", totalUnfulfilled=").append(String.valueOf(this.totalUnfulfilled));
        sb.append(", workloadTypeBreakdownBlob=")
                .append(String.valueOf(this.workloadTypeBreakdownBlob));
        sb.append(", capacityRequestsBlob=").append(String.valueOf(this.capacityRequestsBlob));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccOverviewSummary)) {
            return false;
        }

        OccOverviewSummary other = (OccOverviewSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.periodValue, other.periodValue)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.totalAvailable, other.totalAvailable)
                && java.util.Objects.equals(this.totalDemanded, other.totalDemanded)
                && java.util.Objects.equals(this.totalSupplied, other.totalSupplied)
                && java.util.Objects.equals(this.totalRejected, other.totalRejected)
                && java.util.Objects.equals(this.totalCancelled, other.totalCancelled)
                && java.util.Objects.equals(this.totalUnfulfilled, other.totalUnfulfilled)
                && java.util.Objects.equals(
                        this.workloadTypeBreakdownBlob, other.workloadTypeBreakdownBlob)
                && java.util.Objects.equals(this.capacityRequestsBlob, other.capacityRequestsBlob)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.periodValue == null ? 43 : this.periodValue.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAvailable == null ? 43 : this.totalAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDemanded == null ? 43 : this.totalDemanded.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSupplied == null ? 43 : this.totalSupplied.hashCode());
        result =
                (result * PRIME)
                        + (this.totalRejected == null ? 43 : this.totalRejected.hashCode());
        result =
                (result * PRIME)
                        + (this.totalCancelled == null ? 43 : this.totalCancelled.hashCode());
        result =
                (result * PRIME)
                        + (this.totalUnfulfilled == null ? 43 : this.totalUnfulfilled.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadTypeBreakdownBlob == null
                                ? 43
                                : this.workloadTypeBreakdownBlob.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityRequestsBlob == null
                                ? 43
                                : this.capacityRequestsBlob.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
