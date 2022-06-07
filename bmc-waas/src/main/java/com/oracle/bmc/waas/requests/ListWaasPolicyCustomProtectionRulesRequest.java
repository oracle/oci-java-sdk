/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListWaasPolicyCustomProtectionRulesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWaasPolicyCustomProtectionRulesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ListWaasPolicyCustomProtectionRulesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    public String getWaasPolicyId() {
        return waasPolicyId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous paginated call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Filter rules using a list of ModSecurity rule IDs.
     */
    private java.util.List<String> modSecurityRuleId;

    public java.util.List<String> getModSecurityRuleId() {
        return modSecurityRuleId;
    }
    /**
     * Filter rules using a list of actions.
     */
    private java.util.List<Action> action;

    /**
     * Filter rules using a list of actions.
     **/
    public enum Action {
        Detect("DETECT"),
        Block("BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };

    public java.util.List<Action> getAction() {
        return action;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWaasPolicyCustomProtectionRulesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String waasPolicyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         * @return this builder instance
         */
        public Builder waasPolicyId(String waasPolicyId) {
            this.waasPolicyId = waasPolicyId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous paginated call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private java.util.List<String> modSecurityRuleId = null;

        /**
         * Filter rules using a list of ModSecurity rule IDs.
         * @return this builder instance
         */
        public Builder modSecurityRuleId(java.util.List<String> modSecurityRuleId) {
            this.modSecurityRuleId = modSecurityRuleId;
            return this;
        }

        /**
         * Singular setter. Filter rules using a list of ModSecurity rule IDs.
         * @return this builder instance
         */
        public Builder modSecurityRuleId(String singularValue) {
            return this.modSecurityRuleId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Action> action = null;

        /**
         * Filter rules using a list of actions.
         * @return this builder instance
         */
        public Builder action(java.util.List<Action> action) {
            this.action = action;
            return this;
        }

        /**
         * Singular setter. Filter rules using a list of actions.
         * @return this builder instance
         */
        public Builder action(Action singularValue) {
            return this.action(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListWaasPolicyCustomProtectionRulesRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            modSecurityRuleId(o.getModSecurityRuleId());
            action(o.getAction());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWaasPolicyCustomProtectionRulesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWaasPolicyCustomProtectionRulesRequest
         */
        public ListWaasPolicyCustomProtectionRulesRequest build() {
            ListWaasPolicyCustomProtectionRulesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWaasPolicyCustomProtectionRulesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWaasPolicyCustomProtectionRulesRequest
         */
        public ListWaasPolicyCustomProtectionRulesRequest buildWithoutInvocationCallback() {
            ListWaasPolicyCustomProtectionRulesRequest request =
                    new ListWaasPolicyCustomProtectionRulesRequest();
            request.waasPolicyId = waasPolicyId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.modSecurityRuleId = modSecurityRuleId;
            request.action = action;
            return request;
            // new ListWaasPolicyCustomProtectionRulesRequest(waasPolicyId, opcRequestId, limit, page, modSecurityRuleId, action);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .waasPolicyId(waasPolicyId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .modSecurityRuleId(modSecurityRuleId)
                .action(action);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",waasPolicyId=").append(String.valueOf(this.waasPolicyId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",modSecurityRuleId=").append(String.valueOf(this.modSecurityRuleId));
        sb.append(",action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWaasPolicyCustomProtectionRulesRequest)) {
            return false;
        }

        ListWaasPolicyCustomProtectionRulesRequest other =
                (ListWaasPolicyCustomProtectionRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.modSecurityRuleId, other.modSecurityRuleId)
                && java.util.Objects.equals(this.action, other.action);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.modSecurityRuleId == null ? 43 : this.modSecurityRuleId.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }
}
