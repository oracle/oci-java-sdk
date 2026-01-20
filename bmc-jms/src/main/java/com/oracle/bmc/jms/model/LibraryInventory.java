/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Inventory of libraries in a fleet during a specified time period. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LibraryInventory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LibraryInventory
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "staticallyDetectedLibraryCount",
        "dynamicallyDetectedLibraryCount",
        "uncorrelatedPackageCount",
        "highSeverityLibraryCount",
        "mediumSeverityLibraryCount",
        "lowSeverityLibraryCount"
    })
    public LibraryInventory(
            Integer staticallyDetectedLibraryCount,
            Integer dynamicallyDetectedLibraryCount,
            Integer uncorrelatedPackageCount,
            Integer highSeverityLibraryCount,
            Integer mediumSeverityLibraryCount,
            Integer lowSeverityLibraryCount) {
        super();
        this.staticallyDetectedLibraryCount = staticallyDetectedLibraryCount;
        this.dynamicallyDetectedLibraryCount = dynamicallyDetectedLibraryCount;
        this.uncorrelatedPackageCount = uncorrelatedPackageCount;
        this.highSeverityLibraryCount = highSeverityLibraryCount;
        this.mediumSeverityLibraryCount = mediumSeverityLibraryCount;
        this.lowSeverityLibraryCount = lowSeverityLibraryCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The count of libraries which are detected statically. */
        @com.fasterxml.jackson.annotation.JsonProperty("staticallyDetectedLibraryCount")
        private Integer staticallyDetectedLibraryCount;

        /**
         * The count of libraries which are detected statically.
         *
         * @param staticallyDetectedLibraryCount the value to set
         * @return this builder
         */
        public Builder staticallyDetectedLibraryCount(Integer staticallyDetectedLibraryCount) {
            this.staticallyDetectedLibraryCount = staticallyDetectedLibraryCount;
            this.__explicitlySet__.add("staticallyDetectedLibraryCount");
            return this;
        }
        /** The count of libraries which are detected dynamically. */
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicallyDetectedLibraryCount")
        private Integer dynamicallyDetectedLibraryCount;

        /**
         * The count of libraries which are detected dynamically.
         *
         * @param dynamicallyDetectedLibraryCount the value to set
         * @return this builder
         */
        public Builder dynamicallyDetectedLibraryCount(Integer dynamicallyDetectedLibraryCount) {
            this.dynamicallyDetectedLibraryCount = dynamicallyDetectedLibraryCount;
            this.__explicitlySet__.add("dynamicallyDetectedLibraryCount");
            return this;
        }
        /** The count of packages which are detected but not correlated to any libraries. */
        @com.fasterxml.jackson.annotation.JsonProperty("uncorrelatedPackageCount")
        private Integer uncorrelatedPackageCount;

        /**
         * The count of packages which are detected but not correlated to any libraries.
         *
         * @param uncorrelatedPackageCount the value to set
         * @return this builder
         */
        public Builder uncorrelatedPackageCount(Integer uncorrelatedPackageCount) {
            this.uncorrelatedPackageCount = uncorrelatedPackageCount;
            this.__explicitlySet__.add("uncorrelatedPackageCount");
            return this;
        }
        /** The count of libraries with high severity vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("highSeverityLibraryCount")
        private Integer highSeverityLibraryCount;

        /**
         * The count of libraries with high severity vulnerabilities.
         *
         * @param highSeverityLibraryCount the value to set
         * @return this builder
         */
        public Builder highSeverityLibraryCount(Integer highSeverityLibraryCount) {
            this.highSeverityLibraryCount = highSeverityLibraryCount;
            this.__explicitlySet__.add("highSeverityLibraryCount");
            return this;
        }
        /** The count of libraries with medium severity vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediumSeverityLibraryCount")
        private Integer mediumSeverityLibraryCount;

        /**
         * The count of libraries with medium severity vulnerabilities.
         *
         * @param mediumSeverityLibraryCount the value to set
         * @return this builder
         */
        public Builder mediumSeverityLibraryCount(Integer mediumSeverityLibraryCount) {
            this.mediumSeverityLibraryCount = mediumSeverityLibraryCount;
            this.__explicitlySet__.add("mediumSeverityLibraryCount");
            return this;
        }
        /** The count of libraries with low severity vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("lowSeverityLibraryCount")
        private Integer lowSeverityLibraryCount;

        /**
         * The count of libraries with low severity vulnerabilities.
         *
         * @param lowSeverityLibraryCount the value to set
         * @return this builder
         */
        public Builder lowSeverityLibraryCount(Integer lowSeverityLibraryCount) {
            this.lowSeverityLibraryCount = lowSeverityLibraryCount;
            this.__explicitlySet__.add("lowSeverityLibraryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LibraryInventory build() {
            LibraryInventory model =
                    new LibraryInventory(
                            this.staticallyDetectedLibraryCount,
                            this.dynamicallyDetectedLibraryCount,
                            this.uncorrelatedPackageCount,
                            this.highSeverityLibraryCount,
                            this.mediumSeverityLibraryCount,
                            this.lowSeverityLibraryCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LibraryInventory model) {
            if (model.wasPropertyExplicitlySet("staticallyDetectedLibraryCount")) {
                this.staticallyDetectedLibraryCount(model.getStaticallyDetectedLibraryCount());
            }
            if (model.wasPropertyExplicitlySet("dynamicallyDetectedLibraryCount")) {
                this.dynamicallyDetectedLibraryCount(model.getDynamicallyDetectedLibraryCount());
            }
            if (model.wasPropertyExplicitlySet("uncorrelatedPackageCount")) {
                this.uncorrelatedPackageCount(model.getUncorrelatedPackageCount());
            }
            if (model.wasPropertyExplicitlySet("highSeverityLibraryCount")) {
                this.highSeverityLibraryCount(model.getHighSeverityLibraryCount());
            }
            if (model.wasPropertyExplicitlySet("mediumSeverityLibraryCount")) {
                this.mediumSeverityLibraryCount(model.getMediumSeverityLibraryCount());
            }
            if (model.wasPropertyExplicitlySet("lowSeverityLibraryCount")) {
                this.lowSeverityLibraryCount(model.getLowSeverityLibraryCount());
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

    /** The count of libraries which are detected statically. */
    @com.fasterxml.jackson.annotation.JsonProperty("staticallyDetectedLibraryCount")
    private final Integer staticallyDetectedLibraryCount;

    /**
     * The count of libraries which are detected statically.
     *
     * @return the value
     */
    public Integer getStaticallyDetectedLibraryCount() {
        return staticallyDetectedLibraryCount;
    }

    /** The count of libraries which are detected dynamically. */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicallyDetectedLibraryCount")
    private final Integer dynamicallyDetectedLibraryCount;

    /**
     * The count of libraries which are detected dynamically.
     *
     * @return the value
     */
    public Integer getDynamicallyDetectedLibraryCount() {
        return dynamicallyDetectedLibraryCount;
    }

    /** The count of packages which are detected but not correlated to any libraries. */
    @com.fasterxml.jackson.annotation.JsonProperty("uncorrelatedPackageCount")
    private final Integer uncorrelatedPackageCount;

    /**
     * The count of packages which are detected but not correlated to any libraries.
     *
     * @return the value
     */
    public Integer getUncorrelatedPackageCount() {
        return uncorrelatedPackageCount;
    }

    /** The count of libraries with high severity vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("highSeverityLibraryCount")
    private final Integer highSeverityLibraryCount;

    /**
     * The count of libraries with high severity vulnerabilities.
     *
     * @return the value
     */
    public Integer getHighSeverityLibraryCount() {
        return highSeverityLibraryCount;
    }

    /** The count of libraries with medium severity vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediumSeverityLibraryCount")
    private final Integer mediumSeverityLibraryCount;

    /**
     * The count of libraries with medium severity vulnerabilities.
     *
     * @return the value
     */
    public Integer getMediumSeverityLibraryCount() {
        return mediumSeverityLibraryCount;
    }

    /** The count of libraries with low severity vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("lowSeverityLibraryCount")
    private final Integer lowSeverityLibraryCount;

    /**
     * The count of libraries with low severity vulnerabilities.
     *
     * @return the value
     */
    public Integer getLowSeverityLibraryCount() {
        return lowSeverityLibraryCount;
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
        sb.append("LibraryInventory(");
        sb.append("super=").append(super.toString());
        sb.append("staticallyDetectedLibraryCount=")
                .append(String.valueOf(this.staticallyDetectedLibraryCount));
        sb.append(", dynamicallyDetectedLibraryCount=")
                .append(String.valueOf(this.dynamicallyDetectedLibraryCount));
        sb.append(", uncorrelatedPackageCount=")
                .append(String.valueOf(this.uncorrelatedPackageCount));
        sb.append(", highSeverityLibraryCount=")
                .append(String.valueOf(this.highSeverityLibraryCount));
        sb.append(", mediumSeverityLibraryCount=")
                .append(String.valueOf(this.mediumSeverityLibraryCount));
        sb.append(", lowSeverityLibraryCount=")
                .append(String.valueOf(this.lowSeverityLibraryCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LibraryInventory)) {
            return false;
        }

        LibraryInventory other = (LibraryInventory) o;
        return java.util.Objects.equals(
                        this.staticallyDetectedLibraryCount, other.staticallyDetectedLibraryCount)
                && java.util.Objects.equals(
                        this.dynamicallyDetectedLibraryCount, other.dynamicallyDetectedLibraryCount)
                && java.util.Objects.equals(
                        this.uncorrelatedPackageCount, other.uncorrelatedPackageCount)
                && java.util.Objects.equals(
                        this.highSeverityLibraryCount, other.highSeverityLibraryCount)
                && java.util.Objects.equals(
                        this.mediumSeverityLibraryCount, other.mediumSeverityLibraryCount)
                && java.util.Objects.equals(
                        this.lowSeverityLibraryCount, other.lowSeverityLibraryCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.staticallyDetectedLibraryCount == null
                                ? 43
                                : this.staticallyDetectedLibraryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicallyDetectedLibraryCount == null
                                ? 43
                                : this.dynamicallyDetectedLibraryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.uncorrelatedPackageCount == null
                                ? 43
                                : this.uncorrelatedPackageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.highSeverityLibraryCount == null
                                ? 43
                                : this.highSeverityLibraryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.mediumSeverityLibraryCount == null
                                ? 43
                                : this.mediumSeverityLibraryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lowSeverityLibraryCount == null
                                ? 43
                                : this.lowSeverityLibraryCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
