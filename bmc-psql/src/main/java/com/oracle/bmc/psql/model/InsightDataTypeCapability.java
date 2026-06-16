/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Capability metadata for a specific insight data type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InsightDataTypeCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightDataTypeCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "insightDataType",
        "description",
        "dataContract",
        "dateTimeRangeSupport",
        "granularity",
        "filters",
        "sorting",
        "pagination",
        "limits"
    })
    public InsightDataTypeCapability(
            InsightDataType insightDataType,
            String description,
            InsightDataContract dataContract,
            DateTimeRangeCapability dateTimeRangeSupport,
            GranularityCapability granularity,
            java.util.List<InsightFilterCapability> filters,
            SortingCapability sorting,
            PaginationCapability pagination,
            InsightLimits limits) {
        super();
        this.insightDataType = insightDataType;
        this.description = description;
        this.dataContract = dataContract;
        this.dateTimeRangeSupport = dateTimeRangeSupport;
        this.granularity = granularity;
        this.filters = filters;
        this.sorting = sorting;
        this.pagination = pagination;
        this.limits = limits;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Insight data type identifier (for example, AAS_TIME_SERIES). */
        @com.fasterxml.jackson.annotation.JsonProperty("insightDataType")
        private InsightDataType insightDataType;

        /**
         * Insight data type identifier (for example, AAS_TIME_SERIES).
         *
         * @param insightDataType the value to set
         * @return this builder
         */
        public Builder insightDataType(InsightDataType insightDataType) {
            this.insightDataType = insightDataType;
            this.__explicitlySet__.add("insightDataType");
            return this;
        }
        /** Human-readable description of the insight data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable description of the insight data type.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataContract")
        private InsightDataContract dataContract;

        public Builder dataContract(InsightDataContract dataContract) {
            this.dataContract = dataContract;
            this.__explicitlySet__.add("dataContract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dateTimeRangeSupport")
        private DateTimeRangeCapability dateTimeRangeSupport;

        public Builder dateTimeRangeSupport(DateTimeRangeCapability dateTimeRangeSupport) {
            this.dateTimeRangeSupport = dateTimeRangeSupport;
            this.__explicitlySet__.add("dateTimeRangeSupport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private GranularityCapability granularity;

        public Builder granularity(GranularityCapability granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }
        /** Supported filters for this insight data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<InsightFilterCapability> filters;

        /**
         * Supported filters for this insight data type.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<InsightFilterCapability> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sorting")
        private SortingCapability sorting;

        public Builder sorting(SortingCapability sorting) {
            this.sorting = sorting;
            this.__explicitlySet__.add("sorting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pagination")
        private PaginationCapability pagination;

        public Builder pagination(PaginationCapability pagination) {
            this.pagination = pagination;
            this.__explicitlySet__.add("pagination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("limits")
        private InsightLimits limits;

        public Builder limits(InsightLimits limits) {
            this.limits = limits;
            this.__explicitlySet__.add("limits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightDataTypeCapability build() {
            InsightDataTypeCapability model =
                    new InsightDataTypeCapability(
                            this.insightDataType,
                            this.description,
                            this.dataContract,
                            this.dateTimeRangeSupport,
                            this.granularity,
                            this.filters,
                            this.sorting,
                            this.pagination,
                            this.limits);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightDataTypeCapability model) {
            if (model.wasPropertyExplicitlySet("insightDataType")) {
                this.insightDataType(model.getInsightDataType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dataContract")) {
                this.dataContract(model.getDataContract());
            }
            if (model.wasPropertyExplicitlySet("dateTimeRangeSupport")) {
                this.dateTimeRangeSupport(model.getDateTimeRangeSupport());
            }
            if (model.wasPropertyExplicitlySet("granularity")) {
                this.granularity(model.getGranularity());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("sorting")) {
                this.sorting(model.getSorting());
            }
            if (model.wasPropertyExplicitlySet("pagination")) {
                this.pagination(model.getPagination());
            }
            if (model.wasPropertyExplicitlySet("limits")) {
                this.limits(model.getLimits());
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

    /** Insight data type identifier (for example, AAS_TIME_SERIES). */
    public enum InsightDataType implements com.oracle.bmc.http.internal.BmcEnum {
        AasTimeSeries("AAS_TIME_SERIES"),
        TopQueries("TOP_QUERIES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InsightDataType.class);

        private final String value;
        private static java.util.Map<String, InsightDataType> map;

        static {
            map = new java.util.HashMap<>();
            for (InsightDataType v : InsightDataType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InsightDataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InsightDataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InsightDataType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Insight data type identifier (for example, AAS_TIME_SERIES). */
    @com.fasterxml.jackson.annotation.JsonProperty("insightDataType")
    private final InsightDataType insightDataType;

    /**
     * Insight data type identifier (for example, AAS_TIME_SERIES).
     *
     * @return the value
     */
    public InsightDataType getInsightDataType() {
        return insightDataType;
    }

    /** Human-readable description of the insight data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable description of the insight data type.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataContract")
    private final InsightDataContract dataContract;

    public InsightDataContract getDataContract() {
        return dataContract;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dateTimeRangeSupport")
    private final DateTimeRangeCapability dateTimeRangeSupport;

    public DateTimeRangeCapability getDateTimeRangeSupport() {
        return dateTimeRangeSupport;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    private final GranularityCapability granularity;

    public GranularityCapability getGranularity() {
        return granularity;
    }

    /** Supported filters for this insight data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<InsightFilterCapability> filters;

    /**
     * Supported filters for this insight data type.
     *
     * @return the value
     */
    public java.util.List<InsightFilterCapability> getFilters() {
        return filters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sorting")
    private final SortingCapability sorting;

    public SortingCapability getSorting() {
        return sorting;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pagination")
    private final PaginationCapability pagination;

    public PaginationCapability getPagination() {
        return pagination;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    private final InsightLimits limits;

    public InsightLimits getLimits() {
        return limits;
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
        sb.append("InsightDataTypeCapability(");
        sb.append("super=").append(super.toString());
        sb.append("insightDataType=").append(String.valueOf(this.insightDataType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataContract=").append(String.valueOf(this.dataContract));
        sb.append(", dateTimeRangeSupport=").append(String.valueOf(this.dateTimeRangeSupport));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", sorting=").append(String.valueOf(this.sorting));
        sb.append(", pagination=").append(String.valueOf(this.pagination));
        sb.append(", limits=").append(String.valueOf(this.limits));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightDataTypeCapability)) {
            return false;
        }

        InsightDataTypeCapability other = (InsightDataTypeCapability) o;
        return java.util.Objects.equals(this.insightDataType, other.insightDataType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataContract, other.dataContract)
                && java.util.Objects.equals(this.dateTimeRangeSupport, other.dateTimeRangeSupport)
                && java.util.Objects.equals(this.granularity, other.granularity)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.sorting, other.sorting)
                && java.util.Objects.equals(this.pagination, other.pagination)
                && java.util.Objects.equals(this.limits, other.limits)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.insightDataType == null ? 43 : this.insightDataType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dataContract == null ? 43 : this.dataContract.hashCode());
        result =
                (result * PRIME)
                        + (this.dateTimeRangeSupport == null
                                ? 43
                                : this.dateTimeRangeSupport.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + (this.sorting == null ? 43 : this.sorting.hashCode());
        result = (result * PRIME) + (this.pagination == null ? 43 : this.pagination.hashCode());
        result = (result * PRIME) + (this.limits == null ? 43 : this.limits.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
