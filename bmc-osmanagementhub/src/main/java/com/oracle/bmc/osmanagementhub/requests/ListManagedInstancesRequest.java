/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstancesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListManagedInstancesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagedInstancesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
     */
    private String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
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
     * A filter to return only instances whose architecture type matches the given architecture.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ArchType> archType;

    /**
     * A filter to return only instances whose architecture type matches the given architecture.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ArchType> getArchType() {
        return archType;
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
     * A filter to return only managed instances that are acting as management stations.
     */
    private Boolean isManagementStation;

    /**
     * A filter to return only managed instances that are acting as management stations.
     */
    public Boolean getIsManagementStation() {
        return isManagementStation;
    }
    /**
     * A filter to return only managed instances that are attached to the specified group.
     */
    private String group;

    /**
     * A filter to return only managed instances that are attached to the specified group.
     */
    public String getGroup() {
        return group;
    }
    /**
     * A filter to return only managed instances that are NOT attached to the specified group.
     */
    private String groupNotEqualTo;

    /**
     * A filter to return only managed instances that are NOT attached to the specified group.
     */
    public String getGroupNotEqualTo() {
        return groupNotEqualTo;
    }
    /**
     * A filter to return only managed instances that are associated with the specified lifecycle environment.
     */
    private String lifecycleStage;

    /**
     * A filter to return only managed instances that are associated with the specified lifecycle environment.
     */
    public String getLifecycleStage() {
        return lifecycleStage;
    }
    /**
     * A filter to return only managed instances that are NOT associated with the specified lifecycle environment.
     */
    private String lifecycleStageNotEqualTo;

    /**
     * A filter to return only managed instances that are NOT associated with the specified lifecycle environment.
     */
    public String getLifecycleStageNotEqualTo() {
        return lifecycleStageNotEqualTo;
    }
    /**
     * A filter to return only managed instances that are attached to the specified group or lifecycle environment.
     */
    private Boolean isAttachedToGroupOrLifecycleStage;

    /**
     * A filter to return only managed instances that are attached to the specified group or lifecycle environment.
     */
    public Boolean getIsAttachedToGroupOrLifecycleStage() {
        return isAttachedToGroupOrLifecycleStage;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source. This filter returns resources associated with this software source.
     */
    private String softwareSourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source. This filter returns resources associated with this software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /**
     * The assigned erratum name. It's unique and not changeable.
     * <p>
     * Example: {@code ELSA-2020-5804}
     *
     */
    private java.util.List<String> advisoryName;

    /**
     * The assigned erratum name. It's unique and not changeable.
     * <p>
     * Example: {@code ELSA-2020-5804}
     *
     */
    public java.util.List<String> getAdvisoryName() {
        return advisoryName;
    }
    /**
     * A filter to return only managed instances in a specific lifecycle environment.
     */
    private String lifecycleEnvironment;

    /**
     * A filter to return only managed instances in a specific lifecycle environment.
     */
    public String getLifecycleEnvironment() {
        return lifecycleEnvironment;
    }
    /**
     * A filter to return only managed instances that aren't in a specific lifecycle environment.
     */
    private String lifecycleEnvironmentNotEqualTo;

    /**
     * A filter to return only managed instances that aren't in a specific lifecycle environment.
     */
    public String getLifecycleEnvironmentNotEqualTo() {
        return lifecycleEnvironmentNotEqualTo;
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
     * A multi filter to return only managed instances that match the given profile ids.
     */
    private java.util.List<String> profile;

    /**
     * A multi filter to return only managed instances that match the given profile ids.
     */
    public java.util.List<String> getProfile() {
        return profile;
    }
    /**
     * A multi filter to return only managed instances that don't contain the given profile [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> profileNotEqualTo;

    /**
     * A multi filter to return only managed instances that don't contain the given profile [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getProfileNotEqualTo() {
        return profileNotEqualTo;
    }
    /**
     * A filter to return only managed instances with a registration profile attached.
     */
    private Boolean isProfileAttached;

    /**
     * A filter to return only managed instances with a registration profile attached.
     */
    public Boolean getIsProfileAttached() {
        return isProfileAttached;
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
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
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
                    ListManagedInstancesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
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
         * A filter to return only instances whose architecture type matches the given architecture.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ArchType> archType = null;

        /**
         * A filter to return only instances whose architecture type matches the given architecture.
         * @param archType the value to set
         * @return this builder instance
         */
        public Builder archType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ArchType> archType) {
            this.archType = archType;
            return this;
        }

        /**
         * Singular setter. A filter to return only instances whose architecture type matches the given architecture.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder archType(ArchType singularValue) {
            return this.archType(java.util.Arrays.asList(singularValue));
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
         * A filter to return only managed instances that are acting as management stations.
         */
        private Boolean isManagementStation = null;

        /**
         * A filter to return only managed instances that are acting as management stations.
         * @param isManagementStation the value to set
         * @return this builder instance
         */
        public Builder isManagementStation(Boolean isManagementStation) {
            this.isManagementStation = isManagementStation;
            return this;
        }

        /**
         * A filter to return only managed instances that are attached to the specified group.
         */
        private String group = null;

        /**
         * A filter to return only managed instances that are attached to the specified group.
         * @param group the value to set
         * @return this builder instance
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * A filter to return only managed instances that are NOT attached to the specified group.
         */
        private String groupNotEqualTo = null;

        /**
         * A filter to return only managed instances that are NOT attached to the specified group.
         * @param groupNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder groupNotEqualTo(String groupNotEqualTo) {
            this.groupNotEqualTo = groupNotEqualTo;
            return this;
        }

        /**
         * A filter to return only managed instances that are associated with the specified lifecycle environment.
         */
        private String lifecycleStage = null;

        /**
         * A filter to return only managed instances that are associated with the specified lifecycle environment.
         * @param lifecycleStage the value to set
         * @return this builder instance
         */
        public Builder lifecycleStage(String lifecycleStage) {
            this.lifecycleStage = lifecycleStage;
            return this;
        }

        /**
         * A filter to return only managed instances that are NOT associated with the specified lifecycle environment.
         */
        private String lifecycleStageNotEqualTo = null;

        /**
         * A filter to return only managed instances that are NOT associated with the specified lifecycle environment.
         * @param lifecycleStageNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageNotEqualTo(String lifecycleStageNotEqualTo) {
            this.lifecycleStageNotEqualTo = lifecycleStageNotEqualTo;
            return this;
        }

        /**
         * A filter to return only managed instances that are attached to the specified group or lifecycle environment.
         */
        private Boolean isAttachedToGroupOrLifecycleStage = null;

        /**
         * A filter to return only managed instances that are attached to the specified group or lifecycle environment.
         * @param isAttachedToGroupOrLifecycleStage the value to set
         * @return this builder instance
         */
        public Builder isAttachedToGroupOrLifecycleStage(
                Boolean isAttachedToGroupOrLifecycleStage) {
            this.isAttachedToGroupOrLifecycleStage = isAttachedToGroupOrLifecycleStage;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source. This filter returns resources associated with this software source.
         */
        private String softwareSourceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source. This filter returns resources associated with this software source.
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /**
         * The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         */
        private java.util.List<String> advisoryName = null;

        /**
         * The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         * @param advisoryName the value to set
         * @return this builder instance
         */
        public Builder advisoryName(java.util.List<String> advisoryName) {
            this.advisoryName = advisoryName;
            return this;
        }

        /**
         * Singular setter. The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryName(String singularValue) {
            return this.advisoryName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only managed instances in a specific lifecycle environment.
         */
        private String lifecycleEnvironment = null;

        /**
         * A filter to return only managed instances in a specific lifecycle environment.
         * @param lifecycleEnvironment the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironment(String lifecycleEnvironment) {
            this.lifecycleEnvironment = lifecycleEnvironment;
            return this;
        }

        /**
         * A filter to return only managed instances that aren't in a specific lifecycle environment.
         */
        private String lifecycleEnvironmentNotEqualTo = null;

        /**
         * A filter to return only managed instances that aren't in a specific lifecycle environment.
         * @param lifecycleEnvironmentNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironmentNotEqualTo(String lifecycleEnvironmentNotEqualTo) {
            this.lifecycleEnvironmentNotEqualTo = lifecycleEnvironmentNotEqualTo;
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
         * A multi filter to return only managed instances that match the given profile ids.
         */
        private java.util.List<String> profile = null;

        /**
         * A multi filter to return only managed instances that match the given profile ids.
         * @param profile the value to set
         * @return this builder instance
         */
        public Builder profile(java.util.List<String> profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Singular setter. A multi filter to return only managed instances that match the given profile ids.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder profile(String singularValue) {
            return this.profile(java.util.Arrays.asList(singularValue));
        }

        /**
         * A multi filter to return only managed instances that don't contain the given profile [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> profileNotEqualTo = null;

        /**
         * A multi filter to return only managed instances that don't contain the given profile [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param profileNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder profileNotEqualTo(java.util.List<String> profileNotEqualTo) {
            this.profileNotEqualTo = profileNotEqualTo;
            return this;
        }

        /**
         * Singular setter. A multi filter to return only managed instances that don't contain the given profile [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder profileNotEqualTo(String singularValue) {
            return this.profileNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only managed instances with a registration profile attached.
         */
        private Boolean isProfileAttached = null;

        /**
         * A filter to return only managed instances with a registration profile attached.
         * @param isProfileAttached the value to set
         * @return this builder instance
         */
        public Builder isProfileAttached(Boolean isProfileAttached) {
            this.isProfileAttached = isProfileAttached;
            return this;
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
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListManagedInstancesRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            managedInstanceId(o.getManagedInstanceId());
            status(o.getStatus());
            archType(o.getArchType());
            osFamily(o.getOsFamily());
            isManagementStation(o.getIsManagementStation());
            group(o.getGroup());
            groupNotEqualTo(o.getGroupNotEqualTo());
            lifecycleStage(o.getLifecycleStage());
            lifecycleStageNotEqualTo(o.getLifecycleStageNotEqualTo());
            isAttachedToGroupOrLifecycleStage(o.getIsAttachedToGroupOrLifecycleStage());
            softwareSourceId(o.getSoftwareSourceId());
            advisoryName(o.getAdvisoryName());
            lifecycleEnvironment(o.getLifecycleEnvironment());
            lifecycleEnvironmentNotEqualTo(o.getLifecycleEnvironmentNotEqualTo());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            profile(o.getProfile());
            profileNotEqualTo(o.getProfileNotEqualTo());
            isProfileAttached(o.getIsProfileAttached());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
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
         * Build the instance of ListManagedInstancesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListManagedInstancesRequest
         */
        public ListManagedInstancesRequest build() {
            ListManagedInstancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagedInstancesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagedInstancesRequest
         */
        public ListManagedInstancesRequest buildWithoutInvocationCallback() {
            ListManagedInstancesRequest request = new ListManagedInstancesRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.managedInstanceId = managedInstanceId;
            request.status = status;
            request.archType = archType;
            request.osFamily = osFamily;
            request.isManagementStation = isManagementStation;
            request.group = group;
            request.groupNotEqualTo = groupNotEqualTo;
            request.lifecycleStage = lifecycleStage;
            request.lifecycleStageNotEqualTo = lifecycleStageNotEqualTo;
            request.isAttachedToGroupOrLifecycleStage = isAttachedToGroupOrLifecycleStage;
            request.softwareSourceId = softwareSourceId;
            request.advisoryName = advisoryName;
            request.lifecycleEnvironment = lifecycleEnvironment;
            request.lifecycleEnvironmentNotEqualTo = lifecycleEnvironmentNotEqualTo;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.profile = profile;
            request.profileNotEqualTo = profileNotEqualTo;
            request.isProfileAttached = isProfileAttached;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListManagedInstancesRequest(compartmentId, displayName, displayNameContains, managedInstanceId, status, archType, osFamily, isManagementStation, group, groupNotEqualTo, lifecycleStage, lifecycleStageNotEqualTo, isAttachedToGroupOrLifecycleStage, softwareSourceId, advisoryName, lifecycleEnvironment, lifecycleEnvironmentNotEqualTo, location, locationNotEqualTo, profile, profileNotEqualTo, isProfileAttached, isManagedByAutonomousLinux, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .managedInstanceId(managedInstanceId)
                .status(status)
                .archType(archType)
                .osFamily(osFamily)
                .isManagementStation(isManagementStation)
                .group(group)
                .groupNotEqualTo(groupNotEqualTo)
                .lifecycleStage(lifecycleStage)
                .lifecycleStageNotEqualTo(lifecycleStageNotEqualTo)
                .isAttachedToGroupOrLifecycleStage(isAttachedToGroupOrLifecycleStage)
                .softwareSourceId(softwareSourceId)
                .advisoryName(advisoryName)
                .lifecycleEnvironment(lifecycleEnvironment)
                .lifecycleEnvironmentNotEqualTo(lifecycleEnvironmentNotEqualTo)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .profile(profile)
                .profileNotEqualTo(profileNotEqualTo)
                .isProfileAttached(isProfileAttached)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",archType=").append(String.valueOf(this.archType));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",isManagementStation=").append(String.valueOf(this.isManagementStation));
        sb.append(",group=").append(String.valueOf(this.group));
        sb.append(",groupNotEqualTo=").append(String.valueOf(this.groupNotEqualTo));
        sb.append(",lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(",lifecycleStageNotEqualTo=")
                .append(String.valueOf(this.lifecycleStageNotEqualTo));
        sb.append(",isAttachedToGroupOrLifecycleStage=")
                .append(String.valueOf(this.isAttachedToGroupOrLifecycleStage));
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",advisoryName=").append(String.valueOf(this.advisoryName));
        sb.append(",lifecycleEnvironment=").append(String.valueOf(this.lifecycleEnvironment));
        sb.append(",lifecycleEnvironmentNotEqualTo=")
                .append(String.valueOf(this.lifecycleEnvironmentNotEqualTo));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",profile=").append(String.valueOf(this.profile));
        sb.append(",profileNotEqualTo=").append(String.valueOf(this.profileNotEqualTo));
        sb.append(",isProfileAttached=").append(String.valueOf(this.isProfileAttached));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
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
        if (!(o instanceof ListManagedInstancesRequest)) {
            return false;
        }

        ListManagedInstancesRequest other = (ListManagedInstancesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.isManagementStation, other.isManagementStation)
                && java.util.Objects.equals(this.group, other.group)
                && java.util.Objects.equals(this.groupNotEqualTo, other.groupNotEqualTo)
                && java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage)
                && java.util.Objects.equals(
                        this.lifecycleStageNotEqualTo, other.lifecycleStageNotEqualTo)
                && java.util.Objects.equals(
                        this.isAttachedToGroupOrLifecycleStage,
                        other.isAttachedToGroupOrLifecycleStage)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.advisoryName, other.advisoryName)
                && java.util.Objects.equals(this.lifecycleEnvironment, other.lifecycleEnvironment)
                && java.util.Objects.equals(
                        this.lifecycleEnvironmentNotEqualTo, other.lifecycleEnvironmentNotEqualTo)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(this.profile, other.profile)
                && java.util.Objects.equals(this.profileNotEqualTo, other.profileNotEqualTo)
                && java.util.Objects.equals(this.isProfileAttached, other.isProfileAttached)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagementStation == null
                                ? 43
                                : this.isManagementStation.hashCode());
        result = (result * PRIME) + (this.group == null ? 43 : this.group.hashCode());
        result =
                (result * PRIME)
                        + (this.groupNotEqualTo == null ? 43 : this.groupNotEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStage == null ? 43 : this.lifecycleStage.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStageNotEqualTo == null
                                ? 43
                                : this.lifecycleStageNotEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isAttachedToGroupOrLifecycleStage == null
                                ? 43
                                : this.isAttachedToGroupOrLifecycleStage.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.advisoryName == null ? 43 : this.advisoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironment == null
                                ? 43
                                : this.lifecycleEnvironment.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironmentNotEqualTo == null
                                ? 43
                                : this.lifecycleEnvironmentNotEqualTo.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.locationNotEqualTo == null
                                ? 43
                                : this.locationNotEqualTo.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result =
                (result * PRIME)
                        + (this.profileNotEqualTo == null ? 43 : this.profileNotEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isProfileAttached == null ? 43 : this.isProfileAttached.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
