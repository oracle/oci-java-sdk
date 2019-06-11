/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListPublicIpsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * `REGION`: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private IP
     * in any availability domain in the region. Reserved public IPs have `scope` = `REGION`, as do
     * ephemeral public IPs assigned to a regional entity.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have `scope` = `AVAILABILITY_DOMAIN`.
     *
     */
    private Scope scope;

    /**
     * Whether the public IP is regional or specific to a particular availability domain.
     * <p>
     * `REGION`: The public IP exists within a region and is assigned to a regional entity
     * (such as a {@link NatGateway}), or can be assigned to a private IP
     * in any availability domain in the region. Reserved public IPs have `scope` = `REGION`, as do
     * ephemeral public IPs assigned to a regional entity.
     * <p>
     * `AVAILABILITY_DOMAIN`: The public IP exists within the availability domain of the entity
     * it's assigned to, which is specified by the `availabilityDomain` property of the public IP object.
     * Ephemeral public IPs that are assigned to private IPs have `scope` = `AVAILABILITY_DOMAIN`.
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
            throw new RuntimeException("Invalid Scope: " + key);
        }
    };

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * \"List\" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: `50`
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the `opc-next-page` response header from the previous \"List\"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The name of the availability domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

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
            throw new RuntimeException("Invalid Lifetime: " + key);
        }
    };

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
    }
}
