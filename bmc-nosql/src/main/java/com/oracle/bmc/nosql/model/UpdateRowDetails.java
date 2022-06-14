/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifications for the putting of a table row.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateRowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateRowDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "value",
        "option",
        "isGetReturnRow",
        "timeoutInMs",
        "ttl",
        "isTtlUseTableDefault",
        "identityCacheSize",
        "isExactMatch"
    })
    public UpdateRowDetails(
            String compartmentId,
            java.util.Map<String, Object> value,
            Option option,
            Boolean isGetReturnRow,
            Integer timeoutInMs,
            Integer ttl,
            Boolean isTtlUseTableDefault,
            Integer identityCacheSize,
            Boolean isExactMatch) {
        super();
        this.compartmentId = compartmentId;
        this.value = value;
        this.option = option;
        this.isGetReturnRow = isGetReturnRow;
        this.timeoutInMs = timeoutInMs;
        this.ttl = ttl;
        this.isTtlUseTableDefault = isTtlUseTableDefault;
        this.identityCacheSize = identityCacheSize;
        this.isExactMatch = isExactMatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the table's compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and compartmentId is supplied, the latter
         * must match the identified table's compartmentId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the table's compartment.  Required
         * if the tableNameOrId path parameter is a table name.
         * Optional if tableNameOrId is an OCID.  If tableNameOrId
         * is an OCID, and compartmentId is supplied, the latter
         * must match the identified table's compartmentId.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The map of values from a row.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Map<String, Object> value;

        /**
         * The map of values from a row.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(java.util.Map<String, Object> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Specifies a condition for the put operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("option")
        private Option option;

        /**
         * Specifies a condition for the put operation.
         * @param option the value to set
         * @return this builder
         **/
        public Builder option(Option option) {
            this.option = option;
            this.__explicitlySet__.add("option");
            return this;
        }
        /**
         * If true, and the put fails due to an option setting, then
         * the existing row will be returned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isGetReturnRow")
        private Boolean isGetReturnRow;

        /**
         * If true, and the put fails due to an option setting, then
         * the existing row will be returned.
         *
         * @param isGetReturnRow the value to set
         * @return this builder
         **/
        public Builder isGetReturnRow(Boolean isGetReturnRow) {
            this.isGetReturnRow = isGetReturnRow;
            this.__explicitlySet__.add("isGetReturnRow");
            return this;
        }
        /**
         * Timeout setting for the put.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        /**
         * Timeout setting for the put.
         * @param timeoutInMs the value to set
         * @return this builder
         **/
        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }
        /**
         * Time-to-live for the row, in days.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        /**
         * Time-to-live for the row, in days.
         * @param ttl the value to set
         * @return this builder
         **/
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }
        /**
         * If true, set time-to-live for this row to the table's default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTtlUseTableDefault")
        private Boolean isTtlUseTableDefault;

        /**
         * If true, set time-to-live for this row to the table's default.
         *
         * @param isTtlUseTableDefault the value to set
         * @return this builder
         **/
        public Builder isTtlUseTableDefault(Boolean isTtlUseTableDefault) {
            this.isTtlUseTableDefault = isTtlUseTableDefault;
            this.__explicitlySet__.add("isTtlUseTableDefault");
            return this;
        }
        /**
         * Sets the number of generated identity values that are
         * requested from the server during a put. If present and greater than 0,
         * this value takes precedence over a default value for the table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identityCacheSize")
        private Integer identityCacheSize;

        /**
         * Sets the number of generated identity values that are
         * requested from the server during a put. If present and greater than 0,
         * this value takes precedence over a default value for the table.
         *
         * @param identityCacheSize the value to set
         * @return this builder
         **/
        public Builder identityCacheSize(Integer identityCacheSize) {
            this.identityCacheSize = identityCacheSize;
            this.__explicitlySet__.add("identityCacheSize");
            return this;
        }
        /**
         * If present and true, the presented row value must exactly
         * match the table's schema.  Otherwise, rows with missing
         * non-key fields or extra fields can be written successfully.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isExactMatch")
        private Boolean isExactMatch;

        /**
         * If present and true, the presented row value must exactly
         * match the table's schema.  Otherwise, rows with missing
         * non-key fields or extra fields can be written successfully.
         *
         * @param isExactMatch the value to set
         * @return this builder
         **/
        public Builder isExactMatch(Boolean isExactMatch) {
            this.isExactMatch = isExactMatch;
            this.__explicitlySet__.add("isExactMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRowDetails build() {
            UpdateRowDetails __instance__ =
                    new UpdateRowDetails(
                            compartmentId,
                            value,
                            option,
                            isGetReturnRow,
                            timeoutInMs,
                            ttl,
                            isTtlUseTableDefault,
                            identityCacheSize,
                            isExactMatch);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRowDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .value(o.getValue())
                            .option(o.getOption())
                            .isGetReturnRow(o.getIsGetReturnRow())
                            .timeoutInMs(o.getTimeoutInMs())
                            .ttl(o.getTtl())
                            .isTtlUseTableDefault(o.getIsTtlUseTableDefault())
                            .identityCacheSize(o.getIdentityCacheSize())
                            .isExactMatch(o.getIsExactMatch());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the table's compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the table's compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The map of values from a row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final java.util.Map<String, Object> value;

    /**
     * The map of values from a row.
     * @return the value
     **/
    public java.util.Map<String, Object> getValue() {
        return value;
    }

    /**
     * Specifies a condition for the put operation.
     **/
    public enum Option {
        IfAbsent("IF_ABSENT"),
        IfPresent("IF_PRESENT"),
        ;

        private final String value;
        private static java.util.Map<String, Option> map;

        static {
            map = new java.util.HashMap<>();
            for (Option v : Option.values()) {
                map.put(v.getValue(), v);
            }
        }

        Option(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Option create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Option: " + key);
        }
    };
    /**
     * Specifies a condition for the put operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("option")
    private final Option option;

    /**
     * Specifies a condition for the put operation.
     * @return the value
     **/
    public Option getOption() {
        return option;
    }

    /**
     * If true, and the put fails due to an option setting, then
     * the existing row will be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGetReturnRow")
    private final Boolean isGetReturnRow;

    /**
     * If true, and the put fails due to an option setting, then
     * the existing row will be returned.
     *
     * @return the value
     **/
    public Boolean getIsGetReturnRow() {
        return isGetReturnRow;
    }

    /**
     * Timeout setting for the put.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    private final Integer timeoutInMs;

    /**
     * Timeout setting for the put.
     * @return the value
     **/
    public Integer getTimeoutInMs() {
        return timeoutInMs;
    }

    /**
     * Time-to-live for the row, in days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    /**
     * Time-to-live for the row, in days.
     * @return the value
     **/
    public Integer getTtl() {
        return ttl;
    }

    /**
     * If true, set time-to-live for this row to the table's default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTtlUseTableDefault")
    private final Boolean isTtlUseTableDefault;

    /**
     * If true, set time-to-live for this row to the table's default.
     *
     * @return the value
     **/
    public Boolean getIsTtlUseTableDefault() {
        return isTtlUseTableDefault;
    }

    /**
     * Sets the number of generated identity values that are
     * requested from the server during a put. If present and greater than 0,
     * this value takes precedence over a default value for the table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityCacheSize")
    private final Integer identityCacheSize;

    /**
     * Sets the number of generated identity values that are
     * requested from the server during a put. If present and greater than 0,
     * this value takes precedence over a default value for the table.
     *
     * @return the value
     **/
    public Integer getIdentityCacheSize() {
        return identityCacheSize;
    }

    /**
     * If present and true, the presented row value must exactly
     * match the table's schema.  Otherwise, rows with missing
     * non-key fields or extra fields can be written successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExactMatch")
    private final Boolean isExactMatch;

    /**
     * If present and true, the presented row value must exactly
     * match the table's schema.  Otherwise, rows with missing
     * non-key fields or extra fields can be written successfully.
     *
     * @return the value
     **/
    public Boolean getIsExactMatch() {
        return isExactMatch;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateRowDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", option=").append(String.valueOf(this.option));
        sb.append(", isGetReturnRow=").append(String.valueOf(this.isGetReturnRow));
        sb.append(", timeoutInMs=").append(String.valueOf(this.timeoutInMs));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append(", isTtlUseTableDefault=").append(String.valueOf(this.isTtlUseTableDefault));
        sb.append(", identityCacheSize=").append(String.valueOf(this.identityCacheSize));
        sb.append(", isExactMatch=").append(String.valueOf(this.isExactMatch));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRowDetails)) {
            return false;
        }

        UpdateRowDetails other = (UpdateRowDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.option, other.option)
                && java.util.Objects.equals(this.isGetReturnRow, other.isGetReturnRow)
                && java.util.Objects.equals(this.timeoutInMs, other.timeoutInMs)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && java.util.Objects.equals(this.isTtlUseTableDefault, other.isTtlUseTableDefault)
                && java.util.Objects.equals(this.identityCacheSize, other.identityCacheSize)
                && java.util.Objects.equals(this.isExactMatch, other.isExactMatch)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.option == null ? 43 : this.option.hashCode());
        result =
                (result * PRIME)
                        + (this.isGetReturnRow == null ? 43 : this.isGetReturnRow.hashCode());
        result = (result * PRIME) + (this.timeoutInMs == null ? 43 : this.timeoutInMs.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result =
                (result * PRIME)
                        + (this.isTtlUseTableDefault == null
                                ? 43
                                : this.isTtlUseTableDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.identityCacheSize == null ? 43 : this.identityCacheSize.hashCode());
        result = (result * PRIME) + (this.isExactMatch == null ? 43 : this.isExactMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
