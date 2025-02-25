/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceAnalyticContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetManagedInstanceAnalyticContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetManagedInstanceAnalyticContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * This filter returns only resources contained within the specified compartment.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * This filter returns only resources contained within the specified compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group. This filter returns resources associated with this group.
     */
    private String managedInstanceGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group. This filter returns resources associated with this group.
     */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment. This filter returns only resource contained with the specified lifecycle environment.
     */
    private String lifecycleEnvironmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment. This filter returns only resource contained with the specified lifecycle environment.
     */
    public String getLifecycleEnvironmentId() {
        return lifecycleEnvironmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    private String lifecycleStageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /**
     * A filter to return only managed instances whose status matches the status provided.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status;

    /**
     * A filter to return only managed instances whose status matches the status provided.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> getStatus() {
        return status;
    }
    /**
     * A filter to return resources that match the given display names.
     */
    private java.util.List<String> displayName;

    /**
     * A filter to return resources that match the given display names.
     */
    public java.util.List<String> getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return resources that may partially match the given display name.
     */
    private String displayNameContains;

    /**
     * A filter to return resources that may partially match the given display name.
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * A filter to return instances that have the specified number of available security updates.
     */
    private Integer securityUpdatesAvailableEqualsTo;

    /**
     * A filter to return instances that have the specified number of available security updates.
     */
    public Integer getSecurityUpdatesAvailableEqualsTo() {
        return securityUpdatesAvailableEqualsTo;
    }
    /**
     * A filter to return instances that have the specified number of available bug updates.
     */
    private Integer bugUpdatesAvailableEqualsTo;

    /**
     * A filter to return instances that have the specified number of available bug updates.
     */
    public Integer getBugUpdatesAvailableEqualsTo() {
        return bugUpdatesAvailableEqualsTo;
    }
    /**
     * A filter to return instances that have more available security updates than the number specified.
     */
    private Integer securityUpdatesAvailableGreaterThan;

    /**
     * A filter to return instances that have more available security updates than the number specified.
     */
    public Integer getSecurityUpdatesAvailableGreaterThan() {
        return securityUpdatesAvailableGreaterThan;
    }
    /**
     * A filter to return instances that have more available bug updates than the number specified.
     */
    private Integer bugUpdatesAvailableGreaterThan;

    /**
     * A filter to return instances that have more available bug updates than the number specified.
     */
    public Integer getBugUpdatesAvailableGreaterThan() {
        return bugUpdatesAvailableGreaterThan;
    }
    /**
     * A filter to return only resources whose location matches the given value.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation> location;

    /**
     * A filter to return only resources whose location matches the given value.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocation() {
        return location;
    }
    /**
     * A filter to return only resources whose location does not match the given value.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            locationNotEqualTo;

    /**
     * A filter to return only resources whose location does not match the given value.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocationNotEqualTo() {
        return locationNotEqualTo;
    }
    /**
     * A filter to return only resources that match the given operating system family.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily;

    /**
     * A filter to return only resources that match the given operating system family.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> getOsFamily() {
        return osFamily;
    }
    /**
     * Indicates whether to list only resources managed by the Autonomous Linux service.
     *
     */
    private Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether to list only resources managed by the Autonomous Linux service.
     *
     */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }
    /**
     * The format of the report to download. Default is CSV.
     */
    private ReportFormat reportFormat;

    /**
     * The format of the report to download. Default is CSV.
     **/
    public enum ReportFormat {
        Csv("csv"),
        Json("json"),
        Xml("xml"),
        ;

        private final String value;
        private static java.util.Map<String, ReportFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportFormat v : ReportFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportFormat: " + key);
        }
    };

    /**
     * The format of the report to download. Default is CSV.
     */
    public ReportFormat getReportFormat() {
        return reportFormat;
    }
    /**
     * The type of the report the user wants to download. Default is ALL.
     */
    private ReportType reportType;

    /**
     * The type of the report the user wants to download. Default is ALL.
     **/
    public enum ReportType {
        Security("SECURITY"),
        Bugfix("BUGFIX"),
        Activity("ACTIVITY"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, ReportType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportType v : ReportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportType: " + key);
        }
    };

    /**
     * The type of the report the user wants to download. Default is ALL.
     */
    public ReportType getReportType() {
        return reportType;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetManagedInstanceAnalyticContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * This filter returns only resources contained within the specified compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * This filter returns only resources contained within the specified compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group. This filter returns resources associated with this group.
         */
        private String managedInstanceGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance group. This filter returns resources associated with this group.
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment. This filter returns only resource contained with the specified lifecycle environment.
         */
        private String lifecycleEnvironmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment. This filter returns only resource contained with the specified lifecycle environment.
         * @param lifecycleEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironmentId(String lifecycleEnvironmentId) {
            this.lifecycleEnvironmentId = lifecycleEnvironmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage. This resource returns resources associated with this lifecycle stage.
         */
        private String lifecycleStageId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle stage. This resource returns resources associated with this lifecycle stage.
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /**
         * A filter to return only managed instances whose status matches the status provided.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status =
                null;

        /**
         * A filter to return only managed instances whose status matches the status provided.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only managed instances whose status matches the status provided.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(ManagedInstanceStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return resources that match the given display names.
         */
        private java.util.List<String> displayName = null;

        /**
         * A filter to return resources that match the given display names.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(java.util.List<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the given display names.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder displayName(String singularValue) {
            return this.displayName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return resources that may partially match the given display name.
         */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * A filter to return instances that have the specified number of available security updates.
         */
        private Integer securityUpdatesAvailableEqualsTo = null;

        /**
         * A filter to return instances that have the specified number of available security updates.
         * @param securityUpdatesAvailableEqualsTo the value to set
         * @return this builder instance
         */
        public Builder securityUpdatesAvailableEqualsTo(Integer securityUpdatesAvailableEqualsTo) {
            this.securityUpdatesAvailableEqualsTo = securityUpdatesAvailableEqualsTo;
            return this;
        }

        /**
         * A filter to return instances that have the specified number of available bug updates.
         */
        private Integer bugUpdatesAvailableEqualsTo = null;

        /**
         * A filter to return instances that have the specified number of available bug updates.
         * @param bugUpdatesAvailableEqualsTo the value to set
         * @return this builder instance
         */
        public Builder bugUpdatesAvailableEqualsTo(Integer bugUpdatesAvailableEqualsTo) {
            this.bugUpdatesAvailableEqualsTo = bugUpdatesAvailableEqualsTo;
            return this;
        }

        /**
         * A filter to return instances that have more available security updates than the number specified.
         */
        private Integer securityUpdatesAvailableGreaterThan = null;

        /**
         * A filter to return instances that have more available security updates than the number specified.
         * @param securityUpdatesAvailableGreaterThan the value to set
         * @return this builder instance
         */
        public Builder securityUpdatesAvailableGreaterThan(
                Integer securityUpdatesAvailableGreaterThan) {
            this.securityUpdatesAvailableGreaterThan = securityUpdatesAvailableGreaterThan;
            return this;
        }

        /**
         * A filter to return instances that have more available bug updates than the number specified.
         */
        private Integer bugUpdatesAvailableGreaterThan = null;

        /**
         * A filter to return instances that have more available bug updates than the number specified.
         * @param bugUpdatesAvailableGreaterThan the value to set
         * @return this builder instance
         */
        public Builder bugUpdatesAvailableGreaterThan(Integer bugUpdatesAvailableGreaterThan) {
            this.bugUpdatesAvailableGreaterThan = bugUpdatesAvailableGreaterThan;
            return this;
        }

        /**
         * A filter to return only resources whose location matches the given value.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                location = null;

        /**
         * A filter to return only resources whose location matches the given value.
         * @param location the value to set
         * @return this builder instance
         */
        public Builder location(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                        location) {
            this.location = location;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose location matches the given value.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder location(ManagedInstanceLocation singularValue) {
            return this.location(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources whose location does not match the given value.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                locationNotEqualTo = null;

        /**
         * A filter to return only resources whose location does not match the given value.
         * @param locationNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder locationNotEqualTo(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                        locationNotEqualTo) {
            this.locationNotEqualTo = locationNotEqualTo;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose location does not match the given value.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder locationNotEqualTo(ManagedInstanceLocation singularValue) {
            return this.locationNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources that match the given operating system family.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(
                java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the given operating system family.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder osFamily(OsFamily singularValue) {
            return this.osFamily(java.util.Arrays.asList(singularValue));
        }

        /**
         * Indicates whether to list only resources managed by the Autonomous Linux service.
         *
         */
        private Boolean isManagedByAutonomousLinux = null;

        /**
         * Indicates whether to list only resources managed by the Autonomous Linux service.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder instance
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            return this;
        }

        /**
         * The format of the report to download. Default is CSV.
         */
        private ReportFormat reportFormat = null;

        /**
         * The format of the report to download. Default is CSV.
         * @param reportFormat the value to set
         * @return this builder instance
         */
        public Builder reportFormat(ReportFormat reportFormat) {
            this.reportFormat = reportFormat;
            return this;
        }

        /**
         * The type of the report the user wants to download. Default is ALL.
         */
        private ReportType reportType = null;

        /**
         * The type of the report the user wants to download. Default is ALL.
         * @param reportType the value to set
         * @return this builder instance
         */
        public Builder reportType(ReportType reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(GetManagedInstanceAnalyticContentRequest o) {
            compartmentId(o.getCompartmentId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            lifecycleEnvironmentId(o.getLifecycleEnvironmentId());
            lifecycleStageId(o.getLifecycleStageId());
            status(o.getStatus());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            securityUpdatesAvailableEqualsTo(o.getSecurityUpdatesAvailableEqualsTo());
            bugUpdatesAvailableEqualsTo(o.getBugUpdatesAvailableEqualsTo());
            securityUpdatesAvailableGreaterThan(o.getSecurityUpdatesAvailableGreaterThan());
            bugUpdatesAvailableGreaterThan(o.getBugUpdatesAvailableGreaterThan());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            osFamily(o.getOsFamily());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            reportFormat(o.getReportFormat());
            reportType(o.getReportType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetManagedInstanceAnalyticContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * Build the instance of GetManagedInstanceAnalyticContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
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
            request.securityUpdatesAvailableEqualsTo = securityUpdatesAvailableEqualsTo;
            request.bugUpdatesAvailableEqualsTo = bugUpdatesAvailableEqualsTo;
            request.securityUpdatesAvailableGreaterThan = securityUpdatesAvailableGreaterThan;
            request.bugUpdatesAvailableGreaterThan = bugUpdatesAvailableGreaterThan;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.osFamily = osFamily;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            request.reportFormat = reportFormat;
            request.reportType = reportType;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetManagedInstanceAnalyticContentRequest(compartmentId, managedInstanceGroupId, lifecycleEnvironmentId, lifecycleStageId, status, displayName, displayNameContains, securityUpdatesAvailableEqualsTo, bugUpdatesAvailableEqualsTo, securityUpdatesAvailableGreaterThan, bugUpdatesAvailableGreaterThan, location, locationNotEqualTo, osFamily, isManagedByAutonomousLinux, reportFormat, reportType, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
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
                .securityUpdatesAvailableEqualsTo(securityUpdatesAvailableEqualsTo)
                .bugUpdatesAvailableEqualsTo(bugUpdatesAvailableEqualsTo)
                .securityUpdatesAvailableGreaterThan(securityUpdatesAvailableGreaterThan)
                .bugUpdatesAvailableGreaterThan(bugUpdatesAvailableGreaterThan)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .osFamily(osFamily)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux)
                .reportFormat(reportFormat)
                .reportType(reportType)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",lifecycleEnvironmentId=").append(String.valueOf(this.lifecycleEnvironmentId));
        sb.append(",lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",securityUpdatesAvailableEqualsTo=")
                .append(String.valueOf(this.securityUpdatesAvailableEqualsTo));
        sb.append(",bugUpdatesAvailableEqualsTo=")
                .append(String.valueOf(this.bugUpdatesAvailableEqualsTo));
        sb.append(",securityUpdatesAvailableGreaterThan=")
                .append(String.valueOf(this.securityUpdatesAvailableGreaterThan));
        sb.append(",bugUpdatesAvailableGreaterThan=")
                .append(String.valueOf(this.bugUpdatesAvailableGreaterThan));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(",reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append(",reportType=").append(String.valueOf(this.reportType));
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
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && java.util.Objects.equals(this.reportType, other.reportType)
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
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.locationNotEqualTo == null
                                ? 43
                                : this.locationNotEqualTo.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
        result = (result * PRIME) + (this.reportType == null ? 43 : this.reportType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
