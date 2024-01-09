/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListContainerDatabasePatchesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListContainerDatabasePatchesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListContainerDatabasePatchesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }
    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token to continue listing from. */
    private String page;

    /** The pagination token to continue listing from. */
    public String getPage() {
        return page;
    }
    /** Autonomous patch type, either "QUARTERLY" or "TIMEZONE". */
    private AutonomousPatchType autonomousPatchType;

    /** Autonomous patch type, either "QUARTERLY" or "TIMEZONE". */
    public enum AutonomousPatchType implements com.oracle.bmc.http.internal.BmcEnum {
        Quarterly("QUARTERLY"),
        Timezone("TIMEZONE"),
        ;

        private final String value;
        private static java.util.Map<String, AutonomousPatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (AutonomousPatchType v : AutonomousPatchType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutonomousPatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutonomousPatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutonomousPatchType: " + key);
        }
    };

    /** Autonomous patch type, either "QUARTERLY" or "TIMEZONE". */
    public AutonomousPatchType getAutonomousPatchType() {
        return autonomousPatchType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListContainerDatabasePatchesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token to continue listing from. */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** Autonomous patch type, either "QUARTERLY" or "TIMEZONE". */
        private AutonomousPatchType autonomousPatchType = null;

        /**
         * Autonomous patch type, either "QUARTERLY" or "TIMEZONE".
         *
         * @param autonomousPatchType the value to set
         * @return this builder instance
         */
        public Builder autonomousPatchType(AutonomousPatchType autonomousPatchType) {
            this.autonomousPatchType = autonomousPatchType;
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
        public Builder copy(ListContainerDatabasePatchesRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            autonomousPatchType(o.getAutonomousPatchType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListContainerDatabasePatchesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListContainerDatabasePatchesRequest
         */
        public ListContainerDatabasePatchesRequest build() {
            ListContainerDatabasePatchesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListContainerDatabasePatchesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListContainerDatabasePatchesRequest
         */
        public ListContainerDatabasePatchesRequest buildWithoutInvocationCallback() {
            ListContainerDatabasePatchesRequest request = new ListContainerDatabasePatchesRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.autonomousPatchType = autonomousPatchType;
            return request;
            // new ListContainerDatabasePatchesRequest(autonomousContainerDatabaseId, compartmentId,
            // limit, page, autonomousPatchType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .autonomousPatchType(autonomousPatchType);
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",autonomousPatchType=").append(String.valueOf(this.autonomousPatchType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListContainerDatabasePatchesRequest)) {
            return false;
        }

        ListContainerDatabasePatchesRequest other = (ListContainerDatabasePatchesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.autonomousPatchType, other.autonomousPatchType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousPatchType == null
                                ? 43
                                : this.autonomousPatchType.hashCode());
        return result;
    }
}
