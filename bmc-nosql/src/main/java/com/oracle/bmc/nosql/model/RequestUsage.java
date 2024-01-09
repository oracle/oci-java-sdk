/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The usage metrics for a request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RequestUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestUsage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"readUnitsConsumed", "writeUnitsConsumed"})
    public RequestUsage(Integer readUnitsConsumed, Integer writeUnitsConsumed) {
        super();
        this.readUnitsConsumed = readUnitsConsumed;
        this.writeUnitsConsumed = writeUnitsConsumed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Read Units consumed by this operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
        private Integer readUnitsConsumed;

        /**
         * Read Units consumed by this operation.
         *
         * @param readUnitsConsumed the value to set
         * @return this builder
         */
        public Builder readUnitsConsumed(Integer readUnitsConsumed) {
            this.readUnitsConsumed = readUnitsConsumed;
            this.__explicitlySet__.add("readUnitsConsumed");
            return this;
        }
        /** Write Units consumed by this operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
        private Integer writeUnitsConsumed;

        /**
         * Write Units consumed by this operation.
         *
         * @param writeUnitsConsumed the value to set
         * @return this builder
         */
        public Builder writeUnitsConsumed(Integer writeUnitsConsumed) {
            this.writeUnitsConsumed = writeUnitsConsumed;
            this.__explicitlySet__.add("writeUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestUsage build() {
            RequestUsage model = new RequestUsage(this.readUnitsConsumed, this.writeUnitsConsumed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestUsage model) {
            if (model.wasPropertyExplicitlySet("readUnitsConsumed")) {
                this.readUnitsConsumed(model.getReadUnitsConsumed());
            }
            if (model.wasPropertyExplicitlySet("writeUnitsConsumed")) {
                this.writeUnitsConsumed(model.getWriteUnitsConsumed());
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

    /** Read Units consumed by this operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
    private final Integer readUnitsConsumed;

    /**
     * Read Units consumed by this operation.
     *
     * @return the value
     */
    public Integer getReadUnitsConsumed() {
        return readUnitsConsumed;
    }

    /** Write Units consumed by this operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
    private final Integer writeUnitsConsumed;

    /**
     * Write Units consumed by this operation.
     *
     * @return the value
     */
    public Integer getWriteUnitsConsumed() {
        return writeUnitsConsumed;
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
        sb.append("RequestUsage(");
        sb.append("super=").append(super.toString());
        sb.append("readUnitsConsumed=").append(String.valueOf(this.readUnitsConsumed));
        sb.append(", writeUnitsConsumed=").append(String.valueOf(this.writeUnitsConsumed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestUsage)) {
            return false;
        }

        RequestUsage other = (RequestUsage) o;
        return java.util.Objects.equals(this.readUnitsConsumed, other.readUnitsConsumed)
                && java.util.Objects.equals(this.writeUnitsConsumed, other.writeUnitsConsumed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.readUnitsConsumed == null ? 43 : this.readUnitsConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.writeUnitsConsumed == null
                                ? 43
                                : this.writeUnitsConsumed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
