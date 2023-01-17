/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * SourceSummaryReport
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SourceSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SourceSummaryReport extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nonOobCount", "autoAssociationSourceCount", "oobCount"})
    public SourceSummaryReport(
            Integer nonOobCount, Integer autoAssociationSourceCount, Integer oobCount) {
        super();
        this.nonOobCount = nonOobCount;
        this.autoAssociationSourceCount = autoAssociationSourceCount;
        this.oobCount = oobCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The count of custom (user defined) sources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
        private Integer nonOobCount;

        /**
         * The count of custom (user defined) sources.
         * @param nonOobCount the value to set
         * @return this builder
         **/
        public Builder nonOobCount(Integer nonOobCount) {
            this.nonOobCount = nonOobCount;
            this.__explicitlySet__.add("nonOobCount");
            return this;
        }
        /**
         * The count of sources set to auto-associate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoAssociationSourceCount")
        private Integer autoAssociationSourceCount;

        /**
         * The count of sources set to auto-associate.
         * @param autoAssociationSourceCount the value to set
         * @return this builder
         **/
        public Builder autoAssociationSourceCount(Integer autoAssociationSourceCount) {
            this.autoAssociationSourceCount = autoAssociationSourceCount;
            this.__explicitlySet__.add("autoAssociationSourceCount");
            return this;
        }
        /**
         * The count of built in sources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
        private Integer oobCount;

        /**
         * The count of built in sources.
         * @param oobCount the value to set
         * @return this builder
         **/
        public Builder oobCount(Integer oobCount) {
            this.oobCount = oobCount;
            this.__explicitlySet__.add("oobCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceSummaryReport build() {
            SourceSummaryReport model =
                    new SourceSummaryReport(
                            this.nonOobCount, this.autoAssociationSourceCount, this.oobCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceSummaryReport model) {
            if (model.wasPropertyExplicitlySet("nonOobCount")) {
                this.nonOobCount(model.getNonOobCount());
            }
            if (model.wasPropertyExplicitlySet("autoAssociationSourceCount")) {
                this.autoAssociationSourceCount(model.getAutoAssociationSourceCount());
            }
            if (model.wasPropertyExplicitlySet("oobCount")) {
                this.oobCount(model.getOobCount());
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
     * The count of custom (user defined) sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
    private final Integer nonOobCount;

    /**
     * The count of custom (user defined) sources.
     * @return the value
     **/
    public Integer getNonOobCount() {
        return nonOobCount;
    }

    /**
     * The count of sources set to auto-associate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoAssociationSourceCount")
    private final Integer autoAssociationSourceCount;

    /**
     * The count of sources set to auto-associate.
     * @return the value
     **/
    public Integer getAutoAssociationSourceCount() {
        return autoAssociationSourceCount;
    }

    /**
     * The count of built in sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
    private final Integer oobCount;

    /**
     * The count of built in sources.
     * @return the value
     **/
    public Integer getOobCount() {
        return oobCount;
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
        sb.append("SourceSummaryReport(");
        sb.append("super=").append(super.toString());
        sb.append("nonOobCount=").append(String.valueOf(this.nonOobCount));
        sb.append(", autoAssociationSourceCount=")
                .append(String.valueOf(this.autoAssociationSourceCount));
        sb.append(", oobCount=").append(String.valueOf(this.oobCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceSummaryReport)) {
            return false;
        }

        SourceSummaryReport other = (SourceSummaryReport) o;
        return java.util.Objects.equals(this.nonOobCount, other.nonOobCount)
                && java.util.Objects.equals(
                        this.autoAssociationSourceCount, other.autoAssociationSourceCount)
                && java.util.Objects.equals(this.oobCount, other.oobCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nonOobCount == null ? 43 : this.nonOobCount.hashCode());
        result =
                (result * PRIME)
                        + (this.autoAssociationSourceCount == null
                                ? 43
                                : this.autoAssociationSourceCount.hashCode());
        result = (result * PRIME) + (this.oobCount == null ? 43 : this.oobCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
