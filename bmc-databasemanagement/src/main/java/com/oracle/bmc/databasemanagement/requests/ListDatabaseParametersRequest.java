/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDatabaseParametersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDatabaseParametersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListDatabaseParametersRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The source used to list database parameters. {@code CURRENT} is used to get the database
     * parameters that are currently in effect for the database instance. {@code SPFILE} is used to
     * list parameters from the server parameter file. Default is {@code CURRENT}.
     */
    private Source source;

    /**
     * The source used to list database parameters. {@code CURRENT} is used to get the database
     * parameters that are currently in effect for the database instance. {@code SPFILE} is used to
     * list parameters from the server parameter file. Default is {@code CURRENT}.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        Current("CURRENT"),
        Spfile("SPFILE"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };

    /**
     * The source used to list database parameters. {@code CURRENT} is used to get the database
     * parameters that are currently in effect for the database instance. {@code SPFILE} is used to
     * list parameters from the server parameter file. Default is {@code CURRENT}.
     */
    public Source getSource() {
        return source;
    }
    /** A filter to return all parameters that have the text given in their names. */
    private String name;

    /** A filter to return all parameters that have the text given in their names. */
    public String getName() {
        return name;
    }
    /** When true, results include a list of valid values for parameters (if applicable). */
    private Boolean isAllowedValuesIncluded;

    /** When true, results include a list of valid values for parameters (if applicable). */
    public Boolean getIsAllowedValuesIncluded() {
        return isAllowedValuesIncluded;
    }
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code NAME} is ascending and it is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code NAME} is ascending and it is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("NAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code NAME} is ascending and it is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDatabaseParametersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The source used to list database parameters. {@code CURRENT} is used to get the database
         * parameters that are currently in effect for the database instance. {@code SPFILE} is used
         * to list parameters from the server parameter file. Default is {@code CURRENT}.
         */
        private Source source = null;

        /**
         * The source used to list database parameters. {@code CURRENT} is used to get the database
         * parameters that are currently in effect for the database instance. {@code SPFILE} is used
         * to list parameters from the server parameter file. Default is {@code CURRENT}.
         *
         * @param source the value to set
         * @return this builder instance
         */
        public Builder source(Source source) {
            this.source = source;
            return this;
        }

        /** A filter to return all parameters that have the text given in their names. */
        private String name = null;

        /**
         * A filter to return all parameters that have the text given in their names.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** When true, results include a list of valid values for parameters (if applicable). */
        private Boolean isAllowedValuesIncluded = null;

        /**
         * When true, results include a list of valid values for parameters (if applicable).
         *
         * @param isAllowedValuesIncluded the value to set
         * @return this builder instance
         */
        public Builder isAllowedValuesIncluded(Boolean isAllowedValuesIncluded) {
            this.isAllowedValuesIncluded = isAllowedValuesIncluded;
            return this;
        }

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for {@code NAME} is ascending and it is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for {@code NAME} is ascending and it is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListDatabaseParametersRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            opcRequestId(o.getOpcRequestId());
            source(o.getSource());
            name(o.getName());
            isAllowedValuesIncluded(o.getIsAllowedValuesIncluded());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabaseParametersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDatabaseParametersRequest
         */
        public ListDatabaseParametersRequest build() {
            ListDatabaseParametersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabaseParametersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabaseParametersRequest
         */
        public ListDatabaseParametersRequest buildWithoutInvocationCallback() {
            ListDatabaseParametersRequest request = new ListDatabaseParametersRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.opcRequestId = opcRequestId;
            request.source = source;
            request.name = name;
            request.isAllowedValuesIncluded = isAllowedValuesIncluded;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListDatabaseParametersRequest(managedDatabaseId, opcRequestId, source, name,
            // isAllowedValuesIncluded, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .opcRequestId(opcRequestId)
                .source(source)
                .name(name)
                .isAllowedValuesIncluded(isAllowedValuesIncluded)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",source=").append(String.valueOf(this.source));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",isAllowedValuesIncluded=").append(String.valueOf(this.isAllowedValuesIncluded));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseParametersRequest)) {
            return false;
        }

        ListDatabaseParametersRequest other = (ListDatabaseParametersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.isAllowedValuesIncluded, other.isAllowedValuesIncluded)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.isAllowedValuesIncluded == null
                                ? 43
                                : this.isAllowedValuesIncluded.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
