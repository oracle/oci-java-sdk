/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIPSecConnectionTunnelRoutesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListIPSecConnectionTunnelRoutesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListIPSecConnectionTunnelRoutesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec connection.
     */
    private String ipscId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the IPSec connection.
     */
    public String getIpscId() {
        return ipscId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     */
    private String tunnelId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     */
    public String getTunnelId() {
        return tunnelId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
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
     * Specifies the advertiser of the routes. If set to {@code ORACLE}, this returns only the
     * routes advertised by Oracle. When set to {@code CUSTOMER}, this returns only the routes
     * advertised by the CPE.
     */
    private com.oracle.bmc.core.model.TunnelRouteSummary.Advertiser advertiser;

    /**
     * Specifies the advertiser of the routes. If set to {@code ORACLE}, this returns only the
     * routes advertised by Oracle. When set to {@code CUSTOMER}, this returns only the routes
     * advertised by the CPE.
     */
    public com.oracle.bmc.core.model.TunnelRouteSummary.Advertiser getAdvertiser() {
        return advertiser;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListIPSecConnectionTunnelRoutesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec connection.
         */
        private String ipscId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the IPSec connection.
         *
         * @param ipscId the value to set
         * @return this builder instance
         */
        public Builder ipscId(String ipscId) {
            this.ipscId = ipscId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
         */
        private String tunnelId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
         *
         * @param tunnelId the value to set
         * @return this builder instance
         */
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
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
         * Specifies the advertiser of the routes. If set to {@code ORACLE}, this returns only the
         * routes advertised by Oracle. When set to {@code CUSTOMER}, this returns only the routes
         * advertised by the CPE.
         */
        private com.oracle.bmc.core.model.TunnelRouteSummary.Advertiser advertiser = null;

        /**
         * Specifies the advertiser of the routes. If set to {@code ORACLE}, this returns only the
         * routes advertised by Oracle. When set to {@code CUSTOMER}, this returns only the routes
         * advertised by the CPE.
         *
         * @param advertiser the value to set
         * @return this builder instance
         */
        public Builder advertiser(
                com.oracle.bmc.core.model.TunnelRouteSummary.Advertiser advertiser) {
            this.advertiser = advertiser;
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
        public Builder copy(ListIPSecConnectionTunnelRoutesRequest o) {
            ipscId(o.getIpscId());
            tunnelId(o.getTunnelId());
            limit(o.getLimit());
            page(o.getPage());
            advertiser(o.getAdvertiser());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListIPSecConnectionTunnelRoutesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListIPSecConnectionTunnelRoutesRequest
         */
        public ListIPSecConnectionTunnelRoutesRequest build() {
            ListIPSecConnectionTunnelRoutesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListIPSecConnectionTunnelRoutesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListIPSecConnectionTunnelRoutesRequest
         */
        public ListIPSecConnectionTunnelRoutesRequest buildWithoutInvocationCallback() {
            ListIPSecConnectionTunnelRoutesRequest request =
                    new ListIPSecConnectionTunnelRoutesRequest();
            request.ipscId = ipscId;
            request.tunnelId = tunnelId;
            request.limit = limit;
            request.page = page;
            request.advertiser = advertiser;
            return request;
            // new ListIPSecConnectionTunnelRoutesRequest(ipscId, tunnelId, limit, page,
            // advertiser);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ipscId(ipscId)
                .tunnelId(tunnelId)
                .limit(limit)
                .page(page)
                .advertiser(advertiser);
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
        sb.append(",ipscId=").append(String.valueOf(this.ipscId));
        sb.append(",tunnelId=").append(String.valueOf(this.tunnelId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",advertiser=").append(String.valueOf(this.advertiser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListIPSecConnectionTunnelRoutesRequest)) {
            return false;
        }

        ListIPSecConnectionTunnelRoutesRequest other = (ListIPSecConnectionTunnelRoutesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ipscId, other.ipscId)
                && java.util.Objects.equals(this.tunnelId, other.tunnelId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.advertiser, other.advertiser);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ipscId == null ? 43 : this.ipscId.hashCode());
        result = (result * PRIME) + (this.tunnelId == null ? 43 : this.tunnelId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.advertiser == null ? 43 : this.advertiser.hashCode());
        return result;
    }
}
