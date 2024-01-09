/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceAnalyticContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetManagedInstanceAnalyticContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetManagedInstanceAnalyticContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * This compartmentId is used to list managed instances within a compartment. Or serve as an
     * additional filter to restrict only managed instances with in certain compartment if other
     * filter presents.
     */
    private String compartmentId;

    /**
     * This compartmentId is used to list managed instances within a compartment. Or serve as an
     * additional filter to restrict only managed instances with in certain compartment if other
     * filter presents.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The OCID of the managed instance group for which to list resources. */
    private String managedInstanceGroupId;

    /** The OCID of the managed instance group for which to list resources. */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /** The OCID of the lifecycle environment. */
    private String lifecycleEnvironmentId;

    /** The OCID of the lifecycle environment. */
    public String getLifecycleEnvironmentId() {
        return lifecycleEnvironmentId;
    }
    /** The OCID of the lifecycle stage for which to list resources. */
    private String lifecycleStageId;

    /** The OCID of the lifecycle stage for which to list resources. */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /** A filter to return only instances whose managed instance status matches the given status. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status;

    /** A filter to return only instances whose managed instance status matches the given status. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> getStatus() {
        return status;
    }
    /** A filter to return resources that match the given display names. */
    private java.util.List<String> displayName;

    /** A filter to return resources that match the given display names. */
    public java.util.List<String> getDisplayName() {
        return displayName;
    }
    /** A filter to return resources that may partially match the given display name. */
    private String displayNameContains;

    /** A filter to return resources that may partially match the given display name. */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /** Filter instances by Location. Used when report target type is compartment or group. */
    private com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation instanceLocation;

    /** Filter instances by Location. Used when report target type is compartment or group. */
    public com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation getInstanceLocation() {
        return instanceLocation;
    }
    /**
     * A filter to return instances with number of available security updates equals to the number
     * specified.
     */
    private Integer securityUpdatesAvailableEqualsTo;

    /**
     * A filter to return instances with number of available security updates equals to the number
     * specified.
     */
    public Integer getSecurityUpdatesAvailableEqualsTo() {
        return securityUpdatesAvailableEqualsTo;
    }
    /**
     * A filter to return instances with number of available bug updates equals to the number
     * specified.
     */
    private Integer bugUpdatesAvailableEqualsTo;

    /**
     * A filter to return instances with number of available bug updates equals to the number
     * specified.
     */
    public Integer getBugUpdatesAvailableEqualsTo() {
        return bugUpdatesAvailableEqualsTo;
    }
    /**
     * A filter to return instances with number of available security updates greater than the
     * number specified.
     */
    private Integer securityUpdatesAvailableGreaterThan;

    /**
     * A filter to return instances with number of available security updates greater than the
     * number specified.
     */
    public Integer getSecurityUpdatesAvailableGreaterThan() {
        return securityUpdatesAvailableGreaterThan;
    }
    /**
     * A filter to return instances with number of available bug updates greater than the number
     * specified.
     */
    private Integer bugUpdatesAvailableGreaterThan;

    /**
     * A filter to return instances with number of available bug updates greater than the number
     * specified.
     */
    public Integer getBugUpdatesAvailableGreaterThan() {
        return bugUpdatesAvailableGreaterThan;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetManagedInstanceAnalyticContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This compartmentId is used to list managed instances within a compartment. Or serve as an
         * additional filter to restrict only managed instances with in certain compartment if other
         * filter presents.
         */
        private String compartmentId = null;

        /**
         * This compartmentId is used to list managed instances within a compartment. Or serve as an
         * additional filter to restrict only managed instances with in certain compartment if other
         * filter presents.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The OCID of the managed instance group for which to list resources. */
        private String managedInstanceGroupId = null;

        /**
         * The OCID of the managed instance group for which to list resources.
         *
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /** The OCID of the lifecycle environment. */
        private String lifecycleEnvironmentId = null;

        /**
         * The OCID of the lifecycle environment.
         *
         * @param lifecycleEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironmentId(String lifecycleEnvironmentId) {
            this.lifecycleEnvironmentId = lifecycleEnvironmentId;
            return this;
        }

        /** The OCID of the lifecycle stage for which to list resources. */
        private String lifecycleStageId = null;

        /**
         * The OCID of the lifecycle stage for which to list resources.
         *
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /**
         * A filter to return only instances whose managed instance status matches the given status.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status =
                null;

        /**
         * A filter to return only instances whose managed instance status matches the given status.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only instances whose managed instance status matches
         * the given status.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(ManagedInstanceStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return resources that match the given display names. */
        private java.util.List<String> displayName = null;

        /**
         * A filter to return resources that match the given display names.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(java.util.List<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the given display names.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder displayName(String singularValue) {
            return this.displayName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return resources that may partially match the given display name. */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /** Filter instances by Location. Used when report target type is compartment or group. */
        private com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation instanceLocation =
                null;

        /**
         * Filter instances by Location. Used when report target type is compartment or group.
         *
         * @param instanceLocation the value to set
         * @return this builder instance
         */
        public Builder instanceLocation(
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation instanceLocation) {
            this.instanceLocation = instanceLocation;
            return this;
        }

        /**
         * A filter to return instances with number of available security updates equals to the
         * number specified.
         */
        private Integer securityUpdatesAvailableEqualsTo = null;

        /**
         * A filter to return instances with number of available security updates equals to the
         * number specified.
         *
         * @param securityUpdatesAvailableEqualsTo the value to set
         * @return this builder instance
         */
        public Builder securityUpdatesAvailableEqualsTo(Integer securityUpdatesAvailableEqualsTo) {
            this.securityUpdatesAvailableEqualsTo = securityUpdatesAvailableEqualsTo;
            return this;
        }

        /**
         * A filter to return instances with number of available bug updates equals to the number
         * specified.
         */
        private Integer bugUpdatesAvailableEqualsTo = null;

        /**
         * A filter to return instances with number of available bug updates equals to the number
         * specified.
         *
         * @param bugUpdatesAvailableEqualsTo the value to set
         * @return this builder instance
         */
        public Builder bugUpdatesAvailableEqualsTo(Integer bugUpdatesAvailableEqualsTo) {
            this.bugUpdatesAvailableEqualsTo = bugUpdatesAvailableEqualsTo;
            return this;
        }

        /**
         * A filter to return instances with number of available security updates greater than the
         * number specified.
         */
        private Integer securityUpdatesAvailableGreaterThan = null;

        /**
         * A filter to return instances with number of available security updates greater than the
         * number specified.
         *
         * @param securityUpdatesAvailableGreaterThan the value to set
         * @return this builder instance
         */
        public Builder securityUpdatesAvailableGreaterThan(
                Integer securityUpdatesAvailableGreaterThan) {
            this.securityUpdatesAvailableGreaterThan = securityUpdatesAvailableGreaterThan;
            return this;
        }

        /**
         * A filter to return instances with number of available bug updates greater than the number
         * specified.
         */
        private Integer bugUpdatesAvailableGreaterThan = null;

        /**
         * A filter to return instances with number of available bug updates greater than the number
         * specified.
         *
         * @param bugUpdatesAvailableGreaterThan the value to set
         * @return this builder instance
         */
        public Builder bugUpdatesAvailableGreaterThan(Integer bugUpdatesAvailableGreaterThan) {
            this.bugUpdatesAvailableGreaterThan = bugUpdatesAvailableGreaterThan;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(GetManagedInstanceAnalyticContentRequest o) {
            compartmentId(o.getCompartmentId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            lifecycleEnvironmentId(o.getLifecycleEnvironmentId());
            lifecycleStageId(o.getLifecycleStageId());
            status(o.getStatus());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            instanceLocation(o.getInstanceLocation());
            securityUpdatesAvailableEqualsTo(o.getSecurityUpdatesAvailableEqualsTo());
            bugUpdatesAvailableEqualsTo(o.getBugUpdatesAvailableEqualsTo());
            securityUpdatesAvailableGreaterThan(o.getSecurityUpdatesAvailableGreaterThan());
            bugUpdatesAvailableGreaterThan(o.getBugUpdatesAvailableGreaterThan());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetManagedInstanceAnalyticContentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetManagedInstanceAnalyticContentRequest
         */
        public GetManagedInstanceAnalyticContentRequest build() {
            GetManagedInstanceAnalyticContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetManagedInstanceAnalyticContentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetManagedInstanceAnalyticContentRequest
         */
        public GetManagedInstanceAnalyticContentRequest buildWithoutInvocationCallback() {
            GetManagedInstanceAnalyticContentRequest request =
                    new GetManagedInstanceAnalyticContentRequest();
            request.compartmentId = compartmentId;
            request.managedInstanceGroupId = managedInstanceGroupId;
            request.lifecycleEnvironmentId = lifecycleEnvironmentId;
            request.lifecycleStageId = lifecycleStageId;
            request.status = status;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.instanceLocation = instanceLocation;
            request.securityUpdatesAvailableEqualsTo = securityUpdatesAvailableEqualsTo;
            request.bugUpdatesAvailableEqualsTo = bugUpdatesAvailableEqualsTo;
            request.securityUpdatesAvailableGreaterThan = securityUpdatesAvailableGreaterThan;
            request.bugUpdatesAvailableGreaterThan = bugUpdatesAvailableGreaterThan;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetManagedInstanceAnalyticContentRequest(compartmentId, managedInstanceGroupId,
            // lifecycleEnvironmentId, lifecycleStageId, status, displayName, displayNameContains,
            // instanceLocation, securityUpdatesAvailableEqualsTo, bugUpdatesAvailableEqualsTo,
            // securityUpdatesAvailableGreaterThan, bugUpdatesAvailableGreaterThan, opcRequestId);
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
                .managedInstanceGroupId(managedInstanceGroupId)
                .lifecycleEnvironmentId(lifecycleEnvironmentId)
                .lifecycleStageId(lifecycleStageId)
                .status(status)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .instanceLocation(instanceLocation)
                .securityUpdatesAvailableEqualsTo(securityUpdatesAvailableEqualsTo)
                .bugUpdatesAvailableEqualsTo(bugUpdatesAvailableEqualsTo)
                .securityUpdatesAvailableGreaterThan(securityUpdatesAvailableGreaterThan)
                .bugUpdatesAvailableGreaterThan(bugUpdatesAvailableGreaterThan)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",lifecycleEnvironmentId=").append(String.valueOf(this.lifecycleEnvironmentId));
        sb.append(",lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",instanceLocation=").append(String.valueOf(this.instanceLocation));
        sb.append(",securityUpdatesAvailableEqualsTo=")
                .append(String.valueOf(this.securityUpdatesAvailableEqualsTo));
        sb.append(",bugUpdatesAvailableEqualsTo=")
                .append(String.valueOf(this.bugUpdatesAvailableEqualsTo));
        sb.append(",securityUpdatesAvailableGreaterThan=")
                .append(String.valueOf(this.securityUpdatesAvailableGreaterThan));
        sb.append(",bugUpdatesAvailableGreaterThan=")
                .append(String.valueOf(this.bugUpdatesAvailableGreaterThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManagedInstanceAnalyticContentRequest)) {
            return false;
        }

        GetManagedInstanceAnalyticContentRequest other =
                (GetManagedInstanceAnalyticContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.managedInstanceGroupId, other.managedInstanceGroupId)
                && java.util.Objects.equals(
                        this.lifecycleEnvironmentId, other.lifecycleEnvironmentId)
                && java.util.Objects.equals(this.lifecycleStageId, other.lifecycleStageId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.instanceLocation, other.instanceLocation)
                && java.util.Objects.equals(
                        this.securityUpdatesAvailableEqualsTo,
                        other.securityUpdatesAvailableEqualsTo)
                && java.util.Objects.equals(
                        this.bugUpdatesAvailableEqualsTo, other.bugUpdatesAvailableEqualsTo)
                && java.util.Objects.equals(
                        this.securityUpdatesAvailableGreaterThan,
                        other.securityUpdatesAvailableGreaterThan)
                && java.util.Objects.equals(
                        this.bugUpdatesAvailableGreaterThan, other.bugUpdatesAvailableGreaterThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.managedInstanceGroupId == null
                                ? 43
                                : this.managedInstanceGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironmentId == null
                                ? 43
                                : this.lifecycleEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStageId == null ? 43 : this.lifecycleStageId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLocation == null ? 43 : this.instanceLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.securityUpdatesAvailableEqualsTo == null
                                ? 43
                                : this.securityUpdatesAvailableEqualsTo.hashCode());
        result =
                (result * PRIME)
                        + (this.bugUpdatesAvailableEqualsTo == null
                                ? 43
                                : this.bugUpdatesAvailableEqualsTo.hashCode());
        result =
                (result * PRIME)
                        + (this.securityUpdatesAvailableGreaterThan == null
                                ? 43
                                : this.securityUpdatesAvailableGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.bugUpdatesAvailableGreaterThan == null
                                ? 43
                                : this.bugUpdatesAvailableGreaterThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
