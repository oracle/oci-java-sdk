/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Summary of costs to migrate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CostToMigrate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CostToMigrate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceDataTransferCosts",
        "ociDataTransferCosts",
        "currencyCode",
        "assetCount"
    })
    public CostToMigrate(
            java.math.BigDecimal sourceDataTransferCosts,
            java.math.BigDecimal ociDataTransferCosts,
            String currencyCode,
            Integer assetCount) {
        super();
        this.sourceDataTransferCosts = sourceDataTransferCosts;
        this.ociDataTransferCosts = ociDataTransferCosts;
        this.currencyCode = currencyCode;
        this.assetCount = assetCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Data transfer costs from source cloud provider. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDataTransferCosts")
        private java.math.BigDecimal sourceDataTransferCosts;

        /**
         * Data transfer costs from source cloud provider.
         *
         * @param sourceDataTransferCosts the value to set
         * @return this builder
         */
        public Builder sourceDataTransferCosts(java.math.BigDecimal sourceDataTransferCosts) {
            this.sourceDataTransferCosts = sourceDataTransferCosts;
            this.__explicitlySet__.add("sourceDataTransferCosts");
            return this;
        }
        /** Data transfer costs from OCI. */
        @com.fasterxml.jackson.annotation.JsonProperty("ociDataTransferCosts")
        private java.math.BigDecimal ociDataTransferCosts;

        /**
         * Data transfer costs from OCI.
         *
         * @param ociDataTransferCosts the value to set
         * @return this builder
         */
        public Builder ociDataTransferCosts(java.math.BigDecimal ociDataTransferCosts) {
            this.ociDataTransferCosts = ociDataTransferCosts;
            this.__explicitlySet__.add("ociDataTransferCosts");
            return this;
        }
        /** Currency code as defined by ISO-4217. */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code as defined by ISO-4217.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** Number of assets used in this calculation. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetCount")
        private Integer assetCount;

        /**
         * Number of assets used in this calculation.
         *
         * @param assetCount the value to set
         * @return this builder
         */
        public Builder assetCount(Integer assetCount) {
            this.assetCount = assetCount;
            this.__explicitlySet__.add("assetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostToMigrate build() {
            CostToMigrate model =
                    new CostToMigrate(
                            this.sourceDataTransferCosts,
                            this.ociDataTransferCosts,
                            this.currencyCode,
                            this.assetCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostToMigrate model) {
            if (model.wasPropertyExplicitlySet("sourceDataTransferCosts")) {
                this.sourceDataTransferCosts(model.getSourceDataTransferCosts());
            }
            if (model.wasPropertyExplicitlySet("ociDataTransferCosts")) {
                this.ociDataTransferCosts(model.getOciDataTransferCosts());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("assetCount")) {
                this.assetCount(model.getAssetCount());
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

    /** Data transfer costs from source cloud provider. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDataTransferCosts")
    private final java.math.BigDecimal sourceDataTransferCosts;

    /**
     * Data transfer costs from source cloud provider.
     *
     * @return the value
     */
    public java.math.BigDecimal getSourceDataTransferCosts() {
        return sourceDataTransferCosts;
    }

    /** Data transfer costs from OCI. */
    @com.fasterxml.jackson.annotation.JsonProperty("ociDataTransferCosts")
    private final java.math.BigDecimal ociDataTransferCosts;

    /**
     * Data transfer costs from OCI.
     *
     * @return the value
     */
    public java.math.BigDecimal getOciDataTransferCosts() {
        return ociDataTransferCosts;
    }

    /** Currency code as defined by ISO-4217. */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code as defined by ISO-4217.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** Number of assets used in this calculation. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetCount")
    private final Integer assetCount;

    /**
     * Number of assets used in this calculation.
     *
     * @return the value
     */
    public Integer getAssetCount() {
        return assetCount;
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
        sb.append("CostToMigrate(");
        sb.append("super=").append(super.toString());
        sb.append("sourceDataTransferCosts=").append(String.valueOf(this.sourceDataTransferCosts));
        sb.append(", ociDataTransferCosts=").append(String.valueOf(this.ociDataTransferCosts));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", assetCount=").append(String.valueOf(this.assetCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostToMigrate)) {
            return false;
        }

        CostToMigrate other = (CostToMigrate) o;
        return java.util.Objects.equals(this.sourceDataTransferCosts, other.sourceDataTransferCosts)
                && java.util.Objects.equals(this.ociDataTransferCosts, other.ociDataTransferCosts)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.assetCount, other.assetCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceDataTransferCosts == null
                                ? 43
                                : this.sourceDataTransferCosts.hashCode());
        result =
                (result * PRIME)
                        + (this.ociDataTransferCosts == null
                                ? 43
                                : this.ociDataTransferCosts.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.assetCount == null ? 43 : this.assetCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
