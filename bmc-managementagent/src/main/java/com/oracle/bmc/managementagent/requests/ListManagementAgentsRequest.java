/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListManagementAgentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ListManagementAgentsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment to which a request will be scoped.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment to which a request will be scoped.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Filter to return only Management Agents having the particular Plugin installed. A special pluginName of 'None' can be provided and this will return only Management Agents having no plugin installed.
     */
    private java.util.List<String> pluginName;

    /**
     * Filter to return only Management Agents having the particular Plugin installed. A special pluginName of 'None' can be provided and this will return only Management Agents having no plugin installed.
     */
    public java.util.List<String> getPluginName() {
        return pluginName;
    }
    /**
     * Filter to return only Management Agents having the particular agent version.
     */
    private java.util.List<String> version;

    /**
     * Filter to return only Management Agents having the particular agent version.
     */
    public java.util.List<String> getVersion() {
        return version;
    }
    /**
     * Filter to return only Management Agents having the particular display name.
     */
    private String displayName;

    /**
     * Filter to return only Management Agents having the particular display name.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Filter to return only Management Agents in the particular lifecycle state.
     */
    private com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState;

    /**
     * Filter to return only Management Agents in the particular lifecycle state.
     */
    public com.oracle.bmc.managementagent.model.LifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Filter to return only Management Agents in the particular availability status.
     */
    private com.oracle.bmc.managementagent.model.AvailabilityStatus availabilityStatus;

    /**
     * Filter to return only Management Agents in the particular availability status.
     */
    public com.oracle.bmc.managementagent.model.AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }
    /**
     * Filter to return only Management Agents having the particular agent host id.
     */
    private String hostId;

    /**
     * Filter to return only Management Agents having the particular agent host id.
     */
    public String getHostId() {
        return hostId;
    }
    /**
     * Filter to return only results having the particular platform type.
     */
    private java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType;

    /**
     * Filter to return only results having the particular platform type.
     */
    public java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> getPlatformType() {
        return platformType;
    }
    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     */
    private Boolean isCustomerDeployed;

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     */
    public Boolean getIsCustomerDeployed() {
        return isCustomerDeployed;
    }
    /**
     * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
     */
    private com.oracle.bmc.managementagent.model.InstallTypes installType;

    /**
     * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
     */
    public com.oracle.bmc.managementagent.model.InstallTypes getInstallType() {
        return installType;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    public enum SortOrder {
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

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        Host("host"),
        AvailabilityStatus("availabilityStatus"),
        PlatformType("platformType"),
        PluginDisplayNames("pluginDisplayNames"),
        Version("version"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * if set to true then it fetches resources for all compartments where user has access to else only on the compartment specified.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * if set to true then it fetches resources for all compartments where user has access to else only on the compartment specified.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * When the value is "ACCESSIBLE", insufficient permissions for a compartment will filter out resources in that compartment without rejecting the request.
     *
     */
    private String accessLevel;

    /**
     * When the value is "ACCESSIBLE", insufficient permissions for a compartment will filter out resources in that compartment without rejecting the request.
     *
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagementAgentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Filter to return only Management Agents having the particular Plugin installed. A special pluginName of 'None' can be provided and this will return only Management Agents having no plugin installed.
         */
        private java.util.List<String> pluginName = null;

        /**
         * Filter to return only Management Agents having the particular Plugin installed. A special pluginName of 'None' can be provided and this will return only Management Agents having no plugin installed.
         * @param pluginName the value to set
         * @return this builder instance
         */
        public Builder pluginName(java.util.List<String> pluginName) {
            this.pluginName = pluginName;
            return this;
        }

        /**
         * Singular setter. Filter to return only Management Agents having the particular Plugin installed. A special pluginName of 'None' can be provided and this will return only Management Agents having no plugin installed.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder pluginName(String singularValue) {
            return this.pluginName(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter to return only Management Agents having the particular agent version.
         */
        private java.util.List<String> version = null;

        /**
         * Filter to return only Management Agents having the particular agent version.
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(java.util.List<String> version) {
            this.version = version;
            return this;
        }

        /**
         * Singular setter. Filter to return only Management Agents having the particular agent version.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder version(String singularValue) {
            return this.version(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter to return only Management Agents having the particular display name.
         */
        private String displayName = null;

        /**
         * Filter to return only Management Agents having the particular display name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Filter to return only Management Agents in the particular lifecycle state.
         */
        private com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState = null;

        /**
         * Filter to return only Management Agents in the particular lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Filter to return only Management Agents in the particular availability status.
         */
        private com.oracle.bmc.managementagent.model.AvailabilityStatus availabilityStatus = null;

        /**
         * Filter to return only Management Agents in the particular availability status.
         * @param availabilityStatus the value to set
         * @return this builder instance
         */
        public Builder availabilityStatus(
                com.oracle.bmc.managementagent.model.AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        /**
         * Filter to return only Management Agents having the particular agent host id.
         */
        private String hostId = null;

        /**
         * Filter to return only Management Agents having the particular agent host id.
         * @param hostId the value to set
         * @return this builder instance
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Filter to return only results having the particular platform type.
         */
        private java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType =
                null;

        /**
         * Filter to return only results having the particular platform type.
         * @param platformType the value to set
         * @return this builder instance
         */
        public Builder platformType(
                java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * Singular setter. Filter to return only results having the particular platform type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder platformType(PlatformTypes singularValue) {
            return this.platformType(java.util.Arrays.asList(singularValue));
        }

        /**
         * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
         */
        private Boolean isCustomerDeployed = null;

        /**
         * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
         * @param isCustomerDeployed the value to set
         * @return this builder instance
         */
        public Builder isCustomerDeployed(Boolean isCustomerDeployed) {
            this.isCustomerDeployed = isCustomerDeployed;
            return this;
        }

        /**
         * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
         */
        private com.oracle.bmc.managementagent.model.InstallTypes installType = null;

        /**
         * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
         * @param installType the value to set
         * @return this builder instance
         */
        public Builder installType(com.oracle.bmc.managementagent.model.InstallTypes installType) {
            this.installType = installType;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * if set to true then it fetches resources for all compartments where user has access to else only on the compartment specified.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * if set to true then it fetches resources for all compartments where user has access to else only on the compartment specified.
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * When the value is "ACCESSIBLE", insufficient permissions for a compartment will filter out resources in that compartment without rejecting the request.
         *
         */
        private String accessLevel = null;

        /**
         * When the value is "ACCESSIBLE", insufficient permissions for a compartment will filter out resources in that compartment without rejecting the request.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
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
        public Builder copy(ListManagementAgentsRequest o) {
            compartmentId(o.getCompartmentId());
            pluginName(o.getPluginName());
            version(o.getVersion());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            availabilityStatus(o.getAvailabilityStatus());
            hostId(o.getHostId());
            platformType(o.getPlatformType());
            isCustomerDeployed(o.getIsCustomerDeployed());
            installType(o.getInstallType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListManagementAgentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListManagementAgentsRequest
         */
        public ListManagementAgentsRequest build() {
            ListManagementAgentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagementAgentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagementAgentsRequest
         */
        public ListManagementAgentsRequest buildWithoutInvocationCallback() {
            ListManagementAgentsRequest request = new ListManagementAgentsRequest();
            request.compartmentId = compartmentId;
            request.pluginName = pluginName;
            request.version = version;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.availabilityStatus = availabilityStatus;
            request.hostId = hostId;
            request.platformType = platformType;
            request.isCustomerDeployed = isCustomerDeployed;
            request.installType = installType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            return request;
            // new ListManagementAgentsRequest(compartmentId, pluginName, version, displayName, lifecycleState, availabilityStatus, hostId, platformType, isCustomerDeployed, installType, limit, page, sortOrder, sortBy, opcRequestId, compartmentIdInSubtree, accessLevel);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .pluginName(pluginName)
                .version(version)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .availabilityStatus(availabilityStatus)
                .hostId(hostId)
                .platformType(platformType)
                .isCustomerDeployed(isCustomerDeployed)
                .installType(installType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",pluginName=").append(String.valueOf(this.pluginName));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(",hostId=").append(String.valueOf(this.hostId));
        sb.append(",platformType=").append(String.valueOf(this.platformType));
        sb.append(",isCustomerDeployed=").append(String.valueOf(this.isCustomerDeployed));
        sb.append(",installType=").append(String.valueOf(this.installType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListManagementAgentsRequest)) {
            return false;
        }

        ListManagementAgentsRequest other = (ListManagementAgentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.isCustomerDeployed, other.isCustomerDeployed)
                && java.util.Objects.equals(this.installType, other.installType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomerDeployed == null
                                ? 43
                                : this.isCustomerDeployed.hashCode());
        result = (result * PRIME) + (this.installType == null ? 43 : this.installType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        return result;
    }
}
