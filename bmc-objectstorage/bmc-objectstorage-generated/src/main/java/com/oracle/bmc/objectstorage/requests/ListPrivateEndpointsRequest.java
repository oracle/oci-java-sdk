/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListPrivateEndpointsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPrivateEndpointsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListPrivateEndpointsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The ID of the compartment in which to list buckets. */
    private String compartmentId;

    /** The ID of the compartment in which to list buckets. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * PrivateEndpoint summary in list of PrivateEndpoints includes the 'namespace', 'name',
     * 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and 'etag' fields. This parameter
     * can also include 'tags' (freeformTags and definedTags). The only supported value of this
     * parameter is 'tags' for now. Example 'tags'.
     */
    private java.util.List<Fields> fields;

    /**
     * PrivateEndpoint summary in list of PrivateEndpoints includes the 'namespace', 'name',
     * 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and 'etag' fields. This parameter
     * can also include 'tags' (freeformTags and definedTags). The only supported value of this
     * parameter is 'tags' for now. Example 'tags'.
     */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        Tags("tags"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * PrivateEndpoint summary in list of PrivateEndpoints includes the 'namespace', 'name',
     * 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and 'etag' fields. This parameter
     * can also include 'tags' (freeformTags and definedTags). The only supported value of this
     * parameter is 'tags' for now. Example 'tags'.
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /** The lifecycle state of the Private Endpoint */
    private com.oracle.bmc.objectstorage.model.PrivateEndpoint.LifecycleState lifecycleState;

    /** The lifecycle state of the Private Endpoint */
    public com.oracle.bmc.objectstorage.model.PrivateEndpoint.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPrivateEndpointsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** The ID of the compartment in which to list buckets. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list buckets.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * PrivateEndpoint summary in list of PrivateEndpoints includes the 'namespace', 'name',
         * 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and 'etag' fields. This
         * parameter can also include 'tags' (freeformTags and definedTags). The only supported
         * value of this parameter is 'tags' for now. Example 'tags'.
         */
        private java.util.List<Fields> fields = null;

        /**
         * PrivateEndpoint summary in list of PrivateEndpoints includes the 'namespace', 'name',
         * 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and 'etag' fields. This
         * parameter can also include 'tags' (freeformTags and definedTags). The only supported
         * value of this parameter is 'tags' for now. Example 'tags'.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. PrivateEndpoint summary in list of PrivateEndpoints includes the
         * 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated', 'timeModified' and
         * 'etag' fields. This parameter can also include 'tags' (freeformTags and definedTags). The
         * only supported value of this parameter is 'tags' for now. Example 'tags'.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /** The lifecycle state of the Private Endpoint */
        private com.oracle.bmc.objectstorage.model.PrivateEndpoint.LifecycleState lifecycleState =
                null;

        /**
         * The lifecycle state of the Private Endpoint
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.objectstorage.model.PrivateEndpoint.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListPrivateEndpointsRequest o) {
            namespaceName(o.getNamespaceName());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            fields(o.getFields());
            opcClientRequestId(o.getOpcClientRequestId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPrivateEndpointsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPrivateEndpointsRequest
         */
        public ListPrivateEndpointsRequest build() {
            ListPrivateEndpointsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPrivateEndpointsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPrivateEndpointsRequest
         */
        public ListPrivateEndpointsRequest buildWithoutInvocationCallback() {
            ListPrivateEndpointsRequest request = new ListPrivateEndpointsRequest();
            request.namespaceName = namespaceName;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.fields = fields;
            request.opcClientRequestId = opcClientRequestId;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListPrivateEndpointsRequest(namespaceName, compartmentId, limit, page, fields,
            // opcClientRequestId, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .fields(fields)
                .opcClientRequestId(opcClientRequestId)
                .lifecycleState(lifecycleState);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateEndpointsRequest)) {
            return false;
        }

        ListPrivateEndpointsRequest other = (ListPrivateEndpointsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
