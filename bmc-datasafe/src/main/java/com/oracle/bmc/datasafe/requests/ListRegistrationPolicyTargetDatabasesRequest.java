/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListRegistrationPolicyTargetDatabasesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListRegistrationPolicyTargetDatabasesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListRegistrationPolicyTargetDatabasesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the registration policy to be used for identification */
    private String registrationPolicyId;

    /** The OCID of the registration policy to be used for identification */
    public String getRegistrationPolicyId() {
        return registrationPolicyId;
    }
    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return the target database only if it is registered via the registration policy.
     */
    private String targetDatabaseId;

    /**
     * A filter to return the target database only if it is registered via the registration policy.
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /**
     * Filters registered targets associated with this registration policy by membership status. -
     * OPTIN: returns targets that are included (opted in) by the policy. - OPTOUT: returns targets
     * that are explicitly excluded (opted out) by the policy.
     */
    private MembershipStatus membershipStatus;

    /**
     * Filters registered targets associated with this registration policy by membership status. -
     * OPTIN: returns targets that are included (opted in) by the policy. - OPTOUT: returns targets
     * that are explicitly excluded (opted out) by the policy.
     */
    public enum MembershipStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Optin("OPTIN"),
        Optout("OPTOUT"),
        ;

        private final String value;
        private static java.util.Map<String, MembershipStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MembershipStatus v : MembershipStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        MembershipStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MembershipStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MembershipStatus: " + key);
        }
    };

    /**
     * Filters registered targets associated with this registration policy by membership status. -
     * OPTIN: returns targets that are included (opted in) by the policy. - OPTOUT: returns targets
     * that are explicitly excluded (opted out) by the policy.
     */
    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRegistrationPolicyTargetDatabasesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the registration policy to be used for identification */
        private String registrationPolicyId = null;

        /**
         * The OCID of the registration policy to be used for identification
         *
         * @param registrationPolicyId the value to set
         * @return this builder instance
         */
        public Builder registrationPolicyId(String registrationPolicyId) {
            this.registrationPolicyId = registrationPolicyId;
            return this;
        }

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A filter to return the target database only if it is registered via the registration
         * policy.
         */
        private String targetDatabaseId = null;

        /**
         * A filter to return the target database only if it is registered via the registration
         * policy.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /**
         * Filters registered targets associated with this registration policy by membership status.
         * - OPTIN: returns targets that are included (opted in) by the policy. - OPTOUT: returns
         * targets that are explicitly excluded (opted out) by the policy.
         */
        private MembershipStatus membershipStatus = null;

        /**
         * Filters registered targets associated with this registration policy by membership status.
         * - OPTIN: returns targets that are included (opted in) by the policy. - OPTOUT: returns
         * targets that are explicitly excluded (opted out) by the policy.
         *
         * @param membershipStatus the value to set
         * @return this builder instance
         */
        public Builder membershipStatus(MembershipStatus membershipStatus) {
            this.membershipStatus = membershipStatus;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListRegistrationPolicyTargetDatabasesRequest o) {
            registrationPolicyId(o.getRegistrationPolicyId());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            targetDatabaseId(o.getTargetDatabaseId());
            membershipStatus(o.getMembershipStatus());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRegistrationPolicyTargetDatabasesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRegistrationPolicyTargetDatabasesRequest
         */
        public ListRegistrationPolicyTargetDatabasesRequest build() {
            ListRegistrationPolicyTargetDatabasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRegistrationPolicyTargetDatabasesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRegistrationPolicyTargetDatabasesRequest
         */
        public ListRegistrationPolicyTargetDatabasesRequest buildWithoutInvocationCallback() {
            ListRegistrationPolicyTargetDatabasesRequest request =
                    new ListRegistrationPolicyTargetDatabasesRequest();
            request.registrationPolicyId = registrationPolicyId;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.targetDatabaseId = targetDatabaseId;
            request.membershipStatus = membershipStatus;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListRegistrationPolicyTargetDatabasesRequest(registrationPolicyId, compartmentId,
            // opcRequestId, targetDatabaseId, membershipStatus, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registrationPolicyId(registrationPolicyId)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .targetDatabaseId(targetDatabaseId)
                .membershipStatus(membershipStatus)
                .limit(limit)
                .page(page);
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
        sb.append(",registrationPolicyId=").append(String.valueOf(this.registrationPolicyId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",membershipStatus=").append(String.valueOf(this.membershipStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRegistrationPolicyTargetDatabasesRequest)) {
            return false;
        }

        ListRegistrationPolicyTargetDatabasesRequest other =
                (ListRegistrationPolicyTargetDatabasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registrationPolicyId, other.registrationPolicyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.membershipStatus, other.membershipStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.registrationPolicyId == null
                                ? 43
                                : this.registrationPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.membershipStatus == null ? 43 : this.membershipStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
