/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Instance level status for each region. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdhocQueryRegionalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdhocQueryRegionalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "regionalStatus",
        "regionalError",
        "expectedCount",
        "failedCount",
        "succeededCount",
        "expiredCount"
    })
    public AdhocQueryRegionalDetails(
            String region,
            AdhocQueryStatus regionalStatus,
            String regionalError,
            String expectedCount,
            String failedCount,
            String succeededCount,
            String expiredCount) {
        super();
        this.region = region;
        this.regionalStatus = regionalStatus;
        this.regionalError = regionalError;
        this.expectedCount = expectedCount;
        this.failedCount = failedCount;
        this.succeededCount = succeededCount;
        this.expiredCount = expiredCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Region name */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region name
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** adhoc query status of the region */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalStatus")
        private AdhocQueryStatus regionalStatus;

        /**
         * adhoc query status of the region
         *
         * @param regionalStatus the value to set
         * @return this builder
         */
        public Builder regionalStatus(AdhocQueryStatus regionalStatus) {
            this.regionalStatus = regionalStatus;
            this.__explicitlySet__.add("regionalStatus");
            return this;
        }
        /** error message to show if adhoc query fails in a region */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalError")
        private String regionalError;

        /**
         * error message to show if adhoc query fails in a region
         *
         * @param regionalError the value to set
         * @return this builder
         */
        public Builder regionalError(String regionalError) {
            this.regionalError = regionalError;
            this.__explicitlySet__.add("regionalError");
            return this;
        }
        /** Expected number of instances on which query should run */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedCount")
        private String expectedCount;

        /**
         * Expected number of instances on which query should run
         *
         * @param expectedCount the value to set
         * @return this builder
         */
        public Builder expectedCount(String expectedCount) {
            this.expectedCount = expectedCount;
            this.__explicitlySet__.add("expectedCount");
            return this;
        }
        /** Number of instances on which query failed */
        @com.fasterxml.jackson.annotation.JsonProperty("failedCount")
        private String failedCount;

        /**
         * Number of instances on which query failed
         *
         * @param failedCount the value to set
         * @return this builder
         */
        public Builder failedCount(String failedCount) {
            this.failedCount = failedCount;
            this.__explicitlySet__.add("failedCount");
            return this;
        }
        /** Number of instances on which query succeeded */
        @com.fasterxml.jackson.annotation.JsonProperty("succeededCount")
        private String succeededCount;

        /**
         * Number of instances on which query succeeded
         *
         * @param succeededCount the value to set
         * @return this builder
         */
        public Builder succeededCount(String succeededCount) {
            this.succeededCount = succeededCount;
            this.__explicitlySet__.add("succeededCount");
            return this;
        }
        /** Number of instances on which query expired */
        @com.fasterxml.jackson.annotation.JsonProperty("expiredCount")
        private String expiredCount;

        /**
         * Number of instances on which query expired
         *
         * @param expiredCount the value to set
         * @return this builder
         */
        public Builder expiredCount(String expiredCount) {
            this.expiredCount = expiredCount;
            this.__explicitlySet__.add("expiredCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdhocQueryRegionalDetails build() {
            AdhocQueryRegionalDetails model =
                    new AdhocQueryRegionalDetails(
                            this.region,
                            this.regionalStatus,
                            this.regionalError,
                            this.expectedCount,
                            this.failedCount,
                            this.succeededCount,
                            this.expiredCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdhocQueryRegionalDetails model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("regionalStatus")) {
                this.regionalStatus(model.getRegionalStatus());
            }
            if (model.wasPropertyExplicitlySet("regionalError")) {
                this.regionalError(model.getRegionalError());
            }
            if (model.wasPropertyExplicitlySet("expectedCount")) {
                this.expectedCount(model.getExpectedCount());
            }
            if (model.wasPropertyExplicitlySet("failedCount")) {
                this.failedCount(model.getFailedCount());
            }
            if (model.wasPropertyExplicitlySet("succeededCount")) {
                this.succeededCount(model.getSucceededCount());
            }
            if (model.wasPropertyExplicitlySet("expiredCount")) {
                this.expiredCount(model.getExpiredCount());
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

    /** Region name */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region name
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** adhoc query status of the region */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalStatus")
    private final AdhocQueryStatus regionalStatus;

    /**
     * adhoc query status of the region
     *
     * @return the value
     */
    public AdhocQueryStatus getRegionalStatus() {
        return regionalStatus;
    }

    /** error message to show if adhoc query fails in a region */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalError")
    private final String regionalError;

    /**
     * error message to show if adhoc query fails in a region
     *
     * @return the value
     */
    public String getRegionalError() {
        return regionalError;
    }

    /** Expected number of instances on which query should run */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedCount")
    private final String expectedCount;

    /**
     * Expected number of instances on which query should run
     *
     * @return the value
     */
    public String getExpectedCount() {
        return expectedCount;
    }

    /** Number of instances on which query failed */
    @com.fasterxml.jackson.annotation.JsonProperty("failedCount")
    private final String failedCount;

    /**
     * Number of instances on which query failed
     *
     * @return the value
     */
    public String getFailedCount() {
        return failedCount;
    }

    /** Number of instances on which query succeeded */
    @com.fasterxml.jackson.annotation.JsonProperty("succeededCount")
    private final String succeededCount;

    /**
     * Number of instances on which query succeeded
     *
     * @return the value
     */
    public String getSucceededCount() {
        return succeededCount;
    }

    /** Number of instances on which query expired */
    @com.fasterxml.jackson.annotation.JsonProperty("expiredCount")
    private final String expiredCount;

    /**
     * Number of instances on which query expired
     *
     * @return the value
     */
    public String getExpiredCount() {
        return expiredCount;
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
        sb.append("AdhocQueryRegionalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", regionalStatus=").append(String.valueOf(this.regionalStatus));
        sb.append(", regionalError=").append(String.valueOf(this.regionalError));
        sb.append(", expectedCount=").append(String.valueOf(this.expectedCount));
        sb.append(", failedCount=").append(String.valueOf(this.failedCount));
        sb.append(", succeededCount=").append(String.valueOf(this.succeededCount));
        sb.append(", expiredCount=").append(String.valueOf(this.expiredCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdhocQueryRegionalDetails)) {
            return false;
        }

        AdhocQueryRegionalDetails other = (AdhocQueryRegionalDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.regionalStatus, other.regionalStatus)
                && java.util.Objects.equals(this.regionalError, other.regionalError)
                && java.util.Objects.equals(this.expectedCount, other.expectedCount)
                && java.util.Objects.equals(this.failedCount, other.failedCount)
                && java.util.Objects.equals(this.succeededCount, other.succeededCount)
                && java.util.Objects.equals(this.expiredCount, other.expiredCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalStatus == null ? 43 : this.regionalStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalError == null ? 43 : this.regionalError.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedCount == null ? 43 : this.expectedCount.hashCode());
        result = (result * PRIME) + (this.failedCount == null ? 43 : this.failedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.succeededCount == null ? 43 : this.succeededCount.hashCode());
        result = (result * PRIME) + (this.expiredCount == null ? 43 : this.expiredCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
