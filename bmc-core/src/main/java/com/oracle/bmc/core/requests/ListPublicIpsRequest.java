/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPublicIpsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPublicIpsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListPublicIpsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private IP
     * in any availability domain in the region. Reserved public IPs have {@code scope} = {@code REGION}, as do
     * ephemeral public IPs assigned to a regional entity.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     */
    private Scope scope;

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private IP
     * in any availability domain in the region. Reserved public IPs have {@code scope} = {@code REGION}, as do
     * ephemeral public IPs assigned to a regional entity.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     **/
    public enum Scope {
        Region("REGION"),
        AvailabilityDomain("AVAILABILITY_DOMAIN"),
        ;

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                map.put(v.getValue(), v);
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Scope: " + key);
        }
    };

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private IP
     * in any availability domain in the region. Reserved public IPs have {@code scope} = {@code REGION}, as do
     * ephemeral public IPs assigned to a regional entity.
     * <p>
     * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
     *
     */
    public Scope getScope() {
        return scope;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The name of the availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     */
    private String availabilityDomain;

    /**
     * The name of the availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * A filter to return only public IPs that match given lifetime.
     *
     */
    private Lifetime lifetime;

    /**
     * A filter to return only public IPs that match given lifetime.
     *
     **/
    public enum Lifetime {
        Ephemeral("EPHEMERAL"),
        Reserved("RESERVED"),
        ;

        private final String value;
        private static java.util.Map<String, Lifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (Lifetime v : Lifetime.values()) {
                map.put(v.getValue(), v);
            }
        }

        Lifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Lifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Lifetime: " + key);
        }
    };

    /**
     * A filter to return only public IPs that match given lifetime.
     *
     */
    public Lifetime getLifetime() {
        return lifetime;
    }
    /**
     * A filter to return only resources that belong to the given public IP pool.
     *
     */
    private String publicIpPoolId;

    /**
     * A filter to return only resources that belong to the given public IP pool.
     *
     */
    public String getPublicIpPoolId() {
        return publicIpPoolId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPublicIpsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Whether the public IP is regional or specific to a particular availability domain.
         * <p>
         * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
         * (such as a {@link NatGateway}), or can be assigned to a private IP
         * in any availability domain in the region. Reserved public IPs have {@code scope} = {@code REGION}, as do
         * ephemeral public IPs assigned to a regional entity.
         * <p>
         * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
         * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
         * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
         *
         */
        private Scope scope = null;

        /**
         * Whether the public IP is regional or specific to a particular availability domain.
         * <p>
         * {@code REGION}: The public IP exists within a region and is assigned to a regional entity
         * (such as a {@link NatGateway}), or can be assigned to a private IP
         * in any availability domain in the region. Reserved public IPs have {@code scope} = {@code REGION}, as do
         * ephemeral public IPs assigned to a regional entity.
         * <p>
         * {@code AVAILABILITY_DOMAIN}: The public IP exists within the availability domain of the entity
         * it's assigned to, which is specified by the {@code availabilityDomain} property of the public IP object.
         * Ephemeral public IPs that are assigned to private IPs have {@code scope} = {@code AVAILABILITY_DOMAIN}.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(Scope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The name of the availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         */
        private String availabilityDomain = null;

        /**
         * The name of the availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * A filter to return only public IPs that match given lifetime.
         *
         */
        private Lifetime lifetime = null;

        /**
         * A filter to return only public IPs that match given lifetime.
         *
         * @param lifetime the value to set
         * @return this builder instance
         */
        public Builder lifetime(Lifetime lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        /**
         * A filter to return only resources that belong to the given public IP pool.
         *
         */
        private String publicIpPoolId = null;

        /**
         * A filter to return only resources that belong to the given public IP pool.
         *
         * @param publicIpPoolId the value to set
         * @return this builder instance
         */
        public Builder publicIpPoolId(String publicIpPoolId) {
            this.publicIpPoolId = publicIpPoolId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListPublicIpsRequest o) {
            scope(o.getScope());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            availabilityDomain(o.getAvailabilityDomain());
            lifetime(o.getLifetime());
            publicIpPoolId(o.getPublicIpPoolId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPublicIpsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListPublicIpsRequest
         */
        public ListPublicIpsRequest build() {
            ListPublicIpsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPublicIpsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPublicIpsRequest
         */
        public ListPublicIpsRequest buildWithoutInvocationCallback() {
            ListPublicIpsRequest request = new ListPublicIpsRequest();
            request.scope = scope;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.availabilityDomain = availabilityDomain;
            request.lifetime = lifetime;
            request.publicIpPoolId = publicIpPoolId;
            return request;
            // new ListPublicIpsRequest(scope, compartmentId, limit, page, availabilityDomain, lifetime, publicIpPoolId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .scope(scope)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .availabilityDomain(availabilityDomain)
                .lifetime(lifetime)
                .publicIpPoolId(publicIpPoolId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",lifetime=").append(String.valueOf(this.lifetime));
        sb.append(",publicIpPoolId=").append(String.valueOf(this.publicIpPoolId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPublicIpsRequest)) {
            return false;
        }

        ListPublicIpsRequest other = (ListPublicIpsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.lifetime, other.lifetime)
                && java.util.Objects.equals(this.publicIpPoolId, other.publicIpPoolId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.lifetime == null ? 43 : this.lifetime.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpPoolId == null ? 43 : this.publicIpPoolId.hashCode());
        return result;
    }
}
