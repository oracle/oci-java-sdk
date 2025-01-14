/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The custom table for Cost Analysis UI rendering. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SavedCustomTable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SavedCustomTable
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "rowGroupBy",
        "columnGroupBy",
        "groupByTag",
        "compartmentDepth",
        "version"
    })
    public SavedCustomTable(
            String displayName,
            java.util.List<String> rowGroupBy,
            java.util.List<String> columnGroupBy,
            java.util.List<Tag> groupByTag,
            java.math.BigDecimal compartmentDepth,
            java.math.BigDecimal version) {
        super();
        this.displayName = displayName;
        this.rowGroupBy = rowGroupBy;
        this.columnGroupBy = columnGroupBy;
        this.groupByTag = groupByTag;
        this.compartmentDepth = compartmentDepth;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the custom table. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the custom table.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The row groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName"]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rowGroupBy")
        private java.util.List<String> rowGroupBy;

        /**
         * The row groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName"]}
         *
         * @param rowGroupBy the value to set
         * @return this builder
         */
        public Builder rowGroupBy(java.util.List<String> rowGroupBy) {
            this.rowGroupBy = rowGroupBy;
            this.__explicitlySet__.add("rowGroupBy");
            return this;
        }
        /**
         * The column groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName"]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("columnGroupBy")
        private java.util.List<String> columnGroupBy;

        /**
         * The column groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
         * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
         * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId",
         * "tenantName"]}
         *
         * @param columnGroupBy the value to set
         * @return this builder
         */
        public Builder columnGroupBy(java.util.List<String> columnGroupBy) {
            this.columnGroupBy = columnGroupBy;
            this.__explicitlySet__.add("columnGroupBy");
            return this;
        }
        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only one tag in the list is supported.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        /**
         * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only one tag in the list is supported.
         * For example:
         *   {@code [{"namespace":"oracle", "key":"createdBy"]}
         *
         * @param groupByTag the value to set
         * @return this builder
         **/
        public Builder groupByTag(java.util.List<Tag> groupByTag) {
            this.groupByTag = groupByTag;
            this.__explicitlySet__.add("groupByTag");
            return this;
        }
        /** The compartment depth level. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        /**
         * The compartment depth level.
         *
         * @param compartmentDepth the value to set
         * @return this builder
         */
        public Builder compartmentDepth(java.math.BigDecimal compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }
        /** The version of the custom table. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private java.math.BigDecimal version;

        /**
         * The version of the custom table.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(java.math.BigDecimal version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SavedCustomTable build() {
            SavedCustomTable model =
                    new SavedCustomTable(
                            this.displayName,
                            this.rowGroupBy,
                            this.columnGroupBy,
                            this.groupByTag,
                            this.compartmentDepth,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SavedCustomTable model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("rowGroupBy")) {
                this.rowGroupBy(model.getRowGroupBy());
            }
            if (model.wasPropertyExplicitlySet("columnGroupBy")) {
                this.columnGroupBy(model.getColumnGroupBy());
            }
            if (model.wasPropertyExplicitlySet("groupByTag")) {
                this.groupByTag(model.getGroupByTag());
            }
            if (model.wasPropertyExplicitlySet("compartmentDepth")) {
                this.compartmentDepth(model.getCompartmentDepth());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** The name of the custom table. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the custom table.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The row groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue", "service",
     * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath", "compartmentId",
     * "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName"]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rowGroupBy")
    private final java.util.List<String> rowGroupBy;

    /**
     * The row groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue", "service",
     * "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath", "compartmentId",
     * "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName"]}
     *
     * @return the value
     */
    public java.util.List<String> getRowGroupBy() {
        return rowGroupBy;
    }

    /**
     * The column groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
     * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
     * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName"]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("columnGroupBy")
    private final java.util.List<String> columnGroupBy;

    /**
     * The column groupBy key list. example: {@code ["tagNamespace", "tagKey", "tagValue",
     * "service", "skuName", "skuPartNumber", "unit", "compartmentName", "compartmentPath",
     * "compartmentId", "platform", "region", "logicalAd", "resourceId", "tenantId", "tenantName"]}
     *
     * @return the value
     */
    public java.util.List<String> getColumnGroupBy() {
        return columnGroupBy;
    }

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only one tag in the list is supported.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    private final java.util.List<Tag> groupByTag;

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only one tag in the list is supported.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     * @return the value
     **/
    public java.util.List<Tag> getGroupByTag() {
        return groupByTag;
    }

    /** The compartment depth level. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    private final java.math.BigDecimal compartmentDepth;

    /**
     * The compartment depth level.
     *
     * @return the value
     */
    public java.math.BigDecimal getCompartmentDepth() {
        return compartmentDepth;
    }

    /** The version of the custom table. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final java.math.BigDecimal version;

    /**
     * The version of the custom table.
     *
     * @return the value
     */
    public java.math.BigDecimal getVersion() {
        return version;
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
        sb.append("SavedCustomTable(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", rowGroupBy=").append(String.valueOf(this.rowGroupBy));
        sb.append(", columnGroupBy=").append(String.valueOf(this.columnGroupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SavedCustomTable)) {
            return false;
        }

        SavedCustomTable other = (SavedCustomTable) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.rowGroupBy, other.rowGroupBy)
                && java.util.Objects.equals(this.columnGroupBy, other.columnGroupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.rowGroupBy == null ? 43 : this.rowGroupBy.hashCode());
        result =
                (result * PRIME)
                        + (this.columnGroupBy == null ? 43 : this.columnGroupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
