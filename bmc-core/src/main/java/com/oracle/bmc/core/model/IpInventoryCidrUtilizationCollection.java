/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The IP Inventory CIDR utilization details of a subnet.
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
    builder = IpInventoryCidrUtilizationCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IpInventoryCidrUtilizationCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "count",
        "lastUpdatedTimestamp",
        "ipInventoryCidrUtilizationSummary",
        "message",
        "compartmentId"
    })
    public IpInventoryCidrUtilizationCollection(
            Integer count,
            java.util.Date lastUpdatedTimestamp,
            java.util.List<IpInventoryCidrUtilizationSummary> ipInventoryCidrUtilizationSummary,
            String message,
            String compartmentId) {
        super();
        this.count = count;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.ipInventoryCidrUtilizationSummary = ipInventoryCidrUtilizationSummary;
        this.message = message;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the count for the number of results for the response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Specifies the count for the number of results for the response.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * The Timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
        private java.util.Date lastUpdatedTimestamp;

        /**
         * The Timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param lastUpdatedTimestamp the value to set
         * @return this builder
         **/
        public Builder lastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            this.__explicitlySet__.add("lastUpdatedTimestamp");
            return this;
        }
        /**
         * Lists 'IpInventoryCidrUtilizationSummary object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipInventoryCidrUtilizationSummary")
        private java.util.List<IpInventoryCidrUtilizationSummary> ipInventoryCidrUtilizationSummary;

        /**
         * Lists 'IpInventoryCidrUtilizationSummary object.
         *
         * @param ipInventoryCidrUtilizationSummary the value to set
         * @return this builder
         **/
        public Builder ipInventoryCidrUtilizationSummary(
                java.util.List<IpInventoryCidrUtilizationSummary>
                        ipInventoryCidrUtilizationSummary) {
            this.ipInventoryCidrUtilizationSummary = ipInventoryCidrUtilizationSummary;
            this.__explicitlySet__.add("ipInventoryCidrUtilizationSummary");
            return this;
        }
        /**
         * Indicates the status of the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Indicates the status of the data.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Compartment of the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment of the subnet.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventoryCidrUtilizationCollection build() {
            IpInventoryCidrUtilizationCollection model =
                    new IpInventoryCidrUtilizationCollection(
                            this.count,
                            this.lastUpdatedTimestamp,
                            this.ipInventoryCidrUtilizationSummary,
                            this.message,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventoryCidrUtilizationCollection model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedTimestamp")) {
                this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
            }
            if (model.wasPropertyExplicitlySet("ipInventoryCidrUtilizationSummary")) {
                this.ipInventoryCidrUtilizationSummary(
                        model.getIpInventoryCidrUtilizationSummary());
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
     * Specifies the count for the number of results for the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Specifies the count for the number of results for the response.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    /**
     * The Timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
    private final java.util.Date lastUpdatedTimestamp;

    /**
     * The Timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * Lists 'IpInventoryCidrUtilizationSummary object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipInventoryCidrUtilizationSummary")
    private final java.util.List<IpInventoryCidrUtilizationSummary>
            ipInventoryCidrUtilizationSummary;

    /**
     * Lists 'IpInventoryCidrUtilizationSummary object.
     *
     * @return the value
     **/
    public java.util.List<IpInventoryCidrUtilizationSummary>
            getIpInventoryCidrUtilizationSummary() {
        return ipInventoryCidrUtilizationSummary;
    }

    /**
     * Indicates the status of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Indicates the status of the data.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Compartment of the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment of the subnet.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("IpInventoryCidrUtilizationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", ipInventoryCidrUtilizationSummary=")
                .append(String.valueOf(this.ipInventoryCidrUtilizationSummary));
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
        if (!(o instanceof IpInventoryCidrUtilizationCollection)) {
            return false;
        }

        IpInventoryCidrUtilizationCollection other = (IpInventoryCidrUtilizationCollection) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp)
                && java.util.Objects.equals(
                        this.ipInventoryCidrUtilizationSummary,
                        other.ipInventoryCidrUtilizationSummary)
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
                        + (this.ipInventoryCidrUtilizationSummary == null
                                ? 43
                                : this.ipInventoryCidrUtilizationSummary.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
