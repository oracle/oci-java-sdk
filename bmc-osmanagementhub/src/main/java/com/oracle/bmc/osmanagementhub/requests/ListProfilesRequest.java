/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListProfilesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListProfilesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListProfilesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return registration profiles that match the given profile type.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ProfileType> profileType;

    /**
     * A filter to return registration profiles that match the given profile type.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ProfileType> getProfileType() {
        return profileType;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the registration profile. A filter used to return the specified profile.
     */
    private String profileId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the registration profile. A filter used to return the specified profile.
     */
    public String getProfileId() {
        return profileId;
    }
    /**
     * A filter to return only resources that match the given operating system family.
     */
    private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily;

    /**
     * A filter to return only resources that match the given operating system family.
     */
    public com.oracle.bmc.osmanagementhub.model.OsFamily getOsFamily() {
        return osFamily;
    }
    /**
     * A filter to return only profiles that match the given archType.
     */
    private com.oracle.bmc.osmanagementhub.model.ArchType archType;

    /**
     * A filter to return only profiles that match the given archType.
     */
    public com.oracle.bmc.osmanagementhub.model.ArchType getArchType() {
        return archType;
    }
    /**
     * A filter to return profiles that match the given instance type.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.Profile.RegistrationType>
            registrationType;

    /**
     * A filter to return profiles that match the given instance type.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.Profile.RegistrationType>
            getRegistrationType() {
        return registrationType;
    }
    /**
     * A boolean variable that is used to list only the default profile resources.
     *
     */
    private Boolean isDefaultProfile;

    /**
     * A boolean variable that is used to list only the default profile resources.
     *
     */
    public Boolean getIsDefaultProfile() {
        return isDefaultProfile;
    }
    /**
     * A filter to return only service-provided profiles.
     *
     */
    private Boolean isServiceProvidedProfile;

    /**
     * A filter to return only service-provided profiles.
     *
     */
    public Boolean getIsServiceProvidedProfile() {
        return isServiceProvidedProfile;
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
     * A filter to return only registration profiles in the given state.
     */
    private com.oracle.bmc.osmanagementhub.model.Profile.LifecycleState lifecycleState;

    /**
     * A filter to return only registration profiles in the given state.
     */
    public com.oracle.bmc.osmanagementhub.model.Profile.LifecycleState getLifecycleState() {
        return lifecycleState;
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
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
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
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending.
     * Default order for displayName is ascending.
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
                    ListProfilesRequest, java.lang.Void> {
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
         * A filter to return registration profiles that match the given profile type.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ProfileType> profileType = null;

        /**
         * A filter to return registration profiles that match the given profile type.
         * @param profileType the value to set
         * @return this builder instance
         */
        public Builder profileType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ProfileType> profileType) {
            this.profileType = profileType;
            return this;
        }

        /**
         * Singular setter. A filter to return registration profiles that match the given profile type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder profileType(ProfileType singularValue) {
            return this.profileType(java.util.Arrays.asList(singularValue));
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the registration profile. A filter used to return the specified profile.
         */
        private String profileId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the registration profile. A filter used to return the specified profile.
         * @param profileId the value to set
         * @return this builder instance
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            return this;
        }

        /**
         * A filter to return only resources that match the given operating system family.
         */
        private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(com.oracle.bmc.osmanagementhub.model.OsFamily osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /**
         * A filter to return only profiles that match the given archType.
         */
        private com.oracle.bmc.osmanagementhub.model.ArchType archType = null;

        /**
         * A filter to return only profiles that match the given archType.
         * @param archType the value to set
         * @return this builder instance
         */
        public Builder archType(com.oracle.bmc.osmanagementhub.model.ArchType archType) {
            this.archType = archType;
            return this;
        }

        /**
         * A filter to return profiles that match the given instance type.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.Profile.RegistrationType>
                registrationType = null;

        /**
         * A filter to return profiles that match the given instance type.
         * @param registrationType the value to set
         * @return this builder instance
         */
        public Builder registrationType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.Profile.RegistrationType>
                        registrationType) {
            this.registrationType = registrationType;
            return this;
        }

        /**
         * Singular setter. A filter to return profiles that match the given instance type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder registrationType(
                com.oracle.bmc.osmanagementhub.model.Profile.RegistrationType singularValue) {
            return this.registrationType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A boolean variable that is used to list only the default profile resources.
         *
         */
        private Boolean isDefaultProfile = null;

        /**
         * A boolean variable that is used to list only the default profile resources.
         *
         * @param isDefaultProfile the value to set
         * @return this builder instance
         */
        public Builder isDefaultProfile(Boolean isDefaultProfile) {
            this.isDefaultProfile = isDefaultProfile;
            return this;
        }

        /**
         * A filter to return only service-provided profiles.
         *
         */
        private Boolean isServiceProvidedProfile = null;

        /**
         * A filter to return only service-provided profiles.
         *
         * @param isServiceProvidedProfile the value to set
         * @return this builder instance
         */
        public Builder isServiceProvidedProfile(Boolean isServiceProvidedProfile) {
            this.isServiceProvidedProfile = isServiceProvidedProfile;
            return this;
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
         * A filter to return only registration profiles in the given state.
         */
        private com.oracle.bmc.osmanagementhub.model.Profile.LifecycleState lifecycleState = null;

        /**
         * A filter to return only registration profiles in the given state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.Profile.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending.
         * Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending.
         * Default order for displayName is ascending.
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
        public Builder copy(ListProfilesRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            profileType(o.getProfileType());
            profileId(o.getProfileId());
            osFamily(o.getOsFamily());
            archType(o.getArchType());
            registrationType(o.getRegistrationType());
            isDefaultProfile(o.getIsDefaultProfile());
            isServiceProvidedProfile(o.getIsServiceProvidedProfile());
            vendorName(o.getVendorName());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListProfilesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListProfilesRequest
         */
        public ListProfilesRequest build() {
            ListProfilesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProfilesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProfilesRequest
         */
        public ListProfilesRequest buildWithoutInvocationCallback() {
            ListProfilesRequest request = new ListProfilesRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.profileType = profileType;
            request.profileId = profileId;
            request.osFamily = osFamily;
            request.archType = archType;
            request.registrationType = registrationType;
            request.isDefaultProfile = isDefaultProfile;
            request.isServiceProvidedProfile = isServiceProvidedProfile;
            request.vendorName = vendorName;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListProfilesRequest(compartmentId, displayName, displayNameContains, profileType, profileId, osFamily, archType, registrationType, isDefaultProfile, isServiceProvidedProfile, vendorName, limit, page, lifecycleState, sortOrder, sortBy, opcRequestId);
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
                .profileType(profileType)
                .profileId(profileId)
                .osFamily(osFamily)
                .archType(archType)
                .registrationType(registrationType)
                .isDefaultProfile(isDefaultProfile)
                .isServiceProvidedProfile(isServiceProvidedProfile)
                .vendorName(vendorName)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
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
        sb.append(",profileType=").append(String.valueOf(this.profileType));
        sb.append(",profileId=").append(String.valueOf(this.profileId));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",archType=").append(String.valueOf(this.archType));
        sb.append(",registrationType=").append(String.valueOf(this.registrationType));
        sb.append(",isDefaultProfile=").append(String.valueOf(this.isDefaultProfile));
        sb.append(",isServiceProvidedProfile=")
                .append(String.valueOf(this.isServiceProvidedProfile));
        sb.append(",vendorName=").append(String.valueOf(this.vendorName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListProfilesRequest)) {
            return false;
        }

        ListProfilesRequest other = (ListProfilesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.profileType, other.profileType)
                && java.util.Objects.equals(this.profileId, other.profileId)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.registrationType, other.registrationType)
                && java.util.Objects.equals(this.isDefaultProfile, other.isDefaultProfile)
                && java.util.Objects.equals(
                        this.isServiceProvidedProfile, other.isServiceProvidedProfile)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.profileType == null ? 43 : this.profileType.hashCode());
        result = (result * PRIME) + (this.profileId == null ? 43 : this.profileId.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationType == null ? 43 : this.registrationType.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultProfile == null ? 43 : this.isDefaultProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.isServiceProvidedProfile == null
                                ? 43
                                : this.isServiceProvidedProfile.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
