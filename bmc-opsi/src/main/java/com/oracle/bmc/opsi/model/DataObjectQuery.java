/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information required to form and execute query on a data object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "queryType",
    defaultImpl = DataObjectQuery.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataObjectStandardQuery.class,
        name = "STANDARD_QUERY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataObjectTemplatizedQuery.class,
        name = "TEMPLATIZED_QUERY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DataObjectQuery extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bindParams", "queryExecutionTimeoutInSeconds"})
    protected DataObjectQuery(
            java.util.List<DataObjectBindParameter> bindParams,
            Double queryExecutionTimeoutInSeconds) {
        super();
        this.bindParams = bindParams;
        this.queryExecutionTimeoutInSeconds = queryExecutionTimeoutInSeconds;
    }

    /**
     * List of bind parameters to be applied in the query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bindParams")
    private final java.util.List<DataObjectBindParameter> bindParams;

    /**
     * List of bind parameters to be applied in the query.
     * @return the value
     **/
    public java.util.List<DataObjectBindParameter> getBindParams() {
        return bindParams;
    }

    /**
     * Timeout (in seconds) to be set for the data object query execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeoutInSeconds")
    private final Double queryExecutionTimeoutInSeconds;

    /**
     * Timeout (in seconds) to be set for the data object query execution.
     * @return the value
     **/
    public Double getQueryExecutionTimeoutInSeconds() {
        return queryExecutionTimeoutInSeconds;
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
        sb.append("DataObjectQuery(");
        sb.append("super=").append(super.toString());
        sb.append("bindParams=").append(String.valueOf(this.bindParams));
        sb.append(", queryExecutionTimeoutInSeconds=")
                .append(String.valueOf(this.queryExecutionTimeoutInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectQuery)) {
            return false;
        }

        DataObjectQuery other = (DataObjectQuery) o;
        return java.util.Objects.equals(this.bindParams, other.bindParams)
                && java.util.Objects.equals(
                        this.queryExecutionTimeoutInSeconds, other.queryExecutionTimeoutInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bindParams == null ? 43 : this.bindParams.hashCode());
        result =
                (result * PRIME)
                        + (this.queryExecutionTimeoutInSeconds == null
                                ? 43
                                : this.queryExecutionTimeoutInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of Query
     **/
    public enum QueryType {
        TemplatizedQuery("TEMPLATIZED_QUERY"),
        StandardQuery("STANDARD_QUERY"),
        ;

        private final String value;
        private static java.util.Map<String, QueryType> map;

        static {
            map = new java.util.HashMap<>();
            for (QueryType v : QueryType.values()) {
                map.put(v.getValue(), v);
            }
        }

        QueryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QueryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid QueryType: " + key);
        }
    };
}
