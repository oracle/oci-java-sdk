/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The percentage distribution of waits in the AWR wait event buckets. <br>
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
        builder = AwrDatabaseWaitEventBucketCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "awrResultType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDatabaseWaitEventBucketCollection extends AwrQueryResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbQueryTimeInSecs")
        private Double dbQueryTimeInSecs;

        public Builder dbQueryTimeInSecs(Double dbQueryTimeInSecs) {
            this.dbQueryTimeInSecs = dbQueryTimeInSecs;
            this.__explicitlySet__.add("dbQueryTimeInSecs");
            return this;
        }
        /** The total waits of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalWaits")
        private Long totalWaits;

        /**
         * The total waits of the database.
         *
         * @param totalWaits the value to set
         * @return this builder
         */
        public Builder totalWaits(Long totalWaits) {
            this.totalWaits = totalWaits;
            this.__explicitlySet__.add("totalWaits");
            return this;
        }
        /** A list of AWR wait event buckets. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDatabaseWaitEventBucketSummary> items;

        /**
         * A list of AWR wait event buckets.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<AwrDatabaseWaitEventBucketSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseWaitEventBucketCollection build() {
            AwrDatabaseWaitEventBucketCollection model =
                    new AwrDatabaseWaitEventBucketCollection(
                            this.name,
                            this.version,
                            this.dbQueryTimeInSecs,
                            this.totalWaits,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseWaitEventBucketCollection model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("dbQueryTimeInSecs")) {
                this.dbQueryTimeInSecs(model.getDbQueryTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("totalWaits")) {
                this.totalWaits(model.getTotalWaits());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    @Deprecated
    public AwrDatabaseWaitEventBucketCollection(
            String name,
            String version,
            Double dbQueryTimeInSecs,
            Long totalWaits,
            java.util.List<AwrDatabaseWaitEventBucketSummary> items) {
        super(name, version, dbQueryTimeInSecs);
        this.totalWaits = totalWaits;
        this.items = items;
    }

    /** The total waits of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalWaits")
    private final Long totalWaits;

    /**
     * The total waits of the database.
     *
     * @return the value
     */
    public Long getTotalWaits() {
        return totalWaits;
    }

    /** A list of AWR wait event buckets. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AwrDatabaseWaitEventBucketSummary> items;

    /**
     * A list of AWR wait event buckets.
     *
     * @return the value
     */
    public java.util.List<AwrDatabaseWaitEventBucketSummary> getItems() {
        return items;
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
        sb.append("AwrDatabaseWaitEventBucketCollection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", totalWaits=").append(String.valueOf(this.totalWaits));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseWaitEventBucketCollection)) {
            return false;
        }

        AwrDatabaseWaitEventBucketCollection other = (AwrDatabaseWaitEventBucketCollection) o;
        return java.util.Objects.equals(this.totalWaits, other.totalWaits)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.totalWaits == null ? 43 : this.totalWaits.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
