/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListModelsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListModelsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class ListModelsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** <b>Filter</b> results by the name of the model version set. */
    private String modelVersionSetName;

    /** <b>Filter</b> results by the name of the model version set. */
    public String getModelVersionSetName() {
        return modelVersionSetName;
    }
    /** <b>Filter</b> results by version label. */
    private String versionLabel;

    /** <b>Filter</b> results by version label. */
    public String getVersionLabel() {
        return versionLabel;
    }
    /**
     * <b>Filter</b> results by
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be
     * an OCID of the correct type for the resource type.
     */
    private String id;

    /**
     * <b>Filter</b> results by
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be
     * an OCID of the correct type for the resource type.
     */
    public String getId() {
        return id;
    }
    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project.
     */
    private String projectId;

    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * project.
     */
    public String getProjectId() {
        return projectId;
    }
    /** <b>Filter</b> results by its user-friendly name. */
    private String displayName;

    /** <b>Filter</b> results by its user-friendly name. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
     * resource type.
     */
    private com.oracle.bmc.datascience.model.ModelLifecycleState lifecycleState;

    /**
     * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
     * resource type.
     */
    public com.oracle.bmc.datascience.model.ModelLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * user who created the resource.
     */
    private String createdBy;

    /**
     * <b>Filter</b> results by the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * user who created the resource.
     */
    public String getCreatedBy() {
        return createdBy;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    private SortOrder sortOrder;

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
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

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by {@code
     * timeCreated}, the results are shown in descending order. All other fields default to
     * ascending order. Sort order for the {@code displayName} field is case sensitive.
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by {@code
     * timeCreated}, the results are shown in descending order. All other fields default to
     * ascending order. Sort order for the {@code displayName} field is case sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        LifecycleState("lifecycleState"),
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
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by {@code
     * timeCreated}, the results are shown in descending order. All other fields default to
     * ascending order. Sort order for the {@code displayName} field is case sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListModelsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the compartment.
         */
        private String compartmentId = null;

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** <b>Filter</b> results by the name of the model version set. */
        private String modelVersionSetName = null;

        /**
         * <b>Filter</b> results by the name of the model version set.
         *
         * @param modelVersionSetName the value to set
         * @return this builder instance
         */
        public Builder modelVersionSetName(String modelVersionSetName) {
            this.modelVersionSetName = modelVersionSetName;
            return this;
        }

        /** <b>Filter</b> results by version label. */
        private String versionLabel = null;

        /**
         * <b>Filter</b> results by version label.
         *
         * @param versionLabel the value to set
         * @return this builder instance
         */
        public Builder versionLabel(String versionLabel) {
            this.versionLabel = versionLabel;
            return this;
        }

        /**
         * <b>Filter</b> results by
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must
         * be an OCID of the correct type for the resource type.
         */
        private String id = null;

        /**
         * <b>Filter</b> results by
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must
         * be an OCID of the correct type for the resource type.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the project.
         */
        private String projectId = null;

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the project.
         *
         * @param projectId the value to set
         * @return this builder instance
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /** <b>Filter</b> results by its user-friendly name. */
        private String displayName = null;

        /**
         * <b>Filter</b> results by its user-friendly name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
         * resource type.
         */
        private com.oracle.bmc.datascience.model.ModelLifecycleState lifecycleState = null;

        /**
         * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
         * resource type.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datascience.model.ModelLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the user who created the resource.
         */
        private String createdBy = null;

        /**
         * <b>Filter</b> results by the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the user who created the resource.
         *
         * @param createdBy the value to set
         * @return this builder instance
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by
         * {@code timeCreated}, the results are shown in descending order. All other fields default
         * to ascending order. Sort order for the {@code displayName} field is case sensitive.
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by
         * {@code timeCreated}, the results are shown in descending order. All other fields default
         * to ascending order. Sort order for the {@code displayName} field is case sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
        public Builder copy(ListModelsRequest o) {
            compartmentId(o.getCompartmentId());
            modelVersionSetName(o.getModelVersionSetName());
            versionLabel(o.getVersionLabel());
            id(o.getId());
            projectId(o.getProjectId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            createdBy(o.getCreatedBy());
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
         * Build the instance of ListModelsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListModelsRequest
         */
        public ListModelsRequest build() {
            ListModelsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListModelsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListModelsRequest
         */
        public ListModelsRequest buildWithoutInvocationCallback() {
            ListModelsRequest request = new ListModelsRequest();
            request.compartmentId = compartmentId;
            request.modelVersionSetName = modelVersionSetName;
            request.versionLabel = versionLabel;
            request.id = id;
            request.projectId = projectId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.createdBy = createdBy;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListModelsRequest(compartmentId, modelVersionSetName, versionLabel, id,
            // projectId, displayName, lifecycleState, createdBy, limit, page, sortOrder, sortBy,
            // opcRequestId);
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
                .modelVersionSetName(modelVersionSetName)
                .versionLabel(versionLabel)
                .id(id)
                .projectId(projectId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .createdBy(createdBy)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",modelVersionSetName=").append(String.valueOf(this.modelVersionSetName));
        sb.append(",versionLabel=").append(String.valueOf(this.versionLabel));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",projectId=").append(String.valueOf(this.projectId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",createdBy=").append(String.valueOf(this.createdBy));
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
        if (!(o instanceof ListModelsRequest)) {
            return false;
        }

        ListModelsRequest other = (ListModelsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.modelVersionSetName, other.modelVersionSetName)
                && java.util.Objects.equals(this.versionLabel, other.versionLabel)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
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
        result =
                (result * PRIME)
                        + (this.modelVersionSetName == null
                                ? 43
                                : this.modelVersionSetName.hashCode());
        result = (result * PRIME) + (this.versionLabel == null ? 43 : this.versionLabel.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
