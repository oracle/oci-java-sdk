/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * List of resource id, name , capacity time series data <br>
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
        builder = ExadataInsightResourceCapacityTrendSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInsightResourceCapacityTrendSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "capacityData"})
    public ExadataInsightResourceCapacityTrendSummary(
            String id,
            String name,
            java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData) {
        super();
        this.id = id;
        this.name = name;
        this.capacityData = capacityData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the resource.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Time series data for capacity */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityData")
        private java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData;

        /**
         * Time series data for capacity
         *
         * @param capacityData the value to set
         * @return this builder
         */
        public Builder capacityData(
                java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData) {
            this.capacityData = capacityData;
            this.__explicitlySet__.add("capacityData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceCapacityTrendSummary build() {
            ExadataInsightResourceCapacityTrendSummary model =
                    new ExadataInsightResourceCapacityTrendSummary(
                            this.id, this.name, this.capacityData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceCapacityTrendSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("capacityData")) {
                this.capacityData(model.getCapacityData());
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
     * database insight resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database insight resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the resource.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Time series data for capacity */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityData")
    private final java.util.List<ExadataInsightResourceCapacityTrendAggregation> capacityData;

    /**
     * Time series data for capacity
     *
     * @return the value
     */
    public java.util.List<ExadataInsightResourceCapacityTrendAggregation> getCapacityData() {
        return capacityData;
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
        sb.append("ExadataInsightResourceCapacityTrendSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", capacityData=").append(String.valueOf(this.capacityData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceCapacityTrendSummary)) {
            return false;
        }

        ExadataInsightResourceCapacityTrendSummary other =
                (ExadataInsightResourceCapacityTrendSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.capacityData, other.capacityData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.capacityData == null ? 43 : this.capacityData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
