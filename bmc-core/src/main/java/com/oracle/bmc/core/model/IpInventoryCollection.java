/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The results returned by a {@code ListIpInventory} operation.
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
    builder = IpInventoryCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IpInventoryCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "count",
        "lastUpdatedTimestamp",
        "compartmentsPerTenant",
        "inventoryVcnCollection",
        "message"
    })
    public IpInventoryCollection(
            Integer count,
            java.util.Date lastUpdatedTimestamp,
            Long compartmentsPerTenant,
            java.util.List<InventoryVcnSummary> inventoryVcnCollection,
            String message) {
        super();
        this.count = count;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.compartmentsPerTenant = compartmentsPerTenant;
        this.inventoryVcnCollection = inventoryVcnCollection;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Species the count for the number of results for the response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Species the count for the number of results for the response.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * The timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
        private java.util.Date lastUpdatedTimestamp;

        /**
         * The timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The number of compartments per compartments per tenant.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentsPerTenant")
        private Long compartmentsPerTenant;

        /**
         * The number of compartments per compartments per tenant.
         *
         * @param compartmentsPerTenant the value to set
         * @return this builder
         **/
        public Builder compartmentsPerTenant(Long compartmentsPerTenant) {
            this.compartmentsPerTenant = compartmentsPerTenant;
            this.__explicitlySet__.add("compartmentsPerTenant");
            return this;
        }
        /**
         * Lists {@code IpInventoryVcnSummary} objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryVcnCollection")
        private java.util.List<InventoryVcnSummary> inventoryVcnCollection;

        /**
         * Lists {@code IpInventoryVcnSummary} objects.
         *
         * @param inventoryVcnCollection the value to set
         * @return this builder
         **/
        public Builder inventoryVcnCollection(
                java.util.List<InventoryVcnSummary> inventoryVcnCollection) {
            this.inventoryVcnCollection = inventoryVcnCollection;
            this.__explicitlySet__.add("inventoryVcnCollection");
            return this;
        }
        /**
         * Indicates the status of the data.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Indicates the status of the data.
         *
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventoryCollection build() {
            IpInventoryCollection model =
                    new IpInventoryCollection(
                            this.count,
                            this.lastUpdatedTimestamp,
                            this.compartmentsPerTenant,
                            this.inventoryVcnCollection,
                            this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventoryCollection model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedTimestamp")) {
                this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
            }
            if (model.wasPropertyExplicitlySet("compartmentsPerTenant")) {
                this.compartmentsPerTenant(model.getCompartmentsPerTenant());
            }
            if (model.wasPropertyExplicitlySet("inventoryVcnCollection")) {
                this.inventoryVcnCollection(model.getInventoryVcnCollection());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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
     * Species the count for the number of results for the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Species the count for the number of results for the response.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    /**
     * The timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedTimestamp")
    private final java.util.Date lastUpdatedTimestamp;

    /**
     * The timestamp of the latest update from the database in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * The number of compartments per compartments per tenant.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentsPerTenant")
    private final Long compartmentsPerTenant;

    /**
     * The number of compartments per compartments per tenant.
     *
     * @return the value
     **/
    public Long getCompartmentsPerTenant() {
        return compartmentsPerTenant;
    }

    /**
     * Lists {@code IpInventoryVcnSummary} objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryVcnCollection")
    private final java.util.List<InventoryVcnSummary> inventoryVcnCollection;

    /**
     * Lists {@code IpInventoryVcnSummary} objects.
     *
     * @return the value
     **/
    public java.util.List<InventoryVcnSummary> getInventoryVcnCollection() {
        return inventoryVcnCollection;
    }

    /**
     * Indicates the status of the data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Indicates the status of the data.
     *
     * @return the value
     **/
    public String getMessage() {
        return message;
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
        sb.append("IpInventoryCollection(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", compartmentsPerTenant=").append(String.valueOf(this.compartmentsPerTenant));
        sb.append(", inventoryVcnCollection=").append(String.valueOf(this.inventoryVcnCollection));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventoryCollection)) {
            return false;
        }

        IpInventoryCollection other = (IpInventoryCollection) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp)
                && java.util.Objects.equals(this.compartmentsPerTenant, other.compartmentsPerTenant)
                && java.util.Objects.equals(
                        this.inventoryVcnCollection, other.inventoryVcnCollection)
                && java.util.Objects.equals(this.message, other.message)
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
                        + (this.compartmentsPerTenant == null
                                ? 43
                                : this.compartmentsPerTenant.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryVcnCollection == null
                                ? 43
                                : this.inventoryVcnCollection.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
