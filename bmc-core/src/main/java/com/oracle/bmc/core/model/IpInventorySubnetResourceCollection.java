/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The results returned by a {@code ListIpInventorySubnet} operation. <br>
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
        builder = IpInventorySubnetResourceCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpInventorySubnetResourceCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "count",
        "lastUpdatedTimestamp",
        "ipInventorySubnetResourceSummary",
        "message",
        "compartmentId"
    })
    public IpInventorySubnetResourceCollection(
            Integer count,
            java.util.Date lastUpdatedTimestamp,
            java.util.List<IpInventorySubnetResourceSummary> ipInventorySubnetResourceSummary,
            String message,
            String compartmentId) {
        super();
        this.count = count;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.ipInventorySubnetResourceSummary = ipInventorySubnetResourceSummary;
        this.message = message;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies the count for the number of results for the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Specifies the count for the number of results for the response.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * The Timestamp of the latest update from the database in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
        private java.util.Date lastUpdatedTimestamp;

        /**
         * The Timestamp of the latest update from the database in the format defined by
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
        /** Lists {@code SubnetResourceSummary} objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipInventorySubnetResourceSummary")
        private java.util.List<IpInventorySubnetResourceSummary> ipInventorySubnetResourceSummary;

        /**
         * Lists {@code SubnetResourceSummary} objects.
         *
         * @param ipInventorySubnetResourceSummary the value to set
         * @return this builder
         */
        public Builder ipInventorySubnetResourceSummary(
                java.util.List<IpInventorySubnetResourceSummary> ipInventorySubnetResourceSummary) {
            this.ipInventorySubnetResourceSummary = ipInventorySubnetResourceSummary;
            this.__explicitlySet__.add("ipInventorySubnetResourceSummary");
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
        /** The compartment of the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment of the subnet.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventorySubnetResourceCollection build() {
            IpInventorySubnetResourceCollection model =
                    new IpInventorySubnetResourceCollection(
                            this.count,
                            this.lastUpdatedTimestamp,
                            this.ipInventorySubnetResourceSummary,
                            this.message,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventorySubnetResourceCollection model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedTimestamp")) {
                this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
            }
            if (model.wasPropertyExplicitlySet("ipInventorySubnetResourceSummary")) {
                this.ipInventorySubnetResourceSummary(model.getIpInventorySubnetResourceSummary());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** Specifies the count for the number of results for the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Specifies the count for the number of results for the response.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
    }

    /**
     * The Timestamp of the latest update from the database in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
    private final java.util.Date lastUpdatedTimestamp;

    /**
     * The Timestamp of the latest update from the database in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /** Lists {@code SubnetResourceSummary} objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipInventorySubnetResourceSummary")
    private final java.util.List<IpInventorySubnetResourceSummary> ipInventorySubnetResourceSummary;

    /**
     * Lists {@code SubnetResourceSummary} objects.
     *
     * @return the value
     */
    public java.util.List<IpInventorySubnetResourceSummary> getIpInventorySubnetResourceSummary() {
        return ipInventorySubnetResourceSummary;
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

    /** The compartment of the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment of the subnet.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("IpInventorySubnetResourceCollection(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", ipInventorySubnetResourceSummary=")
                .append(String.valueOf(this.ipInventorySubnetResourceSummary));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventorySubnetResourceCollection)) {
            return false;
        }

        IpInventorySubnetResourceCollection other = (IpInventorySubnetResourceCollection) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp)
                && java.util.Objects.equals(
                        this.ipInventorySubnetResourceSummary,
                        other.ipInventorySubnetResourceSummary)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdatedTimestamp == null
                                ? 43
                                : this.lastUpdatedTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.ipInventorySubnetResourceSummary == null
                                ? 43
                                : this.ipInventorySubnetResourceSummary.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
