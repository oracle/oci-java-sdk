/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.requests;

import com.oracle.bmc.wlms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/wlms/ListWlsDomainsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWlsDomainsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
public class ListWlsDomainsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.wlms.model.WlsDomain.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.wlms.model.WlsDomain.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The display name. */
    private String displayName;

    /** The display name. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     */
    public String getId() {
        return id;
    }
    /** A filter to return WebLogic domains based on the WebLogic version. */
    private WeblogicVersion weblogicVersion;

    /** A filter to return WebLogic domains based on the WebLogic version. */
    public enum WeblogicVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V12214("v12.2.1.4"),
        V14110("v14.1.1.0"),
        V14120("v14.1.2.0"),
        ;

        private final String value;
        private static java.util.Map<String, WeblogicVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (WeblogicVersion v : WeblogicVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        WeblogicVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WeblogicVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WeblogicVersion: " + key);
        }
    };

    /** A filter to return WebLogic domains based on the WebLogic version. */
    public WeblogicVersion getWeblogicVersion() {
        return weblogicVersion;
    }
    /**
     * A filter to return WebLogic domains based on the type of middleware of the WebLogic domain.
     */
    private MiddlewareType middlewareType;

    /**
     * A filter to return WebLogic domains based on the type of middleware of the WebLogic domain.
     */
    public enum MiddlewareType implements com.oracle.bmc.http.internal.BmcEnum {
        Fmw("FMW"),
        Wls("WLS"),
        ;

        private final String value;
        private static java.util.Map<String, MiddlewareType> map;

        static {
            map = new java.util.HashMap<>();
            for (MiddlewareType v : MiddlewareType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MiddlewareType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MiddlewareType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MiddlewareType: " + key);
        }
    };

    /**
     * A filter to return WebLogic domains based on the type of middleware of the WebLogic domain.
     */
    public MiddlewareType getMiddlewareType() {
        return middlewareType;
    }
    /** A filter to return domains based on the patch readiness status. */
    private com.oracle.bmc.wlms.model.PatchReadinessStatus patchReadinessStatus;

    /** A filter to return domains based on the patch readiness status. */
    public com.oracle.bmc.wlms.model.PatchReadinessStatus getPatchReadinessStatus() {
        return patchReadinessStatus;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token that represents the page at which to start retrieving results. The token is
     * usually retrieved from a previous List call.
     */
    private String page;

    /**
     * The page token that represents the page at which to start retrieving results. The token is
     * usually retrieved from a previous List call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order is either 'ASC' or 'DESC'. */
    private SortOrder sortOrder;

    /** The sort order is either 'ASC' or 'DESC'. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order is either 'ASC' or 'DESC'. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field by which to sort the resource. Only one sort order may be provided. Default order
     * for _timeCreated_ is **descending**. Default order for _displayName_ is **ascending**. If no
     * value is specified, _timeCreated_ is default.
     */
    private SortBy sortBy;

    /**
     * The field by which to sort the resource. Only one sort order may be provided. Default order
     * for _timeCreated_ is **descending**. Default order for _displayName_ is **ascending**. If no
     * value is specified, _timeCreated_ is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field by which to sort the resource. Only one sort order may be provided. Default order
     * for _timeCreated_ is **descending**. Default order for _displayName_ is **ascending**. If no
     * value is specified, _timeCreated_ is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWlsDomainsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.wlms.model.WlsDomain.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.wlms.model.WlsDomain.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The display name. */
        private String displayName = null;

        /**
         * The display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** A filter to return WebLogic domains based on the WebLogic version. */
        private WeblogicVersion weblogicVersion = null;

        /**
         * A filter to return WebLogic domains based on the WebLogic version.
         *
         * @param weblogicVersion the value to set
         * @return this builder instance
         */
        public Builder weblogicVersion(WeblogicVersion weblogicVersion) {
            this.weblogicVersion = weblogicVersion;
            return this;
        }

        /**
         * A filter to return WebLogic domains based on the type of middleware of the WebLogic
         * domain.
         */
        private MiddlewareType middlewareType = null;

        /**
         * A filter to return WebLogic domains based on the type of middleware of the WebLogic
         * domain.
         *
         * @param middlewareType the value to set
         * @return this builder instance
         */
        public Builder middlewareType(MiddlewareType middlewareType) {
            this.middlewareType = middlewareType;
            return this;
        }

        /** A filter to return domains based on the patch readiness status. */
        private com.oracle.bmc.wlms.model.PatchReadinessStatus patchReadinessStatus = null;

        /**
         * A filter to return domains based on the patch readiness status.
         *
         * @param patchReadinessStatus the value to set
         * @return this builder instance
         */
        public Builder patchReadinessStatus(
                com.oracle.bmc.wlms.model.PatchReadinessStatus patchReadinessStatus) {
            this.patchReadinessStatus = patchReadinessStatus;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token that represents the page at which to start retrieving results. The token
         * is usually retrieved from a previous List call.
         */
        private String page = null;

        /**
         * The page token that represents the page at which to start retrieving results. The token
         * is usually retrieved from a previous List call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order is either 'ASC' or 'DESC'. */
        private SortOrder sortOrder = null;

        /**
         * The sort order is either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field by which to sort the resource. Only one sort order may be provided. Default
         * order for _timeCreated_ is **descending**. Default order for _displayName_ is
         * **ascending**. If no value is specified, _timeCreated_ is default.
         */
        private SortBy sortBy = null;

        /**
         * The field by which to sort the resource. Only one sort order may be provided. Default
         * order for _timeCreated_ is **descending**. Default order for _displayName_ is
         * **ascending**. If no value is specified, _timeCreated_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListWlsDomainsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            weblogicVersion(o.getWeblogicVersion());
            middlewareType(o.getMiddlewareType());
            patchReadinessStatus(o.getPatchReadinessStatus());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWlsDomainsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWlsDomainsRequest
         */
        public ListWlsDomainsRequest build() {
            ListWlsDomainsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWlsDomainsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWlsDomainsRequest
         */
        public ListWlsDomainsRequest buildWithoutInvocationCallback() {
            ListWlsDomainsRequest request = new ListWlsDomainsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.weblogicVersion = weblogicVersion;
            request.middlewareType = middlewareType;
            request.patchReadinessStatus = patchReadinessStatus;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListWlsDomainsRequest(compartmentId, lifecycleState, displayName, id,
            // weblogicVersion, middlewareType, patchReadinessStatus, opcRequestId, opcRetryToken,
            // limit, page, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .id(id)
                .weblogicVersion(weblogicVersion)
                .middlewareType(middlewareType)
                .patchReadinessStatus(patchReadinessStatus)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",weblogicVersion=").append(String.valueOf(this.weblogicVersion));
        sb.append(",middlewareType=").append(String.valueOf(this.middlewareType));
        sb.append(",patchReadinessStatus=").append(String.valueOf(this.patchReadinessStatus));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWlsDomainsRequest)) {
            return false;
        }

        ListWlsDomainsRequest other = (ListWlsDomainsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.weblogicVersion, other.weblogicVersion)
                && java.util.Objects.equals(this.middlewareType, other.middlewareType)
                && java.util.Objects.equals(this.patchReadinessStatus, other.patchReadinessStatus)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.weblogicVersion == null ? 43 : this.weblogicVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.middlewareType == null ? 43 : this.middlewareType.hashCode());
        result =
                (result * PRIME)
                        + (this.patchReadinessStatus == null
                                ? 43
                                : this.patchReadinessStatus.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
