/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The details of the overlapping VCNs and compartments. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IpInventoryVcnOverlapCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpInventoryVcnOverlapCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lastUpdatedTimestamp",
        "ipInventoryVcnOverlapSummary",
        "message",
        "overlapCount"
    })
    public IpInventoryVcnOverlapCollection(
            java.util.Date lastUpdatedTimestamp,
            java.util.List<IpInventoryVcnOverlapSummary> ipInventoryVcnOverlapSummary,
            String message,
            Integer overlapCount) {
        super();
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.ipInventoryVcnOverlapSummary = ipInventoryVcnOverlapSummary;
        this.message = message;
        this.overlapCount = overlapCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamp of the latest update from the database in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
        private java.util.Date lastUpdatedTimestamp;

        /**
         * The timestamp of the latest update from the database in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param lastUpdatedTimestamp the value to set
         * @return this builder
         */
        public Builder lastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            this.__explicitlySet__.add("lastUpdatedTimestamp");
            return this;
        }
        /** Lists {@code IpInventoryVcnOverlapSummary} object. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipInventoryVcnOverlapSummary")
        private java.util.List<IpInventoryVcnOverlapSummary> ipInventoryVcnOverlapSummary;

        /**
         * Lists {@code IpInventoryVcnOverlapSummary} object.
         *
         * @param ipInventoryVcnOverlapSummary the value to set
         * @return this builder
         */
        public Builder ipInventoryVcnOverlapSummary(
                java.util.List<IpInventoryVcnOverlapSummary> ipInventoryVcnOverlapSummary) {
            this.ipInventoryVcnOverlapSummary = ipInventoryVcnOverlapSummary;
            this.__explicitlySet__.add("ipInventoryVcnOverlapSummary");
            return this;
        }
        /** Indicates the status of the data. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Indicates the status of the data.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The overlap count for the given VCN and compartments. */
        @com.fasterxml.jackson.annotation.JsonProperty("overlapCount")
        private Integer overlapCount;

        /**
         * The overlap count for the given VCN and compartments.
         *
         * @param overlapCount the value to set
         * @return this builder
         */
        public Builder overlapCount(Integer overlapCount) {
            this.overlapCount = overlapCount;
            this.__explicitlySet__.add("overlapCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventoryVcnOverlapCollection build() {
            IpInventoryVcnOverlapCollection model =
                    new IpInventoryVcnOverlapCollection(
                            this.lastUpdatedTimestamp,
                            this.ipInventoryVcnOverlapSummary,
                            this.message,
                            this.overlapCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventoryVcnOverlapCollection model) {
            if (model.wasPropertyExplicitlySet("lastUpdatedTimestamp")) {
                this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
            }
            if (model.wasPropertyExplicitlySet("ipInventoryVcnOverlapSummary")) {
                this.ipInventoryVcnOverlapSummary(model.getIpInventoryVcnOverlapSummary());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("overlapCount")) {
                this.overlapCount(model.getOverlapCount());
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
     * The timestamp of the latest update from the database in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
    private final java.util.Date lastUpdatedTimestamp;

    /**
     * The timestamp of the latest update from the database in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /** Lists {@code IpInventoryVcnOverlapSummary} object. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipInventoryVcnOverlapSummary")
    private final java.util.List<IpInventoryVcnOverlapSummary> ipInventoryVcnOverlapSummary;

    /**
     * Lists {@code IpInventoryVcnOverlapSummary} object.
     *
     * @return the value
     */
    public java.util.List<IpInventoryVcnOverlapSummary> getIpInventoryVcnOverlapSummary() {
        return ipInventoryVcnOverlapSummary;
    }

    /** Indicates the status of the data. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Indicates the status of the data.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The overlap count for the given VCN and compartments. */
    @com.fasterxml.jackson.annotation.JsonProperty("overlapCount")
    private final Integer overlapCount;

    /**
     * The overlap count for the given VCN and compartments.
     *
     * @return the value
     */
    public Integer getOverlapCount() {
        return overlapCount;
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
        sb.append("IpInventoryVcnOverlapCollection(");
        sb.append("super=").append(super.toString());
        sb.append("lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", ipInventoryVcnOverlapSummary=")
                .append(String.valueOf(this.ipInventoryVcnOverlapSummary));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", overlapCount=").append(String.valueOf(this.overlapCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventoryVcnOverlapCollection)) {
            return false;
        }

        IpInventoryVcnOverlapCollection other = (IpInventoryVcnOverlapCollection) o;
        return java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp)
                && java.util.Objects.equals(
                        this.ipInventoryVcnOverlapSummary, other.ipInventoryVcnOverlapSummary)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.overlapCount, other.overlapCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastUpdatedTimestamp == null
                                ? 43
                                : this.lastUpdatedTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.ipInventoryVcnOverlapSummary == null
                                ? 43
                                : this.ipInventoryVcnOverlapSummary.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.overlapCount == null ? 43 : this.overlapCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
