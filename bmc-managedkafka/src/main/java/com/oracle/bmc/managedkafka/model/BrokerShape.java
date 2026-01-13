/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * Configuration of the broker node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BrokerShape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BrokerShape extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeCount", "ocpuCount", "storageSizeInGbs"})
    public BrokerShape(Integer nodeCount, Integer ocpuCount, Integer storageSizeInGbs) {
        super();
        this.nodeCount = nodeCount;
        this.ocpuCount = ocpuCount;
        this.storageSizeInGbs = storageSizeInGbs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of Kafka broker nodes */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * Number of Kafka broker nodes
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** Number of OCPUs per nodes */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Integer ocpuCount;

        /**
         * Number of OCPUs per nodes
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Integer ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** Size of the storage per nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGbs")
        private Integer storageSizeInGbs;

        /**
         * Size of the storage per nodes.
         *
         * @param storageSizeInGbs the value to set
         * @return this builder
         */
        public Builder storageSizeInGbs(Integer storageSizeInGbs) {
            this.storageSizeInGbs = storageSizeInGbs;
            this.__explicitlySet__.add("storageSizeInGbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BrokerShape build() {
            BrokerShape model =
                    new BrokerShape(this.nodeCount, this.ocpuCount, this.storageSizeInGbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BrokerShape model) {
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInGbs")) {
                this.storageSizeInGbs(model.getStorageSizeInGbs());
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

    /** Number of Kafka broker nodes */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * Number of Kafka broker nodes
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** Number of OCPUs per nodes */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Integer ocpuCount;

    /**
     * Number of OCPUs per nodes
     *
     * @return the value
     */
    public Integer getOcpuCount() {
        return ocpuCount;
    }

    /** Size of the storage per nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGbs")
    private final Integer storageSizeInGbs;

    /**
     * Size of the storage per nodes.
     *
     * @return the value
     */
    public Integer getStorageSizeInGbs() {
        return storageSizeInGbs;
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
        sb.append("BrokerShape(");
        sb.append("super=").append(super.toString());
        sb.append("nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", storageSizeInGbs=").append(String.valueOf(this.storageSizeInGbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BrokerShape)) {
            return false;
        }

        BrokerShape other = (BrokerShape) o;
        return java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.storageSizeInGbs, other.storageSizeInGbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInGbs == null ? 43 : this.storageSizeInGbs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
