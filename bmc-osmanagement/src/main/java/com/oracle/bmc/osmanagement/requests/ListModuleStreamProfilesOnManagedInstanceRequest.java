/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamProfilesOnManagedInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListModuleStreamProfilesOnManagedInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class ListModuleStreamProfilesOnManagedInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** OCID for the managed instance */
    private String managedInstanceId;

    /** OCID for the managed instance */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * The ID of the compartment in which to list resources. This parameter is optional and in some
     * cases may have no effect.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources. This parameter is optional and in some
     * cases may have no effect.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The name of a module. This parameter is required if a streamName is specified. */
    private String moduleName;

    /** The name of a module. This parameter is required if a streamName is specified. */
    public String getModuleName() {
        return moduleName;
    }
    /**
     * The name of the stream of the containing module. This parameter is required if a profileName
     * is specified.
     */
    private String streamName;

    /**
     * The name of the stream of the containing module. This parameter is required if a profileName
     * is specified.
     */
    public String getStreamName() {
        return streamName;
    }
    /** The name of the profile of the containing module stream */
    private String profileName;

    /** The name of the profile of the containing module stream */
    public String getProfileName() {
        return profileName;
    }
    /**
     * The status of the profile.
     *
     * <p>A profile with the "INSTALLED" status indicates that the profile has been installed.
     *
     * <p>A profile with the "AVAILABLE" status indicates that the profile is not installed, but can
     * be.
     */
    private ProfileStatus profileStatus;

    /**
     * The status of the profile.
     *
     * <p>A profile with the "INSTALLED" status indicates that the profile has been installed.
     *
     * <p>A profile with the "AVAILABLE" status indicates that the profile is not installed, but can
     * be.
     */
    public enum ProfileStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Installed("INSTALLED"),
        Available("AVAILABLE"),
        ;

        private final String value;
        private static java.util.Map<String, ProfileStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ProfileStatus v : ProfileStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProfileStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProfileStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProfileStatus: " + key);
        }
    };

    /**
     * The status of the profile.
     *
     * <p>A profile with the "INSTALLED" status indicates that the profile has been installed.
     *
     * <p>A profile with the "AVAILABLE" status indicates that the profile is not installed, but can
     * be.
     */
    public ProfileStatus getProfileStatus() {
        return profileStatus;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
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

    /** The sort order to use, either 'asc' or 'desc'. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListModuleStreamProfilesOnManagedInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID for the managed instance */
        private String managedInstanceId = null;

        /**
         * OCID for the managed instance
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * The ID of the compartment in which to list resources. This parameter is optional and in
         * some cases may have no effect.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources. This parameter is optional and in
         * some cases may have no effect.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The name of a module. This parameter is required if a streamName is specified. */
        private String moduleName = null;

        /**
         * The name of a module. This parameter is required if a streamName is specified.
         *
         * @param moduleName the value to set
         * @return this builder instance
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * The name of the stream of the containing module. This parameter is required if a
         * profileName is specified.
         */
        private String streamName = null;

        /**
         * The name of the stream of the containing module. This parameter is required if a
         * profileName is specified.
         *
         * @param streamName the value to set
         * @return this builder instance
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }

        /** The name of the profile of the containing module stream */
        private String profileName = null;

        /**
         * The name of the profile of the containing module stream
         *
         * @param profileName the value to set
         * @return this builder instance
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        /**
         * The status of the profile.
         *
         * <p>A profile with the "INSTALLED" status indicates that the profile has been installed.
         *
         * <p>A profile with the "AVAILABLE" status indicates that the profile is not installed, but
         * can be.
         */
        private ProfileStatus profileStatus = null;

        /**
         * The status of the profile.
         *
         * <p>A profile with the "INSTALLED" status indicates that the profile has been installed.
         *
         * <p>A profile with the "AVAILABLE" status indicates that the profile is not installed, but
         * can be.
         *
         * @param profileStatus the value to set
         * @return this builder instance
         */
        public Builder profileStatus(ProfileStatus profileStatus) {
            this.profileStatus = profileStatus;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListModuleStreamProfilesOnManagedInstanceRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            compartmentId(o.getCompartmentId());
            moduleName(o.getModuleName());
            streamName(o.getStreamName());
            profileName(o.getProfileName());
            profileStatus(o.getProfileStatus());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListModuleStreamProfilesOnManagedInstanceRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListModuleStreamProfilesOnManagedInstanceRequest
         */
        public ListModuleStreamProfilesOnManagedInstanceRequest build() {
            ListModuleStreamProfilesOnManagedInstanceRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListModuleStreamProfilesOnManagedInstanceRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListModuleStreamProfilesOnManagedInstanceRequest
         */
        public ListModuleStreamProfilesOnManagedInstanceRequest buildWithoutInvocationCallback() {
            ListModuleStreamProfilesOnManagedInstanceRequest request =
                    new ListModuleStreamProfilesOnManagedInstanceRequest();
            request.managedInstanceId = managedInstanceId;
            request.compartmentId = compartmentId;
            request.moduleName = moduleName;
            request.streamName = streamName;
            request.profileName = profileName;
            request.profileStatus = profileStatus;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListModuleStreamProfilesOnManagedInstanceRequest(managedInstanceId,
            // compartmentId, moduleName, streamName, profileName, profileStatus, limit, page,
            // sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .compartmentId(compartmentId)
                .moduleName(moduleName)
                .streamName(streamName)
                .profileName(profileName)
                .profileStatus(profileStatus)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",moduleName=").append(String.valueOf(this.moduleName));
        sb.append(",streamName=").append(String.valueOf(this.streamName));
        sb.append(",profileName=").append(String.valueOf(this.profileName));
        sb.append(",profileStatus=").append(String.valueOf(this.profileStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListModuleStreamProfilesOnManagedInstanceRequest)) {
            return false;
        }

        ListModuleStreamProfilesOnManagedInstanceRequest other =
                (ListModuleStreamProfilesOnManagedInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.profileStatus, other.profileStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result =
                (result * PRIME)
                        + (this.profileStatus == null ? 43 : this.profileStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
