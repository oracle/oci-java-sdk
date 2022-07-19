/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the routing action taken on traffic flow with no route found.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NoRouteRoutingActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NoRouteRoutingActionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isRestrictedOrPartial",
        "evaluatedVcnRouteTableId",
        "evaluatedDrgRouteTableId"
    })
    public NoRouteRoutingActionDetails(
            Boolean isRestrictedOrPartial,
            String evaluatedVcnRouteTableId,
            String evaluatedDrgRouteTableId) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.evaluatedVcnRouteTableId = evaluatedVcnRouteTableId;
        this.evaluatedDrgRouteTableId = evaluatedDrgRouteTableId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, the evaluated route table details are incomplete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the evaluated route table details are incomplete.
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         **/
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }
        /**
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the evaluated VCN route table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedVcnRouteTableId")
        private String evaluatedVcnRouteTableId;

        /**
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the evaluated VCN route table.
         *
         * @param evaluatedVcnRouteTableId the value to set
         * @return this builder
         **/
        public Builder evaluatedVcnRouteTableId(String evaluatedVcnRouteTableId) {
            this.evaluatedVcnRouteTableId = evaluatedVcnRouteTableId;
            this.__explicitlySet__.add("evaluatedVcnRouteTableId");
            return this;
        }
        /**
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated DRG route table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedDrgRouteTableId")
        private String evaluatedDrgRouteTableId;

        /**
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated DRG route table.
         *
         * @param evaluatedDrgRouteTableId the value to set
         * @return this builder
         **/
        public Builder evaluatedDrgRouteTableId(String evaluatedDrgRouteTableId) {
            this.evaluatedDrgRouteTableId = evaluatedDrgRouteTableId;
            this.__explicitlySet__.add("evaluatedDrgRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NoRouteRoutingActionDetails build() {
            NoRouteRoutingActionDetails __instance__ =
                    new NoRouteRoutingActionDetails(
                            isRestrictedOrPartial,
                            evaluatedVcnRouteTableId,
                            evaluatedDrgRouteTableId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NoRouteRoutingActionDetails o) {
            Builder copiedBuilder =
                    isRestrictedOrPartial(o.getIsRestrictedOrPartial())
                            .evaluatedVcnRouteTableId(o.getEvaluatedVcnRouteTableId())
                            .evaluatedDrgRouteTableId(o.getEvaluatedDrgRouteTableId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * If true, the evaluated route table details are incomplete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the evaluated route table details are incomplete.
     * @return the value
     **/
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    /**
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the evaluated VCN route table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedVcnRouteTableId")
    private final String evaluatedVcnRouteTableId;

    /**
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the evaluated VCN route table.
     *
     * @return the value
     **/
    public String getEvaluatedVcnRouteTableId() {
        return evaluatedVcnRouteTableId;
    }

    /**
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated DRG route table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedDrgRouteTableId")
    private final String evaluatedDrgRouteTableId;

    /**
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of evaluated DRG route table.
     *
     * @return the value
     **/
    public String getEvaluatedDrgRouteTableId() {
        return evaluatedDrgRouteTableId;
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
        sb.append("NoRouteRoutingActionDetails(");
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", evaluatedVcnRouteTableId=")
                .append(String.valueOf(this.evaluatedVcnRouteTableId));
        sb.append(", evaluatedDrgRouteTableId=")
                .append(String.valueOf(this.evaluatedDrgRouteTableId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NoRouteRoutingActionDetails)) {
            return false;
        }

        NoRouteRoutingActionDetails other = (NoRouteRoutingActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(
                        this.evaluatedVcnRouteTableId, other.evaluatedVcnRouteTableId)
                && java.util.Objects.equals(
                        this.evaluatedDrgRouteTableId, other.evaluatedDrgRouteTableId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRestrictedOrPartial == null
                                ? 43
                                : this.isRestrictedOrPartial.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedVcnRouteTableId == null
                                ? 43
                                : this.evaluatedVcnRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedDrgRouteTableId == null
                                ? 43
                                : this.evaluatedDrgRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
