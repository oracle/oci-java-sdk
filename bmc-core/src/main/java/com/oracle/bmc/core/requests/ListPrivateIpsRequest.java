/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPrivateIpsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPrivateIpsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListPrivateIpsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * An IP address. This could be either IPv4 or IPv6, depending on the resource. Example: {@code
     * 10.0.3.3}
     */
    private String ipAddress;

    /**
     * An IP address. This could be either IPv4 or IPv6, depending on the resource. Example: {@code
     * 10.0.3.3}
     */
    public String getIpAddress() {
        return ipAddress;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet.
     */
    private String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    /** The OCID of the VNIC. */
    private String vnicId;

    /** The OCID of the VNIC. */
    public String getVnicId() {
        return vnicId;
    }
    /**
     * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED otherwise
     * AVAILABLE
     */
    private String ipState;

    /**
     * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED otherwise
     * AVAILABLE
     */
    public String getIpState() {
        return ipState;
    }
    /** Lifetime of the IP address. There are two types of IPs: - Ephemeral - Reserved */
    private String lifetime;

    /** Lifetime of the IP address. There are two types of IPs: - Ephemeral - Reserved */
    public String getLifetime() {
        return lifetime;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VLAN.
     */
    private String vlanId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VLAN.
     */
    public String getVlanId() {
        return vlanId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPrivateIpsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * An IP address. This could be either IPv4 or IPv6, depending on the resource. Example:
         * {@code 10.0.3.3}
         */
        private String ipAddress = null;

        /**
         * An IP address. This could be either IPv4 or IPv6, depending on the resource. Example:
         * {@code 10.0.3.3}
         *
         * @param ipAddress the value to set
         * @return this builder instance
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet.
         */
        private String subnetId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet.
         *
         * @param subnetId the value to set
         * @return this builder instance
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /** The OCID of the VNIC. */
        private String vnicId = null;

        /**
         * The OCID of the VNIC.
         *
         * @param vnicId the value to set
         * @return this builder instance
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            return this;
        }

        /**
         * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED otherwise
         * AVAILABLE
         */
        private String ipState = null;

        /**
         * State of the IP address. If an IP address is assigned to a VNIC it is ASSIGNED otherwise
         * AVAILABLE
         *
         * @param ipState the value to set
         * @return this builder instance
         */
        public Builder ipState(String ipState) {
            this.ipState = ipState;
            return this;
        }

        /** Lifetime of the IP address. There are two types of IPs: - Ephemeral - Reserved */
        private String lifetime = null;

        /**
         * Lifetime of the IP address. There are two types of IPs: - Ephemeral - Reserved
         *
         * @param lifetime the value to set
         * @return this builder instance
         */
        public Builder lifetime(String lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN.
         */
        private String vlanId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN.
         *
         * @param vlanId the value to set
         * @return this builder instance
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
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
        public Builder copy(ListPrivateIpsRequest o) {
            limit(o.getLimit());
            page(o.getPage());
            ipAddress(o.getIpAddress());
            subnetId(o.getSubnetId());
            vnicId(o.getVnicId());
            ipState(o.getIpState());
            lifetime(o.getLifetime());
            vlanId(o.getVlanId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPrivateIpsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPrivateIpsRequest
         */
        public ListPrivateIpsRequest build() {
            ListPrivateIpsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPrivateIpsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPrivateIpsRequest
         */
        public ListPrivateIpsRequest buildWithoutInvocationCallback() {
            ListPrivateIpsRequest request = new ListPrivateIpsRequest();
            request.limit = limit;
            request.page = page;
            request.ipAddress = ipAddress;
            request.subnetId = subnetId;
            request.vnicId = vnicId;
            request.ipState = ipState;
            request.lifetime = lifetime;
            request.vlanId = vlanId;
            return request;
            // new ListPrivateIpsRequest(limit, page, ipAddress, subnetId, vnicId, ipState,
            // lifetime, vlanId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .limit(limit)
                .page(page)
                .ipAddress(ipAddress)
                .subnetId(subnetId)
                .vnicId(vnicId)
                .ipState(ipState)
                .lifetime(lifetime)
                .vlanId(vlanId);
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
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(",subnetId=").append(String.valueOf(this.subnetId));
        sb.append(",vnicId=").append(String.valueOf(this.vnicId));
        sb.append(",ipState=").append(String.valueOf(this.ipState));
        sb.append(",lifetime=").append(String.valueOf(this.lifetime));
        sb.append(",vlanId=").append(String.valueOf(this.vlanId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateIpsRequest)) {
            return false;
        }

        ListPrivateIpsRequest other = (ListPrivateIpsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.ipState, other.ipState)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.vlanId, other.vlanId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.ipState == null ? 43 : this.ipState.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        return result;
    }
}
