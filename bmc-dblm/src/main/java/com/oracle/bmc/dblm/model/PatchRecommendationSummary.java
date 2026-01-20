/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Total count summary of patch recommendations for databases. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchRecommendationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchRecommendationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"total", "upToDate", "patchAvailable"})
    public PatchRecommendationSummary(Integer total, Integer upToDate, Integer patchAvailable) {
        super();
        this.total = total;
        this.upToDate = upToDate;
        this.patchAvailable = patchAvailable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of databases pending to be updated and/or with latest patches. */
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * Total number of databases pending to be updated and/or with latest patches.
         *
         * @param total the value to set
         * @return this builder
         */
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }
        /** Number of databases with latest patches. */
        @com.fasterxml.jackson.annotation.JsonProperty("upToDate")
        private Integer upToDate;

        /**
         * Number of databases with latest patches.
         *
         * @param upToDate the value to set
         * @return this builder
         */
        public Builder upToDate(Integer upToDate) {
            this.upToDate = upToDate;
            this.__explicitlySet__.add("upToDate");
            return this;
        }
        /** Number of databases pending to be updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchAvailable")
        private Integer patchAvailable;

        /**
         * Number of databases pending to be updated.
         *
         * @param patchAvailable the value to set
         * @return this builder
         */
        public Builder patchAvailable(Integer patchAvailable) {
            this.patchAvailable = patchAvailable;
            this.__explicitlySet__.add("patchAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchRecommendationSummary build() {
            PatchRecommendationSummary model =
                    new PatchRecommendationSummary(this.total, this.upToDate, this.patchAvailable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchRecommendationSummary model) {
            if (model.wasPropertyExplicitlySet("total")) {
                this.total(model.getTotal());
            }
            if (model.wasPropertyExplicitlySet("upToDate")) {
                this.upToDate(model.getUpToDate());
            }
            if (model.wasPropertyExplicitlySet("patchAvailable")) {
                this.patchAvailable(model.getPatchAvailable());
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

    /** Total number of databases pending to be updated and/or with latest patches. */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * Total number of databases pending to be updated and/or with latest patches.
     *
     * @return the value
     */
    public Integer getTotal() {
        return total;
    }

    /** Number of databases with latest patches. */
    @com.fasterxml.jackson.annotation.JsonProperty("upToDate")
    private final Integer upToDate;

    /**
     * Number of databases with latest patches.
     *
     * @return the value
     */
    public Integer getUpToDate() {
        return upToDate;
    }

    /** Number of databases pending to be updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchAvailable")
    private final Integer patchAvailable;

    /**
     * Number of databases pending to be updated.
     *
     * @return the value
     */
    public Integer getPatchAvailable() {
        return patchAvailable;
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
        sb.append("PatchRecommendationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("total=").append(String.valueOf(this.total));
        sb.append(", upToDate=").append(String.valueOf(this.upToDate));
        sb.append(", patchAvailable=").append(String.valueOf(this.patchAvailable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchRecommendationSummary)) {
            return false;
        }

        PatchRecommendationSummary other = (PatchRecommendationSummary) o;
        return java.util.Objects.equals(this.total, other.total)
                && java.util.Objects.equals(this.upToDate, other.upToDate)
                && java.util.Objects.equals(this.patchAvailable, other.patchAvailable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + (this.upToDate == null ? 43 : this.upToDate.hashCode());
        result =
                (result * PRIME)
                        + (this.patchAvailable == null ? 43 : this.patchAvailable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
