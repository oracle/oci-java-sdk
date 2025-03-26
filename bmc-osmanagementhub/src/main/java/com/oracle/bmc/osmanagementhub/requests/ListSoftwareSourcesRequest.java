/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListSoftwareSourcesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSoftwareSourcesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListSoftwareSourcesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the software source.
     */
    private String softwareSourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /**
     * The type of the software source.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSourceType>
            softwareSourceType;

    /**
     * The type of the software source.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSourceType>
            getSoftwareSourceType() {
        return softwareSourceType;
    }
    /**
     * A filter to return only resources that match the given vendor name.
     */
    private com.oracle.bmc.osmanagementhub.model.VendorName vendorName;

    /**
     * A filter to return only resources that match the given vendor name.
     */
    public com.oracle.bmc.osmanagementhub.model.VendorName getVendorName() {
        return vendorName;
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
     * The availability of the software source in a non-OCI environment for a tenancy.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> availability;

    /**
     * The availability of the software source in a non-OCI environment for a tenancy.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> getAvailability() {
        return availability;
    }
    /**
     * The availability of the software source in an OCI environment for a tenancy.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> availabilityAtOci;

    /**
     * The availability of the software source in an OCI environment for a tenancy.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
            getAvailabilityAtOci() {
        return availabilityAtOci;
    }
    /**
     * The availability of the software source. Use this query parameter to filter across availabilities in different environments.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> availabilityAnywhere;

    /**
     * The availability of the software source. Use this query parameter to filter across availabilities in different environments.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
            getAvailabilityAnywhere() {
        return availabilityAnywhere;
    }
    /**
     * Indicates whether the software source is mandatory for the Autonomous Linux service.
     */
    private Boolean isMandatoryForAutonomousLinux;

    /**
     * Indicates whether the software source is mandatory for the Autonomous Linux service.
     */
    public Boolean getIsMandatoryForAutonomousLinux() {
        return isMandatoryForAutonomousLinux;
    }
    /**
     * A filter to return software sources which can be synced to a management station.
     */
    private Boolean isMirrorSyncAllowed;

    /**
     * A filter to return software sources which can be synced to a management station.
     */
    public Boolean getIsMirrorSyncAllowed() {
        return isMirrorSyncAllowed;
    }
    /**
     * A filter to return resources that match the given user-friendly name.
     */
    private String displayName;

    /**
     * A filter to return resources that match the given user-friendly name.
     */
    public String getDisplayName() {
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
     * A multi filter to return resources that do not contains the given display names.
     */
    private java.util.List<String> displayNameNotEqualTo;

    /**
     * A multi filter to return resources that do not contains the given display names.
     */
    public java.util.List<String> getDisplayNameNotEqualTo() {
        return displayNameNotEqualTo;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
     * A filter to return only software sources whose state matches the given state.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSource.LifecycleState>
            lifecycleState;

    /**
     * A filter to return only software sources whose state matches the given state.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSource.LifecycleState>
            getLifecycleState() {
        return lifecycleState;
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
                    ListSoftwareSourcesRequest, java.lang.Void> {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the software source.
         */
        private String softwareSourceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the software source.
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /**
         * The type of the software source.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSourceType>
                softwareSourceType = null;

        /**
         * The type of the software source.
         * @param softwareSourceType the value to set
         * @return this builder instance
         */
        public Builder softwareSourceType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSourceType>
                        softwareSourceType) {
            this.softwareSourceType = softwareSourceType;
            return this;
        }

        /**
         * Singular setter. The type of the software source.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder softwareSourceType(SoftwareSourceType singularValue) {
            return this.softwareSourceType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources that match the given vendor name.
         */
        private com.oracle.bmc.osmanagementhub.model.VendorName vendorName = null;

        /**
         * A filter to return only resources that match the given vendor name.
         * @param vendorName the value to set
         * @return this builder instance
         */
        public Builder vendorName(com.oracle.bmc.osmanagementhub.model.VendorName vendorName) {
            this.vendorName = vendorName;
            return this;
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
         * The availability of the software source in a non-OCI environment for a tenancy.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> availability =
                null;

        /**
         * The availability of the software source in a non-OCI environment for a tenancy.
         * @param availability the value to set
         * @return this builder instance
         */
        public Builder availability(
                java.util.List<com.oracle.bmc.osmanagementhub.model.Availability> availability) {
            this.availability = availability;
            return this;
        }

        /**
         * Singular setter. The availability of the software source in a non-OCI environment for a tenancy.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder availability(Availability singularValue) {
            return this.availability(java.util.Arrays.asList(singularValue));
        }

        /**
         * The availability of the software source in an OCI environment for a tenancy.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
                availabilityAtOci = null;

        /**
         * The availability of the software source in an OCI environment for a tenancy.
         * @param availabilityAtOci the value to set
         * @return this builder instance
         */
        public Builder availabilityAtOci(
                java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
                        availabilityAtOci) {
            this.availabilityAtOci = availabilityAtOci;
            return this;
        }

        /**
         * Singular setter. The availability of the software source in an OCI environment for a tenancy.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder availabilityAtOci(Availability singularValue) {
            return this.availabilityAtOci(java.util.Arrays.asList(singularValue));
        }

        /**
         * The availability of the software source. Use this query parameter to filter across availabilities in different environments.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
                availabilityAnywhere = null;

        /**
         * The availability of the software source. Use this query parameter to filter across availabilities in different environments.
         * @param availabilityAnywhere the value to set
         * @return this builder instance
         */
        public Builder availabilityAnywhere(
                java.util.List<com.oracle.bmc.osmanagementhub.model.Availability>
                        availabilityAnywhere) {
            this.availabilityAnywhere = availabilityAnywhere;
            return this;
        }

        /**
         * Singular setter. The availability of the software source. Use this query parameter to filter across availabilities in different environments.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder availabilityAnywhere(Availability singularValue) {
            return this.availabilityAnywhere(java.util.Arrays.asList(singularValue));
        }

        /**
         * Indicates whether the software source is mandatory for the Autonomous Linux service.
         */
        private Boolean isMandatoryForAutonomousLinux = null;

        /**
         * Indicates whether the software source is mandatory for the Autonomous Linux service.
         * @param isMandatoryForAutonomousLinux the value to set
         * @return this builder instance
         */
        public Builder isMandatoryForAutonomousLinux(Boolean isMandatoryForAutonomousLinux) {
            this.isMandatoryForAutonomousLinux = isMandatoryForAutonomousLinux;
            return this;
        }

        /**
         * A filter to return software sources which can be synced to a management station.
         */
        private Boolean isMirrorSyncAllowed = null;

        /**
         * A filter to return software sources which can be synced to a management station.
         * @param isMirrorSyncAllowed the value to set
         * @return this builder instance
         */
        public Builder isMirrorSyncAllowed(Boolean isMirrorSyncAllowed) {
            this.isMirrorSyncAllowed = isMirrorSyncAllowed;
            return this;
        }

        /**
         * A filter to return resources that match the given user-friendly name.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the given user-friendly name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
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
         * A multi filter to return resources that do not contains the given display names.
         */
        private java.util.List<String> displayNameNotEqualTo = null;

        /**
         * A multi filter to return resources that do not contains the given display names.
         * @param displayNameNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder displayNameNotEqualTo(java.util.List<String> displayNameNotEqualTo) {
            this.displayNameNotEqualTo = displayNameNotEqualTo;
            return this;
        }

        /**
         * Singular setter. A multi filter to return resources that do not contains the given display names.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder displayNameNotEqualTo(String singularValue) {
            return this.displayNameNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * A filter to return only software sources whose state matches the given state.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSource.LifecycleState>
                lifecycleState = null;

        /**
         * A filter to return only software sources whose state matches the given state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.osmanagementhub.model.SoftwareSource.LifecycleState>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only software sources whose state matches the given state.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.SoftwareSource.LifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListSoftwareSourcesRequest o) {
            compartmentId(o.getCompartmentId());
            softwareSourceId(o.getSoftwareSourceId());
            softwareSourceType(o.getSoftwareSourceType());
            vendorName(o.getVendorName());
            osFamily(o.getOsFamily());
            archType(o.getArchType());
            availability(o.getAvailability());
            availabilityAtOci(o.getAvailabilityAtOci());
            availabilityAnywhere(o.getAvailabilityAnywhere());
            isMandatoryForAutonomousLinux(o.getIsMandatoryForAutonomousLinux());
            isMirrorSyncAllowed(o.getIsMirrorSyncAllowed());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            displayNameNotEqualTo(o.getDisplayNameNotEqualTo());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSoftwareSourcesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSoftwareSourcesRequest
         */
        public ListSoftwareSourcesRequest build() {
            ListSoftwareSourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSoftwareSourcesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSoftwareSourcesRequest
         */
        public ListSoftwareSourcesRequest buildWithoutInvocationCallback() {
            ListSoftwareSourcesRequest request = new ListSoftwareSourcesRequest();
            request.compartmentId = compartmentId;
            request.softwareSourceId = softwareSourceId;
            request.softwareSourceType = softwareSourceType;
            request.vendorName = vendorName;
            request.osFamily = osFamily;
            request.archType = archType;
            request.availability = availability;
            request.availabilityAtOci = availabilityAtOci;
            request.availabilityAnywhere = availabilityAnywhere;
            request.isMandatoryForAutonomousLinux = isMandatoryForAutonomousLinux;
            request.isMirrorSyncAllowed = isMirrorSyncAllowed;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.displayNameNotEqualTo = displayNameNotEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSoftwareSourcesRequest(compartmentId, softwareSourceId, softwareSourceType, vendorName, osFamily, archType, availability, availabilityAtOci, availabilityAnywhere, isMandatoryForAutonomousLinux, isMirrorSyncAllowed, displayName, displayNameContains, displayNameNotEqualTo, limit, page, sortOrder, sortBy, lifecycleState, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .softwareSourceId(softwareSourceId)
                .softwareSourceType(softwareSourceType)
                .vendorName(vendorName)
                .osFamily(osFamily)
                .archType(archType)
                .availability(availability)
                .availabilityAtOci(availabilityAtOci)
                .availabilityAnywhere(availabilityAnywhere)
                .isMandatoryForAutonomousLinux(isMandatoryForAutonomousLinux)
                .isMirrorSyncAllowed(isMirrorSyncAllowed)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .displayNameNotEqualTo(displayNameNotEqualTo)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
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
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",softwareSourceType=").append(String.valueOf(this.softwareSourceType));
        sb.append(",vendorName=").append(String.valueOf(this.vendorName));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",archType=").append(String.valueOf(this.archType));
        sb.append(",availability=").append(String.valueOf(this.availability));
        sb.append(",availabilityAtOci=").append(String.valueOf(this.availabilityAtOci));
        sb.append(",availabilityAnywhere=").append(String.valueOf(this.availabilityAnywhere));
        sb.append(",isMandatoryForAutonomousLinux=")
                .append(String.valueOf(this.isMandatoryForAutonomousLinux));
        sb.append(",isMirrorSyncAllowed=").append(String.valueOf(this.isMirrorSyncAllowed));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",displayNameNotEqualTo=").append(String.valueOf(this.displayNameNotEqualTo));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSoftwareSourcesRequest)) {
            return false;
        }

        ListSoftwareSourcesRequest other = (ListSoftwareSourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.softwareSourceType, other.softwareSourceType)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.availability, other.availability)
                && java.util.Objects.equals(this.availabilityAtOci, other.availabilityAtOci)
                && java.util.Objects.equals(this.availabilityAnywhere, other.availabilityAnywhere)
                && java.util.Objects.equals(
                        this.isMandatoryForAutonomousLinux, other.isMandatoryForAutonomousLinux)
                && java.util.Objects.equals(this.isMirrorSyncAllowed, other.isMirrorSyncAllowed)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.displayNameNotEqualTo, other.displayNameNotEqualTo)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceType == null
                                ? 43
                                : this.softwareSourceType.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.availability == null ? 43 : this.availability.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAtOci == null ? 43 : this.availabilityAtOci.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAnywhere == null
                                ? 43
                                : this.availabilityAnywhere.hashCode());
        result =
                (result * PRIME)
                        + (this.isMandatoryForAutonomousLinux == null
                                ? 43
                                : this.isMandatoryForAutonomousLinux.hashCode());
        result =
                (result * PRIME)
                        + (this.isMirrorSyncAllowed == null
                                ? 43
                                : this.isMirrorSyncAllowed.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameNotEqualTo == null
                                ? 43
                                : this.displayNameNotEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
