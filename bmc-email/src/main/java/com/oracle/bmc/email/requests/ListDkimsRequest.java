/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/ListDkimsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDkimsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListDkimsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain to which this DKIM belongs.
     *
     */
    private String emailDomainId;

    /**
     * The request ID for tracing from the system
     */
    private String opcRequestId;

    /**
     * A filter to only return resources that match the given id exactly.
     *
     */
    private String id;

    /**
     * A filter to only return resources that match the given name exactly.
     *
     */
    private String name;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For important details about
     * how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List" call.
     * For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The sort order to use, either ascending or descending order.
     *
     */
    private com.oracle.bmc.email.model.SortOrder sortOrder;

    /**
     * Filter returned list by specified lifecycle state. This parameter is case-insensitive.
     *
     */
    private com.oracle.bmc.email.model.Dkim.LifecycleState lifecycleState;

    /**
     * Specifies the attribute with which to sort the DKIMs.
     * <p>
     * Default: {@code TIMECREATED}
     * <p>
     * **TIMECREATED:** Sorts by timeCreated.
     * * **NAME:** Sorts by name.
     * * **ID:** Sorts by id.
     *
     */
    private SortBy sortBy;

    /**
     * Specifies the attribute with which to sort the DKIMs.
     * <p>
     * Default: {@code TIMECREATED}
     * <p>
     * **TIMECREATED:** Sorts by timeCreated.
     * * **NAME:** Sorts by name.
     * * **ID:** Sorts by id.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Id("ID"),
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDkimsRequest, java.lang.Void> {
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
        public Builder copy(ListDkimsRequest o) {
            emailDomainId(o.getEmailDomainId());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDkimsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDkimsRequest
         */
        public ListDkimsRequest build() {
            ListDkimsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
