/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Detailed information about a particular occHandoverResourceBlock. For compute namespace this
 * information includes host serial, host ocid etc. <br>
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
        builder = OccHandoverResourceBlockDetailSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccHandoverResourceBlockDetailSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"occResourceHandoverBlockId", "details"})
    public OccHandoverResourceBlockDetailSummary(
            String occResourceHandoverBlockId, java.util.Map<String, String> details) {
        super();
        this.occResourceHandoverBlockId = occResourceHandoverBlockId;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the occResourceHandoverBlock. */
        @com.fasterxml.jackson.annotation.JsonProperty("occResourceHandoverBlockId")
        private String occResourceHandoverBlockId;

        /**
         * The OCID of the occResourceHandoverBlock.
         *
         * @param occResourceHandoverBlockId the value to set
         * @return this builder
         */
        public Builder occResourceHandoverBlockId(String occResourceHandoverBlockId) {
            this.occResourceHandoverBlockId = occResourceHandoverBlockId;
            this.__explicitlySet__.add("occResourceHandoverBlockId");
            return this;
        }
        /**
         * A map that contains additional details for a given handover resource. For example for
         * compute namespace this includes host ocid, host serial etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, String> details;

        /**
         * A map that contains additional details for a given handover resource. For example for
         * compute namespace this includes host ocid, host serial etc.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccHandoverResourceBlockDetailSummary build() {
            OccHandoverResourceBlockDetailSummary model =
                    new OccHandoverResourceBlockDetailSummary(
                            this.occResourceHandoverBlockId, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccHandoverResourceBlockDetailSummary model) {
            if (model.wasPropertyExplicitlySet("occResourceHandoverBlockId")) {
                this.occResourceHandoverBlockId(model.getOccResourceHandoverBlockId());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** The OCID of the occResourceHandoverBlock. */
    @com.fasterxml.jackson.annotation.JsonProperty("occResourceHandoverBlockId")
    private final String occResourceHandoverBlockId;

    /**
     * The OCID of the occResourceHandoverBlock.
     *
     * @return the value
     */
    public String getOccResourceHandoverBlockId() {
        return occResourceHandoverBlockId;
    }

    /**
     * A map that contains additional details for a given handover resource. For example for compute
     * namespace this includes host ocid, host serial etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.Map<String, String> details;

    /**
     * A map that contains additional details for a given handover resource. For example for compute
     * namespace this includes host ocid, host serial etc.
     *
     * @return the value
     */
    public java.util.Map<String, String> getDetails() {
        return details;
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
        sb.append("OccHandoverResourceBlockDetailSummary(");
        sb.append("super=").append(super.toString());
        sb.append("occResourceHandoverBlockId=")
                .append(String.valueOf(this.occResourceHandoverBlockId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccHandoverResourceBlockDetailSummary)) {
            return false;
        }

        OccHandoverResourceBlockDetailSummary other = (OccHandoverResourceBlockDetailSummary) o;
        return java.util.Objects.equals(
                        this.occResourceHandoverBlockId, other.occResourceHandoverBlockId)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.occResourceHandoverBlockId == null
                                ? 43
                                : this.occResourceHandoverBlockId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
