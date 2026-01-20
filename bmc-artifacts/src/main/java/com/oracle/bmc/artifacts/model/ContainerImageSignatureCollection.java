/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * List container image signature results. <br>
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
        builder = ContainerImageSignatureCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerImageSignatureCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "remainingItemsCount"})
    public ContainerImageSignatureCollection(
            java.util.List<ContainerImageSignatureSummary> items, Integer remainingItemsCount) {
        super();
        this.items = items;
        this.remainingItemsCount = remainingItemsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Page of matching container image signatures. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ContainerImageSignatureSummary> items;

        /**
         * Page of matching container image signatures.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ContainerImageSignatureSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** Estimated number of remaining results. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
        private Integer remainingItemsCount;

        /**
         * Estimated number of remaining results.
         *
         * @param remainingItemsCount the value to set
         * @return this builder
         */
        public Builder remainingItemsCount(Integer remainingItemsCount) {
            this.remainingItemsCount = remainingItemsCount;
            this.__explicitlySet__.add("remainingItemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerImageSignatureCollection build() {
            ContainerImageSignatureCollection model =
                    new ContainerImageSignatureCollection(this.items, this.remainingItemsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerImageSignatureCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("remainingItemsCount")) {
                this.remainingItemsCount(model.getRemainingItemsCount());
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

    /** Page of matching container image signatures. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ContainerImageSignatureSummary> items;

    /**
     * Page of matching container image signatures.
     *
     * @return the value
     */
    public java.util.List<ContainerImageSignatureSummary> getItems() {
        return items;
    }

    /** Estimated number of remaining results. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
    private final Integer remainingItemsCount;

    /**
     * Estimated number of remaining results.
     *
     * @return the value
     */
    public Integer getRemainingItemsCount() {
        return remainingItemsCount;
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
        sb.append("ContainerImageSignatureCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", remainingItemsCount=").append(String.valueOf(this.remainingItemsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerImageSignatureCollection)) {
            return false;
        }

        ContainerImageSignatureCollection other = (ContainerImageSignatureCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.remainingItemsCount, other.remainingItemsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingItemsCount == null
                                ? 43
                                : this.remainingItemsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
