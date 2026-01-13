/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Object containing current utilization, projected utilization, id and daysToReach high and low
 * utilization value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataInsightResourceInsightUtilizationItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInsightResourceInsightUtilizationItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exadataInsightId",
        "exadataDisplayName",
        "currentUtilization",
        "projectedUtilization",
        "daysToReachHighUtilization",
        "daysToReachLowUtilization"
    })
    public ExadataInsightResourceInsightUtilizationItem(
            String exadataInsightId,
            String exadataDisplayName,
            Double currentUtilization,
            Double projectedUtilization,
            Integer daysToReachHighUtilization,
            Integer daysToReachLowUtilization) {
        super();
        this.exadataInsightId = exadataInsightId;
        this.exadataDisplayName = exadataDisplayName;
        this.currentUtilization = currentUtilization;
        this.projectedUtilization = projectedUtilization;
        this.daysToReachHighUtilization = daysToReachHighUtilization;
        this.daysToReachLowUtilization = daysToReachLowUtilization;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata insight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata insight.
         *
         * @param exadataInsightId the value to set
         * @return this builder
         */
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }
        /** The user-friendly name for the Exadata system. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        /**
         * The user-friendly name for the Exadata system. The name does not have to be unique.
         *
         * @param exadataDisplayName the value to set
         * @return this builder
         */
        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }
        /** Current utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("currentUtilization")
        private Double currentUtilization;

        /**
         * Current utilization
         *
         * @param currentUtilization the value to set
         * @return this builder
         */
        public Builder currentUtilization(Double currentUtilization) {
            this.currentUtilization = currentUtilization;
            this.__explicitlySet__.add("currentUtilization");
            return this;
        }
        /** Projected utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("projectedUtilization")
        private Double projectedUtilization;

        /**
         * Projected utilization
         *
         * @param projectedUtilization the value to set
         * @return this builder
         */
        public Builder projectedUtilization(Double projectedUtilization) {
            this.projectedUtilization = projectedUtilization;
            this.__explicitlySet__.add("projectedUtilization");
            return this;
        }
        /** Days to reach projected high utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachHighUtilization")
        private Integer daysToReachHighUtilization;

        /**
         * Days to reach projected high utilization
         *
         * @param daysToReachHighUtilization the value to set
         * @return this builder
         */
        public Builder daysToReachHighUtilization(Integer daysToReachHighUtilization) {
            this.daysToReachHighUtilization = daysToReachHighUtilization;
            this.__explicitlySet__.add("daysToReachHighUtilization");
            return this;
        }
        /** Days to reach projected low utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachLowUtilization")
        private Integer daysToReachLowUtilization;

        /**
         * Days to reach projected low utilization
         *
         * @param daysToReachLowUtilization the value to set
         * @return this builder
         */
        public Builder daysToReachLowUtilization(Integer daysToReachLowUtilization) {
            this.daysToReachLowUtilization = daysToReachLowUtilization;
            this.__explicitlySet__.add("daysToReachLowUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceInsightUtilizationItem build() {
            ExadataInsightResourceInsightUtilizationItem model =
                    new ExadataInsightResourceInsightUtilizationItem(
                            this.exadataInsightId,
                            this.exadataDisplayName,
                            this.currentUtilization,
                            this.projectedUtilization,
                            this.daysToReachHighUtilization,
                            this.daysToReachLowUtilization);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceInsightUtilizationItem model) {
            if (model.wasPropertyExplicitlySet("exadataInsightId")) {
                this.exadataInsightId(model.getExadataInsightId());
            }
            if (model.wasPropertyExplicitlySet("exadataDisplayName")) {
                this.exadataDisplayName(model.getExadataDisplayName());
            }
            if (model.wasPropertyExplicitlySet("currentUtilization")) {
                this.currentUtilization(model.getCurrentUtilization());
            }
            if (model.wasPropertyExplicitlySet("projectedUtilization")) {
                this.projectedUtilization(model.getProjectedUtilization());
            }
            if (model.wasPropertyExplicitlySet("daysToReachHighUtilization")) {
                this.daysToReachHighUtilization(model.getDaysToReachHighUtilization());
            }
            if (model.wasPropertyExplicitlySet("daysToReachLowUtilization")) {
                this.daysToReachLowUtilization(model.getDaysToReachLowUtilization());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata insight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata insight.
     *
     * @return the value
     */
    public String getExadataInsightId() {
        return exadataInsightId;
    }

    /** The user-friendly name for the Exadata system. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
    private final String exadataDisplayName;

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     *
     * @return the value
     */
    public String getExadataDisplayName() {
        return exadataDisplayName;
    }

    /** Current utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("currentUtilization")
    private final Double currentUtilization;

    /**
     * Current utilization
     *
     * @return the value
     */
    public Double getCurrentUtilization() {
        return currentUtilization;
    }

    /** Projected utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("projectedUtilization")
    private final Double projectedUtilization;

    /**
     * Projected utilization
     *
     * @return the value
     */
    public Double getProjectedUtilization() {
        return projectedUtilization;
    }

    /** Days to reach projected high utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachHighUtilization")
    private final Integer daysToReachHighUtilization;

    /**
     * Days to reach projected high utilization
     *
     * @return the value
     */
    public Integer getDaysToReachHighUtilization() {
        return daysToReachHighUtilization;
    }

    /** Days to reach projected low utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachLowUtilization")
    private final Integer daysToReachLowUtilization;

    /**
     * Days to reach projected low utilization
     *
     * @return the value
     */
    public Integer getDaysToReachLowUtilization() {
        return daysToReachLowUtilization;
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
        sb.append("ExadataInsightResourceInsightUtilizationItem(");
        sb.append("super=").append(super.toString());
        sb.append("exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(", exadataDisplayName=").append(String.valueOf(this.exadataDisplayName));
        sb.append(", currentUtilization=").append(String.valueOf(this.currentUtilization));
        sb.append(", projectedUtilization=").append(String.valueOf(this.projectedUtilization));
        sb.append(", daysToReachHighUtilization=")
                .append(String.valueOf(this.daysToReachHighUtilization));
        sb.append(", daysToReachLowUtilization=")
                .append(String.valueOf(this.daysToReachLowUtilization));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceInsightUtilizationItem)) {
            return false;
        }

        ExadataInsightResourceInsightUtilizationItem other =
                (ExadataInsightResourceInsightUtilizationItem) o;
        return java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.exadataDisplayName, other.exadataDisplayName)
                && java.util.Objects.equals(this.currentUtilization, other.currentUtilization)
                && java.util.Objects.equals(this.projectedUtilization, other.projectedUtilization)
                && java.util.Objects.equals(
                        this.daysToReachHighUtilization, other.daysToReachHighUtilization)
                && java.util.Objects.equals(
                        this.daysToReachLowUtilization, other.daysToReachLowUtilization)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDisplayName == null
                                ? 43
                                : this.exadataDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.currentUtilization == null
                                ? 43
                                : this.currentUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.projectedUtilization == null
                                ? 43
                                : this.projectedUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.daysToReachHighUtilization == null
                                ? 43
                                : this.daysToReachHighUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.daysToReachLowUtilization == null
                                ? 43
                                : this.daysToReachLowUtilization.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
